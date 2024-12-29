/* 7KYU CodeWars Fizz Buzz

Return an array containing the numbers from 1 to N, where N is the parametered value.

Replace certain values however if any of the following conditions are met:

If the value is a multiple of 3: use the value "Fizz" instead
If the value is a multiple of 5: use the value "Buzz" instead
If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead
N will never be less than 1.

Method calling example:

FizzBuzzArray.fizzBuzz(3) -->  ["1", "2", "Fizz"]

*/
public class FizzBuzzArray {
    public static String[] fizzBuzz(int n) {
      String[] result = new String[n];
      for (int i = 1; i <= n; i++) {
        if (i % 15 == 0) {
          result[i - 1] = "FizzBuzz";
        }
        else if (i % 5 == 0) {
          result[i - 1] = "Buzz";
        }
        else if (i % 3 == 0) {
          result[i - 1] = "Fizz";
        }
        else {
          result[i - 1] = String.valueOf(i);
        }
      }
      return result;
    }
}
/*-----------------------------------------------------------------------
import java.util.stream.IntStream;
public class FizzBuzzArray {
    public static String[] fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                        .mapToObj(a -> (a % 15 == 0) ? "FizzBuzz" : (a % 5 == 0) ? "Buzz" : (a % 3 == 0) ? "Fizz" : String.valueOf(a))
                        .toArray(String[]::new);
    }
}

-------------------------------------------------------------------------
public class FizzBuzzArray {
    private static String getFb(int number) {
        int mod3 = number % 3, mod5 = number % 5;
        if (mod5 == 0 && mod3 == 0) {
            return "FizzBuzz";
        }
        if (mod5 == 0) {
            return "Buzz";
        }
        if (mod3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
    public static String[] fizzBuzz(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n).mapToObj(FizzBuzzArray::getFb).toArray(String[]::new);
    }
}

-------------------------------------------------------------------------
import java.util.stream.IntStream;

public class FizzBuzzArray {
    public static String[] fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 3 == 0 && i % 5 == 0 ? "FizzBuzz"
                        : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : Integer.toString(i))
                .toArray(String[]::new);
    }
}

-------------------------------------------------------------------------
import java.util.stream.IntStream;

public class FizzBuzzArray {
  public static String[] fizzBuzz(int n) {
    return IntStream.rangeClosed(1, n)
        .mapToObj(number-> getItem(number))
        .toArray(String[]::new);
  }

  private static String getItem(int number){
    if(number%3==0 && number%5==0) {
      return "FizzBuzz";
    }
    if(number%5==0) {
      return "Buzz";
    }
    if(number%3==0) {
      return "Fizz";
    }
    return String.valueOf(number);
  }
}
-------------------------------------------------------------------------
public class FizzBuzzArray {

    public static String[] fizzBuzz(int n) {
        String[] fizzBuzzArray = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                fizzBuzzArray[i - 1] = "FizzBuzz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i - 1] = "Buzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i - 1] = "Fizz";
            } else {
                fizzBuzzArray[i - 1] = Integer.toString(i);
            }
        }
        return fizzBuzzArray;
    }
}
-------------------------------------------------------------------------
import org.apache.commons.lang3.ArrayUtils;

public class FizzBuzzArray {

  public static String[] fizzBuzz(int n) {
    if (n == 1) {
      return new String[] { "1" };
    }

    return ArrayUtils.addAll(fizzBuzz(n - 1), getValue(n));
  }

  private static String getValue(int n) {
    if (n % 15 == 0) {
      return "FizzBuzz";
    }

    if (n % 3 == 0) {
      return "Fizz";
    }

    if (n % 5 == 0) {
      return "Buzz";
    }

    return Integer.toString(n);
  }

}
*/