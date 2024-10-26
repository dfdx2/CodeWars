/* 8KYU CodeWars Calculate Average

Write a function which calculates the average of the numbers in a given array.

Note: Empty arrays should return 0.

*/
public class CalculateAverage {
  public static double find_average(int[] array){
    double average = 0;
    for (int i = 0; i < array.length; i++) {
      average += array[i];
    }
    return array.length < 1 ? 0 : average / array.length;
  }
}
/*---------------------------------------------------------------------------
public class CalculateAverage{
  public static double find_average(int[] array){
    
    double sum = 0;
    double avg = 0;

    // add up all the elememts in the array with a for loop

    for(int i=0; i<array.length; i++){
      // store the added up elements in the sum variable
      sum += array[i];
    }

    // Sum / number of elements
    avg = sum/array.length;

    return avg;
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;
public class Kata{
  public static double find_average(int[] array){
    return Arrays.stream(array).average().orElse(0);
  }
}
-----------------------------------------------------------------------
public class Kata{
  public static double find_average(int[] array){
        double sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
   }    
}
-----------------------------------------------------------------------
public class Kata{
  public static double find_average(int[] array){
  double sum=0;
  double avg=0;
  for (int i=0;i<array.length;i++)
      sum+=array[i];
      
      avg=sum/array.length;
      return avg;
    
  }
}
-----------------------------------------------------------------------
import static java.util.Arrays.stream;

public class Kata{
  public static double find_average(int[] array){
    return stream(array).average().getAsDouble();
  }
}
-----------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata{

  public static double find_average(int[] array){
    return IntStream.of(array).average().getAsDouble();
  }
}
------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  
  public static double find_average(int[] array) {
    double size = array.length;

    return Arrays.stream(array)
                 .mapToDouble(e -> e / size)
                 .sum();
  }

}
------------------------------------------------------------------------
public class Kata{
  public static double find_average(int[] array){
  double result = 0;
    for(double i: array) result += i;
    return result / array.length;
  }
}
------------------------------------------------------------------------
public class Kata {
  public static double find_average(int[] array) {
    return java.util.stream.IntStream.of(array)
                                     .average()
                                     .orElse(Double.NaN);
  }
}
*/