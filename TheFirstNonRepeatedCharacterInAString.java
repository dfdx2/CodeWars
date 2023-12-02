/* 7KYU CodeWars The First Non Repeated Character In A String

You need to write a function, that returns the first non-repeated 
character in the given string.

If all the characters are unique, return the first character of the string.
If there is no unique character, return null in JS or Java, None in 
Python, '\0' in C.

You can assume, that the input string has always non-zero length.

Examples
"test"   returns "e"
"teeter" returns "r"
"trend"  returns "t" (all the characters are unique)
"aabbcc" returns null (all the characters are repeated)

*/

import java.util.*;
public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
      Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < source.length(); i++) {
        if (!map.containsKey(source.charAt(i))) {
          map.put(source.charAt(i), 1);
        }
        else {
          int total = map.get(source.charAt(i));
          map.put(source.charAt(i), total + 1);
        }
      }
      for (int i = 0; i < source.length(); i++) {
        if (map.get(source.charAt(i)) == 1) {
          return source.charAt(i);
        }
      }
      return null;
    }
}
/*--------------------------------------------------------------------------
public class FirstNonRepeated {
    public static Character firstNonRepeated(String str) {
        for(char ch :str.toCharArray()) if(str.indexOf(ch) == str.lastIndexOf(ch)) return ch;
        return 0;
    }
}
------------------------------------------------------------------------------
import java.util.*;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        Map<Character,Integer> seen = new HashMap<Character,Integer>();
        for (char c: source.toCharArray())
            seen.put(c, seen.getOrDefault(c, 0) + 1);
        for (char c: source.toCharArray())
            if (seen.get(c) == 1) return c;
            
        return null;
    }
}
-------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class FirstNonRepeated {

    public static Character firstNonRepeated(String source) {
        return source.chars()
            .mapToObj(ch -> Character.valueOf((char) ch))
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> 1 == e.getValue())
            .map(e -> e.getKey())
            .findFirst().get();
    }

}
-------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        return IntStream.range(0, source.length())
                        .boxed()
                        .collect( Collectors.groupingBy(source::charAt, Collectors.toList()) )
                        .entrySet()
                        .stream()
                        .filter( me -> me.getValue().size() == 1 )
                        .min( (m1, m2) -> m1.getValue().get(0) - m2.getValue().get(0) )
                        .get()
                        .getKey();
    }
}
------------------------------------------------------------------------------
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
      return source.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(entry -> (char) entry.getKey().intValue())
                .orElse(null);
    }
}
------------------------------------------------------------------------------
import java.util.Map;
import java.util.LinkedHashMap;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        LinkedHashMap<Character, Integer> dict = new LinkedHashMap<>();
      
        for (char c : source.toCharArray()) {
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }
      
        for (Map.Entry<Character, Integer> item : dict.entrySet()) {
            if (item.getValue() == 1) {
              return item.getKey();
            }
        }
        
        return null;
    }
}

*/