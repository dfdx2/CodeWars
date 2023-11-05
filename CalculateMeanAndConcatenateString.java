/* 7KYU CodeWars Calculate Mean And Concatenate String

You will be given an array which will include both integers and characters.

Return an array of length 2 with a[0] representing the mean of the ten 
integers as a floating point number. There will always be 10 integers 
and 10 characters. Create a single string with the characters and return 
it as a[1] while maintaining the original order.

lst = ['u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0']

Here is an example of your return

[3.6, "udiwstagwo"]
In C# and Java the mean return is a double.

*/

public class Kata {
    public static Object[] mean(char[] lst) {
      Object[] x = new Object[2];
      String z = "";
      double y = 0;
      int count = 0;
      for (int i = 0; i < lst.length; i++) {
        Character ch = lst[i];
        if (Character.isDigit(ch)) {
          int j = ch - '0';
          y += j;
          count++;
        }
        else {
          z += ch;
        }
      }
     // y = y / count;
      System.out.println(z);
      x[0] = y / count;
      x[1] = z;
      return x;
    }
}
/*----------------------------------------------------------------------------
public class Kata
{
    public static Object[] mean(char[] lst)
    {
      double mean = 0;
        String string = "";

        for(char character : lst)
        {
            if(Character.isDigit(character))
                mean += Character.digit(character, 10);
            else
                string += character;
        }
        mean /= 10d;
        
        Object[] oggetto = {mean,string};
        
        return oggetto;
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static Object[] mean(char[] lst) {
    Object[] answer = new Object[2];
    String[] array = String.valueOf(lst).replaceAll("[^0-9]", "").split("");
    answer[0] = Arrays.stream(array).mapToInt(Integer::parseInt).sum() / (array.length * 1.);
    answer[1] = String.valueOf(lst).replaceAll("[^a-zA-Z]", "");
    return answer;
  }
}
------------------------------------------------------------------------------
public class Kata {
    public static Object[] mean(char[] chars) {
        String string = new String(chars);
        return new Object[]{
                string.chars().filter(Character::isDigit).map(c -> c - '0').average().orElse(0.0),
                string.replaceAll("\\d", "")
        };
    }
}
--------------------------------------------------------------------------------
public class Kata {
  public static Object[] mean(char[] lst) {
    StringBuilder sb = new StringBuilder(10);
    int sum = 0;
    for (Character c : lst)
      if (c-'0'>=0 && c-'0'<10)
        sum += c-'0';
      else 
        sb.append(c);
    return new Object[]{sum/10.0, sb.toString()};
  }
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;

public class Kata {
  public static Object[] mean(char[] chars) {
    return new Object[] {getMean(chars), concat(chars)};
  }
  
  private static double getMean(char[] chars) {
    return getCodePointStream(chars)
                  .filter(Character::isDigit)
                  .map(Character::getNumericValue)
                  .average()
                  .orElse(0);
  }
  
  private static String concat(char[] chars) {
    return getCodePointStream(chars)
                  .filter(Character::isLetter)
                  .collect(StringBuilder::new, 
                            StringBuilder::appendCodePoint, 
                            StringBuilder::append)
                  .toString();
  }
  
  private static IntStream getCodePointStream(char[] chars) {
    IntStream.Builder builder = IntStream.builder();
    for (char next: chars) 
      builder.accept(next);
    return builder.build();
  }
}
----------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
public class Kata
{
    public static Object[] mean(char[] lst)
    {
      double aver = 0;
      int count = 0;
      String s = "";
      Object[] o = new Object[2];
      for(int i = 0; i<lst.length; i++){
        if(Character.isDigit(lst[i])){
          aver += (double)Character.getNumericValue(lst[i]);
          count++;
        }else{
          s += lst[i];
        }
      }
      o[0] = (aver/count);
      o[1] = (s);
      return o;
    }
}
----------------------------------------------------------------------------
class Kata {
  static Object[] mean(char[] lst) {
    String s = "";
    int sum = 0, count = 0;
    for (char c : lst) {
      if (Character.isDigit(c)) {
        sum += Character.digit(c, 10);
        count++;
      } else {
        s += c;
      }
    }
    return new Object[] {(double) sum / count, s};
  }
}


*/