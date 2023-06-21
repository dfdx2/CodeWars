/* 7KYU CodeWars Incrementer

Given an input of an array of digits, return the array with each digit 
incremented by its position in the array: the first digit will be 
incremented by 1, the second digit by 2, etc. Make sure to start counting 
your positions from 1 ( and not 0 ).

Your result can only contain single digit numbers, so if adding a digit with 
its position gives you a multiple-digit number, only the last digit of the 
number should be returned.

Notes:
return an empty array if your array is empty
arrays will only contain numbers so don't worry about checking that
Examples:
[1, 2, 3]  -->  [2, 4, 6]   #  [1+1, 2+2, 3+3]

[4, 6, 9, 1, 3]  -->  [5, 8, 2, 5, 8]  #  [4+1, 6+2, 9+3, 1+4, 3+5]
                                       #  9+3 = 12  -->  2

*/

public class Kata {
  
  public static int[] incrementer(int[] numbers) {
    int[] result = new int[numbers.length];
    int count = 1;
    int i = 0;
    while (i < numbers.length) {
      if (numbers[i] + count >= 10) {
        result[i] = (numbers[i] + count) % 10;
        i++;
        count++;
      }
      else {
        result[i] = numbers[i] + count;
        i++;
        count++;
      }
    }
    return result;
  }
}
/*----------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {
  
  public static int[] incrementer(int[] numbers) {
    return IntStream.range(0, numbers.length).map(i -> (numbers[i] + i + 1) % 10).toArray();
  }
}
-------------------------------------------------------------------------------
import java.util.*;
public class Kata {
  
  public static int[] incrementer(int[] numbers) {
    for(int i = 0 ; i < numbers.length; i++)
      numbers[i] = (numbers[i] + i + 1) % 10;
    return numbers;
  }
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  
  public static int[] incrementer(int[] numbers) {
    if(numbers == null) throw new IllegalArgumentException();
    if(numbers.length == 0) return new int[0];
    
    return IntStream.rangeClosed(1, numbers.length).map(i -> (numbers[i - 1] + i) % 10 ).toArray();
  }
}
----------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface Kata {
  static int[] incrementer(int[] n) {
    return range(0, n.length).map(i -> (n[i] + i + 1) % 10).toArray();
  }
}



*/