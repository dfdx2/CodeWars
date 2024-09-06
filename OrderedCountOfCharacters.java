/* 7KYU CodeWars Ordered Count of Characters

Count the number of occurrences of each character and return 
it as a (list of tuples) in order of appearance. For empty 
output return (an empty list).

Consult the solution set-up for the exact data structure 
implementation depending on your language.

Example:

ordered_count("abracadabra") == [('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1)]

*/

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import static org.apache.commons.lang3.StringUtils.countMatches;

public class OrderedCountOfCharacters {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        return text.chars().distinct().mapToObj(c -> Pair.of((char) c, countMatches(text, (char) c))).toList();
    }
}
/*------------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.tuple.Pair;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        List<Pair<Character, Integer>> result = new ArrayList<>();
      
        int length = text.length();
        while(text.length() > 0) {
            Character key = text.charAt(0);
            text = text.replaceAll(String.valueOf(key), "");
            result.add(Pair.of(key, length - text.length()));
            length = text.length();
        }
      
      return result;
    }
}
--------------------------------------------------------------------------------
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import static org.apache.commons.lang3.StringUtils.countMatches;

interface Solution {
  static List<Pair<Character, Integer>> orderedCount(String text) {
    return text.chars().distinct().mapToObj(c -> Pair.of((char) c, countMatches(text, (char) c))).toList();
  }
}

--------------------------------------------------------------------------------
import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        List<Pair<Character, Integer>> res = new ArrayList<>();
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (var ch : text.toCharArray())
            occurrences.put(ch, occurrences.getOrDefault(ch, 0) + 1);

        occurrences.forEach((key, value) -> res.add(new ImmutablePair<>(key, value)));

        return res;
    }
}

--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;


public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        return Arrays.stream(text.split(""))
                .map(s -> s.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(v -> Pair.of(v.getKey(), v.getValue().intValue()))
                .toList();
    }
}
--------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
import org.apache.commons.lang3.tuple.Pair;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
       
      return IntStream.range(0,text.length()).mapToObj(i -> Pair.of(
                text.charAt(i),
                text.length() - text.replace(String.valueOf(text.charAt(i)), "").length()
            ))
            .distinct() 
            .collect(Collectors.toList());     
    }
}

--------------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.tuple.Pair;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        StringBuilder uniqueStringBuilder = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (uniqueStringBuilder.indexOf(String.valueOf(c)) == -1) {
                uniqueStringBuilder.append(c);
            }
        }
        List<Pair<Character, Integer>> result = new ArrayList<>();

        for (int i = 0; i < uniqueStringBuilder.length(); i++) {
            Integer count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (uniqueStringBuilder.toString().charAt(i) == text.charAt(j)) {
                    count++;
                }

            }
            result.add(Pair.of(uniqueStringBuilder.toString().charAt(i), count));
        }

        return result;
    }
}
--------------------------------------------------------------------------------
import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        List<Pair<Character, Integer>> list = new ArrayList<>();
      LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
      
      for(char c: text.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
      }
      for (Map.Entry<Character, Integer> e: map.entrySet()) {
        list.add(Pair.of(e.getKey(), e.getValue()));
      }
      return list;
    }
}

--------------------------------------------------------------------------------
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
public class Solution {
    public static List<Map.Entry<Character, Integer>> orderedCount(String text) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
      
    for(char c : text.toCharArray()){
      frequencyMap.put(c, frequencyMap.getOrDefault(c,0) +1);
    }
      List<Map.Entry<Character, Integer>> result = new ArrayList<>(frequencyMap.entrySet());
      
      return result;
    }
  
}
--------------------------------------------------------------------------------
import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
      HashMap<Character, Integer> count = new HashMap<>();
      ArrayList<Character> orderList = new ArrayList<>();
      
      for(char symbol : text.toCharArray()) {
        if(!count.containsKey(symbol)) {
          orderList.add(symbol);
        }
        count.put(symbol,count.getOrDefault(symbol,0) + 1);
      }
      
      ArrayList<Pair<Character, Integer>> result = new ArrayList<>();
      
      for(char symbol : orderList) {
        result.add(Pair.of(symbol, count.get(symbol)));
      }
      
      return result;
    }
}
*/