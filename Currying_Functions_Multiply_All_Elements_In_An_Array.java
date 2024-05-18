/* 7KYU CodeWars Currying functions: multiply all elements in an array

To complete this Kata you need to make a function 
multiplyAll/multiply_all which takes an array of 
integers as an argument. This function must return 
another function, which takes a single integer as 
an argument and returns a new array.

The returned array should consist of each of the 
elements from the first array multiplied by the 
integer.

Example:

multiplyAll([1, 2, 3])(2) = [2, 4, 6];
You must not mutate the original array.

*/

import static java.util.stream.IntStream.of;
import java.util.function.IntFunction;

public class Kata {
  public static IntFunction<int[]> multiplyAll(int[] array) {
    return n -> of(array).map(i -> n * i).toArray();
  }
}
/*------------------------------------------------------------
import java.util.Arrays;
import java.util.function.Function;

public class Kata {
  public static Function<Integer, int[]> multiplyAll( int[] array ) {
    return n -> Arrays.stream( array ).map( x -> n*x ).toArray();
  }
}
--------------------------------------------------------------
public class Kata {
  
  public int[] array;
  
  public static Kata multiplyAll(int[] array) {
    Kata kata = new Kata();
    kata.array = array;
    return kata;
  }
  
  public int[] apply(int multiplyer) {
    for(int i = 0; i < array.length; i++) {
      array[i] = array[i] * multiplyer;
    }      
    return array;
  }
}
--------------------------------------------------------------
import java.util.function.Function;

public class Kata {
  public static Function<Integer, int[]> multiplyAll(int[] array) {
        return new Function<Integer, int[]>() {
            int[] innerArray = new int[array.length];
            {
                System.arraycopy(array, 0, innerArray, 0, array.length);
            }

            @Override
            public int[] apply(Integer multiplier) {
                int[] result = new int[innerArray.length];
                for (int i = 0; i < innerArray.length; i++) {
                    result[i] = innerArray[i] * multiplier;
                }
                return result;
            }
        };
    }
}
--------------------------------------------------------------
import java.util.Arrays;
public class Kata {
   public static int[]array;
    
     public static Kata multiplyAll(int[] array1) {
        array=array1;
        return new Kata();
    }
    public static int[]apply(int i){
        return Arrays.stream(array).map(a->a*i).toArray();
}
    }
--------------------------------------------------------------
import java.util.Arrays;
import java.util.function.IntFunction;

public class Kata {
    public static IntFunction<int[]> multiplyAll(int[] array) {
        return value -> Arrays.stream(array)
                .map(n -> n * value)
                .toArray();
    }
}
--------------------------------------------------------------
import java.util.Arrays;
import java.util.function.Function;
public class Kata {
   public static Function<Integer,int[]> multiplyAll(int[] array) {
        Function<Integer, int[]> transformedFunction = x ->
        {
            int finalList[] = new int[array.length];
            for (int i = 0; i < array.length; i++) {

                finalList[i] = curryAdder.apply(array[i]).apply(x);


            }

            return finalList;
        };
        return transformedFunction;
    }



    public static Function<Integer,
            Function<Integer, Integer>>
            curryAdder = u -> v-> u * v;
}

--------------------------------------------------------------
import java.util.function.Function;
import java.util.stream.IntStream;

public class Kata {
  public static Function<Integer, int[]> multiplyAll(int[] array) {
        return integer -> IntStream.of(array).map(x -> integer * x).toArray();
  }
}

--------------------------------------------------------------
import java.util.function.*;
import java.util.*;

public class Kata {
  public static IntFunction<int[]> multiplyAll(int[] array) {
    return multiplier -> Arrays
      .stream(array)
      .map(i -> i * multiplier)
      .toArray();
  }
}
*/