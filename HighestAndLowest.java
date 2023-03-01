/* 7KYU CodeWars Highest and Lowest

In this little assignment you are given a string of space separated numbers, 
and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

*/

public class Kata {
  public static String highAndLow(String numbers) {
    String[] result = numbers.split(" ");
    int low = Integer.parseInt(result[0]);
    int high = Integer.parseInt(result[0]);
    for (int i = 1; i < result.length; i++) {
      if (low > Integer.parseInt(result[i])) {
        low = Integer.parseInt(result[i]);
      }
      if (high < Integer.parseInt(result[i])) {
        high = Integer.parseInt(result[i]);
      }
    }
    return String.valueOf(high) + " " + String.valueOf(low);
  }
}
/*-----------------------------------------------------------------------------------------
import static java.util.Arrays.stream;

class Kata {
  static String highAndLow(String numbers) {
    var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    return stats.getMax() + " " + stats.getMin();
  }
}
--------------------------------------------------------------------------------------------
public class Kata {
  public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
  }
}
-----------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String highAndLow(String numbers) {
        List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        return "%s %s".formatted(Collections.max(nums), Collections.min(nums));
    }
}
------------------------------------------------------------------------------------------
public class Kata {
  public static String highAndLow(String numbers) {
   String[] stringList = numbers.split(" ");

        long mix = -999999999;
        long min = 999999999;

        for(String number : stringList){
            int numberTemp = Integer.parseInt(number);

            if(numberTemp > mix){
                mix = numberTemp;
            }

            if(numberTemp < min){
                min = numberTemp;
            }

        }

        return String.valueOf(mix) + " " + String.valueOf(min);
  }
}
---------------------------------------------------------------------------------------------
import java.util.Collections;
import java.util.ArrayList;
public class Kata {
  public static String highAndLow(String numbers) {
    // Code here or
    String[] num = numbers.split(" ");
    ArrayList<Integer> list = new ArrayList<>();
    for(String s : num){
      list.add(Integer.parseInt(s));
    }
    Collections.sort(list);
    
    return list.get(list.size() - 1) + " " + list.get(0);
  }
}
------------------------------------------------------------------------------------------------
import java.util.*;

public class Kata {
  private static final String SPACE = " ";
  public static String highAndLow(String numbers) {
    TreeSet<Integer> numberSet = new TreeSet<Integer>();   
    String[] numberArr = numbers.split(SPACE);
    for(String numberVal: numberArr){
     numberSet.add(Integer.parseInt(numberVal));
    }                   
    return String.valueOf(numberSet.last()) + SPACE +String.valueOf(numberSet.first());                
      
  }
}
----------------------------------------------------------------------------------------
public class Kata {
  public static String highAndLow(String numbers) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int x;
    String[] num = numbers.split(" ");
    for(String s: num){
      x = Integer.parseInt(s);
      if(min > x) {min = x;}
      if(max < x) {max = x;}
    }
    
    return max + " " + min;
  }
}


*/