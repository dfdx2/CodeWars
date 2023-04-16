/* 8KYU CodeWars What is betweem

Complete the function that takes two integers (a, b, where a < b) and 
return an array of all integers between the input parameters, including them.

For example:

a = 1
b = 4
--> [1, 2, 3, 4]

*/

public class Kata {

  public static int[] between(int a, int b) {
    // your code here
    int count = 0;
    int x = b - a + 1;
    int[] result = new int[x];
    for (int i = a; i <= b; i++) {
      result[count] = i;
      count++;
    }
    return result;
  }
}
/*---------------------------------------------------------------
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[] between(int a, int b) {
    return rangeClosed(a, b).toArray();
  }
}
------------------------------------------------------------------
public class Kata {
  public static int[] between(int a, int b) {
    return java.util.stream.IntStream.rangeClosed(a, b).toArray();
  }
}
------------------------------------------------------------------
public class Kata {

  public static int[] between(int a, int b) {
        // your code here
        int[] result = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            result[i - a] = i;
        }
        return result;
    }
}



*/