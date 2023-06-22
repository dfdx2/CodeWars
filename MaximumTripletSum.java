/*  7KYU CodeWars Maximum Triplet Sum (Array Series *7)

Task
Given an array/list [] of n integers , find maximum triplet sum in the array Without duplications .

Notes :
Array/list size is at least 3 .

Array/list numbers could be a mixture of positives , negatives and zeros .

Repetition of numbers in the array/list could occur , So (duplications are not included when summing).

Input >> Output Examples
1- maxTriSum ({3,2,6,8,2,3}) ==> return (17)
Explanation:
As the triplet that maximize the sum {6,8,3} in order , their sum is (17)

Note : duplications are not included when summing , (i.e) the numbers added only once .

*/

public class Solution
{
    public static int maxTriSum (int[] numbers)
    {
       Arrays.sort(numbers);
      int sum = 0;
      int count = 1;
      int i = numbers.length - 1;
      while (count <= 3) {
        if (numbers[i] == numbers[i - 1]) {
          i--;
        }
        else {
          sum += numbers[i];
          count++;
          i--;
        }
      }
      return sum;
    }
}
/*----------------------------------------------------------------------------
import java.util.Collections;
import java.util.Arrays;

public class Solution
{
    public static int maxTriSum (int[] numbers)
    {       return Arrays.stream(numbers)
               .boxed()
               .sorted(Collections.reverseOrder())
               .distinct()
               .limit(3)
               .mapToInt(i -> i)
               .sum();
    }
}
----------------------------------------------------------------------------
import java.util.*;
public class Solution
{
    public static int maxTriSum (int[] numbers)
    {
     int array[] = Arrays.stream(numbers).distinct().sorted().toArray();
    
     int grandezza = array.length;
   
     return array[grandezza - 1] + array[grandezza - 2] + array[grandezza - 3];
        
    }
}
-----------------------------------------------------------------------
import java.util.Arrays;

public class Solution
{
    public static int maxTriSum (int[] numbers)
    {
       numbers = Arrays.stream(numbers).sorted().distinct().toArray();
       return numbers[numbers.length-1] + numbers[numbers.length-2] + numbers[numbers.length-3];
    }
}



*/