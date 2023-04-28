/* 7KYU Complete The Pattern #4

Task:
You have to write a function pattern which creates the following pattern up to 
n number of rows. If the Argument is 0 or a Negative Integer then it should 
return "" i.e. empty string.

Examples:

pattern(4):

1234
234
34
4

pattern(6):

123456
23456
3456
456
56
6

Note: There are no blank spaces

Hint: Use \n in string to jump to next line

*/

public class Pattern {

	public static String pattern(int n) {
    // Happy Coding ^_^
    if(n <= 0) {
     return "";
    }
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1; i <= n; i++) {
     for(int j = i; j <= n; j++) {
      sb.append(j);
      }
      if(i != n) {
       sb.append("\n");
      }     
    }
		return sb.toString();
	}
}
/*-------------------------------------------------------------------------
public class Pattern {

	public static String pattern(int n) {
    final StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) sb.append(j);
      sb.append("\n");
    }
		return sb.toString().trim();
	}
}
----------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pattern {

	public static String pattern(int n) {
		return IntStream.rangeClosed( 1, n )
				.mapToObj( index -> IntStream.rangeClosed( index, n ).mapToObj( Integer::toString ).collect( Collectors.joining() ) )
				.collect( Collectors.joining( "\n" ) );
	}
}
-------------------------------------------------------------------------------
class Pattern {
  static String pattern(int n) {
    String row = "", pattern = "";
    while (n > 0) {
      pattern = (row = n-- + row) + (pattern.isEmpty() ? "" : "\n") + pattern;
    }
    return pattern;
  }
}
--------------------------------------------------------------------------------
public class Pattern {

	public static String pattern(int n) {
    String res= "";
    String f = "" ; 
    for (int i = n ; i >=1 ; i--) { 
    f = i + f;
            res = f + "\n"  + res ; 
      }  
    return res.trim() ; 
    }
  }



*/