
/*Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state
 to welcome a person. Note that name will be an array consisting of one or more values 
 that should be joined together with one space between each, and the length of the name 
 array in test cases will vary.
*/

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