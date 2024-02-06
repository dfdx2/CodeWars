/* 7KYU CodeWars Find Sum of Top-Left to Bottom-Right diagonals

Given a square matrix (i.e. an array of subarrays), find the sum 
of values from the first value of the first array, the second 
value of the second array, the third value of the third array, 
and so on...

Examples

array = [[1, 2],
         [3, 4]]

diagonal sum: 1 + 4 = 5

array = [[5, 9, 1, 0],
         [8, 7, 2, 3],
         [1, 4, 1, 9],
         [2, 3, 8, 2]]

diagonal sum: 5 + 7 + 1 + 2 = 15

*/
public class Diagonal {
  public static int diagonalSum(final int[][] matrix) {
    int result = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == j) {
          result += matrix[i][j];
        }
      }
    }
    return result;
  }
}
/*------------------------------------------------------------
public class Diagonal
{
  public static int diagonalSum(final int[][] matrix)
  {
    int total = 0;
    for (int x = 0; x < matrix.length; x++){
      total += matrix[x][x];
    }
    return total;
  }
}
---------------------------------------------------------------
import java.util.stream.IntStream;

public class Diagonal {
  public static int diagonalSum(final int[][] matrix) {
    return IntStream.range(0, matrix.length).map(i -> matrix[i][i]).sum();
  }
}
---------------------------------------------------------------
public class Diagonal
{
  public static int diagonalSum(final int[][] matrix) {
    return java.util.stream.IntStream.range(0, matrix.length)
        .map(i -> matrix[i][i])
        .sum();
  }
}
---------------------------------------------------------------
public class Diagonal
{
  public static int diagonalSum(final int[][] matrix)
  {
    return java.util.stream.IntStream.rangeClosed(0, matrix.length-1).map(x -> matrix[x][x]).sum();
  }
}
---------------------------------------------------------------
public class Diagonal
{
  public static int diagonalSum(final int[][] matrix)
  {
      int ans = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (j == i) ans += matrix[i][j];
            }
        }
    
        return ans;
  }
}
----------------------------------------------------------------
import java.util.stream.IntStream;
public class Diagonal
{
  public static int diagonalSum(final int[][] matrix)
  {
   return IntStream.range(0,matrix.length)
                .map(e -> e = matrix[e][e])
                .sum();
  }
}
----------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
public class Diagonal
{
  public static int diagonalSum(final int[][] matrix)
  {
    /*int sum = 0;
    for(int i = 0; i < matrix.length; i++){
      sum += matrix[i][i];
    }
    return sum;
    
    return IntStream.range(0,matrix.length).
            map(x -> matrix[x][x]).
            sum();
  }
}
----------------------------------------------------------------
import java.util.stream.IntStream;

public class Diagonal {
  public static int diagonalSum(final int[][] matrix) {
    return IntStream.rangeClosed(0, matrix.length-1).map(num -> matrix[num][num]).sum();
  }
}
*/