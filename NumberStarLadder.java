/* 7KYU CodeWars Number Star Ladder

Using n as a parameter in the function pattern, where n>0, 
complete the codes to get the pattern (take the help of examples):

Note: There is no newline in the end (after the pattern ends)

Examples
pattern(3) should return "1\n1*2\n1**3", e.g. the following:

1
1*2
1**3
pattern(10): should return the following:

1
1*2
1**3
1***4
1****5
1*****6
1******7
1*******8
1********9
1*********10

*/

public class Kata {
    public static String pattern(int n){
      int i = 1;
      String result = "";
      if (n == 1) {
        return String.valueOf(n);
      }
      String d = "*";
      while (i <= n) {
        if (i == n) {
          result += "1" + d.repeat(i - 1) + String.valueOf(n);
          break;
        }
        else if (i == 1) {
          result += String.valueOf(i) + "\n";
          i++;
        }
        else {
          result += "1" + d.repeat(i - 1) + String.valueOf(i) + "\n";
          i++;
        }
        }
      return result;
    }
}
/*-------------------------------------------------------------------------
public class Kata {
    public static String pattern(int n){
      StringBuilder str = new StringBuilder("1\n");
       for(int i=2; i<=n;i++)
         str.append("1"+"*".repeat(i-1)+i+"\n");
      return str.toString().trim();
    }
}
-----------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static String pattern(int n) {
    return rangeClosed(1, n).mapToObj(i -> "1" + "*".repeat(i - 1) + (i > 1 ? i : "")).collect(joining("\n"));
  }
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;

public class Kata {
  public static String pattern(int n) {
    return IntStream.range(0, n)
                    .mapToObj(Kata::makeStep)
                    .collect(joining("\n"));
  }
  
  private static String makeStep(int i) {
    return "1" + "*".repeat(i) + (i != 0 ? String.valueOf(i + 1) : "");
  }
}
----------------------------------------------------------------------------
public class Kata {
    public static String pattern(int n){
      String chaine = "1";
      for(int i=2; i<=n; i++){
        chaine += "\n1";
        for(int j=1; j<i; j++){
          chaine += "*" ;
       }
        chaine += i;
    }
      return chaine;
}
}
-----------------------------------------------------------------------------
public class Kata {
  
  public static String pattern(int n) {
    
    String answer = "";
    
    for (int i = 0; i < n; i++)
      answer += (i == 0) ? (n != 1) ? (1 + "\n") : 1 : ((i + 1) != n) ? (1 + "*".repeat(i) + (i + 1) + "\n")
                : (1 + "*".repeat(i) + (i + 1));
    
    return answer;
  }
}
------------------------------------------------------------------------------
*/