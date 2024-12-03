/* 8KYU CodeWars Draw Stairs

Given a number n, draw stairs using the letter "I", n tall and n wide, with the tallest in the top left.

For example n = 3 result in:

"I\n I\n  I"
or printed:

I
 I
  I
Another example, a 7-step stairs should be drawn like this:

I
 I
  I
   I
    I
     I
      I
*/

public class DrawStairs{
  public static String draw(int n){
    String result = "";
    if (n == 1) {
      return "I";
    }
    if (n == 2) {
      return "I\n" + " I"; 
    }
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        result += "I\n";
      }
      else if (i == 1) {
        result += " " + "I\n";
      }
      else if (i == n - 1) {
        String a = " ";
        a = a.repeat(i);
        result += a;
        result += "I";
      }
      else {
        String a = " ";
        a = a.repeat(i);
        result += a;
        result += "I\n";
      }
    }
    return result;
  }
}
/*---------------------------------------------------------------------------
public class Stairs{
  public static String draw(int n){
    String res [] = new String[n]; 
    for(int i=0;i<n;i++)
      res[i]=" ".repeat(i)+"I";
    return String.join("\n",res);
  }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stairs{
  public static String draw(int n){
    return IntStream.range(0, n).mapToObj(i -> " ".repeat(i) + "I").collect(Collectors.joining("\n"));
  }
}
-----------------------------------------------------------------------------
public class Stairs{
  public static String draw(int n){
        String result = "I";

        for(int i =1; i<n; i++){
            result += "\n";
            for(int j =0; j<i; j++) {
                result += " ";
            }
            result +="I";

        }
        return result;
  }
}
-----------------------------------------------------------------------------
public class Stairs{
  public static String draw(int n){
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        sb.append(" ");
      }
      sb.append("I\n");
    }
    String result = sb.toString();
    return result.substring(0, result.length()-1);
  }
}
-----------------------------------------------------------------------------
public class Stairs{
  public static String draw(int n){
        StringBuilder stairs = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // Append spaces for the current step
            for (int j = 0; j < i; j++) {
                stairs.append(" ");
            }
            // Append "I" and a newline, unless it's the last line
            stairs.append("I");
            if (i < n - 1) {
                stairs.append("\n");
            }
        }
        return stairs.toString();

  }
}
-----------------------------------------------------------------------------
public class Stairs{
  public static String draw(int n){
    String stairs="";
    for(int i=1; i<=n;i++){
      stairs += "I";
      if(i<n){
        stairs +="\n";
        for  (int j=0;j<i;j++){
          stairs +=" ";
        }
      }
    }
    return stairs;
  }
}
-----------------------------------------------------------------------------
public class Stairs{
  public static String draw(int n){
    StringBuilder builder = new StringBuilder();
    for(int i = 1; i<n; i++){
      builder.append("I\n").append(" ".repeat(i));
    }
    builder.append("I");
    return builder.toString();
  }
}
------------------------------------------------------------------------------
public class Stairs {
  public static String draw(int n) {
    StringBuilder stairs = new StringBuilder(); // Use StringBuilder for efficient string concatenation.
    
    for (int i = 0; i < n; i++) {
      // Add 'i' spaces followed by 'I'
      stairs.append(" ".repeat(i)).append("I").append("\n");
    }
    
    // Return the generated stairs as a string, removing the trailing newline
    return stairs.toString().trim();
  }
}
----------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Stairs{
  public static String draw(int n){
    return IntStream.range(0, n)
      .mapToObj(i -> " ".repeat(i) + "I\n")
      .collect(Collectors.joining())
      .trim();
  }
}
----------------------------------------------------------------------------
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;
public class Stairs{
  public static String draw(int n){
    return IntStream.range(0,n).mapToObj(" "::repeat).map(s -> s+"I").collect(joining("\n"));
  }
}  
*/