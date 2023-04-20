/* 8KYU CodeWars Kata Example Twist

This is an easy twist to the example kata (provided by Codewars 
when learning how to create your own kata).

Add the value "codewars" to the array websites 1,000 times.

*/

public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
      String[] websites = new String[1000];
      String x = "codewars";
      for (int i = 0; i < websites.length; i++) {
        websites[i] = x;
      }
        return websites;
    }
}
/*-------------------------------------------------------------------------
import java.util.*;

public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];
        Arrays.fill(websites,"codewars");
        return websites;
    }
}
---------------------------------------------------------------------------
public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];
        for (int i = 0; i < 1000; i++) websites[i] = "codewars";
        return websites;
    }
}
--------------------------------------------------------------------------
public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        return java.util.stream.Stream.generate(() -> "codewars")
                                      .limit(1000)
                                      .toArray(String[]::new);
    }
}
---------------------------------------------------------------------------
import java.util.Collections;

public class KataExampleTwist {

  
  Returns an array containg 1000 "codewars"
  
  @return 1000 "codewars"
  
  public static String[] kataExampleTwist() {
    return Collections.nCopies(1000, "codewars").toArray(new String[0]);
  }
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
        return IntStream.range(0, 1000)
          .mapToObj(i -> "codewars")
          .toArray(size -> new String[size]);
    }
}
-------------------------------------------------------------------------
import java.util.Collections;

public class KataExampleTwist {
	public static String[] kataExampleTwist() {
		return Collections.nCopies(1000, "codewars").stream().toArray(String[]::new);
	}
}
------------------------------------------------------------------------
class KataExampleTwist {
  static String[] kataExampleTwist() {
    return "codewars,".repeat(1000).split(",");
  }
}
-----------------------------------------------------------------------
import java.util.*;
public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
        return Arrays.stream(new String[1000]).
                      map(x->"codewars").
                      toArray(String[]::new);
    }
}


*/