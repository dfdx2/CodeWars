/* 7KYU CodeWars Change Two-Dimensional Array

Function receive a two-dimensional square array of random integers. 
On the main diagonal, all the negative integers must be changed to 0, 
while the others must be changed to 1 (Note: 0 is considered non-negative, 
here).

(You can mutate the input if you want, but it is a better practice to not 
mutate the input)

Example:

Input array

[
  [-1,  4, -5, -9,  3 ],
  [ 6, -4, -7,  4, -5 ],
  [ 3,  5,  0, -9, -1 ],
  [ 1,  5, -7, -8, -9 ],
  [-3,  2,  1, -5,  6 ]
]
Output array

[
  [ 0,  4, -5, -9,  3 ],
  [ 6,  0, -7,  4, -5 ],
  [ 3,  5,  1, -9, -1 ],
  [ 1,  5, -7,  0, -9 ],
  [-3,  2,  1, -5,  1 ]
]


*/
class CodeWars {
  public static int[][] matrix(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (i == j && array[i][j] < 0) {
          array[i][j] = 0;
        }
        else if (i == j && array[i][j] >= 0) {
          array[i][j] = 1;
        }
      }
    }
    return array;
  }
}
/*-------------------------------------------------------------------
class CodeWars {
  public static int[][] matrix(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      array[i][i] = array[i][i] < 0 ? 0 : 1;
    }
    return array;
  }
}
----------------------------------------------------------------------
class CodeWars {
  
  public static int[][] matrix(int[][] array) {

    int n = array.length, ret[][] = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      System.arraycopy(array[i], 0, ret[i], 0, n);
      ret[i][i] = ret[i][i] < 0 ? 0 : 1;
    }
    
    return ret;
  }
  
}
----------------------------------------------------------------------
class CodeWars {
  
  public static int[][] matrix(int[][] array) {
    
    for (int i = 0; i < array[0].length; i++)
      array[i][i] = array[i][i] < 0 ? 0 : 1; 
    
    return array;
  }
  
}
-----------------------------------------------------------------------
class CodeWars {
  public static int[][] matrix(int[][] array) {
    int index = 0;
        for (int i = 0; i < array.length; i++) {
            INNER:
            for (int j = index; j < array[i].length; j++) {
                if (array[i][index] >= 0) {
                    array[i][index] = 1;
                    index++;
                    break INNER;
                }
                else {
                    array[i][index] = 0;
                    index++;
                    break INNER;
                }
            }
        }
        return array;
  }
}
-----------------------------------------------------------------------
class CodeWars {
  public static int[][] matrix(int[][] array) {
    // Code here
    int[][] result = array;
    for(int i = 0; i < array[0].length; i++) {
      if(result[i][i] < 0)  {
        result[i][i] = 0;
      }else {
        result[i][i] = 1;
      }
    }
    return result;
  }
}
------------------------------------------------------------------------
class CodeWars {
  public static int[][] matrix(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (i == j && array[i][j] < 0) {
          array[i][j] = 0;
        }
        else if (i == j && array[i][j] >= 0) {
          array[i][j] = 1;
        }
      }
    }
    return array;
  }
}
-------------------------------------------------------------------------
import java.util.Arrays;

import static java.util.stream.IntStream.range;

class CodeWars {

  public static int[][] matrix(int[][] array) {
    return range(0, array.length)
      .mapToObj(rowIndex -> changeRow(rowIndex, array[rowIndex]))
      .toArray(int[][]::new);
  }
  
  private static int[] changeRow(int rowIndex, int[] row) {
    return range(0, row.length)
      .map(colIndex -> changeValue(rowIndex, colIndex, row[colIndex]))
      .toArray();
  }

  private static int changeValue(int rowIndex, int colIndex, int value) {
    if (rowIndex != colIndex) {
      return value;
    }

    if (value < 0) {
      return 0;
    }

    return 1;
  }

}
*/