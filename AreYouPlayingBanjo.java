/*  8KYU CodeWars Are you playing Banjo

Create a function which answers the question 
"Are you playing banjo?".
If your name starts with the letter "R" or 
lower case "r", you are playing banjo!
So your solution has to account for that.

The function takes a name as its only argument, 
and returns one of the following strings:

name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings.

*/

public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    // Program me!
    char initial = name.charAt(0);
    if ((initial == 'R') || (initial == 'r')) {
      return (name + " plays banjo");
    }
    else {
      return (name + " does not play banjo");
    }
  }
}
/*------------------------------------------------------------
 public class Banjo 
{
  public static String areYouPlayingBanjo(String name) 
  {
    if( name.toUpperCase().startsWith("R") )
      return name + " plays banjo";
    else
      return name + " does not play banjo";
  }
}
---------------------------------------------------------------
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
      return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
  }
}
---------------------------------------------------------------
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return (Character.toLowerCase(name.toCharArray()[0]) == 'r') 
           ? name + " plays banjo" 
           : name + " does not play banjo";
  }
}
--------------------------------------------------------------------


*/
