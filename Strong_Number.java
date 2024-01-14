/* 7KYU CodeWars Strong Number

Definition
Strong number is the number that the sum of the factorial of 
its digits is equal to number itself.

For example, 145 is strong, since 1! + 4! + 5! = 1 + 24 + 120 = 145.

Task
Given a number, Find if it is Strong or not and return 
either "STRONG!!!!" or "Not Strong !!".

Notes

Number passed is always Positive.

Return the result as String

Input >> Output Examples

strong_num(1) ==> return "STRONG!!!!"
Since, the sum of its digits' factorial (1) is equal to number 
itself, then its a Strong.

strong_num(123) ==> return "Not Strong !!"
Since the sum of its digits' factorial of 1! + 2! + 3! = 9 is 
not equal to number itself, then it's Not Strong .

strong_num(2)  ==>  return "STRONG!!!!"
Since the sum of its digits' factorial of 2! = 2 is equal to 
number itself, then its a Strong.

strong_num(150) ==> return "Not Strong !!"
Since the sum of its digits' factorial of 1! + 5! + 0! = 122 is 
not equal to number itself, Then it's Not Strong .

*/

class StrongNumber { 
    public static String isStrongNumber(int num) {
      String s = "STRONG!!!!";
      String n = "Not Strong !!";
      int result = 0;
      int counter = 0;
      int j = num;
      while (num > 0) {
        counter = num % 10;
        result += fact(counter);
        num = num / 10;
      }
      if (result == j) {
        return s;
      }
      return n;      
    }
  
  public static int fact(int num) {
    if (num == 0) {
      return 1;
    }
    return num * fact(num - 1);
  }
}
/*-------------------------------------------------------------------
class StrongNumber {
    
    public static String isStrongNumber(int num) {
        int sum = 0, n = num;
        for(; n>0; n/=10)
            sum += factorial(n%10);
        
        if(sum == num)
            return "STRONG!!!!";
        else
            return "Not Strong !!";
    }
    
    private static int factorial(int number){
        int sum = 1;
        for(int i=1; i<=number; i++)  
            sum *= i;
        return sum;
    }

}
---------------------------------------------------------------------
import static java.util.stream.IntStream.rangeClosed;

class StrongNumber {
  static String isStrongNumber(int num) {
    return (num + "").chars().map(Character::getNumericValue)
                     .map(i -> rangeClosed(1, i).reduce(1, (a, b) -> a * b))
                     .sum() == num ? "STRONG!!!!" : "Not Strong !!";
  }
}
----------------------------------------------------------------------
class StrongNumber {
    
    public static String isStrongNumber(int num) {
      int new_num = num, element = 0, factorial = 1, sum = 0;    
      while(new_num > 0){
        element = new_num%10;
        for(int i = element; i > 1; i--){
          factorial*=i;
        }
        sum+=factorial;
        factorial = 1;
        new_num = new_num/10;
      }    
        return sum==num? "STRONG!!!!":"Not Strong !!";
    }

}
----------------------------------------------------------------------
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

class StrongNumber {
  public static String isStrongNumber(final int num) {
    return isStrong(num) ? "STRONG!!!!": "Not Strong !!";
  }
  
  private static boolean isStrong(final int num) {
    return String.valueOf(num).chars().map(toDigit).map(factorial).sum() == num;
  }
  
  private static IntUnaryOperator toDigit = c -> Character.digit(c, 10);
  private static IntUnaryOperator factorial = d -> IntStream.rangeClosed(1, d).reduce(1, (a, b) -> a * b);
}
----------------------------------------------------------------------
class StrongNumber {
    
    static final int[] FACT = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    
    public static String isStrongNumber(int num) {
      long sum = 0; int n = num;
      do sum += FACT[n%10]; while ((n/=10) > 0 && sum <= num);
      return sum == num ? "STRONG!!!!" : "Not Strong !!";
    }

}
----------------------------------------------------------------------
import java.util.stream.IntStream;

class StrongNumber { 
  public static String isStrongNumber(int num) {
    int res = String.valueOf(num).chars()
        .map(Character::getNumericValue)
        .map(i -> IntStream.rangeClosed(1, i).reduce(1, (n1, n2) -> n1 * n2))
        .sum();
    return (res == num) ? "STRONG!!!!" : "Not Strong !!";
  }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;
class StrongNumber {
    
    public static String isStrongNumber(int num) {
       char[] chrArray = Integer.toString(num).toCharArray();
    	int count = 0;
    	for(int i=0;i<chrArray.length;i++) {
    		count = count + IntStream.rangeClosed(2, Integer.parseInt(String.valueOf(chrArray[i]))).reduce(1, (x, y) -> x * y);
    	}
      return count == num ? "STRONG!!!!":"Not Strong !!";
    }

}
*/