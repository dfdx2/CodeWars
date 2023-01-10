/*  7KYU CodeWars  Small Enough
You will be given an array and a limit value. You must check that all values 
in the array are below or equal to the limit value. If they are, return true. 
Else, return false.

You can assume all values in the array are numbers.

*/

public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
   for (int i = 0; i < a.length; i++) {
     if (a[i] > limit) {
       return false;
     }
   }
    return true;
  }
}
/*-----------------------------------------------------------
public class Kata
{
  public static boolean smallEnough(int[] a, int limit) {
    return java.util.Arrays.stream(a).noneMatch(i -> i>limit);
  }
}
--------------------------------------------------------------
public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
	  {
	  for (int number : a) {
		  if (number > limit) return false;
	  }
	    return true;
	  }
}
---------------------------------------------------------------
import java.util.stream.*;

public class Kata {

  public static boolean smallEnough(int[] a, int limit) {
    return IntStream.of(a).allMatch(x->x<=limit);
  }
  
}
----------------------------------------------------------------
public class Kata
{
  public static boolean smallEnough(int[] a, int limit) {
    
    boolean smaller = true;
    for (int e : a) {
      if(e > limit){ 
        smaller=false;
      }
    }
    return smaller;
  }
}
--------------------------------------------------------------
public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
    return java.util.Arrays.stream(a).max().orElse(0) <= limit;
  }
}
--------------------------------------------------------------
import java.util.Arrays;

public class Kata
{
    public static boolean smallEnough(int[] a, int limit)
    {
        return Arrays.stream(a)
                .filter(e -> e <= limit)
                .count() == a.length;
    }
}
------------------------------------------------------------
import java.util.Arrays;

public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
    return Arrays.stream(a).allMatch(i -> i <= limit);
  }
}



*/