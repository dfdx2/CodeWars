/* 7KYU CodeWars Four/Seven

Simple kata, simple rules: your function should accept the inputs 4 and 7. 
If 4 is entered, the function should return 7. If 7 is entered, the function 
should return 4. Anything else entered as input should return 0. There's only 
one catch, your function cannot include if statements, switch statements, or 
the ternary operator.

There are some very simple ways of answering this problem, but I encourage 
you to try and be as creative as possible.

Good Luck!

*/

public class Kata{
    public static int fourSeven(int n){
      while (n == 7) {
        return 4;
      }
      while (n == 4) {
        return 7;
      }
      return 0;
    }
  }
/*---------------------------------------------------------------------------
import java.util.Map;

public class Kata{
  static final Map<Integer, Integer> results = Map.of(4, 7, 7, 4);
  public static int fourSeven(int n) {
    return results.getOrDefault(n, 0);
  }
}
------------------------------------------------------------------------------
public class Kata{
  public static int fourSeven(int n){  
    while(n!=4 && n!=7){return 0;}
    return 11-n;
  }
}
------------------------------------------------------------------------------
import java.util.*;

public class Kata{
    public static int fourSeven(int n){
        var i = new HashMap<Integer, Integer>() {{
            put(4, 7);
            put(7, 4);
        }};

        try {
            return i.get(n);
        } catch (Exception e) {
            return 0;
        }
    };
}
--------------------------------------------------------------------------
public class Kata{
  public static int fourSeven(int n){
    int[] arr = new int[8];
    arr[4] = 7;
    arr[7] = 4;
    try {
        return arr[n];
    } catch (IndexOutOfBoundsException e) {
        return 0;
    }
  }
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.Arrays;

public class Kata{
  public static int fourSeven(int n){
    int[] num = new int[]{11 - n};
    return IntStream.of(num).filter(s -> s == 4 || s == 7).max().orElse(0);
  }
}




*/