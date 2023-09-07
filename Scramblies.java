/* 5KYU CodeWars Scramblies

Complete the function scramble(str1, str2) that returns true if a 
portion of str1 characters can be rearranged to match str2, otherwise 
returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits 
will be included.
Performance needs to be considered.

Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False


*/
import java.util.HashMap;
class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      HashMap<Character, Integer> result = new HashMap<>();
      for (char ch : str1.toCharArray()) {
        result.put(ch, 1 + result.getOrDefault(ch, 0));
      }
      for (char ch : str2.toCharArray()) {
        Integer count = result.getOrDefault(ch, 0);
        if (count == 0) {
          return false;
        }
        result.put(ch, --count);
      }
      return true;
    }
}
/*-----------------------------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> word1 = countLetters(str1);
        Map<Character, Integer> word2 = countLetters(str2);

        for (Character c : word2.keySet()) {
            Integer n = word1.get(c);
            if (n == null || n < word2.get(c)) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            Integer n = map.get(c);
            if (n == null) {
                map.put(c, 1);
            } else {
                map.put(c, n + 1);
            }
        }
        return map;
    }
}
----------------------------------------------------------------------------
import java.util.*;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        Map<Integer, Integer> cnt = new HashMap<>();
        str2.chars().forEach(i -> cnt.put(i, cnt.getOrDefault(i, 0) + 1));
        str1.chars().filter(i -> cnt.containsKey(i)).forEach(i -> cnt.put(i, cnt.get(i) - 1));
        return cnt.values().stream().filter(i -> i>0).count() == 0;
    }
}
---------------------------------------------------------------------------
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Scramblies {
  
  public static boolean scramble(String str1, String str2) {
    Map<String, Long> str1Map = Stream.of(str1.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    Map<String, Long> str2Map = Stream.of(str2.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    return str2Map.entrySet().stream().allMatch(e -> str1Map.get(e.getKey()) != null && e.getValue() <= str1Map.get(e.getKey()));
  }
  
}
--------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Scramblies {

	public static boolean scramble(final String bank, final String expected) {
		final Map<Integer, Integer> counts = new HashMap<>();
		expected.chars().forEach(c -> counts.merge(c, 1, (a, b) -> a + b));
		return bank.chars().anyMatch(c ->
				counts.computeIfPresent(c, (character, count) -> (count > 1) ? count - 1 : null) == null
						&& counts.size() == 0);
	}

}
-------------------------------------------------------------------------------
public class Scramblies {
    
    public static boolean scramble(String str1, String str2)
    {
        int [] freq = new int[26];
        for (int i = 0; i < str1.length(); i++)
          freq[str1.charAt(i) - 'a']++;
          
        for (int i = 0; i < str2.length(); i++)
          if ((--freq[(int)(str2.charAt(i) - 'a')]) < 0)
            return false;
                
        return true;
    }
}


*/
