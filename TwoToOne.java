/* 7KYU CodeWars Two To One

Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

*/
import java.util.*;
import java.util.Arrays;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
      Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < s1.length(); i++) {
        if (!map.containsKey(s1.charAt(i))) {
          map.put(s1.charAt(i), 1);
        }
        else {
          int total = map.get(s1.charAt(i));
          map.put(s1.charAt(i), total + 1);
        }
      }
      for (int i = 0; i < s2.length(); i++) {
        if (!map.containsKey(s2.charAt(i))) {
          map.put(s2.charAt(i), 1);
        }
        else {
          int count = map.get(s2.charAt(i));
          map.put(s2.charAt(i), count + 1);
        }
      }
      String x = "";
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        x += entry.getKey();
      }
      char[] y = x.toCharArray();
      Arrays.sort(y);
      String result = "";
      for (int i = 0; i < y.length; i++) {
        result += y[i];
      }
      return result; 
    }
}
/*----------------------------------------------------------------------------
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
-----------------------------------------------------------------------------
public class TwoToOne {
    
     public static String longest (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
------------------------------------------------------------------------------

public class TwoToOne
{

    public static String longest(String s1, String s2)
    {
        String out = "";
        String s = s1 + s2;
        for (char c = 'a'; c <= 'z'; c++)
        {
            if (s.contains(c + ""))
            {
                out += c;
            }
        }
        return out;
    }

    public static void main(String[] args)
    {
        System.out.println(TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }
}
------------------------------------------------------------------------------
import java.util.stream.*;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                  .sorted()
                  .distinct()
                  .collect(Collectors.joining());
    }
}
-----------------------------------------------------------------------------
import java.util.*;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
      TreeSet<Character> set = new TreeSet<>();
      
      //Combine both strings into a single String
      String s1s2 = s1 + s2;
      //Create a StringBuilder that we will us to create our result String
      StringBuilder sb = new StringBuilder();
      
      //Add all characters to TreeSet. Now they are ordered and only 1 occurence of each
      for(int i = 0; i < s1s2.length(); i++)
        set.add(s1s2.charAt(i));
        
      //Build our StringBuilder by interating over the Set  
       for(Character c : set)
         sb.append(c);
        
        //Return the result as a String
         return new String(sb);
       
     
    }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());
    }
}
-----------------------------------------------------------------------------
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
    		String all = "abcdefghijklmnopqrstuvwxyz";
        return all.replaceAll("[^" + s1+s2 + "]", "");
    }
}
------------------------------------------------------------------------------
import java.util.*;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        s1 = s1+s2;
        char[] chars =  s1.toCharArray();
        TreeSet<Character> set = new TreeSet<>();

        for(char i : chars)
            set.add(i);
            s1 = "";
        for(char i : set)
            s1 += i;
            return s1;    }
}
-------------------------------------------------------------------------------
import java.util.TreeSet;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
      char[] chars;
		String result = "";
		TreeSet<Character> ts1 = new TreeSet<Character>();
		TreeSet<Character> ts2 = new TreeSet<Character>();
		chars = s1.toCharArray();
		for (char s : chars) {
			ts1.add(s);
		}
		chars = s2.toCharArray();
		for (char s : chars) {
			ts2.add(s);
		}
		ts1.addAll(ts2);
		for (char c : ts1) {
			result += c;
		}
		return result;
  }
}
*/