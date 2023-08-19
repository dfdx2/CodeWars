/* 7KYU CodeWars Filter The Number

Filter the number
Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text, can you return the number back to its original state?

Task
Your task is to return a number from a string.

Details
You will be given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they occur.



*/
import java.util.*;
public class Kata {
    public static long filterString(final String value) {
      String result = "";
      for (int i = 0; i < value.length(); i++) {
        char c = value.charAt(i);
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
          result += value.charAt(i);
        }
      }
      System.out.println(value);
      System.out.println(result);
      return Long.valueOf(result);  
    }
}
/*--------------------------------------------------------------------------
public class Kata {
    public static long filterString(final String value) {
        return Long.valueOf(value.replaceAll("\\D", ""));
    }
}
-----------------------------------------------------------------------------
public class Kata {
    public static long filterString(final String value) {
      return Long.valueOf(value.replaceAll("[a-z]", ""));
    }
}
------------------------------------------------------------------------------
public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[^0-9]", ""));
    }
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static long filterString(final String value) {
        String ofInt = Arrays.asList(value.split("")).stream()
                .filter(s -> !s.matches("[A-za-z]"))
                .collect(Collectors.joining());
      return Long.valueOf(ofInt);
    }
}

*/