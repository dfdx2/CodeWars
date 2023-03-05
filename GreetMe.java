/* 7KYU CodeWars Greet Me

Write a method that takes one argument as name and then greets that name, 
capitalized and ends with an exclamation point.

Example:

"riley" --> "Hello Riley!"
"JACK"  --> "Hello Jack!"

*/

public class GreetMe{
  public static String greet(String name){
    String n = name.toUpperCase();
    String a = name.toLowerCase();
    String x = n.substring(0,1);
    String y = a.substring(1, a.length());
    return "Hello " + x + y + "!";
  }
}
/*---------------------------------------------------------------------------------------
public class GreetMe{
  public static String greet(String name){
    return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
  }
}
----------------------------------------------------------------------------------------
public class GreetMe{
  public static String greet(String name){
    return String.format("Hello %s!", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
  }
}
-----------------------------------------------------------------------------------------
public class GreetMe{
  public static String greet(String name){
    String lower = name.toLowerCase();
    return "Hello " + lower.substring(0,1).toUpperCase() + lower.substring(1) + "!";
  }
}
----------------------------------------------------------------------------------------
public class GreetMe{
  public static String greet(String name){
    String first = name.substring(0, 1).toUpperCase();
    String last = name.substring(1, name.length()).toLowerCase();
    StringBuilder sb = new StringBuilder();
    sb.append("Hello ")
      .append(first)
      .append(last)
      .append("!");
    return sb.toString();
  }
}



*/