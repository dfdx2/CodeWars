/* 7KYU CodeWars Palindrome Chain Length

Number is a palindrome if it is equal to the number with digits 
in reversed order. For example, 5, 44, 171, 4884 are palindromes, 
and 43, 194, 4773 are not.

Write a function which takes a positive integer and returns the 
number of special steps needed to obtain a palindrome. The special 
step is: "reverse the digits, and add to the original number". If 
the resulting number is not a palindrome, repeat the procedure with 
the sum until the resulting number is a palindrome.

If the input number is already a palindrome, the number of steps is 0.

All inputs are guaranteed to have a final palindrome which does not 
overflow long.

Example

For example, start with 87:

  87 +   78 =  165     - step 1, not a palindrome
 165 +  561 =  726     - step 2, not a palindrome
 726 +  627 = 1353     - step 3, not a palindrome
1353 + 3531 = 4884     - step 4, palindrome!
4884 is a palindrome and we needed 4 steps to obtain it, so answer for 87 is 4.

Additional info

Some interesting information on the problem can be found in this Wikipedia article on Lychrel numbers.

*/

public class PalindromeChainLength {
    public static int palindromeChainLength (long n) {    	
      long x = Long.parseLong(new StringBuilder(n + "").reverse() + "");
      return (x + "").equals(n + "") ? 0 : palindromeChainLength(n + x) + 1;
    }
}
/*-------------------------------------------------------------------------------
public class Palindromes {
    private static boolean isPalindrome(long n) {
        return Long.toString(n).equals(new StringBuilder(Long.toString(n)).reverse().toString());
    }
    private static long getReversed(long n) {
        return Long.parseLong(new StringBuilder(Long.toString(n)).reverse().toString());
    }
    public static int palindromeChainLength (long n) {
        int steps = 0;
        while (!isPalindrome(n)) {
            n += getReversed(n);
            steps ++;
        }
        return steps;
    }
}
---------------------------------------------------------------------------------
public class Palindromes {
  
  public static int palindromeChainLength (long n) {    	
    String ns = "" + n, nrs = "" + new StringBuilder(ns).reverse();
    return ns.equals(nrs) ? 0 : 1 + palindromeChainLength(n + Long.valueOf(nrs));
  }
  
}
---------------------------------------------------------------------------------
public class Palindromes {
    public static int palindromeChainLength (long n) {    	
      int i = 0;
      long pal;
      while(true){
        pal = Pal(n);
        if (pal == n)
          break;
        n += pal;        
        i++;
      }
      
      return i;
    }

  public static long Pal(long n){
      long answer = 0;
      while(n != 0){
        answer = answer*10 + n%10;
        n /= 10;
      }
    return answer;
  }
    
}
---------------------------------------------------------------------------------
public class Palindromes {
    public static int palindromeChainLength(long n) {
        int step = 0;
        while (n != reverseNumber(n)) {
            n = n + reverseNumber(n);
            step++;
        }
        return step;
    }

    private static long reverseNumber(long n) {
        char[] number = String.valueOf(n).toCharArray();
        String reverseNumber = "";
        for (int count = number.length - 1; count >= 0; count--) {
            reverseNumber = reverseNumber + number[count];
        }
        return Long.parseLong(reverseNumber);
    }
}
---------------------------------------------------------------------------------
public class Palindromes {
    public static int palindromeChainLength (long n) {    	
      int stepsNumber=0;
		while(!String.valueOf(n). equals(new StringBuilder().append(n).reverse().toString())) {
			stepsNumber++;
			Long reverseNumber = Long.parseLong((new StringBuilder().append(n).reverse().toString()));
			n =n + reverseNumber;
		}
		return stepsNumber;
    }
}
---------------------------------------------------------------------------------
import java.util.Stack;

public class Palindromes {
    public static int palindromeChainLength (long n) {    	
        int step = 0;
      
        if (n == flip(n))
          return step;

        do {
            n += flip(n);
            step++;

        }while(n != flip(n));
        return step;
    }
  
  
    public static long flip (long n){
        long result = 0;
        long fpow = 0;
        long bpow = (long) (Math.log(n )/ Math.log(10));
        long temp;

        while(bpow >= 0){

            temp = (long) (Math.floor(n / Math.pow(10, bpow)));
            result += (long)(temp * Math.pow(10, fpow));
            n -= (long) (temp * Math.pow(10, bpow));
            fpow++; bpow--;
        }
        return result;
    }
}
---------------------------------------------------------------------------------
public class Palindromes {
    public static long reverse(long num){
      long current_sum = 0;
      while(num != 0){
        long remainder = num%10;
        current_sum = current_sum*10 + remainder;
        num /= 10;
      }
      return current_sum;
    }
    public static int palindromeChainLength (long n) {
      int count = 0;
      long rev_num = reverse(n);
      while(n != rev_num){
        n = n + rev_num;
        rev_num = reverse(n);
        count++;
      }
      return count;
    }
}
*/