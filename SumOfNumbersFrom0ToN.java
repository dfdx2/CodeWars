/* 7KYU CodeWars Sum Of Numbers from 0 To N

Description:

We want to generate a function that computes the series starting 
from 0 and ending until the given number.

Example:
Input:
> 6

Output:
0+1+2+3+4+5+6 = 21

Input:
> -15

Output:
-15<0

Input:

> 0
Output:

0=0

*/

public class SequenceSum{

  public static String showSequence(int value){
    
    if (value < 0) {
      return String.valueOf(value) + "<0";
    }
    if (value == 0) {
      return String.valueOf(value) + "=0";
    }
    String result = "";
    int sum = 0;
    int i = 0;
    while (i < value) {
      sum += i;
      result += String.valueOf(i) + "+";
      i++;
    }
    sum += value;
    result = result + String.valueOf(value);
    result = result + " = ";
    result = result + String.valueOf(sum);
    return result;
  }
}
/*--------------------------------------------------------------------------
public class SequenceSum{

  public static String showSequence(int value){
    String ans = "";
    if (value < 0) return "" + value + "<0";
    if (value == 0) return "0=0";
    for (int i = 0; i <= value; i++) ans += "" + i + "+";
    return ans.substring(0,ans.length() - 1) + " = " + (value * (value + 1) /2);
  }
}
-------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceSum {
  public static String showSequence(int value) {
    if (value < 0)
      return String.format("%d<0", value);
    else if (value == 0)
      return "0=0";
    String expr = IntStream.rangeClosed(0, value).mapToObj(Integer::toString)
      .collect(Collectors.joining("+"));
    long sum = (long)value * (value + 1) / 2;
    return String.format("%s = %d", expr, sum);
  }
}
---------------------------------------------------------------------------------
public class SequenceSum{

  public static String showSequence(int value){
        if(value>0) {
            int result = 0;
            StringBuilder builder = new StringBuilder("0");
            for(int i=1;i<=value;i++)
            {
                result+=i;
                builder.append("+"+i);
            }
            return builder.append(" = "+result).toString();
        }
        if(value==0) return value+"=0";
        return value+"<0";
    }

  /*public static void main(String args[]){
    int param=Integer.ParseInt(args[0]);
    SequenceSum.showSequence(param);
  }*/
}



*/