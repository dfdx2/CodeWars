/* 7KYU CodeWars Factorial

Your task is to write function factorial.

https://en.wikipedia.org/wiki/Factorial

*/

public class Factorial {

    public static long factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
/*----------------------------------------------------------------------------
public class Factorial {

    public static long factorial(int n) {
        
        if (n == 0) {
           return 1;
        }
        else {
           return n * factorial(n - 1);
        }
    }
}
------------------------------------------------------------------------------
import java.util.stream.LongStream;

public class Factorial {

    public static long factorial(int n) {
        return LongStream.rangeClosed(2L, n).parallel().reduce(1L, (a, b) -> a * b);
    }
}
-----------------------------------------------------------------------------
import java.util.stream.LongStream;

public class Factorial {

    public static long factorial(int n) {
        return n < 2 ? 1 : LongStream.rangeClosed(1, n).reduce((x,y) -> x * y).orElse(0);
    }
}
------------------------------------------------------------------------------
public class Factorial {

    public static long factorial(int n) {
        if (n==0) return 1;
        if (n>1) return n * factorial(n-1);
        return n;    }
}


*/