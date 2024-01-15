/* 7KYU CodeWars Digitize

Given a non-negative integer, return an array / a list 
of the individual digits in order.

Examples:

123 => [1,2,3]

1 => [1]

8675309 => [8,6,7,5,3,0,9]

*/

public class Solution{
  public static int[] digitize(int n){
    String a = String.valueOf(n);
    int[] b = new int[a.length()];
    for (int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);
      b[i] = Integer.valueOf(a.charAt(i) - '0');
    }
    return b;
  }
}
/*-------------------------------------------------------------------
public class Solution{
  public static int[] digitize(int n){
        int[] arr = new int[Integer.toString(n).length()];
        int copy = n;
        int index = arr.length - 1;
        while(copy != 0) {
            int cur = copy % 10;
            arr[index] = cur;
            index--;
            copy /= 10;
        }
        return arr;
    }
}
---------------------------------------------------------------------
import java.util.Arrays;

public class Solution{
  public static int[] digitize(int n){
    return Integer.toString(n).chars().map(c->c-'0').toArray();
  }
}
----------------------------------------------------------------------
public class Solution{
  public static int[] digitize(int n){
    return Integer.toString(n).chars().map(i -> i - '0').toArray();
  }
}
---------------------------------------------------------------------
public class Solution{
  public static int[] digitize(int n){
            String str = Integer.toString(n);
        int[] ints = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            char number = str.charAt(i);
            ints[i] = Character.getNumericValue(number);
        }
        return ints;
  }
}
----------------------------------------------------------------------
public class Solution{
  public static int[] digitize(int n){
        String[] a = String.valueOf(n).split("");
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        return b;
  }
}
*/