/* 7KYU CodeWars Anagram Detection

An anagram is the result of rearranging the letters 
of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments 
given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"

*/
import java.util.Arrays;
public class Kata {
  public static boolean isAnagram(String test, String original) {
    test = test.toLowerCase();
    original = original.toLowerCase();
    char[] a = test.toCharArray();
    char[] b = original.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a,b);
  }
}
/*-----------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static boolean isAnagram(String test, String original) {
    if( test == null || original == null || test.length() != original.length())
      return false;
      
    char ch1 [] = test.toLowerCase().toCharArray(); 
    char ch2 [] = original.toLowerCase().toCharArray(); 
    
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    
    return Arrays.equals(ch1, ch2);
    
  }
}
--------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
  public static boolean isAnagram(String test, String original) {
        return Stream.of(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Stream.of(original.toLowerCase()
                                .split(""))
                                .sorted()
                                .collect(Collectors.joining()));
    
    }
}
---------------------------------------------------------------------------
import java.util.*;

public class Kata {
  public static boolean isAnagram(String test, String original) {
    final char[] a = test.toLowerCase().toCharArray(), b = original.toLowerCase().toCharArray();
    Arrays.sort(a); 
    Arrays.sort(b);    
    return Arrays.equals(a,b);
  }
}
----------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static boolean isAnagram(String test, String original) {
    return sort(test.toLowerCase()).equals(sort(original.toLowerCase()));
  }
  public static String sort(String s)
  {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static boolean isAnagram(String a, String b) {
    if (a == null || b == null || a.length() != b.length()) return false;
    if (a == b) return true;
  
    return Arrays.equals(a.toLowerCase().chars().sorted().toArray(), 
                         b.toLowerCase().chars().sorted().toArray());
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Kata {
  public static boolean isAnagram(String test, String original) {
    // your code goes here
        Map<Character, Long> testLetterCount = test.toLowerCase().chars()
                .mapToObj(value -> Character.valueOf((char) value))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        Map<Character, Long> originalLetterCount = original.toLowerCase().chars()
                .mapToObj(value -> Character.valueOf((char) value))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        // your code goes here
        return testLetterCount.equals(originalLetterCount);
  }
}
-------------------------------------------------------------------------
public class Kata {
        public static boolean isAnagram(final String test, final String original) {
            return sortedLowercase(test).equals(sortedLowercase(original));
        }

        private static String sortedLowercase(final String s) {
            return s.toLowerCase()
                    .chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
        }
}

*/
