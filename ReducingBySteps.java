/*      CodeWars 6KYU Reducing By Steps
Data: an array of integers, a function f of two variables and an init value.

Example: a = [2, 4, 6, 8, 10, 20], f(x, y) = x + y; init = 0

Output: an array of integers, say r, such that

r = [r[0] = f(init, a[0]), r[1] = f(r[0], a[1]), r[2] = f(r[1], a[2]), ...]

With our example: r = [2, 6, 12, 20, 30, 50]

Task:
Write the following functions of two variables

som : (x, y) -> x + y
mini : (x, y) -> min(x, y)
maxi : (x, y) -> max(x, y)
lcmu : (x, y) -> lcm(abs(x), abs(y) (see note for lcm)
gcdi : (x, y) -> gcd(abs(x), abs(y) (see note for gcd)
and

function oper_array(fct, arr, init) (or operArray or oper-array) where

fct is the function of two variables to apply to the array arr (fct will be one of som, mini, maxi, lcmu or gcdi)

init is the initial value

Examples:
a = [18, 69, -90, -78, 65, 40]
oper_array(gcd, a, a[0]) => [18, 3, 3, 3, 1, 1]
oper_array(lcm, a, a[0]) => [18, 414, 2070, 26910, 26910, 107640]
oper_array(sum, a, 0) => [18, 87, -3, -81, -16, 24]
oper_array(min, a, a[0]) => [18, 18, -90, -90, -90, -90]
oper_array(max, a, a[0]) => [18, 69, 69, 69, 69, 69]
Notes:
The form of the parameter fct in oper_array (or operArray or oper-array) changes according to the language. You can see each form according to the language in "Your test cases".

AFAIK there are no corner cases, everything is as nice as possible.

lcm and gcd see: https://en.wikipedia.org/wiki/Least_common_multiple https://en.wikipedia.org/wiki/Greatest_common_divisor

you could google "reduce function (your language)" to have a general view about the reduce functions.

In Shell bash, arrays are replaced by strings.

In OCaml arrays are replaced by lists.


*/
import java.util.function.LongBinaryOperator;


public class Operarray {
    public static long gcdi(long x, long y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return y == 0 ? x : gcdi(y, x % y);
    }

    public static long lcmu(long a, long b) {
        return Math.abs(a * (b / gcdi(a, b)));
    }

    public static long som(long a, long b) {
        return a + b;
    }

    public static long maxi(long a, long b) {
        return Math.max(a, b);
    }

    public static long mini(long a, long b) {
        return Math.min(a, b);
    }

    public static long[] operArray(LongBinaryOperator operator, long[] arr, long init) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = operator.applyAsLong(i == 0 ? init : result[i - 1], arr[i]);
        }
        return result;
    }
}
/*-------------------------------------------------------------------
import static java.lang.Math.abs;

import java.util.function.BiFunction;

public class Operarray {
    public static long gcdi(long x, long y) {
        return abs(y) == 0 ? abs(x) : gcdi(abs(y), abs(x) % abs(y));
    }
    public static long lcmu(long a, long b) {
        return abs(a) * abs(b) / gcdi(abs(a), abs(b));
    }
    public static long som(long a, long b) {
        return a + b;
    }
    public static long maxi(long a, long b) {
        return a > b ? a : b;
    }
    public static long mini(long a, long b) {
        return a < b ? a : b;
    }
    public static long[] operArray(BiFunction<Long, Long, Long> operator, long[] arr, long init) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = operator.apply(i - 1 < 0 ? init : result[i - 1], arr[i]);
        }
        return result;
    }
}
----------------------------------------------------------------------------------
import static java.math.BigInteger.valueOf;
import static java.util.stream.LongStream.of;

import java.util.function.LongBinaryOperator;

class Operarray {
  static long gcdi(long x, long y) {
    return valueOf(x).gcd(valueOf(y)).longValue();
  }

  static long lcmu(long a, long b) {
    return Math.abs(b / gcdi(a, b) * a);
  }

  static long som(long a, long b) {
    return a + b;
  }

  static long maxi(long a, long b) {
    return Math.max(a, b);
  }

  static long mini(long a, long b) {
    return Math.min(a, b);
  }

  static long[] operArray(LongBinaryOperator operator, long[] arr, long init) {
    var previous = new long[] {init};
    return of(arr).map(l -> previous[0] = operator.applyAsLong(previous[0], l)).toArray();
  }
}
-----------------------------------------------------------------------------
import java.util.function.*;
import java.math.BigInteger;

public class Operarray {
    public static long gcdi(long x, long y) {
        return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue();
    }
    public static long lcmu(long a, long b) {
        return Math.abs(a * b / gcdi(a,b));
    }
    public static long som(long a, long b) {
        return a + b;
    }
    public static long maxi(long a, long b) {
        return Math.max(a,b);
    }
    public static long mini(long a, long b) {
        return Math.min(a,b);
    }
    public static long[] operArray(BiFunction<Long,Long,Long> operator, long[] arr, long init) {
        long[] res = arr.clone();
        res[0] = operator.apply(res[0],init);
        for (int i = 1; i < res.length; i++)
            res[i] = operator.apply(res[i],res[i-1]);
        return res;
    }

}
----------------------------------------------------------------------------

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.LongStream;

public class Operarray {
    public static long gcdi(long a, long b) {
        return BigInteger.valueOf(Math.abs(a))
                .gcd(BigInteger.valueOf(Math.abs(b)))
                .longValue();
    }

    public static long lcmu(long a, long b) {
        long max, min, x, lcm = 1;
        max = Math.max(Math.abs(a), Math.abs(b));
        min = Math.min(Math.abs(a), Math.abs(b));
        for (int i = 1; i <= min; i++) {
            x = max * i;
            if (x % min == 0) {
                lcm = x;
                break;
            }
        }
        return lcm;
    }

    public static long som(long a, long b) {
        return a + b;
    }

    public static long maxi(long a, long b) {
        return Math.max(a, b);
    }

    public static long mini(long a, long b) {
        return Math.min(a, b);
    }

    public static long[] operArray(BinaryOperator<Long> operator, long[] arr, long init) {

        return LongStream.of(arr).boxed().collect(PairCollector.collector(operator, init));
    }

    private static final class PairCollector {
        private List<Long> res = new ArrayList<>();

        private Long curr;
        private BinaryOperator<Long> operator;

        private PairCollector(BinaryOperator<Long> operator, Long first) {
            this.curr = first;
            this.operator = operator;
        }

        public static Collector<Long, ?, long[]> collector(BinaryOperator<Long> operator, Long first) {
            return Collector.of(() -> new PairCollector(operator, first), PairCollector::accept, PairCollector::combine, PairCollector::finish);
        }

        private void accept(Long value) {
            curr = operator.apply(curr, value);
            res.add(curr);
        }

        private PairCollector combine(PairCollector other) {
            throw new UnsupportedOperationException("Parallel Stream not supported");
        }

        private long[] finish() {
            return res.stream().mapToLong(i -> i).toArray();
        }
    }
}




*/