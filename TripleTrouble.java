/* 6KYU CodeWars Triple Trouble 

Write a function

TripleDouble(long num1, long num2)
which takes numbers num1 and num2 and returns 1 if there is a straight 
triple of a number at any place in num1 and also a straight double of 
the same number in num2.

If this isn't the case, return 0

Examples
TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and 
                                          // num2 has straight double 99s

TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2

TripleDouble(12345, 12345) == 0

TripleDouble(666789, 12345667) == 1

*/
public class Kata {
  public static int TripleDouble(long num1, long num2) {
    String one = Long.toString(num1);
    String two = Long.toString(num2);
    for (int i = 2; i < one.length(); i++) {
      if (two.lastIndexOf(one.charAt(i)) > 0 && (one.charAt(i) == one.charAt(i - 1) && one.charAt(i) == one.charAt(i - 2)) && two.charAt(two.lastIndexOf(one.charAt(i))) == two.charAt(two.lastIndexOf(one.charAt(i)) - 1))
                return 1;
        }
    return 0;
  }
}
/*-------------------------------------------------------------------------------
public class Kata
{
  public static int TripleDouble(long num1, long num2) 
  {
    String n1str = String.valueOf(num1);
    String n2str = String.valueOf(num2);
    for(int i=0;i<10;i++) {
      String n = String.valueOf(i);
      if( n1str.contains(n+n+n) && n2str.contains(n+n) ) return 1;
    }
    return 0;
  }
}
-------------------------------------------------------------------------------
public class Kata
{
  public static int TripleDouble(long num1, long num2) 
  {
    System.out.println(hasRepeat(num1, 3));
    System.out.println(hasRepeat(num2, 2));
    return hasRepeat(num1, 3) && hasRepeat(num2, 2) ? 1 : 0;
  }
  
  public static boolean hasRepeat(long num, int times) {
    Long old = null;
    int t = 0;
    while (num > 0) {
      Long n = num % 10;
      num /= 10;
      if (n == old) {
        if (++t == times) return true;
      } else {
        old = n;
        t = 1;
      }
    }
    return false;
  }
}
-------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static int TripleDouble(long num1, long num2) {
        return IntStream.range(0, 10).anyMatch(index -> isIncluded(String.valueOf(num1), index, 3) &&
                isIncluded(String.valueOf(num2), index, 2)) ? 1 : 0;
    }

    public static boolean isIncluded(String value, int index, int times) {
        return value.contains(repeat(String.valueOf(index), times));
    }

    private static String repeat(String s, int times) {
        return IntStream.range(0, times).mapToObj(c -> s).collect(Collectors.joining(""));
    }
}
--------------------------------------------------------------------------------
public class Kata
{
  public static int TripleDouble(long num1, long num2) 
  {
    int ans = 0;
    String str1 = Long.toString(num1);
    String str2 = Long.toString(num2);
    for (int i =0;ans==0 && i<str1.length()-2;i++){
      if (str1.charAt(i)==str1.charAt(i+1) && str1.charAt(i)==str1.charAt(i+2) && ans==0){
        for (int j=0; ans==0 && j<str2.length()-1; j++){
          if (str2.charAt(j) == str1.charAt(i) && str2.charAt(j)==str2.charAt(j+1)){
            ans=1;
          }
        }
      }
    }
    return ans;
  }
 }



*/