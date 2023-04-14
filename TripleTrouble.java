/* 8KYU CodeWars Triple Trouble

Triple Trouble
Create a function that will return a string that combines all of 
the letters of the three inputed strings in groups. Taking the 
first letter of all of the inputs and grouping them next to each 
other. Do this for every letter, see example below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length.

*/

public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    // Solution
    String x = "";
    for (int i = 0; i < one.length(); i++) {
      x += one.charAt(i);
      x += two.charAt(i);
      x += three.charAt(i);
    }
    return x;
  }
}
/*--------------------------------------------------------------------------
public class Kata {
  public static String tripleTrouble(String s1, String s2, String s3) {
    StringBuilder sb = new StringBuilder(s1.length()*3);
    for (int i=0; i<s1.length(); i++) {
      sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
    }
    return sb.toString();
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    String s = "";
    for (int i = 0; i < one.length(); i++){
      s += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
    }
    return s;
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static String tripleTrouble(String bm, String aa, String tn) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bm.length(); i ++) {
            sb.append(bm.charAt(i));
            sb.append(aa.charAt(i));
            sb.append(tn.charAt(i));
        }
        return sb.toString();
    }
}
-----------------------------------------------------------------------------
import java.util.stream.*;

public class Kata {
  public static String tripleTrouble(String a, String b, String c) {
    return IntStream.range(0,a.length()).mapToObj(i -> "" + a.charAt(i) + b.charAt(i) + c.charAt(i)).collect(Collectors.joining());
  }
}
-----------------------------------------------------------------------------
public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
  
  StringBuilder x = new StringBuilder();
  String[] allStrings = new String[]{one, two, three};
  for(int i = 0; i < one.length(); i++)
       for (String s : allStrings) x.append(s.charAt(i));
        return x.toString();
}
}



*/