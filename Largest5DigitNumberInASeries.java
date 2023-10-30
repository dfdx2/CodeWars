/* 7KYU CodeWars Largest 5 Digit Number In A Series

In the following 6 digit number:

283910
91 is the greatest sequence of 2 consecutive digits.

In the following 10 digit number:

1234567890
67890 is the greatest sequence of 5 consecutive digits.

Complete the solution so that it returns the greatest sequence of five consecutive digits found within the number given. The number will be passed in as a string of only digits. It should return a five digit integer. The number passed may be as large as 1000 digits.

Adapted from ProjectEuler.net



*/

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
      int result = 0;
      for (int i = 0; i < digits.length(); i++) {
        if (digits.length() - i < 5) {
          break;
        }
        else {
          int x = Integer.valueOf(digits.substring(i, i + 5));
          if (x > result) {
            result = x;
          }
        }
      }
      return result;
    }
}
/*---------------------------------------------------------------------------
public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <= digits.length() - 5; i++) {
          int number = Integer.parseInt(digits.substring(i, i + 5));
          largest = Math.max(number, largest);
        }
        return largest;
    }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        return IntStream.range(0, digits.length() - 4)
                        .mapToObj(i -> digits.substring(i, i + 5))
                        .mapToInt(Integer::parseInt)
                        .max()
                        .orElse(0);
    }
}
------------------------------------------------------------------------------
public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        int max = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
          int sub = Integer.valueOf(digits.substring(i, i+5));
          if (sub > max)
            max = sub;
        }
        return max;
    }
}
-------------------------------------------------------------------------------
public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        int max = 0;
        for (int i = 0; i < digits.length()-4; i++)
            max = Math.max(Integer.valueOf(digits.substring(i, i+5)), max);
        return max;
    }
}
--------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < digits.length()-4 ; i++) {
            list.add(Integer.parseInt(digits.substring(i,i+5)));
        }
        return Collections.max(list);
    }
}
------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface LargestFiveDigitNumber {
  static int solve(String digits) {
    return range(0, digits.length() - 4).map(i -> Integer.parseInt(digits.substring(i, i + 5))).max().orElse(0);
  }
}
-------------------------------------------------------------------------------
public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
 int result = 0;

        for (int i = 0; i < digits.length() - 4; i++) {
            final int compare = Integer.parseInt(digits.substring(i, i+5));
            result = Math.max(result, compare);
        }

        return result;
    }
}
-------------------------------------------------------------------------------
import java.util.*;
public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < digits.length()/2+2000; i++) {
            try {
                
                arr.add(digits.substring(i, i+5));
                
            } catch (Exception e) {
            }
        }
        Collections.sort(arr);
        return Integer.parseInt(arr.get(arr.size()-1)); 
    }
}
---------------------------------------------------------------------------------
public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
         int currentHighest = Integer.parseInt(digits.substring(digits.length() - 5));
        for (int i = 0; i < digits.length() - 5; i++ ) {
            int currentSubNum = Integer.parseInt(digits.substring(i, i + 5));
            if (currentSubNum > currentHighest) {
                currentHighest = currentSubNum;
            }
        }
        return currentHighest;
    }
}

-------------------------------------------------------------------------------
*/