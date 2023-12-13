/* 7KYU CodeWars Spoonerize Me

A spoonerism is a spoken phrase in which the first letters of two 
of the words are swapped around, often with amusing results.

In its most basic form a spoonerism is a two word phrase in which 
only the first letters of each word are swapped:

"not picking" --> "pot nicking"

Your task is to create a function that takes a string of two words, 
separated by a space: words and returns a spoonerism of those words 
in a string, as in the above example. A "word" in the context of 
this kata can contain any of the letters A through Z in upper or 
lower case, and the numbers 0 to 9. Though spoonerisms are about 
letters in words in the domain of written and spoken language, numbers 
are included in the inputs for the random test cases and they require 
no special treatment.

NOTE: All input strings will contain only two words. Spoonerisms can 
be more complex. For example, three-word phrases in which the first 
letters of the first and last words are swapped: "pack of lies" --> 
"lack of pies" or more than one letter from a word is swapped: 
"flat battery --> "bat flattery" You are NOT expected to account for 
these, or any other nuances involved in spoonerisms.

Once you have completed this kata, a slightly more challenging take 
on the idea can be found here: 
http://www.codewars.com/kata/56dbed3a13c2f61ae3000bcd

*/

public class Spooner {
    public String spoonerize(String words) {
        String[] result = words.split(" ");
      String x = result[0].substring(0,1);
      String y = result[1].substring(0,1);
      String a = result[0].substring(1, result[0].length());
      String b = result[1].substring(1, result[1].length());
      return y + a + " " + x + b;
    }
}
/*--------------------------------------------------------------------------
public class Spooner {

    public String spoonerize(String words) {
        String[] word = words.split(" ");
        return word[1].substring(0, 1) + word[0].substring(1) + " " + word[0].substring(0, 1) + word[1].substring(1);
    }

}
----------------------------------------------------------------------------
public class Spooner {

    public String spoonerize(final String phrase)
    {
      String[] words = phrase.split(" ");
      
      // validate
      if (words.length != 2)
         throw new IllegalArgumentException("Specialization requires two words separated by a space!");
      
      // string builder to manipulate characters since strings are immutable
      StringBuilder w1 = new StringBuilder(words[0]);
      StringBuilder w2 = new StringBuilder(words[1]);
      
      // swap
      w1.setCharAt(0, words[1].charAt(0));
      w2.setCharAt(0, words[0].charAt(0));
      
      // make result
      w1.append(" ");
      w1.append(w2);
      
      return w1.toString();
    }

}
-----------------------------------------------------------------------------
public class Spooner {
    public String spoonerize(String words) {
      String[] ray = words.split(" ");
      return ray[1].charAt(0)+ray[0].substring(1) + " " + ray[0].charAt(0)+ray[1].substring(1); 
    }
}
----------------------------------------------------------------------------
public class Spooner {

    public String spoonerize(String words) {
        class Word {
            private final String word;
            
            Word(String word) { this.word = word; }
            
            Word replaceFirstLetterFrom(Word another) {
                return new Word(another.word.substring(0,1) + word.substring(1));
            }
            
            public String toString() { return word; }
        }
        Word first = new Word(words.split(" ")[0]);
        Word second = new Word(words.split(" ")[1]);
        return first.replaceFirstLetterFrom(second) + " " + second.replaceFirstLetterFrom(first);
    }

}
-----------------------------------------------------------------------------
public class Spooner {

    public String spoonerize(String words) {
        
        // Split words into separate strings.
        String parts[] = words.split(" ");        
        String part1 = parts[0];
        String part2 = parts[1];
        
        // Spoonarize and put together word.
        String spoonerized = part2.charAt(0)+part1.substring(1, part1.length()) + 
                      " " + part1.charAt(0)+part2.substring(1, part2.length());
        
        return spoonerized;
    }
}
------------------------------------------------------------------------------
public class Spooner {
  public String spoonerize(String words) {
    String result = "";
    String[] arr = words.split(" ");
    for (int i = 1; i < arr.length; i ++){
      String word = arr[i];
      String prev = arr[i - 1];
      result += word.substring(0, 1) + prev.substring(1, prev.length()) + " " + prev.substring(0, 1) + word.substring(1, word.length());
    }
    return result;
  }
}
----------------------------------------------------------------------------
public class Spooner {
    public String spoonerize(String words) {
         
       int index  = words.indexOf(" ");
       char [] arr  = words.toCharArray();
       char temp = arr[0];
       arr[0] = arr[index+1];
      arr[index+1] = temp;
        
        return new String(arr);
    }
}
-----------------------------------------------------------------------------
class Spooner {
  static String spoonerize(String text) {
    var words = text.split(" ");
    return words[1].charAt(0) + words[0].substring(1) + " " + words[0].charAt(0) + words[1].substring(1);
  }
}
----------------------------------------------------------------------------
class Spooner {
    String spoonerize(final String text) {
        final String[] words = text.split(" ");
        return words[1].charAt(0) + words[0].substring(1) + ' ' +
               words[0].charAt(0) + words[1].substring(1);
    }
}
*/