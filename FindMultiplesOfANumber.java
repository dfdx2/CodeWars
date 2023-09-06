/* 8KYU CodeWars Find Multiples Of A Number

In this simple exercise, you will build a program that takes a value, integer, 
and returns a list of its multiples up to another value, limit . If limit is 
a multiple of integer, it should be included as well. There will only ever 
be positive integers passed into the function, not consisting of 0. The limit 
will always be higher than the base.

For example, if the parameters passed are (2, 6), 
the function should return [2, 4, 6] as 2, 4, and 6 
are the multiples of 2 up to 6.

*/

public class Multiples {
    public static int[] find(int base, int limit) {
        int count = limit / base;
      int[] result = new int[count];
      for (int i = 0; i < result.length; i++) {
        result[i] = base * (i + 1);
      }
      return result;
    }
}
/*-------------------------------------------------------------------------
import java.util.*;

public class Multiples {
    public static int[] find(int base, int limit) {
        List<Integer> mults = new ArrayList<>();
        
        for (int i = base; i <= limit; i++) {
            if (i % base == 0) {
                mults.add(i);
            }
        }

        return mults.stream().mapToInt(Integer::intValue).toArray();
    }
}
-----------------------------------------------------------------------------------
public class Multiples {
    public static int[] find(int base, int limit) {
        int[] numbers = new int[(int) limit / base];
        
        for (int i = 0, n = base; n <= limit; i++, n += base) {
          numbers[i] = n;
        }
        return numbers;
    }
}
------------------------------------------------------------------------------
public class Multiples {
    public static int[] find(int base, int limit) {
        int limit2 = limit;
        int count = 0;
        while (limit > 0) {
            if (limit % base == 0) {
                count++;
            }
            limit--;
        }

        int[] result = new int[count];
        int i = 0;
        while (limit2 > 0) {
            if (limit2 % base == 0) {
                result[i] = limit2;
                i++;
            }
            limit2--;
        }
        int[] newResult = new int[result.length];

        for (int j = 0; j < result.length; j++) {
            newResult[j] = result[result.length - j - 1];
        }
        return newResult;
    }
}
------------------------------------------------------------------------------
public class Multiples {


    public static int[] find(int base, int limit) {
        int arraySize = (limit / base) ;
        int[] result = new int[arraySize];
        int num = base;

        for (int i = 0; i < arraySize; i++) {
            if (num <= limit) {
                result[i] = num;
                num += base;
            }
        }

        return result;
    }
}
-------------------------------------------------------------------------
import java.util.*;

public class Multiples {
    public static int[] find(int base, int limit) {
        // your code here
      int[] arr = new int[limit/base];
      
      for(int i = 0; i < limit/base ; i++){
        arr[i] = base * (i+1);
      }
        return arr;
    }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Multiples {
    public static int[] find(int base, int limit) {
        return IntStream.rangeClosed(1, limit / base).map(i -> i * base).toArray();
    }
}
--------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public static int[] find(int base, int limit) {
      List<Integer> list = new ArrayList<>();
      int multiplicand = 1;
      int multiplier = base * multiplicand;
      
      while(multiplier <= limit) {
        list.add(multiplier);
        multiplicand++;
        multiplier = base * multiplicand;
      }
      
      return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


*/