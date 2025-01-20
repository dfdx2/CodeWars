/* 8KYU CodeWars CSV Representation Of Array

Create a function that returns the CSV representation of a two-dimensional numeric array.

Example:

input:
   [[ 0, 1, 2, 3, 4 ],
    [ 10,11,12,13,14 ],
    [ 20,21,22,23,24 ],
    [ 30,31,32,33,34 ]] 
    
output:
     '0,1,2,3,4\n'
    +'10,11,12,13,14\n'
    +'20,21,22,23,24\n'
    +'30,31,32,33,34'
Array's length > 2.

More details here: https://en.wikipedia.org/wiki/Comma-separated_values

Note: you shouldn't escape the \n, it should work as a new line.



*/
public class CSVRepresentationOfArray {
  public static String toCsvText(int[][] array){
    String result = "";
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (j == array[i].length - 1) {
          result += array[i][j] + "\n";
          
        }
        else {
          result += array[i][j] + ",";
        }
      }
    }
    return result.substring(0, result.length() - 1);
  }
}
/*-----------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
  public static String toCsvText(int[][] array){
        return  removeLastChar(Arrays.stream(array)
                .map(elem -> Arrays.toString(elem) + "\n")
                .collect(Collectors.joining())
                .replaceAll("\\[","")
                .replaceAll("\\]","")
                .replaceAll(" ",""))
                ;
    }

    private static String removeLastChar(String stringForRemove){
        return stringForRemove.substring(0,stringForRemove.length()-1);
    }
}
-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
  public static String toCsvText(int[][] array){
    return Arrays.stream(array)
            .map(intArr -> Arrays.stream(intArr)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(",")))
            .collect(Collectors.joining("\n"));
  }
}
--------------------------------------------------------------------------
import java.util.stream.*;
import java.util.*;
public class Kata {
  public static String toCsvText(int[][] array){
    String res = "";
    for(int a[]:array){
      res+= Arrays.stream(a).mapToObj(x->x+"").collect(Collectors.joining(","));
      res+="\n";
    }
    return  res.trim();
  }
}
--------------------------------------------------------------------------
import java.util.stream.*;

public class Kata {
  public static String toCsvText(int[][] array){
    return Stream.of(array)
      .map(a -> IntStream.of(a).mapToObj(i -> i + "").collect(Collectors.joining(",")))
      .collect(Collectors.joining("\n"));
  }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.List;

public class Kata {
  public static String toCsvText(int[][] array){
    List<String> res = new LinkedList<>();
    
    for (int[] numArr : array) {
      res.add(Arrays.toString(numArr).replaceAll("\\[|\\]|\\s", ""));
    }
    
    return res.stream().collect(Collectors.joining("\n"));
  }
}
*/
