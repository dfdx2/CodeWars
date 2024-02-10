/* 8KYU CodeWars To Square(root) or not to square(root)

Write a method, that will get an integer array as parameter 
and will process every number from this array.

Return a new array with processing every number of the 
input-array like this:

If the number has an integer square root, take this, 
otherwise square the number.

Example
[4,3,9,7,2,1] -> [2,9,3,49,4,1]
Notes
The input array will always contain only positive numbers, 
and will never be empty or null.

*/

public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
      int[] result = new int[array.length];
      for (int i = 0; i < array.length; i++) {
        int x = (int) Math.sqrt(array[i]);
        if(Math.pow(x,2) == array[i]) {
          result[i] = x;
        }
        else {
          result[i] = array[i] * array[i];
        }
        }
      return result;
    }
}
/*----------------------------------------------------------------
public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    for(int i = 0; i < array.length; i++) {
      if (Math.sqrt(array[i]) % 1 == 0) array[i] = (int) Math.sqrt(array[i]);
      else array[i] = array[i] * array[i];
    }
    return array;
  }
}
------------------------------------------------------------------
import java.util.Arrays;

public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    return Arrays.stream(array)
          .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))          
          .toArray();      
  }
}
------------------------------------------------------------------
public class Kata
{
  private static double squareRoot = 0d;
  
  public static int[] squareOrSquareRoot(final int[] array)
  {
    int[] newArray = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      if (isPerfectSquare(array[i])) {
        newArray[i] = (int) squareRoot;
      } else {
        newArray[i] = (int) squareNumber(array[i]);
      }
    } 
    
    return newArray;
  }
  
  public static boolean isPerfectSquare(final int num) {
    squareRoot = squareRoot(num);
    return ((squareRoot - Math.floor(squareRoot)) == 0);
  }
  
  public static double squareRoot(int num) {
    return Math.sqrt(num);
  }
  
  public static double squareNumber(final int num) {
    return Math.pow(num, 2);
  }
}
------------------------------------------------------------------
public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
      for (int index = 0; index < array.length; index++) {
            int sqrt =  (int) Math.sqrt(array[index]);
            array[index] = (sqrt * sqrt == array[index]) ? sqrt : array[index] * array[index];
        }
  
        return array;
  }
}
-------------------------------------------------------------------
public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    for (int i = 0; i < array.length; i++) {
      if (Math.sqrt(array[i]) == (int)Math.sqrt(array[i])) {
        array[i] = (int)Math.sqrt(array[i]);
      }
      else {
        array[i] *= array[i];
      }
    }
    return array;
  }
}
-------------------------------------------------------------------
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        return java.util.stream.IntStream.of(array).map(x -> (int) (Math.sqrt(x) == (int) Math.sqrt(x) ? Math.sqrt(x) : Math.pow(x, 2))).toArray();
    }
}
-------------------------------------------------------------------
import java.util.*;

public class Kata{
  public static int[] squareOrSquareRoot(int[] array){
    int result[] = new int[array.length];
    for(int i = 0; i < array.length; i++){
      if(Math.sqrt(array[i])==(int)Math.sqrt(array[i])){
        result[i] = (int)(Math.sqrt(array[i]));  
      }else{
        result[i] = (int)(Math.pow(array[i], 2));
      }
    }
    return result;
  }
}

--------------------------------------------------------------------
public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    int[] Dominican_Republic = new int[array.length];
    int count = 0;
    
    for(int i:array){
      int n = (int)Math.sqrt(i);
      System.out.println(Math.sqrt(i) - n);
      
      if((Math.sqrt(i) - n) != 0){
        Dominican_Republic[count] = i*i;
      }else{
        Dominican_Republic[count] = (int)Math.sqrt(i);
      }
      count++;
     
    }
    
    return Dominican_Republic;
  }
}
--------------------------------------------------------------------
import java.util.Arrays;
public class Kata {
  public static int[] squareOrSquareRoot(int[] array) {
    return Arrays.stream(array)
          .map(i -> {
            var sqrt = Math.sqrt(i);
            return sqrt % 1 == 0 ? (int) sqrt : i * i;          
          }) 
          .toArray();        
  }
}
*/
