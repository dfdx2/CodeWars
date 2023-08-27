/* 6KYU CodeWars Stop gninnipS My sdroW!

Write a function that takes in a string of one or more words, and 
returns the same string, but with all five or more letter words 
reversed (Just like the name of this Kata). Strings passed in 
will consist of only letters and spaces. Spaces will be included 
only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords( "This is a test") => returns "This is a test" 
spinWords( "This is another test" )=> returns "This is rehtona test"

*/

public class SpinWords {

  public String spinWords(String sentence) {
    String[] x = sentence.split(" ");
    String y = "";
    for (int i = 0; i < x.length; i++) {
      String z = x[i];
      if (z.length() >= 5) {
        for (int j = z.length() - 1; j >= 0; j--) {
          if (j == 0) {
            y += z.charAt(j) + " ";
          }
          else {
            y += z.charAt(j);
          }
        }
      }
      else {
        y += z + " ";
      }
    }
    return y.trim();
  }
}
/*--------------------------------------------------------------------------
import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}
----------------------------------------------------------------------------
import java.util.stream.*;
import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
  public static final String WORD_DELIMITER = " ";
  
  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(WORD_DELIMITER, -1)).map(SpinWords::spinIfNecessary).collect(Collectors.joining(WORD_DELIMITER));
  }

  private static String spinIfNecessary(String word) {
    return spinnable(word) ? spin(word) : word;
  }

  private static boolean spinnable(String word) {
    return word.length() >= 5;
  }

  private static String spin(String word) {
    return new StringBuilder(word).reverse().toString();
  }
}
-----------------------------------------------------------------------------
public class SpinWords {

  public String spinWords(String sentence) {
    
        
       for (String a : sentence.split(" "))
       {
           if (a.length()> 4)
           {
              sentence = sentence.replace(a, new  StringBuffer(a).reverse());
           }
          
           
       }
       return sentence;
    //TODO: Code stuff here
  }
}
------------------------------------------------------------------------------
public class SpinWords {
    public String spinWords(String sentence) {
        String[] splitted = sentence.split(" ");
        StringBuilder mainBuilder = new StringBuilder();
        for (String s : splitted) {
            if (s.length() > 4) {
                StringBuilder tempBuilder = new StringBuilder();
                tempBuilder.append(s).reverse();
                mainBuilder.append(tempBuilder).append(" ");
            } else {
                mainBuilder.append(s).append(" ");
            }
        }
        mainBuilder.deleteCharAt(mainBuilder.length() - 1);
        return mainBuilder.toString();
    }
}
-------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
      
      return Arrays.stream( sentence.split(" ") )
                   .map( w -> w.length() < 5 ? w : new StringBuilder(w).reverse().toString() )
                   .collect(Collectors.joining(" "));
  }
}



*/