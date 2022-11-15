/* 8KYU Convert to a Boolean to a String

Implement a function which convert the given boolean 
value into its string representation.

Note: Only valid inputs will be given.


*/

public class BooleanToString {
  public static String convert(boolean b){
    if(b == true) {
      return "true";
    } else {
      return "false";
    }
  }

}

/*----------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    return b ? "true" : "false";
  }
}
-------------------------------------------------------------
public class BooleanToString {
  public static String convert(boolean b){
    return Boolean.toString(b);
  }
}
--------------------------------------------------------------
public class BooleanToString {
  
  public static String convert(boolean b){

    return String.valueOf(b);

  }

}
--------------------------------------------------------------

*/