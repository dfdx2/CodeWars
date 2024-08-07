/* 6KYU CodeWars Sum Of Parts

Let us consider this example (array written in general format):

ls = [0, 1, 3, 6, 10]

Its following parts:

ls = [0, 1, 3, 6, 10]
ls = [1, 3, 6, 10]
ls = [3, 6, 10]
ls = [6, 10]
ls = [10]
ls = []
The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]

The function parts_sums (or its variants in other languages) 
will take as parameter a list ls and return a list of the sums 
of its parts as defined above.

Other Examples:

ls = [1, 2, 3, 4, 5, 6] 
parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]

ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]

parts_sums(ls) -> [10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0]

Notes

Take a look at performance: some lists have thousands of elements.

Please ask before translating.

*/
class SumOfParts {
  public static int[] sumParts(int[] ls) {
    int[] result = new int[ls.length + 1];
    for (int i = ls.length - 1; i >= 0; i--) {
      result[i] = result[i + 1] + ls[i];
    }
    return result;
  }
}
/*--------------------------------------------------------------------
class SumParts {

  public static int[] sumParts(int[] ls) {
    int[] result = new int[ls.length+1];
    for(int i = ls.length-1; i >= 0; --i) {
      result[i] = result[i+1] + ls[i];
    }
    return result;
  }
}
----------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class SumParts {

public static int[] sumParts(int[] ls) {

        int[] result = new int[ls.length + 1];

        int sum = Arrays.stream(ls).sum();

        for (int i = 0; i<ls.length;i++){
            result[i] = sum;
            sum = sum - ls[i];
        }

        return result;
    }
}
----------------------------------------------------------------------
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.ArrayList;

class SumParts {

    static class DiffCollector implements IntConsumer {
      private int sum = 0;
      private ArrayList<Integer> results = new ArrayList<Integer>();
      public DiffCollector(int total) {
        sum = total;
      }
      public void accept(int value) {
        results.add(sum);
        sum -= value;
    }
    public ArrayList<Integer> getResults() {
      results.add(0);
      return results;
    }
  }
    
  public static int[] sumParts(int[] ls) {
      int sum = Arrays.stream(ls).sum();
      DiffCollector collector = new DiffCollector(sum);
      Arrays.stream(ls).forEachOrdered(collector);
      return collector.getResults().stream().mapToInt(Integer::intValue).toArray();
  }
}
----------------------------------------------------------------------
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

class SumParts {

    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int diff = 0;
        int sum = Arrays.stream(ls).sum();
        for (int i = 0; i < ls.length; i++) {
            result[i] = sum - diff;
            diff += ls[i];
        }
        return result;
    }
}
----------------------------------------------------------------------
class SumParts {

  public static int[] sumParts(int[] ls) {
      int sum = 0, parts[] = new int[ls.length + 1];      
      for (int i = parts.length - 2; i >= 0; i--) parts[i] = sum += ls[i];
      return parts;
  }
  
}
----------------------------------------------------------------------
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.concat;
import static java.util.stream.IntStream.of;

import java.util.concurrent.atomic.AtomicInteger;

class SumParts {
    public static int[] sumParts(int[] ls) {
        var sum = new AtomicInteger(stream(ls).sum());
        return concat(of(sum.get()), stream(ls).map(i -> sum.addAndGet(-i))).toArray();
    }
}
----------------------------------------------------------------------
class SumParts {

  public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int sum = 0;

        for (int elem : ls) {
            sum += elem;
        }

        int minus = 0;
        for (int i = 0; i < result.length - 1; i++) {
            result[i] += sum - minus;
            minus += ls[i];
        }
    
        result[result.length - 1] = 0;
        return result;
  }
}
----------------------------------------------------------------------
class SumParts {

    public static int[] sumParts(int[] ar) {
        int[] a = new int[ar.length + 1];
        for (int i = ar.length - 1; i >= 0; i--) a[i] = a[i + 1] + ar[i];
        return a;
    }
}
*/