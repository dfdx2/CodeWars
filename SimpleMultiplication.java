/*  KYU 8 Simple Multiplication

This kata is about multiplying a given number by 
eight if it is an even number and by nine otherwise.

*/

public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        //your code here
        if (n % 2 == 0) {
          return n * 8;
        }
      else {
        return n * 9;
      }
    }
}
/*--------------------------------------------------------
public class Sid {
    public static int simpleMultiplication (int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}



*/