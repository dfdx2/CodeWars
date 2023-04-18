/* 8KYU CodeWars Reversed Sequence

Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]

*/

public class Sequence{

  public static int[] reverse(int n){
    int[] result = new int[n];
    int count = 0;
    for (int i = n; i > 0; i--) {
      result[count] = i;
      count++;
    }
    return result;
  }

}
/*-------------------------------------------------------------------
public class Sequence{

  public static int[] reverse(int n){
    //your code
    int[] res = new int[n];
    for (int i=0; i<n; i++) 
      res[i]=n-i;
    return res;
  }

}
------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Sequence{

  public static int[] reverse(int n){
    
    return IntStream.range(-n, 0).map(Math::abs).toArray();
  }

}
------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Sequence{

  public static int[] reverse(int n){
    return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
  }

}
-----------------------------------------------------------------------
import java.util.stream.IntStream;

class Sequence {
  static int[] reverse(int n) {
    return IntStream.iterate(n, i -> --i).limit(n).toArray();
  }
}
-----------------------------------------------------------------------
import java.util.*;

public class Sequence{

  public static int[] reverse(int n){
    List<Integer> list = new ArrayList<>();
    
    for( Integer i = n; i > 0; i-- ){
      list.add( i );
    }
    
    int[] array = list.stream().mapToInt(i->i).toArray();
    
    return array;
  }

}




*/