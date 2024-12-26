/* 7KYU CodeWars Compound Array

You have to create a method "compoundArray" which should take as 
input two int arrays of different length and return one int array 
with numbers of both arrays shuffled one by one.

Input - {1,2,3,4,5,6} and {9,8,7,6} 
Output - {1,9,2,8,3,7,4,6,5,6}

*/
public class CompoundArray {    
    public static int[] compoundArray(int[] a, int[] b) {
      int[] result = new int[a.length + b.length];
      int j = 0;
      int x = Math.max(a.length, b.length);
      for (int i = 0; i < x; i++) {
        if (i >= a.length) {
          result[j] = b[i];
          j++;
        }
        else if (i >= b.length) {
          result[j] = a[i];
          j++;
        }
        else {
          result[j] = a[i];
          j++;
          result[j] = b[i];
          j++;
        }
      }
      return result;
    }
}
/*-------------------------------------------------------------------
public class CompoundArray {
    
    public static int[] compoundArray(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        for (int i = 0, j = 0; i < result.length; j++) {
            if (j < a.length) result[i++] = a[j];
            if (j < b.length) result[i++] = b[j];
        }
        return result;
    }
}
---------------------------------------------------------------------
public class CompoundArray {
    
    public static int[] compoundArray(int[] a, int[] b){
    int[] output = new int[a.length+b.length];
    int index=0;
    int length = (a.length > b.length) ? a.length : b.length;
    for (int i=0 ; i<length; i++){
        if (i<a.length){output[index]=a[i];
        index++;}
        if (i<b.length) {output[index]=b[i];
        index++;}
    }
        return output;
    }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;

public class CompoundArray {
    
    public static int[] compoundArray(int[] a, int[] b){
        return IntStream.range(0, Math.max(a.length, b.length))
                        .flatMap( i -> i < a.length && i < b.length ? IntStream.of(a[i], b[i])
                                                     : i < b.length ? IntStream.of(b[i])
                                                                    : IntStream.of(a[i]) )
                        .toArray();
    }
}
---------------------------------------------------------------------
public class CompoundArray {
    
    public static int[] compoundArray(int[] a, int[] b){
      int res[] = new int[a.length+b.length];
      for (int i=0,j=0; j<res.length; i++) {
        if (i < a.length) res[j++] = a[i];
        if (i < b.length) res[j++] = b[i];
      }
      return res;
    }
}
---------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

public class CompoundArray {
    
  public static int[] compoundArray(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();
    
    int limit = a.length > b.length ? a.length : b.length;
    
    for(int i = 0; i < limit; i++) {
      if(i < a.length) {
        result.add(a[i]);
      }
      if(i < b.length) {
        result.add(b[i]);
      }
    }
    
    return result.stream()
                 .mapToInt(x -> x)
                 .toArray();
  }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.Arrays;

public class CompoundArray {
    
    public static int[] compoundArray(int[] a, int[] b){
      return IntStream.concat(
        IntStream.range(0, Math.min(a.length, b.length))
                 .flatMap(i -> IntStream.of(a[i],b[i])),
        getRemainder(a, b)).toArray();
    }
    
    private static IntStream getRemainder(int[] a, int[] b) {
      return a.length > b.length
        ? Arrays.stream(a).skip(b.length)
        : Arrays.stream(b).skip(a.length);
    }
}
*/