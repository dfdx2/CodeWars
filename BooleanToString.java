/* 8KYU CodeWars Convert A Boolean To A String

Implement a function which convert the given boolean value into its string representation.

Note: Only valid inputs will be given.


*/
public class BooleanToString {
  public static String convert(boolean b) {
    return b == true ? "true" : "false";
  }
}
/*-----------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    
  String s1 = Boolean.toString(b);
  return s1;
  }
}
--------------------------------------------------------------------------
public class BooleanToString {
  
  public static String convert(boolean b){

    return String.valueOf(b);

  }

}
--------------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    return b+"";
  }
}
--------------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    if(b==true) {
      return "true";
    } else {
      return "false";
    }
  }

}
--------------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean value){
   return String.valueOf(value);
   }
}
--------------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    return "" + b;
    
  }

}
--------------------------------------------------------------------------
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
public class BooleanToString {

  public static String convert(boolean b){
    IntUnaryOperator op = i -> (((((((48*i+68)*i+55)*i%0x7F+43)*i+104)*i+47)*i%0x7F+53)*i+77)%0x7F;
    int[] chars = IntStream.iterate(102+(b?14:0), i->i!=0, op).toArray();
    return new String(chars, 0, chars.length);
  }
}
--------------------------------------------------------------------------
public class BooleanToString 
{
  public static String TRUE = "true";
  public static String FALSE = "false";
  
  public static String convert(boolean b) 
  {
    return (b) ? TRUE : FALSE;
  }
}
--------------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
      return String.format("%b", b);
  }

}
--------------------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    boolean c, a, d, f, g;
    c = b;
    a = c;
    d = a;
    f = d;
    g = f;
    return g ? "true" : "false";
  }

}
*/