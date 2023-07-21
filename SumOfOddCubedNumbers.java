/* 7KYU CodeWars Sum Of Odd Cubed Numbers

Find the sum of the odd numbers within an array, after cubing 
the initial integers. The function should return undefined/None/nil/NULL 
if any of the values aren't numbers.

Note: There are ONLY integers in the JAVA and C# versions of this Kata.

*/
public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
   int result = 0;
   for (int i = 0; i < arr.length; i++) {
     if (arr[i] % 2 != 0) {
       result += arr[i] * arr[i] * arr[i];
     }
   }
   return result;
  }
}
/*-----------------------------------------------------------------------------
import java.util.Arrays;
public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
   return Arrays.stream(arr).filter(n -> n % 2 != 0).map(n -> n*n*n).sum();
  }
}
-------------------------------------------------------------------------------
public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
   int sum = 0;
   for(int i:arr){
       int cube = i*i*i;
       if( cube % 2 != 0)
            sum += cube;   
   }
   return sum;
  }
}
---------------------------------------------------------------------------------
public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        int result = 0;
        for(int i : arr) {
            if(i % 2 != 0)  result += Math.pow(i, 3);   
        }
        return result;
    }
}
--------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

class FindOddCubes {
  static int cubeOdd(int[] arr) {
    return of(arr).map(n -> n % 2 != 0 ? n * n * n : 0).sum();
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;

class FindOddCubes {
    static int cubeOdd(final int[] array) {
        return Arrays.stream(array)
            .map(i -> i*i*i)
            .filter(i -> i % 2 != 0)
            .sum();
    }
}
----------------------------------------------------------------------------------
public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
   return java.util.Arrays.stream(arr).map(x -> (int)Math.pow(x, 3)).filter(x -> Math.abs(x)%2==1).sum();
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;

public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
   
    return Arrays.stream(arr)
        .filter(i -> i % 2 != 0)
        .map(i -> i * i * i)
        .reduce(Integer::sum)
        .orElse(0);
  }
}



*/