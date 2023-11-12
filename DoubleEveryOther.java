/* 7KYU CodeWars Double Every Other

Write a function that doubles every second integer in a list, 
starting from the left.

Example:

For input array/list :

[1,2,3,4]

the function should return :

[1,4,3,8]

*/

public class Kata {
   public static int[] doubleEveryOther(int[] a){
        for (int i = 0; i < a.length; i++) {
          if (i % 2 != 0) {
            a[i] = a[i] * 2;
          }
        }
     return a;
   }
}
/*--------------------------------------------------------------------------------
public class Kata {
  public static int[] doubleEveryOther(int[] a) {
    for (int i = 1; i < a.length; i += 2) a[i] *= 2;
    return a;
  }
}
----------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Kata {
   public static int[] doubleEveryOther(int[] a) {
      return IntStream
        .range(0, a.length)
        .map(i -> a[i] << (i&1))
        .toArray();
   }
}
----------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface Kata {
  static int[] doubleEveryOther(int[] a) {
    return range(0, a.length).map(i -> a[i] * (1 + i % 2)).toArray();
  }
}
---------------------------------------------------------------------------------
import java.util.stream.*;

public class Kata {
 public static int[] doubleEveryOther(int[] a){
   return IntStream.range(0,a.length).map(i->i%2==1 ? 2*a[i] : a[i]).toArray();
 }
}
----------------------------------------------------------------------------------
public class Kata {
   public static int[] doubleEveryOther(int[] a){
        //solution
   
   //   int []b=new int [a.length];
     for(int i=1;i<a.length;i+=2)
       {
            //if(a[i]%2==0)
              //{
              a[i] *= 2;
              
            //}
       
       }
       return a;
   }
}
---------------------------------------------------------------------------------
public class Kata {
   public static int[] doubleEveryOther(int[] a){
       int[] res = new int[a.length];
     for (int x = 0; x < a.length; x++){
         res[x] = x % 2 == 1 ? a[x] * 2 : a[x];
         }
      return res;
       }
   }

---------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
   public static int[] doubleEveryOther(int[] a){
      return IntStream.range(0, a.length)
              .map(value -> value % 2 == 1 ? a[value] * 2 : a[value])
              .toArray();
   }
}
---------------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {
  public static int[] doubleEveryOther(int[] a) {
    return IntStream.range(0, a.length).map(index -> a[index] * (1 + (index % 2))).toArray();
  }
}

*/