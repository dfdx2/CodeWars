/* 7KYU CodeWars Substituting Variables into Strings: Padded Numbers

Complete the solution so that it returns a formatted string. 
The return value should equal "Value is VALUE" where value is 
a 5 digit padded number.

Example:

solution(5); // should return "Value is 00005"

*/

public class PaddedNumbers {
  public static String solution(int value) {
    String a = String.valueOf(value);
    String b = "00000";
    int c = b.length() - a.length();
    return "Value is " + b.substring(0, c) + a;
  }
}