/* 7KYU CodeWars E.S.P. Cards

In this Kata we are conducting important E.S.P. research

You are in the lab and have been asked to focus your mind, harness all your psychic powers, and name the shape printed on the back of the card I am holding.

Suddenly, three things happen -

You realise that you have no psychic powers whatsoever
You notice that if you squint in the reflection of the window behind me you can see the back of my card
You decide to cheat in my experiment
Kata Task
Name the shape on my card.

It is one of square, diamond, circle

Notes
Some real examples of my cards are shown below.

The card borders are all the same.

Shapes on each card are made of the same character, but it is not always *

square

/-------------------\
|                   |
|                   |
|    ***********    |
|    *         *    |
|    *         *    |
|    *         *    |
|    *         *    |
|    *         *    |
|    ***********    |
|                   |
|                   |
\-------------------/
diamond

/-------------------\
|                   |
|         *         |
|        * *        |
|       *   *       |
|      *     *      | 
|     *       *     | 
|      *     *      |
|       *   *       |
|        * *        |
|         *         |
|                   |
\-------------------/
circle

/-------------------\
|                   |
|                   |
|       *****       |
|     *       *     |
|    *         *    |
|    *         *    |
|    *         *    |
|     *       *     |
|       *****       |
|                   |
|                   |
\-------------------/

*/
public class Dinglemouse {
  public static String nameTheShape(final char[][] card) {
    return card[2][10] != ' ' ? "diamond" : card[3][5] != ' ' ? "square" : "circle";
  }
}
/*----------------------------------------------------------------
public class Dinglemouse {

  public static String nameTheShape(final char[][] card) {
		int count = 0;
		
		for (int i = 1; i < card.length-1; i++) {
			for (int j = 1; j < card[i].length-1; j++) {
				if (card[i][j] != ' ') count++;
			}
		}
				
		if (count == 16) return "diamond";
		else if (count == 20) return "circle";
		else return "square";
  }
}
------------------------------------------------------------------
public class Dinglemouse {

  public static String nameTheShape(final char[][] card) {
      return card[2][10] != ' ' ? "diamond"
           : card[3][5]  != ' ' ? "square"
           : "circle";
  }
}
-------------------------------------------------------------------
public class Dinglemouse {

  public static String nameTheShape(final char[][] card) {
    int cnt = 0;
    int firstIndex = 0;
    int firstColumn = 0;
    for (int i = 1; i < card.length-1; i++) {
      for (int j = 1; j < card[i].length-1; j++) {
        char c = card[i][j];
        if (c != ' ') {
          if (firstIndex != -1)
            firstIndex = j;
          cnt++;
        }
      }
      if (cnt == 1)
        return "diamond";
      if (firstIndex > 0) {
        if (firstColumn > 0)
          return firstIndex == firstColumn ? "square" : "circle";
        firstColumn = firstIndex;
      }
    }
    return "";
  }
  
}
------------------------------------------------------------------
class Dinglemouse {
  static String nameTheShape(char[][] card) {
    int stars = 0;
    for (int i = 1; i < card.length - 1; i++) {
      var line = new String(card[i]);
      var noSpace = line.substring(1, line.length() - 1).replace(" ", "");
      stars += noSpace.length();
    }
    System.out.println(stars);
    return stars > 30 ? "square" : stars > 16 ? "circle" : "diamond";
  }
}

-------------------------------------------------------------------
import java.util.Arrays;

public class Dinglemouse {
  private static final int TARGET_ROW = 3;
  private static final int TARGET_COLUMN = 9;

  public static String nameTheShape(final char[][] card) {
    char symbol = card[TARGET_ROW][TARGET_COLUMN];
    if(card[TARGET_ROW][TARGET_COLUMN + 1] != symbol) {
      return "diamond";
    } else if (card[TARGET_ROW][TARGET_COLUMN - 3] != symbol) {
      return "circle";
    } else {
      return "square";
    }
  }
  
}
-------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Dinglemouse {

  public static String nameTheShape(final char[][] card) {
        int characterCounter = Stream.of(card)
                .map(a -> Stream.of(a)
                        .map(String::valueOf)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining())
                .replaceAll(" ", "")
                .length();

         return characterCounter == 80 ? "diamond" : characterCounter == 96
                ? "square" : "circle";
  }
  
}

-------------------------------------------------------------------
public class Dinglemouse {

  public static String nameTheShape(final char[][] card) {
    if(card[3][5]!=' '){
      return "square";
    }
    else if(card[2][10]!=' '){
      return "diamond";
    }
    
    return "circle";
    
  }
  
}
-------------------------------------------------------------------
import java.util.regex.*;

public class Dinglemouse {

  private static final Pattern square = Pattern.compile("\\s([^\\s]){11}\\s");
  private static final Pattern diamond = Pattern.compile("\\s([^\\s])\\s{3}\\1");

  public static String nameTheShape(final char[][] card) {
    String s = "";
    for (final char [] ary : card) s += new String(ary);
    final Matcher sMatcher = square.matcher(s);
    final Matcher dMatcher = diamond.matcher(s);
    if (sMatcher.find()) return "square";
    if (dMatcher.find()) return "diamond";
    return "circle";
  }
  
}
*/
