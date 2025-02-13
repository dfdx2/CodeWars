/* 7KYU CodeWars Substring Fun

Complete the function that takes an array of words.

You must concatenate the nth letter from each word to construct 
a new word which should be returned as a string, where n is the 
position of the word in the list.

For example:

["yoda", "best", "has"]  -->  "yes"
  ^        ^        ^
  n=0     n=1     n=2
Note: Test cases contain valid input only - i.e. a string array or 
an empty array; and each word will have enough letters.

*/
public class SubstringFun {
	public static String nthChar(String[] words) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      String temp = words[i];
      char ch = temp.charAt(i);
      sb.append(ch);
    }
    return sb.toString();
  }
}
/*-----------------------------------------------------------------------
import static java.util.stream.IntStream.range;
import static java.util.stream.Collectors.joining;
public class SubstringFun {
	public static String nthChar(String[] words) {
    return range(0,words.length).mapToObj(i->String.valueOf(words[i].charAt(i))).collect(joining(""));
  }
}
-------------------------------------------------------------------------
public class SubstringFun {
	public static String nthChar(String[] words) {
    return java.util.stream.IntStream.range(0, words.length).map(i -> words[i].codePointAt(i)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
  }
}
-------------------------------------------------------------------------
public class SubstringFun {
	public static String nthChar(String[] words) {
       if (words.length == 0) {return "";};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= i) {
                result.append(words[i].charAt(i));
            }
        }
        return result.toString();
  }
}

-------------------------------------------------------------------------
public class SubstringFun {
	public static String nthChar(String[] words) {
    
      String str = "";
      char n = ' ';
      int i = 0;
      
      for (String word : words) {
        n = word.charAt(i);
        i++;
        str += n;
      }
      
      return str;
  }
}
-------------------------------------------------------------------------
public class SubstringFun {
	public static String nthChar(String[] words) {
    StringBuilder response = new StringBuilder();
    
    for(int i = 0; i<words.length; i++){
      String palavra = words[i];
      char c = palavra.charAt(i);
      
      response.append(c);
    }
    return response.toString();
  }
}
*/