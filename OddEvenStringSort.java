/* 7KYU CodeWars Odd-Even String Sort


input: 'CodeWars'
output 'CdWr oeas'

S[0] = 'C'
S[1] = 'o'
S[2] = 'd'
S[3] = 'e'
S[4] = 'W'
S[5] = 'a'
S[6] = 'r'
S[7] = 's'
Even indices 0, 2, 4, 6, so we have 'CdWr' as the first group
odd ones are 1, 3, 5, 7, so the second group is 'oeas'
And the final string to return is 'Cdwr oeas'

*/

public class OddEvenSort {
  public static String sortMyString(String s) {
    String even = "";
    String odd = "";
    for (int i = 0; i < s.length(); i++) {
      if (i == 0 || i % 2 == 0) {
        even = even + s.charAt(i);
      }
      else {
        odd = odd + s.charAt(i);
      }
    }
    return even + " " + odd;
  }
}
/*--------------------------------------------------------------------------
public class OddEvenSort {
    public static String sortMyString(String s) {
        String even = "";
        String odd = "";

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                even += s.charAt(i);
            }
            else
            {
                odd += s.charAt(i);
            }
        }


        return even + " " + odd;
    }
}
----------------------------------------------------------------------------------
public class OddEvenSort {
  public static String sortMyString(String s) {
    StringBuilder even = new StringBuilder(), odd = new StringBuilder();
    boolean toggle = false;
    for (char c : s.toCharArray()) if (toggle = !toggle) even.append(c); else odd.append(c);
    return String.format("%s %s", even.toString(), odd.toString());
  }
}
----------------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class OddEvenSort {

    public static String sortMyString(String s) {
        String even = IntStream.range(0, s.length())
                               .filter(i -> i % 2 == 0)
                               .mapToObj(i -> s.substring(i,i+1))
                               .collect(Collectors.joining());
        String odd  = IntStream.range(0, s.length())
                               .filter(i -> i % 2 != 0)
                               .mapToObj(i -> s.substring(i, i+1))
                               .collect(Collectors.joining());
        return even + " " + odd;
    }
}
--------------------------------------------------------------------------
public class OddEvenSort {
  
  public static String sortMyString(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i += 2)
      result.append(s.charAt(i));
    result.append(' ');
    for (int i = 1; i < s.length(); i += 2)
      result.append(s.charAt(i));
    return result.toString();
  }
}
------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenSort {
  public static String sortMyString(String s) {
    String[] sArray = s.split("");
     String evenIndex = IntStream.range(0, sArray.length).filter(i -> i % 2 == 0).mapToObj(i -> sArray[i]).collect(Collectors.joining(""));
        String oddIndex = IntStream.range(0, sArray.length).filter(i -> i % 2 != 0).mapToObj(i -> sArray[i]).collect(Collectors.joining(""));
        return evenIndex + " " + oddIndex;
  }
}


*/