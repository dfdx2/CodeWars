/* 7KYU CodeWars Complete The Pattern #1

Task:
You have to write a function pattern which returns the following Pattern(See Pattern & Examples) upto n number of rows.

Note:Returning the pattern is not the same as Printing the pattern.
Rules/Note:
If n < 1 then it should return "" i.e. empty string.
There are no whitespaces in the pattern.
Pattern:
1
22
333
....
.....
nnnnnn
Examples:
pattern(5):

1
22
333
4444
55555
pattern(11):

1
22
333
4444
55555
666666
7777777
88888888
999999999
10101010101010101010
1111111111111111111111
Hint: Use \n in string to jump to next line

*/

public class Pattern1{
  public static String pattern(int n){
    String x = "";
    if (n < 1) {
      return "";
    }
    for (int i = 1; i <= n; i++) {
      if (i == n) {
        x += String.valueOf(i).repeat(i);
      }
      else {
        x += String.valueOf(i).repeat(i) + "\n";
      }
    }          
    return x;
  }
}
/*--------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Pattern1{
  public static String pattern(int n){
    return IntStream.rangeClosed(1, n).mapToObj(num -> String.valueOf(num).repeat(num)).collect(Collectors.joining("\n"));
  }
}
----------------------------------------------------------------------------
public class Pattern1{
  public static String pattern(int n){
    String output = "";
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) output += String.valueOf(i);
      if(n > 1 && i < n) output += "\n";
    }
    return output;
  }
}
----------------------------------------------------------------------------
public class Pattern1{
  public static String pattern(int n){
    // ... You need to return a string here. Happy coding!
    
    if(n<1) return "";
    String[] emp=new String[n];
    for(int i=1;i<=n;i++){
      emp[i-1]=(""+i).repeat(i);
    }
    return String.join("\n",emp);
  }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Pattern1{
  public static String pattern(int n){
    return String.join("\n", IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(i).repeat(i)).toArray(String[]::new));
  }
}


*/