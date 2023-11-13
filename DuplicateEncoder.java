/* 6KYU CodeWars Duplicate Encoder

The goal of this exercise is to convert a string to a new 
string where each character in the new string is "(" if that 
character appears only once in the original string, or ")" if 
that character appears more than once in the original string. 
Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
Notes
Assertion messages may be unclear about what they display in some 
languages. If you read "...It Should encode XXX", the "XXX" is the 
expected result, not the input!

*/
import java.util.*;
public class DuplicateEncoder {
	static String encode(String word){
    Map<Character, Integer> result = new HashMap<>();
    word = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
      if (!result.containsKey(word.charAt(i))) {
        result.put(word.charAt(i), 1);
      }
      else {
        int total = result.get(word.charAt(i));
        result.put(word.charAt(i), total + 1);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      if (result.get(word.charAt(i)) == 1) {
        sb.append("(");
      }
      else {
        sb.append(")");
      }
    }
    System.out.println(word);
    return sb.toString();
  }
}
/*--------------------------------------------------------------------------
public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;

public class DuplicateEncoder {
	static String encode(String word){    
        return word.toLowerCase()
                   .chars()
                   .mapToObj(i -> String.valueOf((char)i))
                   .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                   .collect(Collectors.joining());
  }
}
----------------------------------------------------------------------------
import java.lang.StringBuilder;
import java.util.Map;
import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word) {
    word = word.toLowerCase();

    Map<Character, Integer> letters = new HashMap<Character, Integer>();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      Integer index = letters.get(c);
      
      if (index == null) {
        // First occurrence
        result.append("(");
        letters.put(c, i);
      } else if (index >= 0) {
        // 2nd occurrence, replace first instance, and set entry to -1
        result.replace(index, index + 1, ")");
        result.append(")");
        letters.put(c, -1);
      } else {
        result.append(")");
      }      
    }
    return result.toString();
  }
}
------------------------------------------------------------------------------
import java.util.Map;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

class DuplicateEncoder {
  	static String encode(final String word) {
        final Map<Integer, Long> frequencies = word.codePoints()
            .map(Character::toLowerCase)
            .boxed()
            .collect(groupingBy(identity(), counting()));
        return word.codePoints()
            .map(Character::toLowerCase)
            .mapToObj(i -> frequencies.get(i) > 1 ? ")" : "(")
            .collect(joining());
    }
}
-----------------------------------------------------------------------------
public class DuplicateEncoder {
	static String encode(String word){
    String lowerWord = word.toLowerCase();
    StringBuilder result = new StringBuilder();
    for(char ch: lowerWord.toCharArray()) {
      boolean single = lowerWord.indexOf(ch) == lowerWord.lastIndexOf(ch);
      result.append(single ? '(' : ')');
    }
    return result.toString();
  }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;

public class DuplicateEncoder {
	static String encode(String word){
    String wrd = word.toLowerCase();
    return wrd.chars().mapToObj(i -> (char)i).map(chr ->
      wrd.length() - wrd.replace(chr.toString(), "").length() > 1 ? ")":"("
    ).collect(Collectors.joining(""));
  }
}
-----------------------------------------------------------------------------

*/
