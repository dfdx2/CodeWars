/* 6KYU CodeWars Mexican Wave

Introduction

The wave (known as the Mexican wave in the English-speaking world 
outside North America) is an example of metachronal rhythm achieved 
in a packed stadium when successive groups of spectators briefly 
stand, yell, and raise their arms. Immediately upon stretching to 
full height, the spectator returns to the usual seated position.

The result is a wave of standing spectators that travels through the 
crowd, even though individual spectators never move away from their 
seats. In many large arenas the crowd is seated in a contiguous circuit 
all the way around the sport field, and so the wave is able to travel 
continuously around the arena; in discontiguous seating arrangements, 
the wave can instead reflect back and forth through the crowd. When 
the gap in seating is narrow, the wave can sometimes pass through it. 
Usually only one wave crest will be present at any given time in an 
arena, although simultaneous, counter-rotating waves have been produced. 

(Source Wikipedia)

Task

In this simple Kata your task is to create a function that turns a 
string into a Mexican Wave. You will be passed a string and you must 
return that string in an array where an uppercase letter is a person 
standing up. 

Rules

1.  The input string will always be lower case but maybe empty.

2.  If the character in the string is whitespace then pass over 
    it as if it was an empty seat

Example

wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}

Good luck and enjoy!

*/

import static java.util.stream.IntStream.range;
public class MexicanWave {
    public static String[] wave(String str) {
      return range(0, str.length())
        .filter(n -> str.charAt(n) != ' ')
        .mapToObj(n -> str.substring(0, n) + Character.toUpperCase(str.charAt(n)) + str.substring(n + 1))
        .toArray(String[]::new);
    }   
}
/*-----------------------------------------------------------------------
import java.util.*;

public class MexicanWave {

    public static String[] wave(String str) {    
      List<String> list = new ArrayList<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == ' ') continue;
        list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
      }
      return list.toArray(new String[0]);
    }
    
}
-------------------------------------------------------------------------
import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {
        return IntStream
                .range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> !x.equals(str))
                .toArray(String[]::new);
    }
    
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {

        String[] result = IntStream.range(0, str.length())
                .mapToObj(n ->
                        str.substring(0, n) + Character.toUpperCase(str.charAt(n)) + str.substring(n + 1)
                )
                .filter(a -> !a.equals(str))
                .toArray(String[]::new);
        
        return result;
    }
}
--------------------------------------------------------------------------
import java.util.*;

public class MexicanWave {

    public static String[] wave(String str) {        
        List<String> result = new ArrayList<>();        
        for (int i = 0; i < str.length(); i++) {                
          if (str.charAt(i) != ' ') {
            result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i+1, str.length()));              
          }                    
        }        
        return result.toArray(new String[0]);
    }    
}
---------------------------------------------------------------------------
import java.util.LinkedList;
public class MexicanWave {

    public static String[] wave(String str) {
        LinkedList<String> list = new LinkedList<String>();
    		for(int i = 0; i < str.length(); i++)
    		{
    			char[] charArray = str.toCharArray();	
          
    			if(charArray[i] == ' ') continue;
    			
          charArray[i] = Character.toUpperCase(charArray[i]);
    			list.add(String.valueOf(charArray));
    		}	
    		return list.toArray(new String[list.size()]);
    }
    
}
---------------------------------------------------------------------------
public class MexicanWave {

    public static String[] wave(String str) {
        // Your code here        
        String[] result = new String[str.replace(" ", "").length()];
        char[] chars = str.toCharArray();
        
        int rI=0;
        for(int i=0; i<chars.length; i++){
          if(chars[i] == ' ') continue;
          
          chars[i] = Character.toUpperCase(chars[i]);
          result[rI++] = new String(chars);
          chars[i] = Character.toLowerCase(chars[i]);
        }
        
        return result;
    }
    
}
*/