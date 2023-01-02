/*   8KYU Well of Ideas - Easy Version

For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good 
ideas 'good' and bad ideas 'bad'. If there are one or two good 
ideas, return 'Publish!', if there are more than 2 return 
'I smell a series!'. If there are no good ideas, as is often 
the case, return 'Fail!'.

*/
public class Kata {

  public static String well(String[] x) {
    // TODO
    String y = "Publish!";
    String w = "I smell a series!";
    String z = "Fail!";
    int result = 0;
    int bad = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == "bad") {
        bad += 1;
      }
      else if (x[i] == "good") {
        result += 1;
      }
      else {
        result += 0;
      }
    }
    if (result == 1 || result == 2) {
      return y;
    }
    else if (result > 2) {
      return w;
    }
    else {
      return z;
    }
  }






/*---------------------------------------------------------------------
public class Kata {

  public static String well(String[] x) {
    int count = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == "good") {
        count += 1;
      }
      
    }
    if (count == 1 || count == 2 ) {
      return ("Publish!");
    }
    else if (count > 2) {
      return ("I smell a series!");
    }
    else {
      return ("Fail!");
    }
    
  }

}
-----------------------------------------------------------------------
public class Kata {

  public static String well(String[] x) {
      int count = 0;
      for (String s : x) {
         if (s.equals("good")) count++;
         if (count > 2) return "I smell a series!";
      }
      if (count != 0) return "Publish!";
      return "Fail!";
  }

}
----------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static String well(String[] x) {
        switch (Collections.frequency(Arrays.asList(x), "good")) {
            case 1:
            case 2:
                return "Publish!";
            case 0:
                return "Fail!";
            default:
                return "I smell a series!";
        }
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;

class Kata {
  static String well(String[] ideas) {
    long count = Arrays.stream(ideas).filter(i -> i.equals("good")).count();
    return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
  }
}
-------------------------------------------------------------------------------
public class Kata {

  public static String well(String[] x) {
    int goodCount = (String.join(" ", x).length() - String.join(" ", x).replace("good", "").length())/4;
    return goodCount > 2 ? "I smell a series!" : goodCount == 0 ? "Fail!" : "Publish!";
  }

}
------------------------------------------------------------------------------
public class Kata {

  public static String well(String[] x) {
    int i = 0;
    for (String s : x) {
      if(s == "good") i++;
    }
   return i == 0 ? "Fail!" :  i > 2 ?"I smell a series!" : "Publish!";
  }

}



*/