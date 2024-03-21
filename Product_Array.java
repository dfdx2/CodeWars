/* 7KYU CodeWars Product Array

Task
Given an array/list [] of integers , Construct a product array Of 
same size Such That prod[i] is equal to The Product of all the 
elements of Arr[] except Arr[i].

Notes

Array/list size is at least 2 .

Array/list's numbers Will be only Positives

Repetition of numbers in the array/list could occur.

Input >> Output Examples
productArray ({12,20}) ==>  return {20,12}

Explanation:
The first element in prod [] array 20 is the product of all array's 
elements except the first element

The second element 12 is the product of all array's elements except 
the second element .

productArray ({1,5,2}) ==> return {10,2,5}

Explanation:
The first element 10 is the product of all array's elements except the 
first element 1

The second element 2 is the product of all array's elements except the 
second element 5

The Third element 5 is the product of all array's elements except the 
Third element 2.

productArray ({10,3,5,6,2}) return ==> {180,600,360,300,900}

Explanation:
The first element 180 is the product of all array's elements except the 
first element 10

The second element 600 is the product of all array's elements except the 
second element 3

The Third element 360 is the product of all array's elements except the 
third element 5

The Fourth element 300 is the product of all array's elements except the 
fourth element 6

Finally ,The Fifth element 900 is the product of all array's elements 
except the fifth element 2

*/
public class Solution {
    public static long[] productArray(int[] numbers) {
      long[] result = new long[numbers.length];
      int i = 0;
      long t = 1;
      while (i < numbers.length) {
        for (int j = 0; j < numbers.length; j++) {
          if (i != j) {
            t *= numbers[j];
          }
        }
        result[i] = t;
        t = 1;
        i++;
      }
      return result;
    }
}
/*--------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {
    public static long[] productArray(int[] numbers) {
        long p = IntStream.of(numbers).asLongStream().reduce(1, (x, y) -> x * y);
        return IntStream.of(numbers).mapToLong(x -> p / x).toArray();
    }
}
-----------------------------------------------------------------------
public class Solution {

    public static long[] productArray(int[] n) {  
      int len = n.length;
      long prod = 1, ary[] = new long[len];
      for (int a : n) prod *= a;      
      for (int i = 0; i < len; i++) ary[i] = prod / n[i];
      return ary;
    }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Solution
{
    public static long[] productArray(int[] source)
    {
        return LongStream.range(0, source.length)
                .map(ind -> {
                    return IntStream.range(0, source.length)
                            .filter(it -> it != ind)
                            .mapToLong(it -> source[it])
                            .reduce((a, b) -> a * b)
                            .orElse(-1);
                }).toArray();
    }
}
----------------------------------------------------------------------
import java.util.*;

public class Solution {
    public static long[] productArray(int[] a) {
        long[] b = new long[a.length];
        long result = 1;
        for (int i = 0; i < a.length; i++) {
            result = 1;
            for (int j = 0; j < a.length; j++) {
                if (j != i) {
                    result *= a[j];
                }
            }
            b[i] = result;
        }
        return b;
    }
}
-----------------------------------------------------------------------
import java.util.stream.*;
public class Solution {
  public static long[] productArray(int[] xs) {
    long p = IntStream.of(xs).mapToLong(x -> (long)x).reduce(1L, (acc, x) -> acc * x);
    return IntStream.of(xs).mapToLong(x -> p / x).toArray();
  }
}
-----------------------------------------------------------------------
import static java.util.stream.IntStream.of;

import java.util.concurrent.atomic.AtomicLong;

class Solution {
  static long[] productArray(int[] numbers) {
    var temp = new AtomicLong(1);
    of(numbers).mapToLong(n -> temp.getAndSet(n * temp.get())).max();
    return of(numbers).mapToLong(n -> temp.get() / n).toArray();
  }
}
------------------------------------------------------------------------
public class Solution
{
    public static long[] productArray(int[] numbers)
    {
        long generalProduct = java.util.Arrays.stream(numbers).asLongStream().reduce(1, (x, y) -> x*y);
        long [] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; ++i)
          result[i] = generalProduct/numbers[i];
        return result;
    }
}
-----------------------------------------------------------------------
import java.util.stream.*;
public class Solution
{
    public static long[] productArray(int[] numbers)
    {
        long p = IntStream.of(numbers).asLongStream().reduce(1, (x,y) -> x*y);
        return IntStream.of(numbers).mapToLong(x -> p / x).toArray();

        
    }
}
*/