/*    5KYU CodeWars DID YOU MEAN   

I'm sure, you know Google's "Did you mean ...?", when you entered a search 
term and mistyped a word. In this kata we want to implement something similar.
You'll get an entered term (lowercase string) and an array of known words 
(also lowercase strings). Your task is to find out, which word from the dictionary 
is most similar to the entered one. The similarity is described by the minimum number 
of letters you have to add, remove or replace in order to get from the entered word 
to one of the dictionary. The lower the number of required changes, the higher the 
similarity between each two words.

Same words are obviously the most similar ones. A word that needs one letter to be 
changed is more similar to another word that needs 2 (or more) letters to be changed. 
E.g. the mistyped term berr is more similar to beer (1 letter to be replaced) 
than to barrel (3 letters to be changed in total).
Extend the dictionary in a way, that it is able to return you the most similar word 
from the list of known words.

Code Examples:
Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple", "melon", 
                                                  "strawberry", "raspberry"});

fruits.findMostSimilar("strawbery"); // must return "strawberry"
fruits.findMostSimilar("berry"); // must return "cherry"

Dictionary things = new Dictionary(new String[]{"stars", "mars", "wars", "codec", "codewars"});
things.findMostSimilar("coddwars"); // must return "codewars"

Dictionary languages = new Dictionary(new String[]{"javascript", "java", "ruby", 
                                                     "php", "python", "coffeescript"});
languages.findMostSimilar("heaven"); // must return "java"
languages.findMostSimilar("javascript"); // must return "javascript" (same words are 
obviously the most similar ones)
I know, many of you would disagree that java is more similar to heaven than all the 
other ones, but in this kata it is ;)

Additional notes:

there is always exactly one possible correct solution


/**
 * 3 kyu: Did you mean ...?
 * https://www.codewars.com/kata/5259510fc76e59579e0009d4/train/java
 */


import java.util.Arrays;
import java.util.stream.IntStream;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        return Arrays.stream(words)
                .min((alpha, beta) -> getSimilarPoint(alpha, to) - getSimilarPoint(beta, to))
                .get();
    }

    private int getSimilarPoint(String alpha, String beta) {
        return Math.max(alpha.length(), beta.length()) - ((int) sameLettersLength(alpha, beta));
    }

    private long sameLettersLength(String alpha, String beta) {
        if (alpha.length() > beta.length()) {
            return sameLettersLength(beta, alpha);
        }

        return IntStream.rangeClosed(0, beta.length() - alpha.length())
                .mapToLong(i -> IntStream.range(0, alpha.length()).filter(j -> alpha.charAt(j) == beta.charAt(i + j)).count())
                .max()
                .orElse(0);
    }
}
/*----------------------------------------------------------------
import org.apache.commons.lang3.StringUtils;

public class Dictionary {
  
  private final String[] words;

  public Dictionary(String[] words) {
    this.words = words;
  }
  
  public String findMostSimilar(String to) {
  int check = 0;
  String temp = "";
    for (int i = 0; i < words.length; i++) {
      int gdl = StringUtils.getLevenshteinDistance(to, words[i]);
      if ((10 - gdl) > check) {
        check = (10 - gdl);
         temp = words[i];
         }
       }
    return temp;
  }
}
------------------------------------------------------------------
import java.util.Arrays;
public class Dictionary {  
  private final String[] words;
  public Dictionary(String[] words) {
    this.words = words;
  }  
  public String findMostSimilar(String to) {
    int i_position = 0, i_number = 0, count;
    for(int i=0;i<words.length;i++) {
        String s1 = words[i].length()<to.length() ? words[i] : to;
        String s2 = words[i].length()<to.length() ? to : words[i];
        for(int i1=0;i1<=s2.length()-s1.length();i1++) {           
            count=0;
            for(int i2=0;i2<s1.length();i2++) { 
              if(s1.charAt(i2)==s2.charAt(i2+i1)) 
                count++;
            }
            if(count-(words[i].length()-count)>i_number-(words[i_position].length()-i_number)) {
              i_number=count;
              i_position=i;
            }
        }
    }
    return words[i_position];
  }
}







*/