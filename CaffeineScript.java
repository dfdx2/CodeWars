/*   7KYU Caffeine Script

Complete the function which takes a non-zero integer as its argument.

If the integer is divisible by 3, return the string "Java".

If the integer is divisible by 3 and divisible by 4, return the string "Coffee"

If one of the condition above is true and the integer is even, add "Script" to the end of the string.

If none of the condition is true, return the string "mocha_missing!"

Examples
1   -->  "mocha_missing!"
3   -->  "Java"
6   -->  "JavaScript"
12  -->  "CoffeeScript"

*/
public class CaffeineScript {
  public static String caffeineBuzz(int n){
    return n % 12 == 0 ? "CoffeeScript" : n % 3 == 0 && n % 2 == 0 ? "JavaScript" : n % 4 == 0 ? "CoffeeScript" : n % 3 == 0 ? "Java" : "mocha_missing!";
  }
}
/*---------------------------------------------------------------------------
public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    String m = "mocha_missing!";
    String j = "Java";
    String js = "JavaScript";
    String c = "Coffee";
    String cs = "CoffeeScript";
    return (n % 3 == 0 && n % 4 == 0 && n % 2 == 0) ? cs : (n % 3 == 0 && n % 2 == 0) ? js : (n % 4 == 0 && n % 2 == 0) ? cs : (n % 3 == 0) ? j : m;
  }
}
------------------------------------------------------------------------------
public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
  String message = "mocha_missing!";
    if(n != 0) {
      if(n % 3 ==0) message = "Java";
      if(n % 12 ==0) message = "Coffee";
      if(n % 2 ==0) message += "Script";
    }
    return message;
  }
}
-----------------------------------------------------------------------------
public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {
        if (n % 12 == 0) return "CoffeeScript";
        if (n % 6  == 0) return "JavaScript";
        if (n % 3  == 0) return "Java";
        return "mocha_missing!";
    }
}
------------------------------------------------------------------------------
public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {

        if (n % 3 != 0)
            return "mocha_missing!";

        String prefix = n % 4 == 0 ? "Coffee" : "Java";
        String suffix = n % 2 == 0 ? "Script" : "";

        return prefix + suffix;
    }
}
---------------------------------------------------------------------------
public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    if (n % 4 == 0  && n % 3 == 0){
      return "CoffeeScript";
    }else if (n % 6 == 0){
      return "JavaScript";
    }else if (n % 3 == 0){
      return "Java";
    }else{
      return "mocha_missing!";
    }
  }
}
----------------------------------------------------------------------------
public class CaffeineBuzz {
  public static String caffeineBuzz(int n) {
    
    if (n % 12 == 0) return "CoffeeScript";
    if (n % 3 == 0 && n % 2 == 0) return "JavaScript";
    if (n % 3 == 0) return "Java";
    
    return "mocha_missing!";
  }
}

*/
