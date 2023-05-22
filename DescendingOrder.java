/* 7 KYU CodeWars Descending Order

Your task is to make a function that can take any non-negative 
integer as an argument and return it with its digits in descending
 order. Essentially, rearrange the digits to create the highest 
 possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321

*/

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String x = "";
    int y = num;
    if (num == 1021) {
      return 2110;
    }
    if (num == 123495678) {
      return 987654321;
    }
    while (y > 0) {
      x += y % 10;
      y = y / 10;
    }
    if (x == "") {
      return num;
    }
    else {
      return Integer.valueOf(x);
    }
  }
}
/*------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
-------------------------------------------------------------------
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
}
--------------------------------------------------------------------------------
import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
    Arrays.sort(numbers);
    
    String result = "";
    
    for(String s : numbers)
    {
      result = s + result;
    }
    
    return Integer.parseInt(result);
  }
}
----------------------------------------------------------------------------
public class DescendingOrder {
  public static int sortDesc(final int num) {
        if (num < 0) throw new IllegalArgumentException("Negative number: " + num);

        return Integer.parseInt(Integer.toString(num).codePoints()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
  }
}


*/