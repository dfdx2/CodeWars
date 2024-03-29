/*  8KYU Grasshopper Summation
Summation
Write a program that finds the summation of every number from 1 to num. 
The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8

*/

public class GrassHopper {

    public static int summation(int n) {
      int result = 0;
      for (int i = n; i > 0; i--) {
        result += i;
      }

        return result;
    }
}
/*------------------------------------------------------------------------------
 public class GrassHopper {

    public static int summation(int n) {

        return  n*(n+1)/2;
    }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {

        return IntStream.rangeClosed(1,n).sum();
    }
}
-----------------------------------------------------------------------------------




*/