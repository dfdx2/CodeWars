/* 6KYU CodeWars Detect Pangram

A pangram is a sentence that contains every single letter 
of the alphabet at least once. For example, the sentence 
"The quick brown fox jumps over the lazy dog" is a pangram, 
because it uses the letters A-Z at least once (case 
is irrelevant).

Given a string, detect whether or not it is a pangram. 
Return True if it is, False if not. Ignore numbers and 
punctuation.

*/

import java.util.*;
public class PangramChecker {
  public boolean check(String sentence){
    sentence = sentence.toLowerCase();
    Map<Character, Integer>map = new HashMap<>();
    map.put('a', 0);
    map.put('b', 0);
    map.put('c', 0);
    map.put('d', 0);
    map.put('e', 0);
    map.put('f', 0);
    map.put('g', 0);
    map.put('h', 0);
    map.put('i', 0);
    map.put('j', 0);
    map.put('k', 0);
    map.put('l', 0);
    map.put('m', 0);
    map.put('n', 0);
    map.put('o', 0);
    map.put('p', 0);
    map.put('q', 0);
    map.put('r', 0);
    map.put('s', 0);
    map.put('t', 0);
    map.put('u', 0);
    map.put('v', 0);
    map.put('w', 0);
    map.put('x', 0);
    map.put('y', 0);
    map.put('z', 0);
    for (int i = 0; i < sentence.length(); i++) {
      if (map.containsKey(sentence.charAt(i))) {
        int total = map.get(sentence.charAt(i));
        map.put(sentence.charAt(i), total + 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      char ch = entry.getKey();
      int x = entry.getValue();
      if (x == 0) {
        return false;
      }
    }
    return true;
  }
}
/*-----------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

  }
}
-------------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String sentence){
  	return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }
}
-------------------------------------------------------------------------
class PangramChecker {
    boolean check(final String sentence) {
        return sentence.chars()
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .distinct()
            .count() == 26;
    }
}
-------------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String sentence){
        String x = sentence.toLowerCase();
        if(x.contains("a") && x.contains("b") && x.contains("c") && x.contains("d")
                && x.contains("e") && x.contains("f") && x.contains("g")
                && x.contains("h") && x.contains("i") && x.contains("j")
                && x.contains("k") && x.contains("l") && x.contains("m")
                && x.contains("n") && x.contains("o") && x.contains("p")
                && x.contains("q") && x.contains("r") && x.contains("s")
                && x.contains("t") && x.contains("u") && x.contains("v")
                && x.contains("w") && x.contains("x") && x.contains("y")
                && x.contains("z")){
            return true;
        }else{
            return false;
        }
    }
}
--------------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String sentence){
    long result = sentence.toLowerCase().chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();
    return result == 26;
  }
}
-------------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String s){
    return s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
  }
}
--------------------------------------------------------------------------
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
  public boolean check(String sentence){
    String str = sentence.toLowerCase().replaceAll("[^a-z]", "");
		Set<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			set.add(c);
		}
		return set.size() == 26;
  }
}
---------------------------------------------------------------------------
import java.util.*;

public class PangramChecker {

  public boolean check(String s){
    return new HashSet<>(Arrays.asList(s.toUpperCase().replaceAll("[^A-Z]","").split(""))).size() == 26;
  }
}
----------------------------------------------------------------------------
import java.util.*;

public class PangramChecker {
  public boolean check(String sentence){
    
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    List<String> sentence_chars = Arrays.asList( sentence.toLowerCase().split("") );
    List<String> alphabet_chars = Arrays.asList( alphabet.split("") );
    
    return sentence_chars.containsAll( alphabet_chars ); 
  }
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class PangramChecker {
  public boolean check(String inputSentence){
    String loweredInput = inputSentence.toLowerCase();
    return IntStream.range('a', 'z' + 1).allMatch(a -> loweredInput.indexOf(a) >= 0);
  }
}
---------------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String sentence){
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for (char letter: alph.toCharArray()) {
            if (!sentence.toLowerCase().contains(String.valueOf(letter))) return false;
        }
        return true;
  }
}
----------------------------------------------------------------------------
public class PangramChecker {
  public boolean check(String sentence){
    return sentence.toLowerCase()
              .chars()
              .mapToObj(i -> (char)i)
              .filter(Character::isAlphabetic)
              .distinct()
              .count() == 26;
  }
}
---------------------------------------------------------------------------
import java.util.stream.Collectors;

public class PangramChecker {
  public boolean check(String sentence){
    return sentence
              .toLowerCase()
              .replaceAll("[^a-z]", "")
              .chars()
              .mapToObj(ch -> (char) ch)
              .collect(Collectors.toSet()).size() == 26;
  }
}

*/