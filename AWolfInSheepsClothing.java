/*  8KYU CodeWars A Wolf in Sheep's Clothing

Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves 
which pretend to be sheep. Fortunately, you are good at spotting them.

Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at 
the front of the queue which is at the end of the array:

[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
   7      6      5      4      3            2      1
If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, 
return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.

Note: there will always be exactly one wolf in the array.

Examples
Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"

Input: ["sheep", "sheep", "wolf"]
Output: "Pls go away and stop eating my sheep"

*/

public class ZywOo {

  public static String warnTheSheep(String[] array) {
    int counter = 0;
    String result = "";
    for (int i = array.length - 1; i >= 0; i--) {
      if (array[i] != "wolf") {
        counter += 1;
      }
      else if (array[i] == "wolf" && counter == 0) {
        result = "Pls go away and stop eating my sheep";
      }
      else {
        result = "Oi! Sheep number " + counter + "!" + " You are about to be eaten by a wolf!";
      }
    }
    return result;
    
  }

}
/*-------------------------------------------------------------
import java.util.*;

public class ZywOo {

  public static String warnTheSheep(String[] array) {
    Collections.reverse(Arrays.asList(array));
    int pos = Arrays.asList(array).indexOf("wolf");
    return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
  }

}
----------------------------------------------------------------------
public class ZywOo {

  public static String warnTheSheep(String[] array) 
  {
    //Your code)))
    String retStr = "";
    int wolfPos = -1;
    int sheepCount = 0;
    
    
    for (int i = 0; i < array.length; i++)
    {
        if (array[i].equals("sheep"))
        {
            sheepCount++;
        }
        else if (array[i].equals("wolf"))
        {
            wolfPos = i;
        }
            
    }
    
    if (wolfPos == array.length - 1)
    {
        return "Pls go away and stop eating my sheep";
    }
    return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", sheepCount - wolfPos);
  }

}
----------------------------------------------------------------------
public class ZywOo {

  private static final String WOLF="wolf";
  private static final String MESSAGE_WOLF="Pls go away and stop eating my sheep";
  private static final String MESSAGE_SHEEP="Oi! Sheep number %s! You are about to be eaten by a wolf!";

  public static String warnTheSheep(String[] array) {
    int pos = indexOfWolf(array);
    
    if (pos==array.length-1){
      return MESSAGE_WOLF;
    }else{
      return String.format(MESSAGE_SHEEP, array.length-pos-1);
    }
  }
  
  public static int indexOfWolf(String[] array){
    int pos=-1;
    for (int i=0;i<array.length;i++){
      if (array[i].equals(WOLF))
      {
        pos=i;
        break;
      }
    }
    return pos;
  }

}
-----------------------------------------------------------------------
public class ZywOo {

  public static String warnTheSheep(String[] array) {
    int queueWolfNumber = 0;
    for(int i=0; i<array.length; i++){
      if(array[i] == "wolf") {queueWolfNumber = array.length - i; break;}
    }
    return queueWolfNumber == 1 ?
      String.format("Pls go away and stop eating my sheep") :
      String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", queueWolfNumber - 1);
  }
}
----------------------------------------------------------------------

*/