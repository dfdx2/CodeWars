/* 7KYU CodeWars Changing Letters

When provided with a String, capitalize all vowels

For example:

Input : "Hello World!"

Output : "HEllO WOrld!"

Note: Y is not a vowel in this kata.

*/

public class Kata {
    public static String swap(String st){
    
     st = st.replace("a", "A");
     st = st.replace("e", "E");
     st = st.replace("i", "I");
     st = st.replace("o", "O");
     st = st.replace("u", "U");
     return st;
    }
}
/*--------------------------------------------------------------------
public class Kata {
    public static String swap(String st){
      return st.replace("a","A").replace("e","E").replace("i","I").replace("o","O").replace("u","U");
    }
}
--------------------------------------------------------------------
public class Kata {
    public static String swap(String st){
    
     // Your code here
     
     StringBuilder sb = new StringBuilder();
        for (char ch : st.toCharArray()) {
            char t = Character.toUpperCase(ch);
            if (t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U') {
                sb.append(t);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
---------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {

    public static String swap(String st){
      return Stream.of(st.split("")).map(ch -> ch = "aeiou".contains(ch) ? ch.toUpperCase() : ch).collect(Collectors.joining());
    }
}
-----------------------------------------------------------------------
public class Kata {
    public static String swap(String st){
     return java.util.regex.Pattern.compile("[aeiou]").matcher(st).replaceAll(x -> x.group().toUpperCase());
    }
}
--------------------------------------------------------------------
import java.util.Set;

public class Kata {
  
  private static final Set<Integer> VOWELS = 
    Set.of((int) 'a', (int) 'e', (int) 'i', (int) 'o', (int) 'u');
  
  public static String swap(String str) {
    return str.chars()
              .map(ch -> VOWELS.contains(ch) ? Character.toUpperCase(ch) : ch)
              .collect(StringBuilder::new, 
                       StringBuilder::appendCodePoint, 
                       StringBuilder::append)
              .toString();
  }
}
---------------------------------------------------------------------
public class Kata {
  private static final String VOWELS = "aeiou";

  public static String swap(String st) {
    StringBuilder sb = new StringBuilder();
    for (char c : st.toCharArray())
      sb.append(VOWELS.indexOf(c) >= 0 ? Character.toUpperCase(c) : c);
    return sb.toString();
  }
}
-------------------------------------------------------------------
*/