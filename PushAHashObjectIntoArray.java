/* 8KYU CodeWars Push A Hash / An Object into array

You are trying to put a hash in ruby or an object in javascript 
or java into an array, but it always returns error, solve it and 
keep it as simple as possible!

*/


import java.util.List;
import java.util.ArrayList;

public class PushAnObjectIntoArray {  
  public static List<String> push(){
    List<String> items = new ArrayList<>();
    items.add("an object");
    return items;
  }
}
/*--------------------------------------------------------------------------------
import java.util.*;

public class PushAnObjectIntoArray {  
  public static List<String> push() { return Arrays.asList("an object"); }
}
--------------------------------------------------------------------------------------
import java.util.List;

class PushAnObjectIntoArray {
  static List<String> push() {
    return List.of("an object");
  }
}
--------------------------------------------------------------------------------------





*/