/* 8KYU CodeWars Array plus Array

I'm new to coding and now I want to get the sum 
of two arrays... Actually the sum of all their 
elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. 
Output is a number too.

*/

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...
    int a = 0;
    int b = 0;
    for (int i = 0; i < arr1.length; i++) {
      a += arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      b += arr2[i];
    }
    return a + b;
  }

}
/*--------------------------------------------------------------
import java.util.stream.*;

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
  }

}
----------------------------------------------------------------
public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int arrSum = 0;
    for(int num : arr1) {arrSum += num;}
    for(int num : arr2) {arrSum += num;}
    return arrSum;
  }

}
-----------------------------------------------------------------
public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
        sum += arr1[i] + arr2[i];            
    }
      return sum;
  }

}
-----------------------------------------------------------------
public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...
    int sum1=0,sum2=0;
    
    for (int i:arr1)sum1+=i;
    for (int i:arr2)sum2+=i;
    
    
    return sum1+sum2;
  }

}

*/