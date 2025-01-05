/* 7KYU CodeWars Array Leaders (Array Series #3)

Definition
An element is leader if it is greater than The Sum all the elements to its right side.

Task
Given an array/list [] of integers , Find all the LEADERS in the array.

Notes
Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives , negatives and zeros

Repetition of numbers in the array/list could occur.

Returned Array/list should store the leading numbers in the same order in the original array/list .

Input >> Output Examples
arrayLeaders ({1, 2, 3, 4, 0}) ==> return {4}
Explanation:
4 is greater than the sum all the elements to its right side

Note : The last element 0 is equal to right sum of its elements (abstract zero).

arrayLeaders ({16, 17, 4, 3, 5, 2}) ==> return {17, 5, 2}
Explanation:
17 is greater than the sum all the elements to its right side

5 is greater than the sum all the elements to its right side

Note : The last element 2 is greater than the sum of its right elements (abstract zero).

arrayLeaders ({5, 2, -1}) ==> return {5, 2}
Explanation:
5 is greater than the sum all the elements to its right side

2 is greater than the sum all the elements to its right side

Note : The last element -1 is less than the sum of its right elements (abstract zero).

arrayLeaders ({0, -1, -29, 3, 2}) ==> return {0, -1, 3, 2}
Explanation:
0 is greater than the sum all the elements to its right side

-1 is greater than the sum all the elements to its right side

3 is greater than the sum all the elements to its right side

Note : The last element 2 is greater than the sum of its right elements (abstract zero).

*/
import java.util.*;
public class ArrayLeaders {
    public static List arrayLeaders(int[] numbers) {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
      }
      ArrayList<Integer> result = new ArrayList<>();
      for (int i = 0; i < numbers.length; i++) {
        sum -= numbers[i];
        if (numbers[i] > sum) {
          result.add(numbers[i]);
        }  
      }
      return result;
    }
}
/*-----------------------------------------------------------------
import java.util.*;

public class Solution {

    public static List arrayLeaders(int[] n) {
      List<Integer> ary = new ArrayList<>();
      for (int i = n.length-1, sum = 0; i >= 0; i--) {
        if (n[i] > sum) ary.add(0, n[i]);
        sum += n[i];
      }
      return ary;
    }
    
}
-------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
  public static List arrayLeaders(int[] numbers) {
    return IntStream.range(0, numbers.length).filter(i -> numbers[i] > Arrays.stream(Arrays.copyOfRange(numbers, i + 1, numbers.length)).sum()).mapToObj(i -> numbers[i]).collect(Collectors.toList());
  }
}
-------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

class Solution {
  static List<Integer> arrayLeaders(int[] numbers) {
    var arr = new ArrayList<Integer>();
    for (int i = 0; i < numbers.length; i++) {
      int sum = 0;
      for (int j = i + 1; j < numbers.length; j++) {
        sum += numbers[j];
      }
      if (numbers[i] > sum) {
        arr.add(numbers[i]);
      }
    }
    return arr;
  }
}
-------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> arrayLeaders(int[] numbers) {
        int length = numbers.length;
        List<Integer> leaders = new ArrayList<>(length);
        for (int i = length - 1, sum = 0; i >= 0; i--) {
            int num = numbers[i];
            if (num > sum) {
                leaders.add(0, num);
            }
            sum += num;
        }
        return leaders;
    }
}
-------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> arrayLeaders(int[] numbers) {
        List<Integer> listOdLeaders = new ArrayList<>();
        int sumRightNumbers = Arrays.stream(numbers).sum();
        for (int number : numbers) {
            sumRightNumbers -= number;
            if (number > sumRightNumbers) {
                listOdLeaders.add(number);
            }
        }
        return listOdLeaders;
    }
}
*/