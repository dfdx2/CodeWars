/* 7KYU CodeWars Numbers In Strings

In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number groupings and return the largest number. Numbers will not have leading zeros.

For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.

Good luck!


*/
class Solution{
    public static int solve(String s){
      String a = s.replaceAll("[^0123456789]", " ");
      String[] b = a.split(" ");
      int c = 0;
      for (int i = 0; i < b.length; i++) {
        String d = b[i];
        if (d == "") {
          continue;
        }
        else if (Integer.valueOf(d) > c) {
          c = Integer.valueOf(d);
        }
      }
      return c;
    }
}
/*-------------------------------------------------------------------------
import java.util.Arrays;

class Solution{
    public static int solve(String s){
        return Arrays.asList(s.split("[a-z]+")).stream().filter(e-> !e.isEmpty()).mapToInt(Integer::parseInt).max().getAsInt();
    }
}
---------------------------------------------------------------------------
import static java.util.stream.Stream.of;

interface Solution {
  static int solve(String s) {
    return of(s.split("\\D")).mapToInt(n -> n.isEmpty() ? 0 : Integer.parseInt(n)).max().orElse(0);
  }
}
--------------------------------------------------------------------------
class Solution {

  public static int solve(String s) {
    int max = 0, n = 0;
    for (char c : s.toCharArray())
      if ('0' <= c  && c <= '9') { n = n * 10 + c - '0'; max = Math.max(max, n); } else n = 0;
    return max;
  }
  
}

---------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;

class Solution{
    public static int solve(String s) {
        if (s.isEmpty()) return 0; 
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                builder.append(ch);
            } else {
                if (builder.length() > 0) {
                    list.add(Integer.parseInt(builder.toString()));
                    builder.setLength(0);
                }
            }
        }
        if (builder.length() > 0) {
            list.add(Integer.parseInt(builder.toString()));
        }
        Collections.sort(list);

        return list.get(list.size() - 1);
    }
}
---------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{
    public static int solve(String s){
        Pattern digitRegex = Pattern.compile("-?\\d+");
        Matcher matcher = digitRegex.matcher(s);

        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        while (matcher.find()) {
            stringList.add(matcher.group());
        }

        for (String value : stringList) {
            integerList.add(Integer.valueOf(value));
        }

        Collections.sort(integerList);
      
        return integerList.get(integerList.size()-1);
    }
}
---------------------------------------------------------------------------
class Solution{
    public static int solve(String s){
     String f [] = s.replaceAll("[^0-9]" , " ").split(" "); 
     int x =0 ; 
       for (String str:f ){  
                  try {  
                       int x1 = Integer.parseInt(str); 
                       if (x1>x) x=x1;
                  }catch (Exception e ) {continue;} 
         }
      return x ;
      }
}
---------------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
    public static int solve(String s){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);

        int max = 0;
        while (m.find()) {
            int num = Integer.parseInt(m.group());

            // Алгоритм поска наибольшего числа в массиве
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
------------------------------------------------------------------------------
import java.util.regex.Pattern;

public class Solution {
  
  private static final Pattern GROUP_OF_LETTERS = Pattern.compile("\\p{Alpha}+");
  
  public static int solve(String source) {
    return GROUP_OF_LETTERS.splitAsStream(source)
                           .filter(str -> !str.isEmpty())
                           .mapToInt(Integer::valueOf)
                           .max()
                           .orElseThrow();
  }
}
*/