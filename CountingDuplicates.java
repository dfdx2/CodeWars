/* 6KYU CodeWars Counting Duplicates

Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive 
alphabetic characters and numeric digits that occur more than once in the 
input string. The input string can be assumed to contain only alphabets 
(both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

*/
import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int result = 0;
    Map<Character, Integer> map = new HashMap<>();
    text = text.toLowerCase();
    for (int i = 0; i < text.length(); i++) {
      if (!map.containsKey(text.charAt(i))) {
        map.put(text.charAt(i), 1);
      }
      else {
        int total = map.get(text.charAt(i));
        map.put(text.charAt(i), total + 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        result++;
      }
    }
    return result;
  }
}
/*-----------------------------------------------------------------
import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    text = text.toLowerCase();
    Map<Character, Integer> result = new HashMap<>();
    char[] x = new char[text.length()];
    for (int i = 0; i < x.length; i++) {
      x[i] = text.charAt(i);
    }
    for (char c : x) {
      if (!result.containsKey(c)) {
        result.put(c, 1);
      }
      else {
        int total = result.get(c);
        result.put(c, total + 1);
      }
    }
    int count = 0;
    for (Map.Entry<Character, Integer> item : result.entrySet()) {
      if (item.getValue() > 1) {
        count++;
      }
    }
    return count;
  }
}
----------------------------------------------------------------------------
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}
--------------------------------------------------------------------------------
import java.util.Map;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class CountingDuplicates {
    private static Map<Character, Long> charFrequenciesMap(final String text) {
        return text.codePoints()
            .map(Character::toLowerCase)
            .mapToObj(c -> (char) c)
            .collect(groupingBy(identity(), counting()));
    }
    
    static int duplicateCount(final String text) {
        return (int) charFrequenciesMap(text).values().stream()
            .filter(i -> i > 1)
            .count();
    }
}
--------------------------------------------------------------------------------
import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
      HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
      return (int) map.values().stream().filter(e -> e > 0).count();
    }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    return (int)text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
  }
}
------------------------------------------------------------------------------
import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
		Set<String> count = new HashSet<>();
		
		for (String string : text.toLowerCase().split("")) {
			if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
		}
		
		return count.size();
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
        List<String> list = Arrays.asList(text.toLowerCase().split(""));
        return (int) list.stream().filter(s -> Collections.frequency(list, s) > 1).distinct().count();
        }
}
-------------------------------------------------------------------------------
public class CountingDuplicates {
    public static int duplicateCount(String text) {

        byte[] charsCnt = new byte[255];
        int counter = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if(charsCnt[c]<3)
                charsCnt[c]++;
            if (charsCnt[c] == 2)
                counter++;
        }
        return counter;
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
public class CountingDuplicates {
    public static long duplicateCount(String text) {
        String workingText = text.toUpperCase();
        return Arrays.stream(workingText.split(""))
                .filter(c -> (workingText.indexOf(c) != workingText.lastIndexOf(c)))
                .distinct()
                .count();
    }
}


*/