/*   8KYU  CodeWars  Sum Arrays 
Write a function that takes an array of numbers and returns the 
sum of the numbers. The numbers can be negative or non-integer. 
If the array does not contain any numbers then you should return 0.

Examples
Input: [1, 5.2, 4, 0, -1]
Output: 9.2

Input: []
Output: 0

Input: [-2.398]
Output: -2.398

Assumptions
You can assume that you are only given numbers.
You cannot assume the size of the array.
You can assume that you do get an array and if the array is empty, return 0.
Tests expect accuracy of 1e-4.

What We're Testing
We're testing basic loops and math operations. This is for beginners who are 
just learning loops and math operations. Advanced users may find this 
extremely easy and can easily write this in one line.
Can you make it better?
*/

public class SumArray {

  public static double sum(double[] numbers) {
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers.length == 0) {
        return 0;
      }
      else {
        sum += numbers[i];
      }
    }
    return sum;
  }
}
/*------------------------------------------------------------------------------- 
import java.util.Arrays;

public class SumArray {

  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  } 
}
-----------------------------------------------------------------------------------
public class SumArray {

  public static double sum(double[] numbers) {
    double result = 0;
    for(double value : numbers){result += value;}
    return result;
  }
}
------------------------------------------------------------------------------------

import java.util.*;

public class SumArray {

  public static double sum(double[] numbers) {
    return (numbers.length > 0) ? Arrays.stream(numbers).sum() : 0;
  }
}
-------------------------------------------------------------------------------------


*/