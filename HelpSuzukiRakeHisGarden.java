/* 7KYU CodeWars Help Suzuki Rake His Garden

Help Suzuki rake his garden!

The monastery has a magnificent Zen garden made of white gravel 
and rocks and it is raked diligently everyday by the monks. 
Suzuki having a keen eye is always on the lookout for anything 
creeping into the garden that must be removed during the daily 
raking such as insects or moss.

You will be given a string representing the garden such as:

garden = 'gravel gravel gravel gravel gravel gravel gravel gravel gravel rock slug ant gravel gravel snail rock gravel gravel gravel gravel gravel gravel gravel slug gravel ant gravel gravel gravel gravel rock slug gravel gravel gravel gravel gravel snail gravel gravel rock gravel snail slug gravel gravel spider gravel gravel gravel gravel gravel gravel gravel gravel moss gravel gravel gravel snail gravel gravel gravel ant gravel gravel moss gravel gravel gravel gravel snail gravel gravel gravel gravel slug gravel rock gravel gravel rock gravel gravel gravel gravel snail gravel gravel rock gravel gravel gravel gravel gravel spider gravel rock gravel gravel'

Rake out any items that are not a rock or gravel and replace them 
with gravel such that:

garden = 'slug spider rock gravel gravel gravel gravel gravel gravel gravel'

Returns a string with all items except a rock or gravel replaced with gravel:

garden = 'gravel gravel rock gravel gravel gravel gravel gravel gravel gravel'

Please also try the other Kata in this series..

*/

public class Kata {
  public static String rakeGarden(String garden) {
    StringBuilder sb = new StringBuilder();
    String[] words = garden.split(" ");
    for (String i : words) {
      if (i.equals("gravel")) {
        sb.append(i);
        sb.append(" ");
      }
      else if (i.equals("rock")) {
        sb.append(i);
        sb.append(" ");
      }
      else {
        sb.append("gravel");
        sb.append(" ");
      }
    }
    return sb.toString().trim();
    }
}
/*------------------------------------------------------------------------
public class Kata
{
  public static String rakeGarden(String garden)
    {
      String[] arr = garden.split(" ");
      for (int i = 0; i < arr.length; i++) {
        if (!arr[i].equals("rock")) arr[i] = "gravel";
      }
      return String.join(" ", arr);
    }
}
-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata
{
    public static String rakeGarden(String garden)
    {
        return Arrays.stream(garden.split(" ")).map(x -> (x.equals("rock") || x.equals("gravel"))? x : "gravel").collect(Collectors.joining(" "));
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;

public class Kata
{
    public static String rakeGarden(String garden){
        StringBuilder builder = new StringBuilder();
        Arrays.stream(garden.split(" ")).forEach(s -> builder.append(rake(s)));
        return builder.toString().trim();
    }

    private static String rake(String s){
        return s.equalsIgnoreCase("rock")
                ? "rock "
                : "gravel ";
    }
}
---------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class Kata {
  static String rakeGarden(String garden) {
    return of(garden.split(" ")).map(s -> s.equals("rock") ? s : "gravel").collect(joining(" "));
  }
}
---------------------------------------------------------------------------
public class Kata
{
  public static String rakeGarden(String garden)
    {
      String res = "";
      String[] contents = garden.split(" ");
      for(String content : contents){
          if(content.equals("rock") || content.equals("gravel")){
            res += content + " ";
          }else{
            res += "gravel ";
          }
      }
      res = res.substring(0, res.length()-1);
      
      return res;
    }
}
--------------------------------------------------------------------------
public class Kata
{
  public static String rakeGarden(String garden) {
      return garden.replaceAll("\\b(?:(?!\\bgravel\\b|\\brock\\b)\\w)+\\b", "gravel");
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
  public static String rakeGarden(String garden) {
    return Arrays.stream(garden.split(" "))
      .map(s -> s.equals("rock") ? "rock" : "gravel")
      .collect(Collectors.joining(" "));
  }
}
*/