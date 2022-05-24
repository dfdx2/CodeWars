public class TrafficLights {

  public static String updateLight(String current) {
    if (current == "green") {
      return ("yellow");
    }
    else if (current == "yellow") {
      return ("red");
    }
    else {
      return ("green");
    }
  
  
  }
  
}