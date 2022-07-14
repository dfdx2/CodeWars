// 6 KYU CodeWars  Moduli Number System

/* 
A number system with moduli is deﬁned by a vector of k moduli, [m1,m2, ···,mk].

The moduli must be pairwise co-prime, which means that, for any pair of moduli, 
the only common factor is 1.
In such a system each number n is represented by a string "-x1--x2-- ... --xk-" 
of its residues, one for each modulus. The product m1 * ... * mk must be greater 
than the given number n which is to be converted in the moduli number system.
For example, if we use the system [2, 3, 5] the number n = 11 is represented 
by "-1--2--1-", the number n = 23 by "-1--2--3-".
If we use the system [8, 7, 5, 3] the number n = 187 becomes "-3--5--2--1-".
You will be given a number n (n >= 0) and a system S = [m1,m2, ···,mk] and you 
will return a string "-x1--x2-- ...--xk-" representing the number n in the system S.
If the moduli are not pairwise co-prime or if the product m1 * ... * mk is not 
greater than n, return "Not applicable".

Examples:
(you can add them in the "Sample tests")
fromNb2Str(11, [2,3,5]) -> "-1--2--1-"
fromNb2Str(6, [2, 3, 4]) -> "Not applicable", since 2 and 4 are not coprime
fromNb2Str(7, [2, 3]) -> "Not applicable" since 2 * 3 < 7
*/

import java.util.Arrays;

public class ModSystem {
    public static String fromNb2Str(int n, int[] sys) {
        int product = Arrays.stream(sys).reduce(1, (i, j) -> i * j);
        if (product <= n) {
            return "Not applicable";
        }

        if (Arrays.stream(sys).anyMatch(i -> Arrays.stream(sys).anyMatch(j -> (j > i && coprime(j, i) == 0)))) {
            return "Not applicable";
        }

        StringBuilder result = new StringBuilder();
        Arrays.stream(sys).forEach(i -> result.append("-").append(n % i).append("-"));
        return result.toString();
    }

    public static int coprime(int x, int y) {
        int result = x % y;
        return result > 1 ? coprime(y, result) : result;
    }
}
/* 
------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class ModSystem {

    private static int gcd(int a, int b) {
        return (a == 0) ? b : gcd(b % a, a);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    public static String fromNb2Str(int n, int[] bases) {
        int product = Arrays.stream(bases).reduce(1, (a,b) -> a*b);
        int baseLcm = Arrays.stream(bases).reduce(1, ModSystem::lcm);
        if (baseLcm != product || product <= n) return "Not applicable";

        return Arrays.stream(bases)
                .map(base -> n % base)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining("--", "-", "-"));
    }

}
----------------------------------------------------------------------------------

public class ModSystem { 
  public static String fromNb2Str(int n, int[] sys) {
    var prd = 1;
    var lcm = 1;
    var res = new java.lang.StringBuilder();
    for (var e : sys) {
      prd *= e;
      lcm = (lcm * e) / gcd(lcm, e);
      res.append(String.format("-%d-", n % e));
    }
    return prd < n || lcm != prd ? "Not applicable" : res.toString();
  }
  private static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
-----------------------------------------------------------------------------------------
public class ModSystem {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static String fromNb2Str(int n, int[] sys) {
        int prod = 1;
        for (int v : sys) {
            prod *= v;
        }
        if (prod <= n) {
            return "Not applicable";
        }
        for (int i = 0; i < sys.length; ++i) {
            for (int j = i + 1; j < sys.length; ++j) {
                if (gcd(sys[i], sys[j]) > 1) {
                    return "Not applicable";
                }
            }
        }
        String res = "";
        for (int v : sys) {
            res += "-" + n % v + "-";
        }
        return res;
    }
}


*/