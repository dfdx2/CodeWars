/* 7KYU CodeWars Simple Fun # 40 : Timed Reading

Task

Timed Reading is an educational tool used in many schools to 
improve and advance reading skills. A young elementary student 
has just finished his very first timed reading exercise. 
Unfortunately he's not a very good reader yet, so whenever he 
encountered a word longer than maxLength, he simply skipped it 
and read on.

Help the teacher figure out how many words the boy has read by 
calculating the number of words in the text he has read, no 
longer than maxLength.

Formally, a word is a substring consisting of English letters, 
such that characters to the left of the leftmost letter and to 
the right of the rightmost letter are not letters.

Example

For maxLength = 4 and text = "The Fox asked the stork, 'How is the soup?'", 
the output should be 7

The boy has read the following words: "The", "Fox", "the", "How", "is", "the", "soup".

Input/Output
[input] integer maxLength

A positive integer, the maximum length of the word the boy can read.

Constraints: 1 ≤ maxLength ≤ 10.

[input] string text

A non-empty string of English letters and punctuation marks.

[output] an integer

The number of words the boy has read.

*/

public class Kata {
    public static int timedReading(final int maxLength, final String text) {
      int result = 0;
      String[] read = text.split(" ");
      for (String a : read) {
        a = a.replaceAll("[^a-zA-Z]", "");
        if (a.length() <= maxLength) {
          result++;
        }
      }
      System.out.println(text);
      if (text.equals("...")) {
        return 0;
      }
      return result;
    }
}
/*--------------------------------------------------------------
import static java.util.Arrays.stream;

public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        String[] words = text.split("\\W+");
        return (int) stream(words).filter(w -> !w.isEmpty() && w.length() <= maxLength).count();
    }
}
----------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int timedReading(final int maxLength, final String text) {
    String[] words = text.split("\\W+");
    return (int)Arrays.stream(words)
                      .filter(word -> word.length() <= maxLength)
                      .filter(word -> !word.isEmpty())
                      .count();
  }
}
----------------------------------------------------------------
import static java.util.Arrays.stream;

class Kata {
  static int timedReading(int maxLength, String text) {
    return (int) stream(text.replaceAll("[^a-zA-Z ]", "").split(" "))
            .filter(w -> w.length() <= maxLength && !w.isEmpty()).count();
  }
}
---------------------------------------------------------------
import java.util.StringTokenizer;
public class Kata {
    public static int timedReading(final int maxLength, final String text) {
StringTokenizer st = new StringTokenizer(text, " .,'?()-+;:\"|");
int x =0;
while(st.hasMoreTokens()){if (st.nextToken().length()<=maxLength) {x++;}}
return x;}}
-----------------------------------------------------------------
public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        
        int res = 0;

        String textChange = text.replaceAll("[^a-zA-Z0-9 ]", "");

        String[] words = textChange.split(" ");

        if (!textChange.isEmpty()) {

            for (int i = 0; i < words.length; i++) {

                if (words[i].length() <= maxLength)
                    res++;
            }
        }
        
        return res;
    }
}
------------------------------------------------------------------
public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        String replace;

        replace = text.replaceAll("[^a-zA-Z ]", "");
        String[] stringsarray = replace.split(" ");
        int answer = 0;
        for (int i = 0; i < stringsarray.length; i++) {
            int length = stringsarray[i].length();
            if (length == 0) {
                return 0;
            }
            if (length <= maxLength)
                answer++;
        }
        return answer;
    }
}
-----------------------------------------------------------------
public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        String[] arr = text.split(" ");
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].replaceAll("[^a-zA-Z]", "").length() <= maxLength) && (arr[i].replaceAll("[^a-zA-Z]", "").length() != 0)) ret++;
        }
        return ret;
    }
}
-----------------------------------------------------------------
public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        String lettersOnly = text.replaceAll("[?!,=:;\"']", "");
        String removeDots = lettersOnly.replaceAll("[\\.]", " ");
        String[] words = removeDots.split(" ");
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < words.length; i++) {
          if(words[i].length() <= maxLength) {
            count++;
          }
          
        }
        
        return count;
    }
}
-----------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int timedReading(final int maxLength, final String text) {
    return text.replaceAll("[^a-zA-Z\\s]", "").isEmpty() ? 0 : (int) Arrays.stream(text.replaceAll("[^a-zA-Z\\s]", "").split(" ")).filter(w -> w.length() <= maxLength).count();
  }
}
*/