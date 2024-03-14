/* 7KYU CodeWars Sum Of A Sequence

Your task is to write a function which returns the sum 
of a sequence of integers.

The sequence is defined by 3 non-negative values: begin, end, step.

If begin value is greater than the end, your function should return 0. 
If end is not the result of an integer number of steps, then don't add 
it to the sum. See the 4th example below.

Examples

2,2,2 --> 2
2,6,2 --> 12 (2 + 4 + 6)
1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
1,5,3  --> 5 (1 + 4)

*/

public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    int result = 0;
    for (int i = start; i <= end; i+= step) {
      result += i;
    }
    return result;
  }
}
/*--------------------------------------------------------------------
public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    int sum = 0;
    for (int i = start; i <= end; i += step) sum += i;
    return sum;
  }
}
----------------------------------------------------------------------
import static java.util.stream.IntStream.iterate;

interface Kata {
  static int sequenceSum(int start, int end, int step) {
    return iterate(start, i -> i <= end, i -> i + step).sum();
  }
}
-----------------------------------------------------------------------
interface Kata {
  static int sequenceSum(int start, int end, int step) {
    return start > end ? 0 : (end = (end - start) / step + 1) * start + end * (end - 1) / 2 * step;
  }
}
----------------------------------------------------------------------
public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    int sum = 0;

    for (int first = start; first <= end; first += step) {
      sum += first;
    }

    return sum;
  }
}
------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    public static int sequenceSum(int start, int end, int step) {
        return IntStream.rangeClosed(0, end/step).map(i->start+(i*step)>end? 0: start+(i*step)).sum();
    }
}
-----------------------------------------------------------------------
public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    if (start > end){return 0;}//check if start > end
    System.out.println("start : "+start);//look at start
    int result = 0;//empty result
    int add = start+0;//add variable
    while (add <= end){//while loop until add > end
      System.out.println("add   : "+add);//current add
      result += add;//add to result
      System.out.println("result: "+result + "(" + (result-add) + " + " + add + ")");//result change from prev to next
      add += step;//change add
    }
    System.out.println("Final : "+result);//final result
    return result;//return
  }
}
-----------------------------------------------------------------------
public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    int len = end - start;
    return len < 0 ? 0 : (len / step + 1) * 
      (end + start - len % step) / 2;
  }
}
*/