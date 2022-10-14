/* 
We need a function that can transform a number into a string.

What ways of achieving this do you know?

Examples:
123 --> "123"
999 --> "999"
*/

class Kata {
  public static String numberToString(int num) {
    // Return a string of the number here!
    return String.valueOf(num);
  }
}

/* ------------------------------------------------------------- 
Old version

class Kata {
  public static String numberToString(int num) {
    // Return a string of the number here!
    String n = String.valueOf(num);
    return n;
  }
}
----------------------------------------------------------------
class Kata {
  public static String numberToString(int num) {
    return ""+num;
  }
}
--------------------------------------------------------------------
class Kata {
   returns the string representation of integer given 
  public static String numberToString(int num) {
    return Integer.toString(num);  
}
}
---------------------------------------------------------------------
*/