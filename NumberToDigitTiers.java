/* 7KYU CodeWars Number To Digit Tiers

Create a function that takes a number and returns an array 
of strings containing the number cut off at each digit.

Examples
420 should return ["4", "42", "420"]
2017 should return ["2", "20", "201", "2017"]
2010 should return ["2", "20", "201", "2010"]
4020 should return ["4", "40", "402", "4020"]
80200 should return ["8", "80", "802", "8020", "80200"]
PS: The input is guaranteed to be an integer in the range [0, 1000000]


*/
public class NumberToDigitTiers {

  public static String[] createArrayOfTiers(int num) {
    String a = String.valueOf(num);
    String[] b = new String[a.length()];
    for (int i = 0; i < b.length; i++) {
      String c = a.substring(0, i + 1);
      b[i] = c;
    }
    return b;
  } 
}
/*----------------------------------------------------------------------
import java.util.stream.*;
public class Solution {

  public static String[] createArrayOfTiers(int num) {
    String n=String.valueOf(num);
    return IntStream.range(0,n.length())
                    .mapToObj(i->n.substring(0,i+1))
                    .toArray(String[]::new);
  } 
}

------------------------------------------------------------------------
public class Solution {

  public static String[] createArrayOfTiers(int num) {
    String[] array;
        if (num < 10) {
            array = new String[]{String.valueOf(num)};
        } else if (num < 100) {
            array = new String[]{String.valueOf(num / 10), String.valueOf(num)};
        } else if (num < 1000) {
            array = new String[]{
                    String.valueOf(num / 100),
                    String.valueOf(num / 10),
                    String.valueOf(num)};
        } else if (num < 10000) {
            array = new String[]{
                    String.valueOf(num / 1000),
                    String.valueOf(num / 100),
                    String.valueOf(num / 10),
                    String.valueOf(num)};
        } else if (num < 100000) {
            array = new String[]{
                    String.valueOf(num / 10000),
                    String.valueOf(num / 1000),
                    String.valueOf(num / 100),
                    String.valueOf(num / 10),
                    String.valueOf(num)};
        } else if (num < 1000000) {
            array = new String[]{
                    String.valueOf(num / 100000),
                    String.valueOf(num / 10000),
                    String.valueOf(num / 1000),
                    String.valueOf(num / 100),
                    String.valueOf(num / 10),
                    String.valueOf(num)};
        } else {
            array = new String[]{
                    String.valueOf(num / 1000000),
                    String.valueOf(num / 100000),
                    String.valueOf(num / 10000),
                    String.valueOf(num / 1000),
                    String.valueOf(num / 100),
                    String.valueOf(num / 10),
                    String.valueOf(num)};
        }
        return array;
  } 
}
------------------------------------------------------------------------
public class Solution {

  public static String[] createArrayOfTiers(int a) {
    String b= String.valueOf(a);
        String[] s=new String[b.length()];
        for (int i = b.length()-1; i >= 0; i--) {
            s[i]=b.substring(0,i+1);
        }
    return s;
  } 
}
------------------------------------------------------------------------
import java.util.*;

public class Solution {

  public static String[] createArrayOfTiers(int num) {
    String numbers = String.valueOf(num);
    List<String> results = new ArrayList<String>();
    for (int i = 1; i <= numbers.length(); i++) {
      results.add(numbers.substring(0, i));
      System.out.println(results);
    }
    return results.toArray(new String[0]);
  } 
}
------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution {

  public static String[] createArrayOfTiers(int num) {
    String s = Integer.toString(num);
    return IntStream.rangeClosed(1,s.length())
                    .mapToObj(x -> s.substring(0,x))
                    .toArray(String[]::new);
  } 
}

------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface Solution {
  static String[] createArrayOfTiers(int num) {
    return range(0, (num + "").length()).mapToObj(i -> (num + "").substring(0, i + 1)).toArray(String[]::new);
  }
}
*/