/* 6KYU CodeWars Matrix Addition

Write a function that accepts two square matrices 
(N x N two dimensional arrays), and return the sum 
of the two. Both matrices being passed into the function 
will be of size N x N (square), containing only integers.

How to sum two matrices:

Take each cell [n][m] from the first matrix, and add it 
with the same [n][m] cell from the second matrix. This 
will be cell [n][m] of the solution matrix. 
(Except for C where solution matrix will be a 1d 
pseudo-multidimensional array).

Visualization:

|1 2 3|     |2 2 1|     |1+2 2+2 3+1|     |3 4 4|
|3 2 1|  +  |3 2 3|  =  |3+3 2+2 1+3|  =  |6 4 4|
|1 1 1|     |1 1 3|     |1+1 1+1 1+3|     |2 2 4|
Example
matrixAddition(
  [ [1, 2, 3],
    [3, 2, 1],
    [1, 1, 1] ],
//      +
  [ [2, 2, 1],
    [3, 2, 3],
    [1, 1, 3] ] )

// returns:
  [ [3, 4, 4],
    [6, 4, 4],
    [2, 2, 4] ]
*/
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        result[i][j] = a[i][j] + b[i][j];
      }
    }
    return result;
	}
}
/*--------------------------------------------------------------------------
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
    int matLen = a.length;
    int[][] resultMatrix = new int[matLen][matLen];
		for(int i = 0; i < matLen; i++) {
      for(int j = 0; j < matLen; j++) {
        resultMatrix[i][j] = a[i][j] + b[i][j];
      }
    }
    return resultMatrix;
	}
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
		IntStream.range(0, a.length * a.length)
                 .forEach(n -> a[n / a.length][n % a.length] += b[n / a.length][n % a.length]);
        return a;
	}
}
-----------------------------------------------------------------------------
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
		for(int row=0;row<a.length;row++)
    for(int col=0;col<a[0].length;col++)
      a[row][col]+=b[row][col];
      
    return a;
	}
}
-----------------------------------------------------------------------------
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
		for(int i = 0; i < a.length ; i++){
      for(int ii = 0; ii < a[0].length; ii++){
        a[i][ii] = a[i][ii] + b[i][ii];
      }
    }
    return a;
	}
}
------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

public class Kata {
  static int[][] matrixAddition(int[][] a, int[][] b) {
    range(0, a.length * a.length).forEach(i -> a[i / a.length][i % a.length] += b[i / a.length][i % a.length]);
    return a;
  }
}
------------------------------------------------------------------------------
public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
    if (a.length != b.length || a[0].length != b[0].length) {
      System.out.println("Error: Matrices must have the same dimensions");
      return null;
      }
    
    int rows = a.length;
    int cols = a[0].length;
    
		int[][] c = new int[rows][cols];
    
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }
    return c;
	}
}
*/
