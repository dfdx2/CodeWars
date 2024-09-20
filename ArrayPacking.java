/* 7KYU CodeWars Simple Fun # 9 Array Packing

Task

You are given an array of up to four non-negative integers, each less than 256.

Your task is to pack these integers into one number M in the following way:

The first element of the array occupies the first 8 bits of M;
The second element occupies next 8 bits, and so on.
Return the obtained integer M as unsigned integer.

Note:

the phrase "first bits of M" refers to the least significant bits of 
M - the right-most bits of an integer. For further clarification see 
the following example.

Example

For a = [24, 85, 0], the output should be 21784

An array [24, 85, 0] looks like [00011000, 01010101, 00000000] in binary.

After packing these into one number we get 00000000 01010101 00011000 
(spaces are placed for convenience), which equals to 21784.

Input/Output
[input] integer array a
Constraints: 1 ≤ a.length ≤ 4 and 0 ≤ a[i] < 256

[output] an unsigned integer
More Challenge
Are you a One-Liner? Please try to complete the kata in one line(no test for it) ;-)

*/
import static java.util.stream.IntStream.range;
public class ArrayPacking {
    public static long arrayPacking(int[] arr) {
      return range(0, arr.length).mapToLong(i -> (long) arr[i] << (i * 8)).sum();
    }
}
/*-----------------------------------------------------------------------------------------
public class Kata {
  public static long arrayPacking(int[] arr) {
    long ret = 0, shift = 0;
    for (long i : arr) {
      ret |= i << shift;
      shift += 8;
    }
    return ret;
  }
}
-------------------------------------------------------------------------------------------
import java.util.stream.*;
public class Kata {
     public static long arrayPacking(int[] arr) {
        return Long.parseLong(IntStream.range(0, arr.length)
                .map(x -> arr[arr.length - 1 - x])
                .mapToObj(Integer::toBinaryString)
                .mapToInt(Integer::parseInt)
                .mapToObj(x -> String.format("%08d",x))
                .collect(Collectors.joining()), 2);        
    }
      
}
-------------------------------------------------------------------------------------------
public class Kata {
    public static long arrayPacking(int[] arr) {
        long res = 0;
        for (int i=0; i < arr.length; i++)
          res = res | ((long)arr[i] << (8*i));
        return res;
    }
}
-------------------------------------------------------------------------------------------
public class Kata {
    public static long arrayPacking(int[] arr) {
        long s = 0;
        for (int i = 0; i < arr.length; i++) {
          s += arr[i] * Math.pow(2, i * 8);
        }
        return s;
    }
}
-------------------------------------------------------------------------------------------
import java.util.*;

public class Kata {
    public static long arrayPacking(int[] arr) {
        String result =  Arrays.stream(arr).boxed()
                .map(e -> String.format("%08d", Integer.parseInt(Integer.toBinaryString(e))))
                .reduce((x, y) -> y.concat(x)).get();
        return Long.parseLong(result, 2);
    }
}
-------------------------------------------------------------------------------------------
public class Kata {
    public static long arrayPacking(int[] arr)
    {
        long packed = 0;
        for(int i = 0; i < arr.length; i++)
        {
            packed |= (long) arr[i] << 8 * i;
        }
        return packed;
    }
}
-------------------------------------------------------------------------------------------
class Kata{static long arrayPacking(int[]a){long r=0,s=-8;for(long i:a)r|=i<<(s+=8);return r;}}
-------------------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;
public class Kata {
    public static long arrayPacking(int[] arr) {
      return range(0, arr.length).mapToLong(i -> (long) arr[i] << (i * 8)).sum();
    }
}
*/