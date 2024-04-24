/* 7KYU CodeWars Flatten And Sort An Array

Challenge:

Given a two-dimensional array of integers, return the flattened 
version of the array with all the integers in the sorted 
(ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function 
should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

*/

import java.util.Arrays;
public class Kata {
	public static int[] flattenAndSort(int[][] array) {		
		return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();		
	}
}

/*------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {

    public static int[] flattenAndSort(int[][] array) {
        int length = 0;
        for(int[] line: array)
            length = length + line.length;
        
        //debug
        System.out.println("length = " + length);
        
        int[] out = new int[length];
                
        int i = 0;
        for(int[] line: array)
            for(int cell: line) {
                out[i] = cell;
                i++;
            }

        Arrays.sort(out);
        
        return out;
    }
}
--------------------------------------------------------------------------
import java.util.*;
public class Kata {

	public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                list.add(array[i][j]);
            }
        }
        Collections.sort(list);
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }

}
---------------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {

	public static int[] flattenAndSort(int[][] array) {		
    return Stream.of(array)
        .filter(it -> it.length > 0)
        .flatMapToInt(IntStream::of)
        .sorted().toArray();
	}

}
--------------------------------------------------------------------------
import java.util.*;
public class Kata {

	public static int[] flattenAndSort(int[][] array) {		
		List<Integer> myList = new ArrayList<>();
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                myList.add(ints[j]);
            }
        }
        Collections.sort(myList);
        return myList.stream().mapToInt(Integer::intValue).toArray();	
	}

}
---------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {

	public static int[] flattenAndSort(int[][] array) {		
    int len = 0;
    for (int l=0; l<array.length;l++){
      len += array[l].length;
    }
    
    int[] newarr = new int[len];
    int counter = 0;
    for (int i=0; i<array.length;i++) {
      for (int j=0; j<array[i].length;j++){
          newarr[counter] = array[i][j];
          counter++;
      }
    }  
    
    Arrays.sort(newarr);
    return newarr;
	}

}
*/