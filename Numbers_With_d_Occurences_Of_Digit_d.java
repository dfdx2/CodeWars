/* 7KYU CodeWars Numbers with d Occurences of digit digit

In this kata, we want to discover a small property of numbers. 
We say that a number is a dd number if it contains d occurences 
of a digit d, (d is in [1,9]).

Examples

664444309 is a dd number, as it contains 4 occurences of the number 4

30313, 122 are dd numbers as they respectively contain 3 occurences 
of the number 3, and (1 occurence of the number 1 AND 2 occurences 
of the number 2)

123109, 0, 56542 are not dd numbers

Task

Your task is to implement a function called is_dd (isDd in javascript) 
that takes a positive number (type depends on the language) and returns 
a boolean corresponding to whether the number is a dd number or not.


*/
import java.util.*;
public class DD {
     public static boolean isDD(int n) {
       Map<Character, Integer> map = new HashMap<>();
       String a = String.valueOf(n);
       for (int i = 0; i < a.length(); i++) {
         if (!map.containsKey(a.charAt(i))) {
           map.put(a.charAt(i), 1);
         }
         else {
           int total = map.get(a.charAt(i));
           map.put(a.charAt(i), total + 1);
         }
       }
       for (int i = 0; i < a.length(); i++) {
         int c = Integer.valueOf(a.charAt(i) - '0');
         if (a.charAt(i) != '0' && map.get(a.charAt(i)) == c) {
           return true;
         }
       }
       return false;
     }
}
/*-----------------------------------------------------------------------
public class DD {
    static final int base = 10;
    public static boolean isDD(int n) {
        int[] digitCounts = new int[base];
        while (n != 0) {
            digitCounts[n % base]++;
            n /= base;
        }
        for (int i = 1; i < base; i++)
            if (digitCounts[i] == i)
                return true;
        return false;
    }
}
--------------------------------------------------------------------------
public class DD {
  public static boolean isDD(int n) {
    for(int i=1;i<10;i++) if(Integer.toString(n).replace(""+i,"").length()==Integer.toString(n).length()-i) return true;
    return false;
  }
}
-------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class DD {
  static boolean isDD(int n) {
    return range(1, 9)
        .mapToObj(i -> ("" + n).replaceAll("[^" + i + "]", ""))
        .anyMatch(s -> !s.isEmpty() && s.length() == s.charAt(0) - 48);
  }
}
--------------------------------------------------------------------------
public class DD {
     public static boolean isDD(int n) { 
       String s = Integer.toString(n);
      for (int i =1;i <=9 ; i++) {  
         if (s.replaceAll("[^"+i+"]", "").length()==i) return true; 
      }
       return false ; 
       }
}
----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DD {
     public static boolean isDD(int n) {
       Map<Long, Long> res = Arrays.stream(String.valueOf(n).split(""))
                .map(Long::parseLong)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return res.entrySet().stream().anyMatch(x -> x.getValue() == x.getKey());
     }
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class DD {
  public static boolean isDD(int n) {
    return IntStream.rangeClosed(1, 9)
        .mapToObj(i -> String.valueOf(n).replaceAll("[^" + i + "]", ""))
        .map(s -> (s.isEmpty()) ? "0" : s)
        .anyMatch(s -> Integer.parseInt("" + s.charAt(0)) == s.length());       
  }
}
----------------------------------------------------------------------------
public class DD {
    public static boolean isDD(int n) {
        String s = Integer.toString(n);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int c7 = 0;
        int c8 = 0;
        int c9 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') c1++;
            if (s.charAt(i) == '2') c2++;
            if (s.charAt(i) == '3') c3++;
            if (s.charAt(i) == '4') c4++;
            if (s.charAt(i) == '5') c5++;
            if (s.charAt(i) == '6') c6++;
            if (s.charAt(i) == '7') c7++;
            if (s.charAt(i) == '8') c8++;
            if (s.charAt(i) == '9') c9++;
        }
        if (c1 == 1) return true;
        if (c2 == 2) return true;
        if (c3 == 3) return true;
        if (c4 == 4) return true;
        if (c5 == 5) return true;
        if (c6 == 6) return true;
        if (c7 == 7) return true;
        if (c8 == 8) return true;
        if (c9 == 9) return true;
        return false;
    }
}
-----------------------------------------------------------------
public class DD {
    public static boolean isDD(int n) {
        String s = Integer.toString(n);
        char ch[] = s.toCharArray();
        int num[] = {0,0,0,0,0,0,0,0,0};
        for(char i : ch)
        {
            switch(i)
            {
                case '1' : num[0]++; break;
                case '2' : num[1]++; break;
                case '3' : num[2]++; break;
                case '4' : num[3]++; break;
                case '5' : num[4]++; break;
                case '6' : num[5]++; break;
                case '7' : num[6]++; break;
                case '8' : num[7]++; break;
                case '9' : num[8]++; break;
            }
        }
        for(int i = 0; i <num.length; i++)
        {
            if(num[i] == i+1 ) return true; else continue;
        }
        return false;
    }
}
-------------------------------------------------------------------
import java.util.function.Function;
import java.util.stream.Collectors;

public class DD {

    public static boolean isDD(int n) {
        return String.valueOf(n).chars().boxed().collect(Collectors.collectingAndThen(
                Collectors.groupingBy(Function.identity(), Collectors.counting()),
                x -> x.entrySet().stream().anyMatch(e -> Character.getNumericValue(e.getKey()) == e.getValue())
        ));
    }
}
*/
