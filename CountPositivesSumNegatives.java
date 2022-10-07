/*

Given an array of integers.

Return an array, where the first element is the count of 
positives numbers and the second element is sum of negative 
numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], 
you should return [10, -65].

*/

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      if (input == null || input.length == 0) {
        int[] blank = {};
          return blank;
      }

      int[] result = new int[2];
      for (int i = 0; i < input.length; i++) {
        if (input[i] > 0) {
          result[0] += 1;
        }
        else {
          result[1] += input[i];
        }
       
      }

     
      return result; 
    }
}