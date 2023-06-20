/* 7KYU CodeWars Halving Sum

Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47

*/

public class HalvingSum {
  int halvingSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n;
      n = n / 2;
    }
    return sum;
  }
}
/*----------------------------------------------------------------------------
public class HalvingSum {
  int halvingSum(int n) {
    return n == 1 ? 1 : n + halvingSum(n/2);
  }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class HalvingSum {
  int halvingSum(int n) {
    return IntStream.iterate(n, x -> x != 0, x -> x / 2).sum();
  }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class HalvingSum {
  int halvingSum(int n) {
    return IntStream.iterate(n, i -> i / 2).limit(n).filter(i -> i > 0).sum();
  }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class HalvingSum {
  int halvingSum(int n) {
    return IntStream.rangeClosed(0, 31 - Integer.numberOfLeadingZeros(n))
      .map(i -> n >> i)
      .sum();
  }
}
*/