/* 7KYU CodeWars Center of the matrix

Create a method that returns the center of a 2-dim array.

It should return null if there is no single center element.

You can assume all inputs will be rectangular matricies 
in array form. ex: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

*/

public class CenterOfTheMatrix {
    public static Integer center(int[][] matrix) {
      return matrix.length % 2 > 0 && matrix[0].length % 2 > 0 ? matrix[matrix.length / 2][matrix[0].length / 2] : null;
    }
}
/*------------------------------------------------------------------
public class Kata {
  
  public static Integer center(int[][] m) {
    int x, y;
    return ((y = m.length) % 2 > 0) && ((x = m[0].length) % 2 > 0) ? m[y/2][x/2] : null;
  }
  
}
--------------------------------------------------------------------
public class Kata {
  public static Integer center(int[][] matrix) {
    if (matrix.length == 0) return null;
    int colms = matrix.length; 
    int rows = matrix[0].length; 
    
    if ((colms*rows) % 2 == 0) return null; 
    else { 
      int midColm = colms / 2; 
      int midRow = rows / 2; 
      return matrix[midColm][midRow];
    }
  }
}
--------------------------------------------------------------------
public class Kata {
  public static Integer center(int[][] matrix) {
    if (matrix.length % 2 == 0 || matrix[0].length % 2 == 0) {
      return null;
    }
    else {
      return matrix[(int) Math.ceil(matrix.length / 2)][(int) Math.ceil(matrix[0].length / 2)];
    }
  }
}
--------------------------------------------------------------------
public class Kata {
  public static Integer center(int[][] matrix) {
    if(matrix.length % 2==1 && matrix[0].length % 2==1){
      int j = matrix[0].length / 2;
      int i = matrix.length / 2;
      return matrix[i][j];
    }else{
      return null;
    }
  }
}
--------------------------------------------------------------------
public class Kata {
  public static Integer center(int[][] matrix) {
    
    if(matrix.length == 0) {
      return null;
    }
    
    int numRows = matrix.length;
    int numCols = matrix[0].length;
    
    if(numRows % 2 == 0 || numCols % 2 == 0) {
      return null;
    }
    
    int centerR = numRows / 2;
    int centerC = numCols / 2;
    
    return matrix[centerR][centerC];
 }
}
--------------------------------------------------------------------
public class Kata {
  public static Integer center(int[][] matrix) {
    int row = matrix.length;
    if(row == 0){
      return null;
    }
    int col = matrix[0].length; 
    if(row % 2 == 0 || col % 2 == 0 ){
      return null;
    } 
    int r = row/2;
    int c = col/2;
    return matrix[r][c];
  }
}
*/