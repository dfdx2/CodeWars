/* 7KYU CodeWars Latin Squares

A latin square is an n × n array filled with the integers 1 to n, each occurring once in each row and column.

Here are examples of latin squares of size 4 and 7:

[[1, 4, 3, 2],      [[2, 3, 1, 7, 4, 6, 5], 
 [4, 3, 2, 1],       [7, 1, 6, 5, 2, 4, 3], 
 [3, 2, 1, 4],       [6, 7, 5, 4, 1, 3, 2], 
 [2, 1, 4, 3]]       [4, 5, 3, 2, 6, 1, 7], 
                     [5, 6, 4, 3, 7, 2, 1], 
                     [1, 2, 7, 6, 3, 5, 4], 
                     [3, 4, 2, 1, 5, 7, 6]]
Latin squares have many practical uses, for example in error-correcting-codes and the design of agricultural experiments. See https://en.wikipedia.org/wiki/Latin_square for more details. Sudoku is a special type of 9 x 9 latin square, with additional conditions.

Task: Write a function that returns a latin square for any positive integer n.


*/
import static java.util.stream.IntStream.range;
public class LatinSquares {
    public static int[][] makeLatinSquare(int n) {
      return range(0, n).mapToObj(i -> range(0, n).map(j -> (j + i) % n + 1).toArray()).toArray(int[][]::new);
    }
}
/*--------------------------------------------------------------------------------------
public class LatinSquares {
    public static final int[][] makeLatinSquare(int n) {
        int[][] latinSquare = new int[n][n];
        for(int y = 0; y < n; y++) {
            for(int x = 0; x < n; x++) {
                latinSquare[y][x] = (y + x) % n + 1;
            }
        }
        return latinSquare;
    }
}
----------------------------------------------------------------------------------------
public class LatinSquares {
  public static int[][] makeLatinSquare(int n) {
    int[][] latinSquare = new int[n][n];
    for (int row = 0; row < n; row++) {
      int col = row;
      for (int i = 1; i <= n; i++) {
        latinSquare[row][col] = i;
        col = (col + 1) % n;
      }
    }
    return latinSquare;
  }
}
---------------------------------------------------------------------------------------
public class LatinSquares {
    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];
        
        int row = latinSquare.length;
        int col = latinSquare[0].length;
        
        for(int i=0,j=0;j<col;j++)
        {
        	latinSquare[i][j] = j+1;
        }
        
        int i = 1;
        
        while(i<row)
        {
        	int firstNum = latinSquare[i-1][0];
        	
        	for(int j=0;j<col-1;j++)
        	{
        		latinSquare[i][j] = latinSquare[i-1][j+1]; 
        	}
        	latinSquare[i][col-1] = firstNum;
        	i++;
        }
        
      
        return latinSquare;
    }
	
}
-----------------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class LatinSquares {
  public static int[][] makeLatinSquare(int n) {
    return IntStream.range(0, n).mapToObj(i ->
      IntStream.range(0, n).map(j -> (i + j) % n + 1).toArray()
    ).toArray(int[][]::new);
  }
}
-----------------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class LatinSquares {
    public static final int[][] makeLatinSquare(int n) {
      return IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> (i + j) % n + 1).toArray()).toArray(int[][]::new);
    }
}
-----------------------------------------------------------------------------------------
public class LatinSquares {
    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];
        int x = 1;
        int a = 1;
        int b = 0;
        for (int i = 0; i < n; i++) {

            for (int p = 0; p < n; p++) {
                if (x + p > n){
                    latinSquare[i][p] = b + a;
                    b++;
                }else
                    latinSquare[i][p] = p + x;
            }
            b = 0;
            x++;
        }

        return latinSquare;
    }
}
-----------------------------------------------------------------------------------------
public class LatinSquares {
    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];

        // Put your code here

        for (int i = 0; i < latinSquare.length; i++) {
            latinSquare[0][i] = i + 1;

        }
        for (int i = 1; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare.length; j++) {
                latinSquare[i][j] = latinSquare[i-1][(j+1)%n];
            }
        }

        return latinSquare;
    }
}
*/
