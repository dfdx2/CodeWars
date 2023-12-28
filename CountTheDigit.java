/* 7KYU CodeWars Count The Digit

Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.

Square all numbers k (0 <= k <= n) between 0 and n.

Count the numbers of digits d used in the writing of all the k**2.

Implement the function taking n and d as parameters and returning this count.

Examples:
n = 10, d = 1 
the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
We are using the digit 1 in: 1, 16, 81, 100. The total count is then 4.

The function, when given n = 25 and d = 1 as argument, should return 11 since
the k*k that contain the digit 1 are:
1, 16, 81, 100, 121, 144, 169, 196, 361, 441.
So there are 11 digits 1 for the squares of numbers between 0 and 25.
Note that 121 has twice the digit 1.
*/

public class CountDig {
    
    public static int nbDig(int n, int d) {
      String[] test = new String[n + 1];
      int counter = 0;
      for (int i = 0; i < test.length; i++) {
        int a = i * i;
        test[i] = String.valueOf(a);
      }
      for (String b : test) {
        String c = String.valueOf(d);
        for (int i = 0; i < b.length(); i++) {
          if (b.charAt(i) == c.charAt(0)) {
            counter++;
          }
        }
      }
      return counter;
    }
}
/*------------------------------------------------------------------------------
public class CountDig {
    
    public static int nbDig(int n, int d) {
      int sum = 0;
      for (int i = 0; i <= n; i++) {
        sum += countOfDigit((int) Math.pow(i, 2), d);
      }        
      return sum;
    }
    
    public static int countOfDigit(int n, int d) {
      int count = 0;
      do {
        if (n % 10 == d)
          count ++;
        n /= 10;
      } while (n > 0);
      return count;
    }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class CountDig {

    public static int nbDig(int n, int d) {

         return (int) IntStream
               .rangeClosed(0, n)
               .map(i -> i * i)
               .flatMap(i -> String.valueOf(i).chars())
               .mapToObj(i -> (char)i)
               .mapToInt(Character::getNumericValue)
               .filter(i -> i == d)
               .count();
    }
}
--------------------------------------------------------------------------------
import java.util.stream.*;
public class CountDig {
   public static int nbDig(int n, int d) {
     return IntStream.range(0, n+1)
                     .mapToObj(i -> String.valueOf(i*i))
                     .map(s -> s.replaceAll("[^"+d+"]", ""))
                     .collect(Collectors.joining())
                     .length();
   }
}
--------------------------------------------------------------------------------
public class CountDig {

    public static int nbDig(int n, int d) {
        int needle = String.valueOf(d).charAt(0);
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String haystack = String.valueOf(i * i);
            count += (int) haystack.chars().filter(ch -> ch == needle).count();
        }
        return count;
    }
}
----------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class CountDig {
    
    public static int nbDig(int n, int d) {
        return (int) IntStream.rangeClosed(0, n)
                  .flatMap(i -> String.valueOf(i * i).chars())
                        .filter(i -> i == (char)(d + '0'))
                        .count();
    }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class CountDig {
    
    public static int nbDig(int n, int d) {
        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .mapToObj(Integer::toString)
                .flatMap(s -> Stream.of(s.split("")))
                .filter(st -> st.equals(Integer.toString(d)))
                .count();
    }
}
--------------------------------------------------------------------------------
public class CountDig {
    
    public static int nbDig(int n, int d) {
        int c = 0;
        for (int i = 0; i < n + 1; i++) {
          int temp = i * i;
          while (true) {
            if (temp % 10 == d) c++;
            if ((temp /= 10) == 0) break;
          }
        }
        
        return c;
    }
}
--------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDig {
    public static int nbDig(int n, int d) {
        return (int) IntStream.range(0, n + 1)
                .map(x -> x * x)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .chars()
                .filter(c -> c - 48 == d)
                .count();
    }
}
*/