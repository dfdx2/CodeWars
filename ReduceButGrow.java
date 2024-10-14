/*  8KYU CodeWars  Reduce But Grow
Given a non-empty array of integers, return the result 
of multiplying the values together in order. 

Example:
[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

*/
import java.util.*;
public class ReduceButGrow {
  public static int grow(int[] x){
    return Arrays.stream(x).reduce(1, (a, b) -> a * b);
  }
}
/*---------------------------------------------------------------
public class Kata{

  public static int grow(int[] x){
    int result = 1;
    for (int i = 0; i < x.length; i++) {
      result *= x[i];
    }
    return result;
  }
}
-----------------------------------------------------------------
public class Kata{

  public static int grow(int[] x){
    int result = 1;
    for (int a : x) {
      result *= a;
    }
    return result;
  }
}
-------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata{

  public static int grow(int[] x){

    return IntStream.of(x).reduce(1, (a, b) -> a * b);
  
  }

}
-------------------------------------------------------------------
import java.util.*;

public class Kata{

  public static int grow(int[] x){
    return Arrays.stream(x).reduce(1 ,(a, b) -> a * b);
  }

}
--------------------------------------------------------------
public class Kata{

  public static int grow(int[] x){
    int r = 1;
    for (int n : x) r *= n; 
    return r;
  }

}

*/