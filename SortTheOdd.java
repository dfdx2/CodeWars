/* 6KYU CodeWars Sort The Odd

You will be given an array of numbers. You have to sort the odd 
numbers in ascending order while leaving the even numbers at their 
original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]




*/

public class Kata {
    public static int[] sortArray(int[] array) {
      if (array.length <= 0) {
        return array;
      }
      int i = 0;
      while (i < array.length) {
        while (i < array.length && array[i] % 2 == 0) 
          i++;
        int j = i + 1;
        while (j < array.length) {
          while (j < array.length && array[j] % 2 == 0) 
            j++;
          if (j < array.length && array[i] % 2 != 0 && array[j] != 0 && array[i] > array[j]) {
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
          }
          j++;
  
        }
        i++;
      }
      return array;
    }
}
/*------------------------------------------------------------------------
import java.util.*;

public class Kata {

  public static int[] sortArray(final int[] array) {

    // Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
    
    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }
    
    return array;
  }
  
}
---------------------------------------------------------------------------------
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class Kata {
  public static int[] sortArray(int[] array) {
    OfInt sortedOdds = IntStream
        .of(array)
        .filter(i -> i % 2 == 1)
        .sorted()
        .iterator();

    return IntStream
        .of(array)
        .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
        .toArray();  
      }
}
----------------------------------------------------------------------------
public class Kata {
  public static int[] sortArray(int[] array) {
     for(int i=0 ; i<array.length-1 ; i++){
            for(int j=i+1; j<array.length ; j++){
                if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
     return array;
  }
}
---------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;

public class Kata {

    public static int[] sortArray(int[] array) {
        ArrayList<Integer> oddList = new ArrayList<>(array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddList.add(array[i]);
            }
        }
        Collections.sort(oddList);

        for (int i = 0, j = 0; i < oddList.size(); i++, j++) {
            while (array[j] % 2 == 0) {
                j++;
            }
            array[j] = oddList.get(i);
        }
        return array;
    }
    
}





*/

  