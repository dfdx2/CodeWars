/* 7KYU CodeWars Special Number (Special Numbers Series #5)

Definition
A number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5

Given a number determine if it special number or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
The number passed will be positive (N > 0) .

All single-digit numbers within the interval [1:5] are considered as 
special number.

Input >> Output Examples
specialNumber(2) ==> return "Special!!"
Explanation:
It's a single-digit number within the interval [1:5] .

specialNumber(9) ==> return "NOT!!"
Explanation:
Although, it's a single-digit number but Outside the interval [1:5] .

specialNumber(23) ==> return "Special!!"
Explanation:
All the number's digits formed from the interval [0:5] digits .

specialNumber(39) ==> return "NOT!!"
Explanation:
Although, there is a digit (3) Within the interval But the second digit 
is not (Must be ALL The Number's Digits ) .

specialNumber(59) ==> return "NOT!!"
Explanation:
Although, there is a digit (5) Within the interval But the second digit is 
not (Must be ALL The Number's Digits ) .

specialNumber(513) ==> return "Special!!"
specialNumber(709) ==> return "NOT!!"


*/

public class Solution {
  public static String specialNumber(int number) {
    System.out.println(number);
    String s = "Special!!";
    String n = "NOT!!";
    while (number > 0) {
      int x = number % 10;
      if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 0) {
        number = number / 10;
      } 
      else {
        return n;
      }
    }
    return s;
  }
}
/*----------------------------------------------------------------------------
public class Solution {
    public static String specialNumber(int n) {
      return (""+n).matches("[0-5]+")?"Special!!":"NOT!!";
    }
}
------------------------------------------------------------------------------
public class Solution {
    public static String specialNumber(int number) {
        while (number != 0) {
            if (number % 10 > 5)
                return "NOT!!";
            number /= 10;
        }
        return "Special!!";
    }
}
------------------------------------------------------------------------------
public class Solution {
  public static String specialNumber(final int number) {
    return isSpecial(number) ? "Special!!" : "NOT!!";
  }
  
  private static boolean isSpecial(final int number) {
    return String.valueOf(number).matches("[0-5]+");
  }
}
-----------------------------------------------------------------------------
public class Solution
{
    public static String specialNumber(int number)
    {  
    String result = "Special!!";
         String k = String.valueOf(number);
         for(char l : k.toCharArray()){
     switch(l){
         case '0':continue;
         case '1':continue;
         case '2':continue;
         case '3':continue;
         case '4':continue;
         case '5':continue;
         default:result="NOT!!";
 }
         }
        
        return result;
   }
}
-----------------------------------------------------------------------------
class Solution {
  static String specialNumber(int number) {
    return ("" + number).replaceAll("[0-5]", "").isEmpty() ? "Special!!" : "NOT!!";
  }
}
----------------------------------------------------------------------------------
import java.util.HashSet;
public class Solution{
    public static String specialNumber(int number){
        HashSet<Integer> set = new HashSet<>();
		String string = "";
		int count = 0;
		for (int i = 0; i < 6; i++) {
			set.add(i);
		}
		int remainder = 0;
		while (number > 0) {
			remainder = number % 10;
			if (set.contains(remainder)) {
				string += remainder;
			}
			number = number / 10;
			count++;
		}
		if (string.length() == count)
			return "Special!!";

		else
			return "NOT!!";

    }
}

*/