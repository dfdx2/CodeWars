/*  8KYU CodeWars  Convert to Binary

Task Overview
Given a non-negative integer n, write a function 
to_binary/ToBinary which returns that number in a 
binary format.

to_binary(1)   should return 1 
to_binary(5)   should return 101 
to_binary(11)  should return 1011 

*/

public class Kata {

    public static int toBinary(int n) {
      return Integer.parseInt(Integer.toBinaryString(n));
    }
}

/*-----------------------------------------------------------------
public class Kata {

  public static int toBinary(int n) {
    return Integer.valueOf(Integer.toBinaryString(n));
  }
}
-------------------------------------------------------------------
public class Kata {

  public static int toBinary(int n) {
        int multiplier = 1;
        int value = 0;
        
        do {
            value += (n % 2) * multiplier;
            n /= 2;
            multiplier *= 10;
        } while (n > 0);
        
        return value;
    }

}
------------------------------------------------------------------
public class Kata {

  public static int toBinary(int n) {
    return n>1 ? toBinary(n/2) * 10 + n%2 : n;
  }
}


*/