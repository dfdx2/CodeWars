/*  8KYU CodeWars Find the first non-consecutive number

Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element 
of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are 
all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null2.

The array will always have at least 2 elements1 and all elements will be numbers. 
The numbers will also all be unique and in ascending order. The numbers could be 
positive or negative and the first non-consecutive could be either too!

If you like this Kata, maybe try this one next: 
https://www.codewars.com/kata/represent-array-of-numbers-as-ranges

1 Can you write a solution that will return null2 for both [] and [ x ] though? 
(This is an empty array and one with a single number and is not tested for, 
but you can write your own example test. )

2
Swift, Ruby and Crystal: nil
Haskell: Nothing
Python, Rust, Scala: None
Julia: nothing
Nim: none(int) (See options)

*/

class FirstNonConsecutive {
    static Integer find(final int[] array) {
        
      for (int i = 0; i < array.length-1; i++) {
        if (array[i+1] != array[i] + 1) {
           return array[i + 1];
        }
      }
        return null;
    }
}
/*-----------------------------------------------------------------------------
class FirstNonConsecutive {
    static Integer find(final int[] array) {
       for(int i = 1; i < array.length; ++i)
       {
         if(array[i] - array[i - 1] != 1)
         {
           return array[i];
          }
        }
       return null;
    }
}
--------------------------------------------------------------------------------
import java.util.stream.*;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
      return IntStream.range(1, array.length).filter(i -> array[i-1] != array[i]-1)
                     .mapToObj(x -> new Integer(array[x])).findFirst().orElse(null);
    }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
        return IntStream
                  .range(1, array.length)
                  .filter(x -> array[x - 1] + 1 != array[x])
                  .mapToObj(x -> array[x])
                  .findFirst()
                  .orElse(null);
    }
}
-----------------------------------------------------------------------------



*/
 