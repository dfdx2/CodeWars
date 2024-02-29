/* 7KYU CodeWars Most Digits

Find the number with the most digits.

If two numbers in the argument array have the same number 
of digits, return the first one in the array.

*/
import static java.util.stream.IntStream.of;

public class MostDigits {
  public static int findLongest(int[] numbers) {
    return of(numbers).reduce(0, (a, b) -> ("" + Math.abs(a)).length() < ("" + Math.abs(b)).length() ? b : a);
  }
}
/*---------------------------------------------------------------------------------
public class MostDigits {
  public static int findLongest(int[] numbers) {
    int index = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
        index = i;
      }
    }
    return numbers[index];
  }
}
-----------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class MostDigits {
  public static int findLongest(int[] numbers) {
    return IntStream.of(numbers).reduce(0, (a, b) -> String.valueOf(Math.abs(a)).length() >= String.valueOf(Math.abs(b)).length() ? a : b);
  }
}
-----------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class MostDigits {
  public static int findLongest(int[] numbers) {
    return Arrays.stream(numbers)
      .mapToObj(String::valueOf)
      .max(Comparator.comparingInt(s -> s.replaceAll("-", "").length()))
      .map(Integer::parseInt)
      .get();
  }
}
-----------------------------------------------------------------------------------
public class MostDigits {
  public static int findLongest(int[] numbers) {
    int result = numbers[0];
    for (Integer i : numbers){
      if (String.valueOf(result).replaceAll("-", "").length() < String.valueOf(i).replaceAll("-", "").length()) result = i;
    }
    return result;
  }
}
-----------------------------------------------------------------------------------
public class MostDigits {
  public static int findLongest(int[] array) {
    int max = 0, nb = 0;
    for (int i = 0; i < array.length; i++) {
      int n = Math.abs(array[i]);
      int nbDig = String.valueOf(n).length();
      if (nbDig > max) {
        max = nbDig;
        nb = array[i];
      }
    }
    return nb;
  }
}
*/