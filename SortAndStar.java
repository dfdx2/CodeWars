/* 8KYU CodeWars Sort And Star

You will be given a list of strings. You must sort it 
alphabetically (case-sensitive, and based on the ASCII 
values of the chars) and then return the first value.

The returned value must be a string, and have "***" 
between each of its letters.

You should not remove or add elements from/to the array.

*/

import java.util.Arrays;
public class SortAndStar {

  public static String twoSort(String[] s) {
    Arrays.sort(s);
    String y = s[0];
    String x = "***";
    String z = "";
    for (int i = 0; i < y.length(); i++) {
      if (i == y.length() - 1) {
        z += y.charAt(i);
      }
      else {
        z += y.charAt(i) + x;
      }
    }
    return z;
  }
}
/*------------------------------------------------------------------------
public class SortAndStar {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
public class SortAndStar {

  public static String twoSort(String[] s) {
    return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s) {
    Arrays.sort(s);
    String str=s[0];
    return str.replace(""," ").trim().replace(" ","***");
  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s) {
    return Arrays.stream(Arrays.stream(s).sorted().findFirst().get().split("")).reduce((p, c) -> p + "***" + c).get();
  }
}
-------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class SortAndStar {

  public static String twoSort(String[] s) {
    Arrays.sort(s);
    return s[0].chars()
      .mapToObj(value -> String.valueOf((char) value))
      .collect(Collectors.joining("***"));
  }
}









*/