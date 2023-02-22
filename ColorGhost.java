/* 8KYU CodeWars Color Ghost

Color Ghost
Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of "white" or "yellow" 
or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"

*/

import java.util.*;

public class Ghost {
    private final String color;
    private final String[] colors = {"white", "yellow", "purple", "red"};

    public String getColor() {
        return color;
    }

    public Ghost() {
        color = colors[new Random().ints(0, 4).findFirst().getAsInt()];
    }
}

/*---------------------------------------------------------------------------
import java.util.*;

public class Ghost {
  String color = "";
  
  public String getColor(){
    return this.color;
  }
  
  public Ghost(){
    switch(new Random().nextInt(4)){
      case 0:
        this.color = "white";
        break;
      case 1:
        this.color = "yellow";
        break;
      case 2:
        this.color = "purple";
        break;
      case 3:
        this.color = "red";
        break;
    }
  }
}
-----------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ghost {
    
    * Probably overkill for this Kata, 
    * but in this way the Ghost colors will be super easy to maintain in the future.
    * Adding and removing colors takes a few seconds only :)
    
    private enum GhostColor{
      WHITE("white"),
      YELLOW("yellow"),
      PURPLE("purple"),
      RED("red");

      private String color;
      private static List<GhostColor> values = Arrays.asList(GhostColor.values());
      private static final Random random = new Random();

      GhostColor(String color){
          this.color = color;
      }

      static GhostColor generateRandomColor(){
          return values.get(random.nextInt(values.size()));
      }
  }

  private GhostColor ghostColor;

  Ghost(){
      ghostColor = GhostColor.generateRandomColor();
  }

  public String getColor(){
      return ghostColor.color;
  }
}
--------------------------------------------------------------------------------------------
import java.util.Random;
import java.util.List;

public class Ghost {
  private static final Random random = new Random();
  private static final List<String> COLOURS = List.of("white", "yellow", "purple", "red");
  
  private final String colour;
  
  public Ghost() {
    this.colour = COLOURS.get(random.nextInt(COLOURS.size()));
  }
  
  public String getColor() {
    return colour;
  }
}
------------------------------------------------------------------------------------------
import java.util.concurrent.ThreadLocalRandom;

public class Ghost {
  static final String[] COLORS = {"white", "yellow", "purple", "red"};
  private String color;
  
  public String getColor(){
    if(color == null){
      color = Ghost.COLORS[ThreadLocalRandom.current().nextInt(0, 4)];
    }
    return color;
  }
}

*/