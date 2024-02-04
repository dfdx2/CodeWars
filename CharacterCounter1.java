/* 7KYU CodeWars Character Counter

You are going to be given a word. Your job will be to 
make sure that each character in that word has the exact 
same number of occurrences. You will return true if it is 
valid, or false if it is not.

For this kata, capitals are considered the same as lowercase 
letters. Therefore: "A" == "a"

The input is a string (with no spaces) containing [a-z],[A-Z],[0-9] 
and common symbols. The length will be 0 < length < 100.

Examples

"abcabc" is a valid word because "a" appears twice, "b" appears twice, 
and"c" appears twice.

"abcabcd" is NOT a valid word because "a" appears twice, "b" appears twice, 
"c" appears twice, but "d" only appears once!

"123abc!" is a valid word because all of the characters only appear once 
in the word.

*/

import java.util.*;
public class CharacterCounter {

  public static boolean validateWord(String word) {
    Map<Character, Integer> map = new HashMap<>();
    word = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
      if (!map.containsKey(word.charAt(i))) {
        map.put(word.charAt(i), 1);
      }
      else {
        int total = map.get(word.charAt(i));
        map.put(word.charAt(i), total + 1);
      }
    }
    int result = map.get(word.charAt(0));
    for (int i = 0; i < word.length(); i++) {
      if (map.get(word.charAt(i)) != result) {
        return false;
      }
    }
    return true;
  }
}
/*----------------------------------------------------------------------
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter {

  public static boolean validateWord(String word) {
    return new HashSet<Long>(word.toLowerCase().chars().boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .values()
      ).size() == 1;
  }
}
------------------------------------------------------------------------
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CharacterCounter
{

  public static boolean validateWord(String word) 
  {
    // your code here
    Map<Character, Integer> map = new HashMap<Character, Integer>();

    String lower = word.toLowerCase();
    
    for (char c : lower.toCharArray())
    {
    	map.put(c,  map.get(c) == null ? 1 : map.get(c) + 1);
    }

    HashSet<Integer> counts = new HashSet<Integer>(map.values());
    
    return counts.size() == 1;
    
  }
  
}
------------------------------------------------------------------------
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class CharacterCounter {

  public static boolean validateWord(String word) {
         Map<Character, Integer> map = new HashMap<Character, Integer>();
        char array[] = word.toLowerCase().toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int value = 1;
            if (map.containsKey(array[i])) value = map.get(array[i]) + 1;
            map.put(array[i],value);
        }
        Set<Object> uniqueValues = new HashSet<Object>(map.values());
        if (uniqueValues.size() == 1) return true;
        else return false;
  }
}
------------------------------------------------------------------------
public class CharacterCounter {

  public static boolean validateWord(String word) {
    word = word.toLowerCase();
    int times = word.length() - word.replace(word.substring(0,1) , "").length();
    boolean ans = true;
    for (int i = 0; i < word.length(); i++)
    {
      if (word.length() - word.replace(word.substring(i,i+1) , "").length() != times)
      {
        ans = false;
      }
    }
    return ans;
  }
}
------------------------------------------------------------------------
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.HashSet;

class CharacterCounter {
  static boolean validateWord(String word) {
    return new HashSet<>(word.toLowerCase().chars().boxed()
                           .collect(groupingBy(identity(), counting())).values()).size() == 1;
  }
}
------------------------------------------------------------------------
public class CharacterCounter {

  public static boolean validateWord(String word) {
            word = word.toLowerCase();
            int cuenta = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == word.charAt(0)) {
                    cuenta++;
                }

            }

            for (int i = 1; i < word.length(); i++) {
                int ci = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == word.charAt(i)) {
                        ci++;
                    }

                }

                if (cuenta != ci) {
                    return false;
                }

            }
            return true;
        }
  
}
-------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

	public static boolean validateWord(String word) {
		word = word.toLowerCase();
		Map<Character, Integer> buchstabenZuordnung = new HashMap<Character, Integer>();
		for (int c = 0; c < word.length(); c++) {

			if (buchstabenZuordnung.containsKey(word.charAt(c))) {
				buchstabenZuordnung.put(word.charAt(c), buchstabenZuordnung.get(word.charAt(c)) + 1);

			} else {
				buchstabenZuordnung.put(word.charAt(c), 1);
			}
		}
		for (int d = 0; d < word.length()-1; d++) {
			if (buchstabenZuordnung.get(word.charAt(d)) != buchstabenZuordnung.get(word.charAt(d + 1))) {
				return false;
			}
		}return true;
	}
}
-------------------------------------------------------------------------
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static boolean validateWord(String s) {
        String string = s.toLowerCase();
        Map<Character, Integer> dict = new HashMap<>();

        for (char c : string.toCharArray()) {
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }

        return new HashSet<>(dict.values()).size() == 1;
    }
}

*/