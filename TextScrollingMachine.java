/* 6KYU CodeWars All Star Code Challenge #15 - Text Scrolling Machine

This Kata is intended as a small challenge for my students

Your family runs a shop and have just brought a Scrolling Text Machine 
(http://3.imimg.com/data3/RP/IP/MY-2369478/l-e-d-multicolour-text-board-250x250.jpg) 
to help get some more business.

The scroller works by replacing the current text string with a similar text string, 
but with the first letter shifted to the end; this simulates movement.

Your father is far too busy with the business to worry about such details, so, 
naturally, he's making you come up with the text strings.

Create a function that accepts a string argument and returns an array of strings 
with each letter from the input string being rotated to the end.

Examples:
"Hello" --> ["elloH", "lloHe", "loHel", "oHell", "Hello"]
Note:
The original string should be included in the output array.

The order matters. Each element of the output array should be the rotated version 
of the previous element.

The output array SHOULD be the same length as the input string.

The function should return an empty array with an empty string ('') as input.

*/
public class TextScrollingMachine {
  public String[] rotate(String text) {
    String[] result = new String[text.length()];
    for (int i = 0; i < result.length; i++) {
      char ch = text.charAt(0);
      String j = text.substring(1, text.length());
      StringBuilder sb = new StringBuilder();
      sb.append(j);
      sb.append(ch);
      text = sb.toString();
      result[i] = text;
    }
    return result;
  }
}
/*------------------------------------------------------------
public class ScrollingTextMachine {
  public String[] rotate(String text) {
    // TODO your code here
    int len = text.length();
    String rotate[] = new String[len];
    
    for (int i = 0; i < len; i++) {
      rotate[i] = text.substring((i+1), len) + text.substring(0, i+1);
    }
    
    return rotate;
  }
}
--------------------------------------------------------------
import static java.util.stream.IntStream.rangeClosed;

class ScrollingTextMachine {
  String[] rotate(String text) {
    return rangeClosed(1, text.length())
            .mapToObj(i -> text.substring(i) + text.substring(0, i))
            .toArray(String[]::new);
  }
}

--------------------------------------------------------------
public class ScrollingTextMachine {
    public String[] rotate(String text) {
        if (text.isEmpty()) {
            return new String[]{};
        }
        var result = new String[text.length()];
        for (int i = 1; i < text.length(); i++) {
            result[i - 1] =  text.substring(i, text.length()) + text.substring(0, i);
        }
        result[text.length() - 1] = text;
        return result;
    }
}
--------------------------------------------------------------
import java.util.stream.*;

public class ScrollingTextMachine {
  public String[] rotate(String text) {
    return Stream
      .iterate(text, t -> t.substring(1) + t.charAt(0))
      .skip(1)
      .limit(text.length())
      .toArray(String[]::new);
  }
}
*/