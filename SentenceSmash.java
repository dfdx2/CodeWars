/* 8KYU CodeWars Sentence Smash

Sentence Smash
Write a function that takes an array of words and smashes them together 
into a sentence and returns the sentence. You can ignore any need to 
sanitize words or add punctuation, but you should add spaces between 
each word. Be careful, there shouldn't be a space at the beginning or 
the end of the sentence!

Example

['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'

*/


import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    // TODO Write your code below this comment please
    
    String result = "";
    for (String x : words) {
      if (words[0] == "") {
        return result;
      }
      else {
        result += x + " ";
      }
      
    }
    int x = result.length() - 1;
    return result.isEmpty() ? "" : result.substring(0, x);
  }
}
/*-------------------------------------------------------------------------------------------

public class SmashWords {
	public static String smash(String... words) {
    return String.join(" ", words);
  }
}
---------------------------------------------------------------------------------------------
import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    return words != null ? String.join(" ", words) : null;
  }
}
--------------------------------------------------------------------------------------------
import java.util.Arrays;
import java.lang.StringBuilder;

public class SmashWords {

	public static String smash(String... words) {
    StringBuilder sb = new StringBuilder();
    for (String word : words)
    {
      sb.append(word + " ");
    }
    return sb.toString().trim();
  }
}
---------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.*;

public class SmashWords {

	public static String smash(String... words) {
    return Stream.of(words).collect(Collectors.joining(" "));
  }
}
----------------------------------------------------------------------------------------
import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
		if (words != null)
			return String.join(" ", Arrays.asList(words));
		else
			return null;
	}
}
----------------------------------------------------------------------------------------
import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    return Arrays.asList(words).toString().replaceAll("\\[|\\]|,", "");
  }
}


*/