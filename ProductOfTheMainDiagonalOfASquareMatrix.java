/* 7KYU CodeWars Product Of The Main Diagonal Of A Square Matrix

Given a list of rows of a square matrix, find the product of the main diagonal.

Examples:

  [[1, 0], [0, 1]] should return 1
  [[1, 2, 3], [4, 5, 6], [7, 8, 9]] should return 45
http://en.wikipedia.org/wiki/Main_diagonal



*/

public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
      int result = 1;
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          if (i == j) {
            result *= matrix[i][j];
          }
        }
      }
      return result;
    }
}
/*---------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface DiagonalProduct {
  static int ReturnProduct(int[][] matrix) {
    return range(0, matrix.length).reduce(1, (r, i) -> r * matrix[i][i]);
  }
}
------------------------------------------------------------------------------
public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
        //your code here
        int sum = matrix[0][0];
        if(matrix.length >= 2){
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix.length; j++) {
                    if(i == j){
                        sum *= matrix[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
-------------------------------------------------------------------------------
public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
        int prod = 1;
        for(int i = 0; i < matrix.length; i++) {
          prod *= matrix[i][i];
        }
        return prod; //your code here
    }
}
------------------------------------------------------------------------------
public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
        // Declare index and total
        int rowIndex = 0;
        int total = 1;
      
        // Loop through columns (outer array)
        for (int col = 0; col < matrix[0].length; col++) {
            // Increase total
            total *= ( matrix[col][rowIndex] );
          
            // Increase row index to keep Main diagonal horizontally
            rowIndex++;
        }
      
        // Provide answer
        return total;
    }
-----------------------------------------------------------------------------
public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
        return java
          .util
          .stream
          .IntStream
          .range(0, matrix.length)
          .reduce(1, (p, i) -> p * matrix[i][i]);
    }
}
-------------------------------------------------------------------------------
public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) count *= matrix[i][j];
            }
        }
        return count;
    }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
      return IntStream.range(0, matrix.length).reduce(1, (r, i) -> r * matrix[i][i]);
    }
}
------------------------------------------------------------------------------
public class DiagonalProduct {
    public static int ReturnProduct(int matrix[][]) {
      int producto = 1;
        for(int i = 0; i < matrix.length; i++){
          producto = producto * matrix[i][i];
        }
      return producto;
    }
}
*/