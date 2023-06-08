/* 7KYU CodeWars Sort Arrays - 1

Just a simple sorting usage. Create a function that returns the 
elements of the input-array / list sorted in lexicographical order.

*/

import java.util.Arrays;
public class SortArray{
  
  public static Integer[] sortArray(Integer[] names) {
    Arrays.sort(names);
    return names;
  }
  public static long[] sortArray(long[] names) {
    Arrays.sort(names);
    return names;
  }
  public static double[] sortArray(double[] names) {
    Arrays.sort(names);
    return names;
  }
  public static float[] sortArray(float[] names) {
    Arrays.sort(names);
    return names;
  }
  public static String[] sortArray(String[] names) {
    Arrays.sort(names);
    return names;
  }
  
  public static int[] sortArray(int[] names){
    Arrays.sort(names);
    return names;
  }
}
/*----------------------------------------------------------------------------------
import static java.util.Arrays.sort;

public class SortArray{
  public static int[] sortArray(int[] ary) { sort(ary); return ary; }
  public static long[] sortArray(long[] ary) { sort(ary); return ary; }
  public static float[] sortArray(float[] ary) { sort(ary); return ary; }
  public static double[] sortArray(double[] ary) { sort(ary); return ary; }
  public static Object[] sortArray(Object[] ary) { sort(ary); return ary; }
}
------------------------------------------------------------------------------
import java.util.Arrays;

interface SortArray {
  static <T> T sortArray(T array) {
    if (array instanceof int[] ints) {
      Arrays.sort(ints);
    } else if (array instanceof long[] longs) {
      Arrays.sort(longs);
    } else if (array instanceof float[] floats) {
      Arrays.sort(floats);
    } else if (array instanceof double[] doubles) {
      Arrays.sort(doubles);
    } else if (array instanceof Object[] objects){
      Arrays.sort(objects);
    }
    return array;
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;

class SortArray {
  static int[] sortArray(int[] names) {
    Arrays.sort(names);
    return names;
  }

  static long[] sortArray(long[] names) {
    Arrays.sort(names);
    return names;
  }

  static float[] sortArray(float[] names) {
    Arrays.sort(names);
    return names;
  }

  static double[] sortArray(double[] names) {
    Arrays.sort(names);
    return names;
  }

  static Object[] sortArray(Object[] names) {
    Arrays.sort(names);
    return names;
  }
}
---------------------------------------------------------------------------
public class SortArray{
  public static <T> T sortArray(T names){
    try{
      var type = names.getClass().getComponentType();
      type = type.isPrimitive() ? type : Object.class;
      var m = java.util.Arrays.class.getMethod("sort", type.arrayType());
      m.invoke(null, names);
    } catch (Exception e) {}
    return names;
  }
}



*/