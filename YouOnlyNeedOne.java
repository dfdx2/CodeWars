/*  8KYU  You only need one - Beginner

You will be given an array a and a value x. 
All you need to do is check whether the provided 
array contains the value.
Array can contain numbers or strings. X can be either.
Return true if the array contains the value, false if not.

*/

public class Solution {

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
          if (a[i] == x) {
            return true;
          }
        }
        return false;
    }
}
/*---------------------------------------------------------------------
import java.util.Arrays;

public class Solution {

    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

} 
-------------------------------------------------------------------------
import java.util.Objects;

public class Solution {

    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
          if (Objects.equals(o, x)) {
            return true;
          }
        }
        return false;
    }

}
---------------------------------------------------------------------------
import java.util.Arrays;
public class Solution {

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a)
        .anyMatch(i -> x.equals(i));
    }

}
----------------------------------------------------------------------
import static java.util.List.of;

interface Solution {
  static boolean check(Object[] a, Object x) {
    return of(a).contains(x);
  }
}


*/