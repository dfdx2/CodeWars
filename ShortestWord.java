/* 7KYU CodeWars Shortest Word

Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

*/

public class Kata {
    public static int findShort(String s) {
      String[] t = s.split(" ");  
      int result = 100;
      for (String x : t) {
        if (x.length() < result) {
          result = x.length();
        }
      }
      return result;
    }
}
/*------------------------------------------------------------------
import java.util.stream.*;
public class Kata {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
    }
}
---------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
---------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(-1);
    }
}
---------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
            .map(String::length)
            .min(Comparator.naturalOrder())
            .get();
    }
}
-----------------------------------------------------------------------
import java.util.*;
import java.util.Collections;
public class Kata {
    public static int findShort(String s) {
        var temp = s.split(" ");
        List<String> lst = Arrays.asList(temp);
        List<Integer> intlst = new ArrayList();
        for(var x=0;x<lst.size();x++){
          intlst.add(lst.get(x).length());
        }
        Collections.sort(intlst);
        return intlst.get(0);
    }
}
------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Kata {
    public static int findShort(String s) {
 
        return Arrays.stream(s.split(" ")).min(Comparator.comparing(t->t.length())).get().length();
    }
}
------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).reduce(Math::min).orElse(0);
    }
}



*/