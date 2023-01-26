/* 8KYU CodeWars A + B

Vasya Pupkin just started learning Java and C#. At first, 
he decided to write simple program that was supposed to 
sum up two small numbers (numbers and their sum fit in 
a byte), but it didn't work. Vasya was too sad to find 
out what is wrong. Help him to correct the mistake.

*/
public class FirstClass {
    public static byte sum (byte a, byte b) {
        int c = a + b;
        return (byte) c;
    }
}
/*---------------------------------------------------------------------

public class FirstClass {
    public static byte sum (byte a, byte b) {
        byte c =(byte) (a + b);
        return c;
    }
}
---------------------------------------------------------------------
public class FirstClass {
    public static byte sum (byte a, byte b) {
        // JLS states that operations on bytes/shorts are promoted to ints.
        // a downcast is therefore needed
        byte c = (byte)(a + b);
        return c;
    }
}
----------------------------------------------------------------------
public class FirstClass {
    public static byte sum (byte a, byte b) {
        return (byte)(a + b);
        
    }
}
---------------------------------------------------------------------
class FirstClass {
  static byte sum(byte a, byte b) {
    return a += b;
  }
}
---------------------------------------------------------------------
public class FirstClass {
    public static byte sum (byte a, byte b) {
     return new Byte(Integer.toString(a+b));
    }
}
---------------------------------------------------------------------




*/