/* 6KYU CodeWars Count Characters In Your String

The main idea is to count all the occurring characters 
in a string. If you have a string like aba, then the 
result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be 
empty object literal, {}.

*/
import java.util.Map;
import java.util.*;
public class Kata {
    public static Map<Character, Integer> count(String str) {
      Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
        if (!map.containsKey(str.charAt(i))) {
          map.put(str.charAt(i), 1);
        }
        else {
          int total = map.get(str.charAt(i));
          map.put(str.charAt(i), total + 1);
        }
      }
      return map;
    }
}
/*------------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character character : str.toCharArray()) {
            if (charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            } else {
                charMap.put(character, 1);
            }
        }
        return charMap;
    }
}
--------------------------------------------------------------------
import java.util.Map;

import static java.util.stream.Collectors.toMap;

interface Kata {
  static Map<Character, Integer> count(String str) {
    return str.chars().mapToObj(c -> (char) c).collect(toMap(c -> c, c -> 1, Integer::sum));
  }
}
---------------------------------------------------------------------
import java.util.Map;
import java.util.stream.Collectors;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        return str
                .chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toMap(character -> character, character -> 1, Integer::sum));
    }
}
---------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static Map<Character, Integer> count(String s){ 
         Map<Character,Integer> M = new HashMap(); 
         for (char c : s.toCharArray())
             M.put(c,M.getOrDefault(c,0)+1);
          return M;
      }
}
--------------------------------------------------------------------
import java.util.Map;
import java.util.TreeMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> hm = new TreeMap<>();
        for(char x: str.toCharArray()){
            hm.put(x, (int) str.chars().filter(t -> t == x).count());
        }
        return hm;
    }
}
---------------------------------------------------------------------
import java.util.Map;
import java.util.*;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> symbolCount = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        String tmp = "";
        for (char ch: charArray) if (!tmp.contains(String.valueOf(ch))) tmp += ch;

        for (int i = 0; i < tmp.length(); i++) {
            int count = 0;
            for (char ch: charArray) if (tmp.charAt(i) == ch) count++;
            symbolCount.put(tmp.charAt(i), count);
        }
        return symbolCount;
    }
}
----------------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character character : str.toCharArray())
          charMap.put(character, charMap.getOrDefault(character, 0) + 1);
        
        return charMap;
    }
}
--------------------------------------------------------------------
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        str = str.toLowerCase();
        Map<Character, Long> charFrequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Integer> duplicateChars = charFrequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() >= 1)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().intValue(), Math::max));

        return duplicateChars;
    }
}
*/