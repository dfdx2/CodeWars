/* 7KYU CodeWars Disarium Number (Special Numbers Series # 3)

Definition
Disarium number is the number that The sum of its digits powered 
with their respective positions is equal to the number itself.

Task

Given a number, Find if it is Disarium or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
Number passed is always Positive .
Return the result as String

Input >> Output Examples

disariumNumber(89) ==> return "Disarium !!"

Explanation:
Since , 81 + 92 = 89 , thus output is "Disarium !!"

disariumNumber(564) ==> return "Not !!"

Explanation:
Since , 51 + 62 + 43 = 105 != 564 , thus output is "Not !!"

*/

public class Solution {
    public static String disariumNumber(int number) {
      String j = String.valueOf(number);
      int x = 0;
      int y = 0;
      for (int i = 0; i < j.length(); i++) {
        y = Integer.valueOf(j.charAt(i) - '0');
        System.out.println("y " + y);
        x += (int) Math.pow(y, i + 1);
      }
      System.out.println(x);
      return x == number ? "Disarium !!" : "Not !!";
    }
}
/*--------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution
{
    public static String disariumNumber(int number) {
        int[] numbers = Integer.toString(number)
                               .chars()
                               .map(Character::getNumericValue)
                               .toArray();
        
        return IntStream.range(0, numbers.length)
                        .map(index -> (int) Math.pow(numbers[index], index + 1))
                        .sum() == number ? "Disarium !!" : "Not !!";
    }
}
----------------------------------------------------------------------
public class Solution
{
    public static String disariumNumber(int number)
    {
        int sum = 0;
        char[] arr = String.valueOf(number).toCharArray();
        
        for (int i = 0; i < arr.length; i++)  
          sum += Math.pow(arr[i]-'0', i+1);
        
        return sum == number ? "Disarium !!" : "Not !!"; 
    }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution{
    public static String disariumNumber(int number){
    
    int[] findDisarium = Integer.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        return IntStream.range(0,findDisarium.length)
                .mapToDouble(i->Math.pow(findDisarium[i],i+1))
                .sum() == number ? "Disarium !!" : "Not !!";
    }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {

    public static String disariumNumber(int number) {
        String s = String.valueOf(number);
        double sum = IntStream.range(0, s.length())
                           .mapToDouble(i -> Math.pow(s.charAt(i)-'0', i+1))
                           .sum();
        return number == sum ? "Disarium !!" : "Not !!";
    }
}
-----------------------------------------------------------------------
public class Solution
{
    public static String disariumNumber(int number)
    {
        int x=number,c=0,sum=0;
        
        while(x>0)
        {
           x/=10;
           c++;//counting no of digits
        }
        
        x=number;
        
        while(x>0)
        {
           int k=x%10;//extracting digit
           sum=(int)(sum+Math.pow(k,c--));//adding the digits with its power
           x/=10;
        }
        
        if(sum==number)
        return "Disarium !!";
        else
        return "Not !!";
    }
    
}
-----------------------------------------------------------------------
public class Solution
{
    public static String disariumNumber(int number) {
        String bla = "" + number;
        int disa = 0;
        int digit;

        for (int i = 0; i < bla.length(); i++) {
            digit = Integer.parseInt("" + bla.charAt(i));
            digit = (int) Math.pow(digit, i + 1);
            disa += digit;
        }
        
        return disa == number ? "Disarium !!" : "Not !!";
    }
}
------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Solution {
  static String disariumNumber(int number) {
    return range(1, (number + "").length() + 1)
                .map(n -> (int) Math.pow((number + "").charAt(n - 1) - 48, n))
                .sum() == number ? "Disarium !!" : "Not !!";
  }
}

*/