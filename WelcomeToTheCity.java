/* 8KYU CodeWars Welcome To The City

Create a method sayHello/say_hello/SayHello that takes as 
input a name, city, and state to welcome a person. Note that 
name will be an array consisting of one or more values that 
should be joined together with one space between each, and 
the length of the name array in test cases will vary.

Example:

sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
This example will return the string Hello, John Smith! 
Welcome to Phoenix, Arizona!

*/
public class WelcomeToTheCity {
  public String sayHello(String [] name, String city, String state){
    if (name.length == 3) {
      return "Hello, " + name[0] + " " + name[1] + " " + name[2] + "! Welcome to " + city + ", " + state + "!";
    }
    return "Hello, " + name[0] + " " + name[1] + "! Welcome to " + city + ", " + state + "!";
  }
}

/*-----------------------------------------------------------------------
public class Hello{
  public String sayHello(String [] name, String city, String state) {
    
    String x = "";
    for (int i = 0; i < name.length; i++) {
      x += " " + name[i];
    }
    return "Hello," + x + "!" + " Welcome to " + city + ", " + state + "!";
  }
}
----------------------------------------------------------------------
public class Hello{
  public String sayHello(String[] name, String city, String state){
    return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
  }
}
---------------------------------------------------------------------
public class Hello{
  public String sayHello(String [] name, String city, String state){
    String fullName = "";
    for (String nam : name){
        fullName += " " + nam;
    }
    return String.format("Hello,%s! Welcome to %s, %s!", fullName, city, state);
  }
}
----------------------------------------------------------------------
public class Hello{
  public String sayHello(String [] name, String city, String state){
    String fullName = String.join(" ", name);
    return String.format("Hello, %s! Welcome to %s, %s!", fullName, city, state);
  }
}
----------------------------------------------------------------------
public class Hello{
  public String sayHello(String [] name, String city, String state){
    StringBuilder sb = new StringBuilder();
    sb.append("Hello,");
    for(String n : name){
      sb.append(" ");
      sb.append(n);
    }
    sb.append("! Welcome to ");
    sb.append(city);
    sb.append(", ");
    sb.append(state);
    sb.append("!");
    return sb.toString();
  }
}
--------------------------------------------------------------------
import org.apache.commons.lang3.StringUtils;

public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
     String str = StringUtils.join(name," ");
    return "Hello, " + str +"! Welcome to " +city +", "+ state + "!";
  }
}
---------------------------------------------------------------------
class Hello {
  String sayHello(String[] name, String city, String state) {
    return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
  }
}
----------------------------------------------------------------------
public class We!comeToTheCity{
    public String sayHello(String [] name, String city, String state){
      //code here
      return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
    }
  }

/*---------------------------------------------------------------------------------------- */
/*import java.util.*;
public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
    StringBuilder str = new StringBuilder();
    str.append(name[0]);
    str.append(" ");
    str.append(name[1]);
    str.append("!");
    String str1 = " Welcome to ";
    String tres = (city + ", " + state + "!");
    return ("Hello, " + str + str1 + tres);
  }
} */


*/