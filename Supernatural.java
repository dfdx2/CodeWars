/* 7KYU CodeWars Supernatural

This kata is a tribute/fanwork to the TV-show: Supernatural

Balls!

Those wayward Winchester boys are in trouble again, hunting 
something down in New Orleans. You are Bobby Singer, you know 
how "idjits" they can be, so you have to prepare. They will 
call you any minute with the race of the thing, and you want 
to answer as soon as possible. By answer, I mean: tell them 
how to kill, or fight it.

You have something like a database (more like drunken doodling) 
to help them:

werewolf : Silver knife or bullet to the heart
vampire : Behead it with a machete
wendigo : Burn it to death
shapeshifter : Silver knife or bullet to the heart
angel : Use the angelic blade
demon : Use Ruby's knife, or some Jesus-juice
ghost : Salt and iron, and don't forget to burn the corpse
dragon : You have to find the excalibur for that
djinn : Stab it with silver knife dipped in a lamb's blood
pagan god : It depends on which one it is
leviathan : Use some Borax, then kill Dick
ghoul : Behead it
jefferson starship : Behead it with a silver blade
reaper : If it's nasty, you should gank who controls it
rugaru : Burn it alive
skinwalker : A silver bullet will do it
phoenix : Use the colt
witch : They are humans
else : I have friggin no idea yet

You can access the database as 
drunkenDoodling/drunken_doodling/DrunkenDoodling 
depending on your language.


*/

