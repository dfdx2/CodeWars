/* 6KYU CodeWars Which Are In

Given two arrays of strings a1 and a2 return a sorted array r in 
lexicographical order of the strings of a1 which are substrings 
of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

Example 2:
a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []

Notes:

Arrays are written in "general" notation. See "Your Test Cases" for 
examples in your language.  In Shell bash a1 and a2 are strings. 
The return is a string where words are separated by commas.
Beware: In some languages r must be without duplicates.

*/
import static java.util.stream.Stream.of;
public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
		 return of(array1).filter(a -> of(array2).anyMatch(b -> b.contains(a))).sorted().toArray(String[]::new);
	}
}
/*------------------------------------------------------------------------
import java.util.Arrays;

public class WhichAreIn { 
	  
	public static String[] inArray(String[] array1, String[] array2) {
    return Arrays.stream(array1)
      .filter(str ->
        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
      .distinct()
      .sorted()
      .toArray(String[]::new);
	}
}
--------------------------------------------------------------------------
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
		 Set<String> result = new HashSet<>();
     
     for(String a1 : array1) {
       for(String a2 : array2) {
         if(a2.contains(a1)) {
           result.add(a1);
           break;
         }
       }
     }
     
     String[] resultArray = result.toArray(new String[result.size()]);
     
     Arrays.sort(resultArray);
     
     return resultArray;
	}
}
---------------------------------------------------------------------------
import static java.util.Arrays.stream;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return stream(array1).filter(s1 -> stream(array2).anyMatch(s2 -> s2.contains(s1))).sorted().distinct().toArray(String[]::new);
    }
}
---------------------------------------------------------------------------
public static String[] inArray(String[] array1, String[] array2) {
    // Join the strings of array2 on the '\0' character, allowing a single string search to check
    // if a given string is a substring of any of those in array2. Sort and return the matching strings.
    final String combined = String.join("\0", array2);
    
    final List<String> result = new ArrayList<>();
    for (final String str : array1) {
      if (combined.indexOf(str) != -1) {
        result.add(str);
      }
    }
    
    Collections.sort(result);
    return result.toArray(new String[result.size()]);
	}
}
---------------------------------------------------------------------------
import java.util.Arrays;

public class WhichAreIn { 
	
  public static boolean is_in_array2(String str, String[] array2) {
      return Arrays.stream(array2).map(s -> s.contains(str))
                   .anyMatch(b -> b);
  }
  
	public static String[] inArray(String[] array1, String[] array2) {
     return Arrays.stream(array1)
                  .filter(s -> is_in_array2(s, array2))
                  .sorted()
                  .distinct()
                  .toArray(String[]::new);
	}
}
--------------------------------------------------------------------------
import java.util.*;public class WhichAreIn { 
	
	 public static String[] inArray(String[] array1, String[] array2) {
     Set<String> result = new TreeSet<>();
        String arr[];

        for (String s : array1)
            for (String i : array2)
                if (i.contains(s))
                    result.add(s);


        arr = new String[result.size()];
        return result.toArray(arr);
    }
}
----------------------------------------------------------------------------
import java.util.*;
public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
    List<String> result = new ArrayList<String>();
      for(int i=0; i<array1.length; i++){
         for(int j=0; j<array2.length; j++ ){
            if(array2[j].indexOf(array1[i]) >= 0){
              result.add(array1[i]);
              j =array2.length;
            }
          }
      }
    Collections.sort(result);
	  return result.toArray(new String[result.size()]);
	}
}
----------------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
		 return Stream.of(array1).filter(s1 -> Arrays.stream(array2).anyMatch(s2 -> s2.contains(s1))).sorted().toArray(String[]::new);
	}
}
*/