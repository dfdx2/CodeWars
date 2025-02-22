/* 7KYU CodeWars Name Array Capping

Create a method that accepts an array of names, and returns 
an array of each name with its first letter capitalized.

example

Kata.capMe(new String[] {"jo", "nelson", "jurie"}) // 
returns new String[] {"Jo", "Nelson", "Jurie"}

Kata.capMe(new String[] {"KARLY", "DANIEL", "KELSEY"}) // 
returns new String[] {"Karly", "Daniel", "Kelsey"}

*/
public class NameArrayCapping {
  public static String[] capMe(String[] strings) {
    int i = 0;
    for (String j : strings) {
      j = j.toLowerCase();
      char ch = j.charAt(0);
      ch = Character.toUpperCase(ch);
      j = ch + j.substring(1, j.length());
      strings[i] = j;
      i++;
    }
    return strings;
  }
}
/*----------------------------------------------------------------------------
public class Kata {
    public static String[] capMe(String[] strings) {
      String[] result = new String[strings.length];
      for (int i = 0; i < strings.length; i++) {
        String j = strings[i];
        j = j.toLowerCase();
        Character ch = j.charAt(0);
        ch = Character.toUpperCase(ch);
        j = ch + j.substring(1, j.length());
        result[i] = j;
      }
      return result;
    }
}
----------------------------------------------------------------------------
public class Kata {
  public static String[] capMe(String[] strings) {
    for (int i = 0; i < strings.length; i++) {
            if (strings.length > 0)
                strings[i] = Character.toUpperCase(strings[i].charAt(0)) +
                        strings[i].substring(1, strings[i].length()).toLowerCase();
        }
        return strings;
  }
}
-------------------------------------------------------------------------------
public class Kata {
  public static String[] capMe(String[] strings) {
    for (int i = 0; i < strings.length; i++) {
      strings[i] = Character.toUpperCase(strings[i].charAt(0)) + strings[i].toLowerCase().substring(1);
    }
    return strings;
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
  public static String[] capMe(String[] strings) {
    return Arrays.stream(strings)
            .map(s -> s.toLowerCase())
            .map(s-> Character.toUpperCase(s.charAt(0))+s.substring(1))
            .toArray(String[]::new);
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static String[] capMe(String[] strings) {
        return Arrays.stream(strings).map(i -> i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase()).toArray(String[]::new);

    }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  private static String capitalize(String str) {
    return str.toUpperCase().charAt(0) + str.toLowerCase().substring(1);
  }


  public static String[] capMe(String[] strings) {
    return Arrays.stream(strings).map(str -> capitalize(str)).toArray(String[]::new);
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String[] capMe(String[] strings) {
    for (int i = 0; i < strings.length; ++i) {
            StringBuilder stringBuilder = new StringBuilder(strings[i].toLowerCase());
            char ch = Character.toUpperCase(stringBuilder.charAt(0));
            stringBuilder.deleteCharAt(0);
            stringBuilder.insert(0, ch);
            strings[i] = stringBuilder.toString();
        }
        return strings;
  }
}
------------------------------------------------------------------------------
*/