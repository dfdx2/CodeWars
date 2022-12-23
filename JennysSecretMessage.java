/* 8KYU CodeWars Jenny's Secret Message

Jenny has written a function that returns a greeting for a user. 
However, she's in love with Johnny, and would like to greet him 
slightly different. She added a special case to her function, but 
she made a mistake.

Can you help her?

*/

public class Greeter {
  public static String greet(String name) {
    
    if (name.equals("Johnny")){
      return "Hello, my love!";
    }
    
    return name.format("Hello, %s!", name);
  }
}
/*-----------------------------------------------------------------
public class Greeter {
  public static String greet(String name) {
    return "Hello, " + (name == "Johnny" ?  "my love" : name) + "!";
  }
}
------------------------------------------------------------------
public class Greeter {
  public static String greet(String name) {
    if(!name.equals("Johnny")){
      return String.format("Hello, %s!", name);
    } else {
      return "Hello, my love!";
    }
  }
}
------------------------------------------------------------------
public class Greeter {
  public static String greet(String name) {
    return name.equals("Johnny")? "Hello, my love!" : String.format("Hello, %s!", name);
  }
}
------------------------------------------------------------------
public class Greeter {
  public static String greet(String name) {
    
    
    
    if(name.equals("Johnny")){
      return "Hello, my love!";
    }
    else {
      return String.format("Hello, %s!", name);
    }
  }
}


*/