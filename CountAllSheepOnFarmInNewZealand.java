/*  7KYU CodeWars  Count all the sheep on the farm in the heights of New Zealand

Every Friday and Saturday night, farmer counts amount of sheep returned 
back to his farm (sheep returned on Friday stay and don't leave for a weekend).

Sheep return in groups each of the days -> you will be given two arrays with 
these numbers (one for Friday and one for Saturday night). Entries are always 
positive ints, higher than zero.

Farmer knows the total amount of sheep, this is a third parameter. You need 
to return the amount of sheep lost (not returned to the farm) after final 
sheep counting on Saturday.

Example 1: Input: {1, 2}, {3, 4}, 15 --> Output: 5

Example 2: Input: {3, 1, 2}, {4, 5}, 21 --> Output: 6

Good luck! :-)

*/

public class Kata {
  public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {

    int result = 0;
    int result2 = 0;
    int total = 0;
    for (int i = 0; i < fridayNightCounting.length; i++) {
      result = result + fridayNightCounting[i];
      }
    for (int i = 0; i < saturdayNightCounting.length; i++) {
      result2 = result2 + saturdayNightCounting[i];
    }
    total = sheepTotal - (result + result2);
    return total;
  }
}

/*-------------------------------------------------------------------------- 
public class Kata {
  public static int lostSheeps(int[] a, int[] b, int t) {
    for (int i=0; i<a.length; i++) t-=a[i];
    for (int i=0; i<b.length; i++) t-=b[i];
    return t;
  }
}
-----------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

class Kata {
  static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
    return sheepsTotal - of(fridayNightCounting).sum() - of(saturdayNightCounting).sum();
  }
}
--------------------------------------------------------------------------------

public class Kata {
  public static int lostSheep(int[] fri, int[] sat, int tot) {
    for (int s: fri) tot-=s;
    for (int s: sat) tot-=s;
    return tot;
  }
}
------------------------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
  public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
   
    int eins = Arrays.stream(fridayNightCounting).filter(x -> x >= 0).sum();
    int zwei = Arrays.stream(saturdayNightCounting).filter(x -> x >= 0).sum();

    return sheepsTotal - eins - zwei;
    //streamsarehardtounderstand
  }
}









*/