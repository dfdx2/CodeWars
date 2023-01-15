/*   7KYU CodeWars  Predict Your Age
My grandfather always predicted how old people would get, 
and right before he passed away he revealed his secret!
In honor of my grandfather's memory we will write a function using his formula!

Take a list of ages when each of your great-grandparent died.

Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.

Example
predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
Note: the result should be rounded down to the nearest integer.

Some random tests might fail due to a bug in the JavaScript implementation. 
Simply resubmit if that happens to you.


*/
public class Solution {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // your code goes here
      int result = (age1 * age1) + (age2 * age2) + (age3 * age3) + (age4 * age4) + (age5 * age5) + (age6 * age6) + (age7 * age7) + (age8 * age8);
      double x = Math.sqrt(result);
      int y = (int) x / 2;
      return y;
    }
}
/* 
----------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;

public class Solution {
  
  public static int predictAge(int ... ages) {
    return (int) Math.sqrt(of(ages).map(a->a*a).sum())/2;
  }

}
--------------------------------------------------------------------------------------
import java.util.Arrays;
public class Solution {
  public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
    int[] ages = { age1, age2, age3, age4, age5, age6, age7, age8 };
    int sum = Arrays.stream(ages).map(age -> age * age).sum();
    double sqrt = Math.sqrt(sum);
    return (int) (sqrt / 2);
  }
}
---------------------------------------------------------------------------------------
public class Solution {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int sumAges=(age1*age1)+(age2*age2)+(age3*age3)+(age4*age4)+(age5*age5)+(age6*age6)+(age7*age7)+(age8*age8);
        int ages=(int)Math.sqrt(sumAges)/2;
        return ages;
    }}

-------------------------------------------------------------------------------------------
public class Solution {
    public static int predictAge(int...integers) {
        int result = 0;
        for (int i : integers)
        {
            result += i*i;
        }
        return (int)Math.sqrt(result)/2;
    }
}
-------------------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {

    public static int predictAge(int... ages) {
        int sumOfSquares = IntStream.of(ages)
                .map(a -> a * a)
                .sum();
        double result = Math.sqrt(sumOfSquares) / 2;
        return Math.round((int) result);
    }
}
-----------------------------------------------------------------------------------------
import java.util.Arrays;
public class Solution {
    public static int predictAge(int... ages) {
        return (int)Math.sqrt(Arrays.stream(ages).reduce(1,(a,b)->a+b*b))/2;
    }
}


*/