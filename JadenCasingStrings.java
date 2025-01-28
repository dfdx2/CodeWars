/* 7KYU CodeWars Jaden Casing Strings
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) 
and After Earth (2013). Jaden is also known for some of his philosophy that he 
delivers via Twitter. When writing on Twitter, he is known for almost always 
capitalizing every word. For simplicity, you'll have to capitalize each word, check 
out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith. 
The strings are actual quotes from Jaden Smith, but they are not capitalized 
in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

Note that the Java version expects a return value of null for an empty string or null.
*/
public class JadenCasingStrings {
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.length() < 1) {
      return null;
    }
    String[] result = phrase.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String x : result) {
      char ch = x.charAt(0);
      ch = Character.toUpperCase(ch);
      sb.append(ch);
      x = x.substring(1, x.length());
      sb.append(x);
      sb.append(" ");
    }
    return sb.toString().trim();
	}
}
/*-------------------------------------------------------------------
public class JadenCase {

	public String toJadenCase(String phrase) {
    if ((phrase == null) || phrase == "") {
      return null;
    }		
		char[] result = phrase.toCharArray();
    for (int i = 0; i < result.length; i++) {
      if (i == 0 || result[i - 1] == ' ') {
        result[i] = Character.toUpperCase(result[i]);
      }
    }
    return new String(result);
	}
}
----------------------------------------------------------------------

public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
		if ((phrase == null) || (phrase == "")) {
     return null;
    }
    char[] array = phrase.toCharArray();
    
    for (int i = 0; i < array.length; i++) {
      if (i == 0 || array[i-1] == ' ') {
        array[i] = Character.toUpperCase(array[i]);
      }
    }
    return new String(array);
	}

}
-----------------------------------------------------------------------------
import java.lang.Character;

public class JadenCase {

	public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;
    
    char[] array = phrase.toCharArray();
    
    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }
		
		return new String(array);
	}

}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

	public String toJadenCase(String phrase) {
      if (null == phrase || phrase.length() == 0) {
          return null;
      }

      return Arrays.stream(phrase.split(" "))
                   .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                   .collect(Collectors.joining(" "));
	}

}
---------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.Arrays;

public class JadenCase {
	public static final Collector<CharSequence,?,String> JOIN_WITH_SPACE = Collectors.joining(" ");

	public String toJadenCase(String phrase) {
  	if (phraseIsEmpty(phrase)) { return null; }
    
    return Arrays.stream(splitIntoWords(phrase)).map(this::capitalize).collect(JOIN_WITH_SPACE);
	}

	private String[] splitIntoWords(String phrase) {
	  return phrase.split(" ");
  }
  
	private String capitalize(String word) {
  	return word.substring(0, 1).toUpperCase() + word.substring(1);
  }
  
	private boolean phraseIsEmpty(String phrase) {
    return phrase == "" || phrase == null;
  }
}
----------------------------------------------------------------------------
import org.apache.commons.lang3.text.WordUtils;
public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
		if(phrase == ""){
      return null;
    }
    else{
		  return WordUtils.capitalize(phrase);
    }
  }
}





*/