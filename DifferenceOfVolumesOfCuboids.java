/* 8KYU CodeWwars Difference of Volumes of Cuboids

In this simple exercise, you will create a program that 
will take two lists of integers, a and b. Each list will 
consist of 3 positive integers above 0, representing the 
dimensions of cuboids a and b. You must find the difference 
of the cuboids' volumes regardless of which is bigger.

For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), 
the volume of a is 12 and the volume of b is 20. Therefore, the 
function should return 8.

Your function will be tested with pre-made examples as well as 
random ones.

If you can, try writing it in one line of code.

*/

public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    //your code here !!
    int a = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
    int b = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
    return (a > b) ? (a - b) : (b - a);
    
  }
}

/*-----------------------------------------------------------------
interface CuboidVolumes {
  static int findDifference(int[] a, int[] b) {
    return Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);
  }
}
--------------------------------------------------------------------
public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int vol1 = 1, vol2 = 1;
    for (int i = 0; i < 3; i++) {
      vol1 *= firstCuboid[i];
      vol2 *= secondCuboid[i];
    }
    
    return Math.abs(vol1 - vol2);
  }
}
----------------------------------------------------------------------
import java.util.stream.IntStream;
public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    //your code here !!
    return Math.abs(IntStream.of(firstCuboid).reduce(1, (acc, x) -> acc * x) - IntStream.of(secondCuboid).reduce(1, (acc, x) -> acc * x));
  }
}
-----------------------------------------------------------------------
public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    return Math.abs(getMulti(firstCuboid) - getMulti(secondCuboid));
  }
  
  public static int getMulti(int[] arr) {
    int sum = 1;
    for (int i = 0; i < arr.length; i++) {
      sum *= arr[i];
    }
    return sum;
  }
}
--------------------------------------------------------------------
import java.lang.Math;

public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    //your code here !!
    return Math.abs(firstCuboid[0] * firstCuboid[1] * firstCuboid[2] -
                     secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
  }
}



*/