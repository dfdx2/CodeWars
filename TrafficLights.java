/* 8KYU CodeWars Logic Drills : Traffic Light

You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, when the input is green, output should be yellow.

*/

public class TrafficLights {

  public static String updateLight(String current) {
    return (current == "green") ? "yellow" : (current == "yellow") ? "red" : (current == "red") ? "green" : null;
  }
}
/*----------------------------------------------------------------------------
public class TrafficLights {

  public static String updateLight(String current) {
    switch (current) {
      case "red": return "green";
      case "yellow": return "red";
      case "green": return "yellow";
      default: throw new IllegalArgumentException();
    }
  }

}
-------------------------------------------------------------------------------
public class TrafficLights {

  public static String updateLight(String current) {
  
    return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
    
  }
  
}
------------------------------------------------------------------------------
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class TrafficLights {

    private static final Map<String, String> LIGHTS = ImmutableMap.of(
            "red", "green",
            "green", "yellow",
            "yellow", "red"
    );

  public static String updateLight(String current) {
      return LIGHTS.get(current);
  }
  
}
------------------------------------------------------------------------------
public class TrafficLights {

  public static String updateLight(String current) {
    if(current.equals("green")){return "yellow"; }
    if(current.equals("yellow")){return "red"; }
    if(current.equals("red")){return "green"; }
  else {return "error";}
  }
  
}
-------------------------------------------------------------------------------
import java.util.List;
import java.util.Arrays;

public class TrafficLights {
  private static List<String> lights = Arrays.asList("green", "yellow", "red");
  
  public static String updateLight(String current) {
    //return the next color
    return lights.get((lights.indexOf(current)+1)%lights.size());
  }
  
}
-----------------------------------------------------------------------------
import java.util.HashMap;

public class TrafficLights {

  public static String updateLight(String current) {
    HashMap<String, String> lights = new HashMap<>();
    lights.put("green", "yellow"); lights.put("yellow", "red"); lights.put("red", "green");
    return lights.get(current);
  }
  
}


*/