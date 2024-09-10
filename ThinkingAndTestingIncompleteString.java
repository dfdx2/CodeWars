/* 7KYU CodeWars Thinking & Testing : Incomplete String

No Story

No Description

Only by Thinking and Testing

Look at result of testcase, guess the code!

*/
import static java.lang.Character.toChars;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
public class ThinkingAndTestingIncompleteString {

  public static String testIncompleteString(String s) {
    // return s ?
    // return s.substring(0, 1) ?
    // return s.substring(0, s.length() / 2) ?
    String result = range(0, s.length() / 2).mapToObj(i -> toChars((s.charAt(2 * i) + s.charAt(2 * i + 1)) / 2)[0] + "").collect(joining());
    return s.length() % 2 == 0 ? result : result + s.charAt(s.length() - 1);
  }
}
/*--------------------------------------------------------------------------------------
public class ThinkingAndTesting {

  public static String testIncompleteString(String s) {
    StringBuilder builder = new StringBuilder((s.length() / 2) + 1);
    for (int i = 0; i < s.length(); i += 2) {
      builder.appendCodePoint(i != s.length() - 1 ? ((s.codePointAt(i) + s.codePointAt(i + 1)) / 2) : s.codePointAt(i));
    }
    return builder.toString();
  }
}
----------------------------------------------------------------------------------------
public class ThinkingAndTesting {
    public static String testIncompleteString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i += 2) {
            sb.append((char)((s.charAt(i) + s.charAt(i - 1)) / 2));
        }
        return sb.toString() + (s.length() % 2 == 1 ? s.charAt(s.length() - 1) : "");
    }
}
----------------------------------------------------------------------------------------
public class ThinkingAndTesting {
    public static String testIncompleteString(String s) {
        if(s.length() % 2 == 1) s += s.charAt(s.length() - 1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i += 2) {
            sb.append((char)((s.charAt(i) + s.charAt(i + 1)) / 2));
        }
        return sb.toString();
    }
}
---------------------------------------------------------------------------------------
public class ThinkingAndTesting {

	public static String testIncompleteString(String s) {
		
		for (int i = 1; i < s.length()+1/2; i++) {
			s = s.replaceFirst("(?<=.{" + (i-1) + "})..", String.valueOf( (char) ((s.charAt(i-1) + s.charAt(i))/2) ));
		}

		return s;
	}
}
-----------------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThinkingAndTesting {

  public static String testIncompleteString(String s) {
     return IntStream.iterate(0, i -> i < s.length(), i -> i + 2)
                .mapToObj(i -> s.substring(i, Math.min(i + 2, s.length())))
                .map(ss -> ss.chars().average().getAsDouble())
                .map(Math::floor)
                .map(d -> Character.toChars(d.intValue())[0])
                .map(String::valueOf)
                .collect(Collectors.joining());
  }
}
------------------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class ThinkingAndTesting {
  public static String testIncompleteString(String s) {
    return IntStream.iterate(0, i -> i < s.length(), i -> i + 2)
                    .map(i -> getAverageChar(s, i))
                    .collect(StringBuilder::new, 
                              StringBuilder::appendCodePoint, 
                              StringBuilder::append)
                    .toString();
  }
  
  private static int getAverageChar(String source, int i) {
    return i < source.length() - 1 ? 
            (source.charAt(i) + source.charAt(i + 1)) / 2 : 
            source.charAt(i);
  }
}
-----------------------------------------------------------------------------------------
public class ThinkingAndTesting {

     public static String testIncompleteString(String s) {
        char[] chars = s.toCharArray();
        char[] res = new char[(int) Math.ceil(chars.length / 2.0)];
        for (int i = 0; i < chars.length - 1; i += 2) {
            res[i / 2] = getMiddleChar(chars[i], chars[i + 1]);
        }
        if (s.length() % 2 != 0) {
            res[res.length - 1] = s.charAt(s.length() - 1);
        }
        return new String(res);
    }
    public static char getMiddleChar(char a, char b){
        int charInt = ((int)a + (int)b)/2;
        return (char)charInt;
    }
}
-----------------------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ThinkingAndTesting {

    public static String testIncompleteString(String s) {
        String r = IntStream.range(0, s.length()/2)
                            .map(i -> (s.charAt(2 * i) + s.charAt(2 * i + 1))/2)
                            .mapToObj(i -> String.valueOf((char)i))
                            .collect(Collectors.joining());
        return s.length() % 2 == 0 ? r : r + s.substring(s.length()-1);
    }
}
-----------------------------------------------------------------------------------------
public class ThinkingAndTesting {

  public static String testIncompleteString(String s) {
      
      String s1;
      int diff, min;
      StringBuilder s2 = new StringBuilder();

      if(s.length() == 0 || s.length() == 1)
        return s;
      else {
        if( (s.length() % 2) == 0 ){
          for(int i = 0; i < s.length(); i = i + 2){

            s1 = s.substring(i, i + 2);
            min = Math.min((int)s1.charAt(0), (int)s1.charAt(1));
            diff = (int)Math.abs((float)s1.charAt(0) - (float)s1.charAt(1));

            if( diff == 0 || diff == 1 )
              s2.append((char)min);
            else
              s2.append((char)(min + (int)Math.floor((double)diff / 2)));
          }
        }
        else{
          for(int i = 0; i < s.length() - 1; i = i + 2){
            s1 = s.substring(i, i + 2);
            min = Math.min((int)s1.charAt(0), (int)s1.charAt(1));
            diff = (int)Math.abs((float)s1.charAt(0) - (float)s1.charAt(1));

            if( diff == 0 || diff == 1 )
              s2.append((char)min);
            else
              s2.append((char)(min + (int)Math.floor((double)diff / 2)));
          }
          s2.append( s.charAt( s.length() - 1 ) );
        }
      }
      return s2.toString();
      
    }
}
------------------------------------------------------------------------------------------
public class ThinkingAndTesting {

  public static String testIncompleteString(String s) {
    // return s ?
    // return s.substring(0, 1) ?
    char[] letters = s.toCharArray();
    int index = 1;
    String result = "";
    while (index <= s.length()-1){
        int letter1 = (int) letters[index-1];
        int letter2 = (int) letters[index];
        result += (char) ((letter2 + letter1)/2);
      index += 2;  
    }
    return s.length() % 2 == 0 ? result : result + s.charAt(s.length()-1);
  }
}
*/