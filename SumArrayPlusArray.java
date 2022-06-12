/*      I'm new to coding and now I want to get the sum of two arrays...
        actually the sum of all their elements. I'll appreciate for your help.
        P.S. Each array includes only integer numbers. Output is a number too.
 */
public class SumArrayPlusArray {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...
    int sum = 0;
    int sum1 = 0;
    for (int i : arr1) {
        sum += i;
         }
    for (int j : arr2) {
            sum1 += j;
    
       }
    
    return sum + sum1;
  
   } 
}


/*
 * import java.util.stream.*;

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
  }

}
 * ------------------------------------------------------------------------
 * 
 * public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int arrSum = 0;
    for(int num : arr1) {arrSum += num;}
    for(int num : arr2) {arrSum += num;}
    return arrSum;
  }

}
 * --------------------------------------------------------------------------
 * import java.util.Arrays;
import java.util.stream.Stream;

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
  }

}
 * --------------------------------------------------------------------------
 * 
 * import static java.util.Arrays.stream;
import static java.util.stream.IntStream.concat;

public class Sum {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return concat(stream(arr1),stream(arr2)).sum();
  }
}
 * ----------------------------------------------------------------------------
 * public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
        sum += arr1[i] + arr2[i];            
    }
      return sum;
  }

}
 * ------------------------------------------------------------------------------
 * 
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    
    return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .sum();
  }

}
 * -----------------------------------------------------------------------
 * 
 * public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...
    int sum1=0,sum2=0;
    
    for (int i:arr1)sum1+=i;
    for (int i:arr2)sum2+=i;
    
    
    return sum1+sum2;
  }

}
 */