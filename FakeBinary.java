/* 8KYU CodeWars Fake Binary

Given a string of digits, you should replace any digit below 5 with '0' 
and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string

*/

public class FakeBinary {
    public static String fakeBin(String numberString) {
     
        return numberString.replaceAll("[1-4]","0").replaceAll("[5-9]","1");
    }
}
/*---------------------------------------------------------------------------
public class FakeBinary {
    public static String fakeBin(String numberString) {
        final char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
          c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);
    }
}
-----------------------------------------------------------------------------
public class FakeBinary {
    public static String fakeBin(String s) {
        return s.replaceAll("[1-4]","0").replaceAll("[^0]","1");
    }
}
-----------------------------------------------------------------------------
public class FakeBinary {
    public static String fakeBin(String numberString) {
        String res = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < '5') {
                res += '0';
            } else {
                res += '1';
            }
        }
        return res;
    }
}
-------------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

public class FakeBinary {
    public static String fakeBin(String str) {
        return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }
}
-------------------------------------------------------------------------------
import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars()
            .mapToObj(x -> String.valueOf((Character.getNumericValue(x) < 5) ? 0 : 1))
            .collect(Collectors.joining());
    }
}




*/
