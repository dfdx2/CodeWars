/* 8KYU CodeWars No Zeros For Heros

Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105
Zero alone is fine, don't worry about it. Poor guy anyway

*/

public class NoBoring {
    public static int noBoringZeros(int n) {
      if (n == 0) {
        return 0;
      }
      while (n % 10 == 0) {
        n = n / 10;
      }
      return n;
    }
}
/*-------------------------------------------------------------------------
public class NoBoring {
    public static int noBoringZeros(int n) {
        if (n == 0) return 0;
        if (n % 10 != 0) return n;
        else return noBoringZeros (n / 10);
    }
}
----------------------------------------------------------------------------
public class NoBoring {
    public static int noBoringZeros(int n) {
       return ((n%10)==0)&&(n!=0) ? noBoringZeros(n/10) : n;
    }
}
-----------------------------------------------------------------------------
public class NoBoring {
    public static int noBoringZeros(int n) {
        return Integer.parseInt(Integer.valueOf(n).toString().replaceAll("(?!^)[0]+$", ""));
    }
}
---------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class NoBoring {
  public static int noBoringZeros(int n) {
    return IntStream.iterate(n, i -> i / 10)
                    .dropWhile(i -> i % 10 == 0 && i != 0)
                    .findFirst()
                    .orElse(0);
  }
}



*/