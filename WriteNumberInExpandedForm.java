/* 6KYU CodeWars Write Number in Expanded Form

Write Number in Expanded Form
You will be given a number and you will need to return 
it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

NOTE: All numbers will be whole numbers greater than 0.

*/
import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface WriteNumberInExpandedForm {
  static String expandedForm(int num) {
    return range(0, (num + "").length())
        .mapToObj(i -> (num + "").charAt(i) + "0".repeat((num + "").length() - 1 - i))
        .filter(not(c -> c.matches("0+")))
        .collect(joining(" + "));
  }
}
/*-------------------------------------------------------
public class Kata
{
    public static String expandedForm(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;
        
        return outs;
    }
}
---------------------------------------------------------
public class Kata
{
    public static String expandedForm(int num)
    {
      StringBuffer res = new StringBuffer();
      int d = 1;
      while(num > 0) {
        int nextDigit = num % 10;        
        num /= 10;
        if (nextDigit > 0) {
          res.insert(0, d * nextDigit);
          res.insert(0, " + ");
        }
        d *= 10;
      }
      
      return res.substring(3).toString();
    }
}
---------------------------------------------------------
import java.util.LinkedList;

public class Kata {
    public static String expandedForm(int num) {
        LinkedList<String> expandedList = new LinkedList<>();
        int digit;
        int multiplier = 1;
        while (num > 0) {
            digit = (num % 10) * multiplier;
            if (digit != 0) {
                expandedList.push(Integer.toString(digit));
            }
            num /= 10;
            multiplier *= 10;
        }
        return String.join(" + ", expandedList);
    }
}
---------------------------------------------------------
public class Kata
{
    public static String expandedForm(int n)
    {
      int c = 0; String s = "";
      while (n>0){ s = n%10==0 ? s : n%10*(int)Math.pow(10,c)+" + "+s; n/=10; c++;}
      return s.substring(0,s.length()-3);
    }
}
---------------------------------------------------------
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;

public class Kata {
  public static String expandedForm(int num) {
    var ns = ""+num;
    return IntStream.range(0, ns.length())
      .mapToObj(i -> ns.charAt(i) + "0".repeat(ns.length() - 1 - i))
      .filter(e -> !e.matches("0+"))
      .collect(joining(" + "));
  }
}
---------------------------------------------------------
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Kata {

    static String expandedForm(int i) {
        ArrayList<Integer> parts = new ArrayList<>();
        int divider = 10;

        while (i > 0) {
            int remainder = i % divider;

            if (remainder > 0) {
                parts.add(remainder);
            }

            divider *= 10;
            i -= remainder;
        }

        return parts.stream()
                .sorted(Comparator.reverseOrder())
                .map(part -> Integer.toString(part))
                .collect(Collectors.joining(" + "));
    }
}
---------------------------------------------------------
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class Kata
{
    public static String expandedForm(int num)
    {
      if (num < 10) {
        return String.valueOf(num);
      }
      
      int dec = (int)pow(10, (int)log10(num));
      int fir = num/dec;
      int max = dec * fir;
      int nxt = num - max;
      
      return String.valueOf(max) + ((nxt != 0) ? " + " + expandedForm(nxt) : "");
    }
}
*/