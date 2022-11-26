/* 8KYU CodeWars If you cant sleep, just count sheep

If you can't sleep, just count sheep!!

Task:
Given a non-negative integer, 3 for example, return a string with
a murmur: "1 sheep...2 sheep...3 sheep...". Input will always 
be valid, i.e. no negative integers.

*/

class Kata {
  public static String countingSheep(int num) {
    //Add your code here
    String x = "";
    for (int i = 1; i <= num; i++) {
      x += i + " sheep...";
    }
    return x;
  }
}
/*-------------------------------------------------------------------------

class Kata {
    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }
}
----------------------------------------------------------------------------

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
  public static String countingSheep(int num) {
    return IntStream.rangeClosed(1, num)
                    .mapToObj(i -> i + " sheep...")
                    .collect(Collectors.joining());
  }
}
----------------------------------------------------------------------------





*/