public class Supernatural {
  public static String bob(String beast) {
    return beast == "vampire" ? "Behead it with a machete, idjits!" :
    beast == "pagan god" ? "It depends on which one it is, idjits!" :
    beast == "werewolf" ? "Silver knife or bullet to the heart, idjits!" :
    beast == "wendigo" ? "Burn it to death, idjits!" :
    beast == "shapeshifter" ? "Silver knife or bullet to the heart, idjits!" : 
    beast == "angel" ? "Use the angelic blade, idjits!" : 
    beast == "demon" ? "Use Ruby's knife, or some Jesus-juice, idjits!" : 
    beast == "ghost" ? "Salt and iron, and don't forget to burn the corpse, idjits!" :
    beast == "dragon" ? "You have to find the excalibur for that, idjits!" :
    beast == "djinn" ? "Stab it with silver knife dipped in a lamb's blood, idjits!" :
    beast == "pagan god" ? "It depends on which one it is, idjits!" : 
    beast == "leviathan" ? "Use some Borax, then kill Dick, idjits!" : 
    beast == "ghoul" ? "Behead it, idjits!" : 
    beast == "jefferson starship" ? "Behead it with a silver blade, idjits!" : 
    beast == "reaper" ? "If it's nasty, you should gank who controls it, idjits!" : 
    beast == "rugaru" ? "Burn it alive, idjits!" : 
    beast == "skinwalker" ? "A silver bullet will do it, idjits!" : 
    beast == "phoenix" ? "Use the colt, idjits!" : 
    beast == "witch" ? "They are humans, idjits!" : "I have friggin no idea yet, idjits!";
  }
}
/*------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Supernatural {

  // Where is drunkenDoodling ?????????????????
  private static final Map<String, String> map = new HashMap<>();
  
  static {
    map.put("werewolf", "Silver knife or bullet to the heart");
    map.put("vampire", "Behead it with a machete");
    map.put("wendigo", "Burn it to death");
    map.put("shapeshifter", "Silver knife or bullet to the heart");
    map.put("angel", "Use the angelic blade");
    map.put("demon", "Use Ruby's knife, or some Jesus-juice");
    map.put("ghost", "Salt and iron, and don't forget to burn the corpse");
    map.put("dragon", "You have to find the excalibur for that");
    map.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
    map.put("pagan god", "It depends on which one it is");
    map.put("leviathan", "Use some Borax, then kill Dick");
    map.put("ghoul", "Behead it");
    map.put("jefferson starship", "Behead it with a silver blade");
    map.put("reaper", "If it's nasty, you should gank who controls it");
    map.put("rugaru", "Burn it alive");
    map.put("skinwalker", "A silver bullet will do it");
    map.put("phoenix", "Use the colt");
    map.put("witch", "They are humans");
    map.put("else", "I have friggin no idea yet");
  }


  public static String bob(String beast) {
    String str = map.get(beast);
    if(str == null) return "I have friggin no idea yet, idjits!";
    return str + ", idjits!";
  }
}

--------------------------------------------------------------------
import java.util.*;
public class Supernatural {
  private static final HashMap<String, String> drunkenDoodling = new HashMap<String, String>();

  static {
    drunkenDoodling.put("werewolf", "Silver knife or bullet to the heart");
    drunkenDoodling.put("vampire", "Behead it with a machete");
    drunkenDoodling.put("wendigo", "Burn it to death");
    drunkenDoodling.put("shapeshifter", "Silver knife or bullet to the heart");
    drunkenDoodling.put("angel", "Use the angelic blade");
    drunkenDoodling.put("demon", "Use Ruby's knife, or some Jesus-juice");
    drunkenDoodling.put("ghost", "Salt and iron, and don't forget to burn the corpse");
    drunkenDoodling.put("dragon", "You have to find the excalibur for that");
    drunkenDoodling.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
    drunkenDoodling.put("pagan god", "It depends on which one it is");
    drunkenDoodling.put("leviathan", "Use some Borax, then kill Dick");
    drunkenDoodling.put("ghoul", "Behead it");
    drunkenDoodling.put("jefferson starship", "Behead it with a silver blade");
    drunkenDoodling.put("reaper", "If it's nasty, you should gank who controls it");
    drunkenDoodling.put("rugaru", "Burn it alive");
    drunkenDoodling.put("skinwalker", "A silver bullet will do it");
    drunkenDoodling.put("phoenix", "Use the colt");
    drunkenDoodling.put("witch", "They are humans");
  }
  
  public static String bob(String beast) {
    return drunkenDoodling.containsKey(beast) ? drunkenDoodling.get(beast) + ", idjits!" : "I have friggin no idea yet, idjits!";
  }
}
--------------------------------------------------------------------
import static java.util.Map.entry;
import static java.util.Map.ofEntries;

interface Supernatural {
  static String bob(String beast) {
    return ofEntries(
        entry("werewolf", "Silver knife or bullet to the heart"),
        entry("vampire", "Behead it with a machete"),
        entry("wendigo", "Burn it to death"),
        entry("shapeshifter", "Silver knife or bullet to the heart"),
        entry("angel", "Use the angelic blade"),
        entry("demon", "Use Ruby's knife, or some Jesus-juice"),
        entry("ghost", "Salt and iron, and don't forget to burn the corpse"),
        entry("dragon", "You have to find the excalibur for that"),
        entry("djinn", "Stab it with silver knife dipped in a lamb's blood"),
        entry("pagan god", "It depends on which one it is"),
        entry("leviathan", "Use some Borax, then kill Dick"),
        entry("ghoul", "Behead it"),
        entry("jefferson starship", "Behead it with a silver blade"),
        entry("reaper", "If it's nasty, you should gank who controls it"),
        entry("rugaru", "Burn it alive"),
        entry("skinwalker", "A silver bullet will do it"),
        entry("phoenix", "Use the colt"),
        entry("witch", "They are humans"))
        .getOrDefault(beast, "I have friggin no idea yet") + ", idjits!";
  }
}
--------------------------------------------------------------------
public class Supernatural {
  public static String bob(String beast) {
  String ans = new String();
        switch (beast) {
            case "werewolf":
                return ans = "Silver knife or bullet to the heart, idjits!";
            case "vampire":
                return ans = "Behead it with a machete, idjits!";
            case "wendigo":
                return ans = "Burn it to death, idjits!";
            case "shapeshifter":
                return ans = "Silver knife or bullet to the heart, idjits!";
            case "angel":
                return ans = "Use the angelic blade, idjits!";
            case "demon":
                return ans = "Use Ruby's knife, or some Jesus-juice, idjits!";
            case "ghost":
                return ans = "Salt and iron, and don't forget to burn the corpse, idjits!";
            case "dragon":
                return ans = "You have to find the excalibur for that, idjits!";
            case "djinn":
                return ans = "Stab it with silver knife dipped in a lamb's blood, idjits!";
            case "pagan god":
                return ans = "It depends on which one it is, idjits!";
            case "leviathan":
                return ans = "Use some Borax, then kill Dick, idjits!";
            case "ghoul":
                return ans = "Behead it, idjits!";
            case "jefferson starship":
                return ans = "Behead it with a silver blade, idjits!";
            case "reaper":
                return ans = "If it's nasty, you should gank who controls it, idjits!";
            case "rugaru":
                return ans = "Burn it alive, idjits!";
            case "skinwalker":
                return ans = "A silver bullet will do it, idjits!";
            case "phoenix":
                return ans = "Use the colt, idjits!";
            case "witch":
                return ans = "They are humans, idjits!";
            default:
                return ans = "I have friggin no idea yet, idjits!";
        }
  }  
}
---------------------------------------------------------------------
import java.util.HashMap;

class Supernatural {
  static String bob(String beast) {
    var map = new HashMap<>();
    map.put("werewolf", "Silver knife or bullet to the heart");
    map.put("vampire", "Behead it with a machete");
    map.put("wendigo", "Burn it to death");
    map.put("shapeshifter", "Silver knife or bullet to the heart");
    map.put("angel", "Use the angelic blade");
    map.put("demon", "Use Ruby's knife, or some Jesus-juice");
    map.put("ghost", "Salt and iron, and don't forget to burn the corpse");
    map.put("dragon", "You have to find the excalibur for that");
    map.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
    map.put("pagan god", "It depends on which one it is");
    map.put("leviathan", "Use some Borax, then kill Dick");
    map.put("ghoul", "Behead it");
    map.put("jefferson starship", "Behead it with a silver blade");
    map.put("reaper", "If it's nasty, you should gank who controls it");
    map.put("rugaru", "Burn it alive");
    map.put("skinwalker", "A silver bullet will do it");
    map.put("phoenix", "Use the colt");
    map.put("witch", "They are humans");
    return map.getOrDefault(beast, "I have friggin no idea yet") + ", idjits!";
  }
}
---------------------------------------------------------------------
public class Supernatural {

  public static String bob(String beast) {
    //wasted time((
    switch(beast){
      case"werewolf": return "Silver knife or bullet to the heart, idjits!";
      case"vampire": return "Behead it with a machete, idjits!";
      case"wendigo": return "Burn it to death, idjits!";
      case"shapeshifter": return "Silver knife or bullet to the heart, idjits!";
      case"angel": return"Use the angelic blade, idjits!";
      case"demon": return"Use Ruby's knife, or some Jesus-juice, idjits!";
      case"ghost": return"Salt and iron, and don't forget to burn the corpse, idjits!";
      case"dragon": return"You have to find the excalibur for that, idjits!";
      case"djinn": return"Stab it with silver knife dipped in a lamb's blood, idjits!";
      case"pagan god": return"It depends on which one it is, idjits!";
      case"leviathan": return"Use some Borax, then kill Dick, idjits!";
      case"ghoul": return"Behead it, idjits!";
      case"jefferson starship": return"Behead it with a silver blade, idjits!";
      case"reaper": return"If it's nasty, you should gank who controls it, idjits!";
      case"rugaru": return"Burn it alive, idjits!";
      case"skinwalker": return"A silver bullet will do it, idjits!";
      case"phoenix": return"Use the colt, idjits!";
      case"witch": return"They are humans, idjits!";
    }
    return "I have friggin no idea yet, idjits!";
  }
}
-----------------------------------------------------------------------
import java.util.*;

public class Supernatural {
 
   private static final Map<String,String> map = new HashMap<>();
   static {
     map.put("werewolf", "Silver knife or bullet to the heart");
     map.put("vampire", "Behead it with a machete");
     map.put("wendigo", "Burn it to death");
     map.put("shapeshifter", "Silver knife or bullet to the heart");
     map.put("angel", "Use the angelic blade");
     map.put("demon", "Use Ruby's knife, or some Jesus-juice");
     map.put("ghost", "Salt and iron, and don't forget to burn the corpse");
     map.put("dragon", "You have to find the excalibur for that");
     map.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
     map.put("pagan god", "It depends on which one it is");
     map.put("leviathan", "Use some Borax, then kill Dick");
     map.put("ghoul", "Behead it");
     map.put("jefferson starship", "Behead it with a silver blade");
     map.put("reaper", "If it's nasty, you should gank who controls it");
     map.put("rugaru", "Burn it alive");
     map.put("skinwalker", "A silver bullet will do it");
     map.put("phoenix", "Use the colt");
     map.put("witch", "They are humans");
  }
     
  public static String bob(String beast) {
    return (map.containsKey(beast) ? map.get(beast) : "I have friggin no idea yet") + ", idjits!";
  }
}
----------------------------------------------------------------------
public class Supernatural {
  public static String bob(String beast) {
    if (beast.equals("werewolf"))
    return "Silver knife or bullet to the heart, idjits!";
    if (beast.equals("vampire"))
    return "Behead it with a machete, idjits!";
    if (beast.equals("wendigo"))
    return "Burn it to death, idjits!";
    if (beast.equals("shapeshifter"))
    return "Silver knife or bullet to the heart, idjits!";
    if (beast.equals("angel"))
    return "Use the angelic blade, idjits!";
    if (beast.equals("demon"))
    return "Use Ruby's knife, or some Jesus-juice, idjits!";
    if (beast.equals("ghost"))
    return "Salt and iron, and don't forget to burn the corpse, idjits!";
    if (beast.equals("dragon"))
    return "You have to find the excalibur for that, idjits!";
    if (beast.equals("djinn"))
    return "Stab it with silver knife dipped in a lamb's blood, idjits!";
    if (beast.equals("pagan god"))
    return "It depends on which one it is, idjits!";
    if (beast.equals("leviathan"))
    return "Use some Borax, then kill Dick, idjits!";
    if (beast.equals("ghoul"))
    return "Behead it, idjits!";
    if (beast.equals("jefferson starship"))
    return "Behead it with a silver blade, idjits!";
    if (beast.equals("reaper"))
    return "If it's nasty, you should gank who controls it, idjits!";
    if (beast.equals("rugaru"))
    return "Burn it alive, idjits!";
    if (beast.equals("skinwalker"))
    return "A silver bullet will do it, idjits!";
    if (beast.equals("phoenix"))
    return "Use the colt, idjits!";
    if (beast.equals("witch"))
    return "They are humans, idjits!";
    else
    return "I have friggin no idea yet, idjits!";
  }
}
*/