/* 7KYU CodeWars Principal Diagonal |VS| Secondary Diagonal

Principal Diagonal -- The principal diagonal in a matrix identifies 
those elements of the matrix running from North-West to South-East.

Secondary Diagonal -- the secondary diagonal of a matrix identifies 
those elements of the matrix running from North-East to South-West.

For example:

matrix:             [1, 2, 3]
                    [4, 5, 6]
                    [7, 8, 9]

principal diagonal: [1, 5, 9]
secondary diagonal: [3, 5, 7]

Task

Your task is to find which diagonal is "larger": which diagonal has 
a bigger sum of their elements.

If the principal diagonal is larger, return "Principal Diagonal win!"
If the secondary diagonal is larger, return "Secondary Diagonal win!"
If they are equal, return "Draw!"

Note: You will always receive matrices of the same dimension.

*/
public class Solution{
  public static String diagonal(int[][] matrix){
    int pd = 0;
    int sd = 0;
    int x = matrix[0].length;
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        if (i == j) {
          pd += matrix[i][j];
        }
        if ((i + j) == (x - 1)) {
          sd += matrix[i][j];
        }
      }
    }
    return (pd == sd) ? "Draw!" : (pd > sd) ? "Principal Diagonal win!" : "Secondary Diagonal win!"; 
  }
}
/*-------------------------------------------------------------------------------
public class Solution{
  public static String diagonal(int[][] matrix){
    int p=0;
    int d=0;
    for(int i=0;i<matrix.length;i++){
      p+=matrix[i][i];
      d+=matrix[i][matrix.length-1-i];
    }
    return (p>d) ? "Principal Diagonal win!" : (d>p) ? "Secondary Diagonal win!" : "Draw!";
  }
}
----------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution{

    private final static String PRINCIPAL_WIN = "Principal Diagonal win!";
    private final static String SECONDARY_WIN = "Secondary Diagonal win!";
    private final static String DRAW = "Draw!";

    public static String diagonal(int[][] matrix) {
        int dimension = matrix.length;
        int principalSum = IntStream.range(0, dimension).map(i -> matrix[i][i]).sum();
        int secondarySum = IntStream.range(0, dimension).map(i -> matrix[dimension - 1 - i][i]).sum();
        return principalSum > secondarySum ? PRINCIPAL_WIN : principalSum < secondarySum ? SECONDARY_WIN : DRAW;
    }
}
---------------------------------------------------------------------------------
public class Solution {

  public static String diagonal(int[][] matrix) {
    int principalSum = 0;
    int secondarySum = 0;
    
    for (int i = 0; i < matrix.length; i++) {
      principalSum += matrix[i][i];
      secondarySum += matrix[i][matrix.length - i - 1];
    }
    
    return (principalSum > secondarySum) ?
      "Principal Diagonal win!" :
      (secondarySum > principalSum) ? "Secondary Diagonal win!" : "Draw!";
  }
}
---------------------------------------------------------------------------------
public class Solution{
  public static String diagonal(int[][] m) {
    int x = 0;
    for (int i = 0, n = m.length; i < n; i++) x += m[i][i] - m[n-1-i][i];
    return x == 0 ? "Draw!" :  (x > 0 ? "Principal" : "Secondary") + " Diagonal win!";    
  }
}
----------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution{
    private final static String PRINCIPAL_WIN = "Principal Diagonal win!";
    private final static String SECONDARY_WIN = "Secondary Diagonal win!";
    private final static String DRAW = "Draw!";

    public static String diagonal(int[][] matrix) {
        int principalDiagonalSum = IntStream.range(0, matrix.length)
                .map(i -> matrix[i][i])
                .sum();
        int secondaryDiagonalSum = IntStream.range(0, matrix.length)
                .map(i -> matrix[matrix.length - 1 - i][i])
                .sum();

        return resolveResult(principalDiagonalSum, secondaryDiagonalSum);
    }

    private static String resolveResult(int principalDiagonalSum, int secondaryDiagonalSum) {
        if (principalDiagonalSum == secondaryDiagonalSum)
            return DRAW;
        if (principalDiagonalSum > secondaryDiagonalSum)
            return PRINCIPAL_WIN;
        else
            return SECONDARY_WIN;
    }
}
---------------------------------------------------------------------------------
class Solution {
  static String diagonal(int[][] matrix) {
    int score = 0;
    for (int i = 0; i < matrix.length; i++) {
      score += matrix[i][i];
      score -= matrix[i][matrix.length - 1 - i];
    }
    return score == 0 ? "Draw!" : (score > 0 ? "Principal" : "Secondary") + " Diagonal win!";
  }
}
----------------------------------------------------------------------------------
public class Solution{
  public static String diagonal(int[][] matrix){
    int principalSum = 0;
    int secondarySum = 0;
    for(int y = 0; y < matrix.length; y++) {
        principalSum += matrix[y][y];
        secondarySum += matrix[y][matrix.length - 1 - y];
    }
    return principalSum > secondarySum ? "Principal Diagonal win!" 
      : principalSum < secondarySum ? "Secondary Diagonal win!" 
      : "Draw!";
  }
}
----------------------------------------------------------------------------------
public class Solution{
  public static String diagonal(int[][] matrix){
    int principalSum = 0, secondarySum = 0;
    
    for (int i = 0; i < matrix.length; i++) {
      principalSum += matrix[i][i];
      secondarySum += matrix[i][matrix.length-i-1];
    }
      
    return principalSum > secondarySum ? "Principal Diagonal win!"
           : principalSum == secondarySum ? "Draw!" : "Secondary Diagonal win!";
  }
}
*/

