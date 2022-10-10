/*  8KYU CodeWars  Multiply

Multiply 2 inputs

*/


public class Multiply {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}
/*---------------------------------------------------------------------------------
public class Multiply {
    public static Double multiply(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }
}
-------------------------------------------------------------------------------------
public class Multiply {
    public static Double multiply(Double a, Double b) {
        if(a == null || b == null)
          throw new IllegalArgumentException("Arguments must not be null");
          
        return a * b;
    }
}
------------------------------------------------------------------------------------
public class Multiply {
    public static double multiply(Double a, Double b) {
        return a * b;
    }
  public static void main(String[] args) {
        multiply(2.4,3.5);
    }
  
}
--------------------------------------------------------------------------------------
import java.util.*;

public class Multiply {
    public static Double multiply(Double ... d) {
        return Arrays
                .stream(d)
                .reduce((a, b) -> a * b)
                .get();
    }
}
-------------------------------------------------------------------------------------
public class Multiply {
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5,6));
    }
}
------------------------------------------------------------------------------------
*/