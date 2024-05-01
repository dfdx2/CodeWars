/* 7KYU CodeWars Nth Power Rules Them All

You are provided with an array of positive integers and 
an additional integer n (n > 1).

Calculate the sum of each value in the array to the nth power. 
Then subtract the sum of the original array.

Examples
{1, 2, 3}, 3  -->  (1^3 + 2^3 + 3^3 ) - (1 + 2 + 3)  -->  36 - 6  -->  30
{1, 2}, 5     -->  (1^5 + 2^5) - (1 + 2)             -->  3

*/

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    int[] result = new int[array.length];
    int test = 0;
    int sum = 0;
    int i = 0;
    while (i < array.length) {
      int j = array[i];
      j = (int) Math.pow(j, power);
      result[i] = j;
      i++;
    }
    for (int j = 0; j < array.length; j++) {
      sum += array[j];
    }
    for (int j = 0; j < result.length; j++) {
      test += result[j];
    }
    return test - sum;
  }
}
/*------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    return Arrays.stream(array).map(x -> (int)Math.pow(x, power) - x).sum();
  }
}
--------------------------------------------------------------------
public class Kata {
  public static int modifiedSum(int[] array, int power) {
    int sum = 0;
    for (int i : array)
      sum+=Math.pow(i,power)-i;
    return sum;
  }
}
--------------------------------------------------------------------
import java.util.stream.*;

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    return IntStream.of(array).map(e -> (int)Math.pow(e, power) - e).sum();
  }
}
--------------------------------------------------------------------
public class Kata {
  public static int modifiedSum(int[] array, int power) {
     //IntStream ar = Arrays.stream(array).map((i) -> (int) Math.pow(i, power));
        //int[] powerAr = ar.toArray();
        int minInt = 0;
        int powerInt = 0;

        int[] powerAr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            powerAr[i] = (int) Math.pow(array[i], power);
        }

        for (int i: array) {
            minInt = minInt + i;
        }
        //System.out.print(minInt+"\n");

        for(int i: powerAr){
            powerInt = powerInt+i;

        }
        //System.out.print(powerInt+"\n");
        return powerInt - minInt;
  }
}
---------------------------------------------------------------------
public class Kata {
  public static int modifiedSum(int[] array, int power) {
    int poweresult = 0;
    int numResult = 0;
    for (int i: array){
      poweresult += powers(i, power);
      numResult += i;
    }
    return poweresult - numResult;
  }
  public static int powers (int i, int powerr){
    int result = 1;
    for (int x = 0; x < powerr; x ++){
      result *= i;
    }
    return result;
  }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;
import static java.lang.Math.*;

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    return getPowerSum(array, power) - getPowerSum(array, 1);
  }
  
  private static int getPowerSum(int[] arr, int power) {
    return IntStream.of(arr)
                    .map(i -> (int) pow(i, power))
                    .sum();
  }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    return IntStream.of(array).map((base) -> (int) Math.pow(base, power) - base).sum();
  }
---------------------------------------------------------------------
import static java.util.stream.IntStream.of;

class Kata {
  static int modifiedSum(int[] array, int power) {
    return of(array).map(n -> (int) Math.pow(n, power) - n).sum();
  }
}
---------------------------------------------------------------------
public class Kata {
  public static int modifiedSum(int[] array, int power) {
    int sum = 0;
    int normalSum = 0;

    for (int i=0; i < array.length; i++ ) {      
      sum += pow(array[i], power) - array[i];
    }

    return sum;
  }

  public static int pow(int a, int b) {
    int powered = 1;
    for(int i = 0; i < b; i++) {
      powered *= a;
    }
    return powered;
  }

}
---------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
	public static int modifiedSum(int[] array, int power) {
		return Arrays.stream( array ).map( i -> (int) Math.pow( i, power ) ).sum() - Arrays.stream( array ).sum();
	}
}
---------------------------------------------------------------------
public class Kata {
  public static int pow(int a, int b) {
        if (b == 0) return 1;
        int ret = pow(a, b / 2);
        ret *= ret;
        if (((b & 1) != 0)) ret *= a;
        return ret;
    }

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += pow(array[i], power)-array[i];
        }
        return sum;
    }
}
---------------------------------------------------------------------
public class Kata {
  public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int n : array) {
            sum += Math.pow(n,power) - n;
        }
        return sum;
  }
}
---------------------------------------------------------------------
import java.lang.Math.*;
import java.math.BigInteger;

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    BigInteger sum= new BigInteger("0");
    long sum2=0;
    for (int i=0;i < array.length;i++){
      BigInteger counter = new BigInteger(Integer.toString(array[i]));
      sum = sum.add(counter.pow(power));
      sum2 += (long)array[i];
    }    
    return (int)(sum.intValue()-sum2);
  }
}
*/