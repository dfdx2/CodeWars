/* 8KYU CodeWars  Grasshopper - Personalized Message

Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

Use conditionals to return the proper message:

case	return
name equals owner	'Hello boss'
otherwise	'Hello guest'

*/

class Kata {
  static String greet(String name, String owner) {
    return (owner.equalsIgnoreCase(name)) ? "Hello boss" : "Hello guest";
  }
}

/*------------------------------------------------------------------
class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        // Add code here
      if (owner.equalsIgnoreCase(name)) {
        return ("Hello boss");
      }
      else {
        return ("Hello guest");
      }
    }
}
--------------------------------------------------------------------
class Kata {
    static String greet(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss":"guest");
    }
}
---------------------------------------------------------------------
class Kata {
    static String greet(String name, String owner) {
      String a = "Hello boss" ; 
      String b = "Hello guest";
      if (name.matches(owner)){
          return a;
          }
          else {
            return b;
        }
    }
}

*/