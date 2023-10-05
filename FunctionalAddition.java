/*  7KYU CodeWars Functional Addition

Create a function add(n)/Add(n) which returns a function 
that always adds n to any number

Note for Java: the return type and methods have not been 
provided to make it a bit more challenging.

...returnType addOne = Kata.add(1);
addOne.method(3) => 4

*/

import java.util.function.IntUnaryOperator;

public class Kata {
  public static IntUnaryOperator add(int n) {
    IntUnaryOperator op = a ->  a + n;
    return op;
  }
}
/*-------------------------------------------------------------------------
import java.util.function.IntUnaryOperator;

public class Kata {

  public static IntUnaryOperator add(int n) {
    return num -> num + n;
  }

}
---------------------------------------------------------------------------
import java.util.function.IntUnaryOperator;

public class Kata {

  public static IntUnaryOperator add(int n) {
     return new Plus(n); 
  }
}

class Plus implements IntUnaryOperator {
  private int n;
  
  public Plus(int n) {
    this.n = n;
  }

  public int applyAsInt(int operand) {
    return this.n + operand;
  }
}



*/