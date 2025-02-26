/* 7KYU CodeWars Summing a Number's Digits

Write a function which takes a number as input and returns the sum of the absolute value of each of the number's decimal digits.

For example: (Input --> Output)

10 --> 1
99 --> 18
-32 --> 5
Let's assume that all numbers in the input will be integer values.

*/
public class SummingANumbersDigits{
  public static int sumDigits(int number){
    int result = 0;
    number = Math.abs(number);
    while (number > 0) {
      result += number % 10;
      number /= 10;
    }
    return result;
  }
}