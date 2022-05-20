import java.util.stream.*;
public class SumOfPositive{
  public static int sum(int[] input) {
    return IntStream.of(input)
      .filter(i -> i > 0)
      .sum();
  }
}