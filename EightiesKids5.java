/* 7KYU CodeWars 80's Kids # 5 : You Can't Do That On Television
 
There are just some things you can't do on television. In this case, you've just come back from having a "delicious" Barth burger and you're set to give an interview. The Barth burger has made you queezy, and you've forgotten some of the import rules of the "You Can't Do That on Television" set.

If you say any of the following words a large bucket of "water" will be dumped on you: "water", "wet", "wash" This is true for any form of those words, like "washing", "watered", etc.

If you say any of the following phrases you will be doused in "slime": "I don't know", "slime"

If you say both in one sentence, a combination of water and slime, "sludge", will be dumped on you.

Write a function, bucketOf(str), that takes a string and determines what will be dumped on your head. If you haven't said anything you shouldn't have, the bucket should be filled with "air". The words should be tested regardless of case.

Examples:

bucketOf("What is that, WATER?!?") -> "water"
bucketOf("I don't know if I'm doing this right.") -> "slime"
bucketOf("You won't get me!") -> "air"


*/

public class EightiesKids5 {

  public static String bucketOf(String said) {
    said = said.toLowerCase();
    if (said.contains("water") && said.contains("slime") || said.contains("wet") && said.contains("i don't know") || said.contains("wet") && said.contains("slime") || said.contains("water") && said.contains("i don't know") || said.contains("wash") && said.contains("i don't know") || said.contains("wash") && said.contains("slime")) {
      return "sludge";
    }
    if (said.contains("water") || said.contains("wet") || said.contains("wash")) {
      return "water";
    }
    if (said.contains("slime") || said.contains("I don't know") || said.contains("i don't know")) {
      return "slime";
    }
    return "air";
  }
}
/*------------------------------------------------------------------------
public class EightiesKids5 {

  public static String bucketOf(String said) {
    boolean water = said.toLowerCase().matches(".*(water|wet|wash)+.*");
    boolean slime = said.toLowerCase().matches(".*(i don\\'t know|slime)+.*");
    return water && slime ? "sludge" : water ? "water" : slime ? "slime" : "air";
  }
}
--------------------------------------------------------------------------
public class EightiesKids5 {

  public static String bucketOf(String said) {
    said = said.toLowerCase();
    boolean includeWater = said.contains("water") || said.contains("wet") || said.contains("wash");
    boolean includeSlime = said.contains("slime") || said.contains("i don't know");
    if (includeWater && includeSlime) return "sludge";
    else if (includeWater) return "water";
    else if (includeSlime) return "slime";
    else return "air";
  }
}
--------------------------------------------------------------------------
public class EightiesKids5 {

  public static String bucketOf(String said) {
    String text = said.toLowerCase();
    boolean water = text.contains("wet") || text.contains("water") || text.contains("wash");
    boolean slime = text.contains("slime") || text.contains("i don't know");
    if (water && slime) return "sludge";
    if (water) return "water";
    if (slime) return "slime";
    return "air";
  }
}
--------------------------------------------------------------------------
class EightiesKids5 {
  static String bucketOf(String said) {
    var water = said.toLowerCase().matches(".*(water|wet|wash).*");
    var slime = said.toLowerCase().matches(".*(don't know|slime).*");
    return water && slime ? "sludge" : water ? "water" : slime ? "slime" : "air";
  }
}
--------------------------------------------------------------------------
public class EightiesKids5 {

  public static String bucketOf(String said) {
    String w[] = {"water","wet","wash"},s[] = {"i don't know","slime"};
    for(String x:w) {
      if(said.toLowerCase().indexOf(x) >=0){
           for(String y:s) if(said.toLowerCase().indexOf(y) >=0) return "sludge"; 
           return "water";
        }    
    }
    for(String z:s) if(said.toLowerCase().indexOf(z) >=0) return "slime";
    return "air";
  }
}
--------------------------------------------------------------------------
public class EightiesKids5 {

  public static String bucketOf(String said) {
    boolean water = said.matches(".*(?i)(?:water|wet|wash).*");
    boolean slime = said.matches("(?i).*(?:i don't know|slime).*");
    if(water && slime) {
      return "sludge";
    } else if (water) {
      return "water";
    } else if (slime) {
      return "slime";
    } else {
      return "air";
    }
  }
}
------------------------------------------------------------------------
public class EightiesKids5 {

    public static String bucketOf(String said) {
        said = said.toLowerCase();
        boolean water = shouldBeWet(said);
        boolean slime = shouldBeSlimed(said);
        return water && slime ? "sludge" 
                              : water ? "water" 
                                      : slime ? "slime" 
                                              : "air";
    }

    private static boolean shouldBeWet(String text){
        return text.contains("wet") || text.contains("water") || text.contains("wash");
    }

    private static boolean shouldBeSlimed(String text){
        return text.contains("i don't know") || text.contains("slime");
    }
}
*/