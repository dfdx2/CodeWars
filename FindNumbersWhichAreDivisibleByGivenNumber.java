/* 8KYU CodeWars Find Numbers Which Are Divisible By Given Number

Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.

Example(Input1, Input2 --> Output)
[1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]


*/
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % divider == 0) {
        result.add(numbers[i]);
      }
    }
    int[] r1 = result.stream().mapToInt(i -> i).toArray();
    return r1;
  }
}
/*----------------------------------------------------------------------------
import java.util.stream.*;
import java.util.Arrays;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
  
    return Arrays.stream(numbers)
                 .filter(i -> (i % divider) == 0)
                 .toArray();
  }
}
----------------------------------------------------------------------------
public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers){
          if (number % divider == 0){
            count ++;
          }
        }
        int[] arr = new int[count];
        int i = 0;        
        for (int number : numbers){
          if (number % divider == 0){
            arr[i] = number;
            i++;
          }        
        }
        return arr;
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;

public class EvenNumbers {

  /**
   * @param numbers input array
   * @param divider
   * @return all number, which are divisible by given divisor. 
   *
  public static int[] divisibleBy(int[] numbers, int divider) {
    return Arrays.stream(numbers)
                 .filter(number -> number % divider == 0)
                 .toArray();
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
        int[]newArray = new int[numbers.length];
        int k = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                newArray[k] = numbers[i];
                k++;
            }
        }
        
        return Arrays.copyOf(newArray, k);
    }
}
-----------------------------------------------------------------------------


*/