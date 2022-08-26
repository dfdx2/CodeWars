/*  7KYU CodeWars  Count the divisors of a number

Count the number of divisors of a positive integer n.

Random tests go up to n = 500000.

Examples (input --> output)
4 --> 3 (1, 2, 4)
5 --> 2 (1, 5)
12 --> 6 (1, 2, 3, 4, 6, 12)
30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)

*/

public class FindDivisor {

  public long numberOfDivisors(int n) {
    // TODO please write your code below this comment
    int result = 0;
    for (int i = n; i >= 1; --i) {
      if (n % i == 0) {
        result += 1;
      }
    }
    return result;

  }

}

/*--------------------------------------------------

import java.util.stream.IntStream;
public class FindDivisor {
  public long numberOfDivisors(int n) {
    return IntStream.range(1, n+1).filter(i -> n%i==0).count();
  }
}

--------------------------------------------------------------

import java.util.stream.IntStream;

public class FindDivisor {

    public long numberOfDivisors(int n) {
        return n == 0 ? 0l : IntStream.rangeClosed(1, n/2).filter(i -> n % i == 0).count() + 1l;
    }

}

*/