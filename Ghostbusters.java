/*  7KYU CodeWars Ghostbusters

Oh no! Ghosts have reportedly swarmed the city. It's your job to get rid 
of them and save the day!

In this kata, strings represent buildings while whitespaces within those 
strings represent ghosts.

So what are you waiting for? Return the building(string) without any 
ghosts(whitespaces)!

Example:

ghostBusters("Sky scra per");
Should return:

"Skyscraper"
If the building contains no ghosts, return the string:

"You just wanted my autograph didn't you?"

*/

public class Ghostbusters {
  
  public static String ghostBusters(String building) {
    for(int i = 0; i < building.length(); i++) {
      if (building.charAt(i) == ' ') {
        return building.replace(" ", "");
      }
    }
    return "You just wanted my autograph didn't you?";
  }
}
/*--------------------------------------------------------------------------
public class Ghostbusters {
  
  public static String ghostBusters(String building) {
    return building.contains(" ") ? building.replace(" ", "") : "You just wanted my autograph didn't you?";
  }
}
--------------------------------------------------------------------------------
public class Ghostbusters {
  
  public static String ghostBusters(String building) {
    if(!building.contains(" ")) return "You just wanted my autograph didn't you?";
    else return building.replaceAll(" ", "");
  }
}
--------------------------------------------------------------------------------
public class Ghostbusters {
  public static String ghostBusters(String building) {
    String temp = building.replaceAll("\\s+", "");
    if (building.equals(temp)) return "You just wanted my autograph didn't you?";
    return temp;
  }
}





*/