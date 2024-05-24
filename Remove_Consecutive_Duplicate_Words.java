/* 7KYU CodeWars Remove Consecutive Duplicate Words

Your task is to remove all consecutive duplicate words from a string, 
leaving only first words entries. For example:

"alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"

--> "alpha beta gamma delta alpha beta gamma delta"
Words will be separated by a single space. There will be no leading or 
trailing spaces in the string. An empty string (0 words) is a valid input.

*/

public class Kata {
    public static String removeConsecutiveDuplicates(String s){
       String[] x = s.split(" ");
      String y = x[0];
      for (int i = 1; i < x.length; i++) {
        String z = x[i];
        String a = x[i - 1];
        if (!a.equals(z)) {
          y += " ";
          y += z;
        }
      }
      return y;
    }
}
/*------------------------------------------------------------------
interface Kata {
  static String removeConsecutiveDuplicates(String s) {
    return s.replaceAll("(\\b\\S+)( \\1\\b)+", "$1");
  }
}
--------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Kata {
  
    static class Word {
        private final String value;

        Word(String value) {
            this.value = value;
        }

        String asString() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Word word = (Word) o;
            return Objects.equals(value, word.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    static class WordsParser {

        List<Word> words(String input) {
            Pattern pattern = Pattern.compile(" ");
            return pattern.splitAsStream(input)
                    .map(Word::new)
                    .collect(toList());
        }

    }

    static class UniqueConsecutiveWords {

        private final List<Word> words = new ArrayList<>();

        public UniqueConsecutiveWords(List<Word> words) {
            words.forEach(this::add);
        }

        private void add(Word word) {
            if (isNotLastElement(word)) {
                this.words.add(word);
            }
        }

        private boolean isNotLastElement(Word word) {
            return words.isEmpty() || !words.get(words.size() - 1).equals(word);
        }

        String format() {
            return words.stream()
                    .map(Word::asString)
                    .collect(joining(" "));
        }
    }

    public static String removeConsecutiveDuplicates(String input) {
        WordsParser parser = new WordsParser();
        List<Word> words = parser.words(input);

        UniqueConsecutiveWords uniqueConsecutiveWords = new UniqueConsecutiveWords(words);

        return uniqueConsecutiveWords.format();
    }


}
-------------------------------------------------------------------
public class Kata {
    public static String removeConsecutiveDuplicates(String s){
        String newString[] = s.split(" ");
        String answer = newString[0];
        String currWord = newString[0];
        
        for (String word : newString) {
            if (!word.equals(currWord)) {
                answer = answer.concat(" " + word);
            }
            currWord = word;
        }
      return answer;
    }
}
--------------------------------------------------------------------
import java.util.Stack;

public class Kata {
    public static String removeConsecutiveDuplicates(String s) {
        Stack<String> st = new Stack<>();
        for (String w : s.split(" ")) if (st.isEmpty() || !st.peek().equals(w)) st.push(w);
        return String.join(" ", st);
    }
}
--------------------------------------------------------------------
public class Kata {
    public static String removeConsecutiveDuplicates(String s){
      String[] arr = s.split(" ");
      String res = arr[0];
      
      for (int i = 1; i < arr.length; i++) {
        if (arr[i].equals(arr[i-1])) {
          continue;
        }
        res += " " + arr[i];
      }
      return res;
    }
}
--------------------------------------------------------------------
public class Kata {
    public static String removeConsecutiveDuplicates(String s){
        String[] arr = s.split(" ");
	      
	      String str = "";
	      
	      String ans = "";
	      
	      for(int i=0;i<arr.length;i++)
	      {
	    	  if(!str.equals(arr[i]))
	    	  {
	    		  ans+=arr[i]+" ";
	    	  }
	    	  str = arr[i];
	      }
	      
	      return ans.trim();
    }
}
--------------------------------------------------------------------
import java.util.ArrayList;

public class Kata {
    public static String removeConsecutiveDuplicates(String s){
      String[] splittedStr = s.split(" ");
      ArrayList<String> finishedStrArr = new ArrayList<String>();
      finishedStrArr.add(splittedStr[0]);
        for (int i = 1; i < splittedStr.length; i++){
          if (!splittedStr[i].equals(splittedStr[i -1])){
              finishedStrArr.add(splittedStr[i]);
          };
        };
      return String.join(" ", finishedStrArr);
    };
};
--------------------------------------------------------------------
import java.util.*;
public class Kata {
    public static String removeConsecutiveDuplicates(String str){
        String[] strSplit = str.split(" ");
        String newWord = "";
        newWord = newWord + strSplit[0];
        for(int i = 0; i < strSplit.length-1; i++){
            if(!Objects.equals(strSplit[i], strSplit[i + 1])){
                newWord = newWord  +" " + strSplit[i+1];
            }
        }
        return newWord.trim();
    }
}
*/