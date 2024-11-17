/* 7KYU CodeWars Number of Rectangles in a Grid

Given a grid of size m x n, calculate the total number of rectangles contained in this rectangle. All integer sizes and positions are counted.

Examples(Input1, Input2 --> Output):

3, 2 --> 18
4, 4 --> 100
Here is how the 3x2 grid works (Thanks to GiacomoSorbi for the idea):

1 rectangle of size 3x2:

[][][]
[][][]
2 rectangles of size 3x1:

[][][]
4 rectangles of size 2x1:

[][]
2 rectangles of size 2x2

[][]
[][]
3 rectangles of size 1x2:

[]
[]
6 rectangles of size 1x1:

[]
As you can see (1 + 2 + 4 + 2 + 3 + 6) = 18, and is the solution for the 3x2 grid.

There is a very simple solution to this!


*/

public class NumberOfRectanglesInAGrid {
  public static int numberOfRectangles(int m, int n) {
    return n * (n + 1) * m * (m + 1) / 4;
  }
}
/*------------------------------------------------------------
public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    return n*m*(n+1)*(m+1)/4;
  }
  
}
--------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    return sumFromZeroTo(m) * sumFromZeroTo(n);
  }
  
  private static int sumFromZeroTo(int n) {
    return IntStream.range(0, n + 1).sum();
  }
  
}
--------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution {
    public static int numberOfRectangles(int m, int n) {
      return IntStream.rangeClosed(1, m).sum() * IntStream.rangeClosed(1, n).sum();
  }
}
--------------------------------------------------------------
public class Solution {
  public static int numberOfRectangles(int m, int n) {
    //#triangularnumbers
    return (m * (m + 1) / 2) * (n * (n + 1) / 2);
  }
}
--------------------------------------------------------------
public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    
    int rectangles = 0;
    
    for(int i = 1; i <= m; i++) {
      for(int j = 1; j <= n; j++) {
        
        System.out.println(String.format("%sx%x: %s rectangles", i, j, (m + 1 - i)*(n + 1 - i)));
        
        rectangles += (m + 1 - i)*(n + 1 - j);
        
      }
    }
    
    return rectangles;
  }
  
}
--------------------------------------------------------------
public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    int sum = 0;
    for (int i = m; i > 0; i--) {
      for (int j = n; j > 0; j--) {
        sum += i * j;
      }
    }
    return sum;
  }
}
--------------------------------------------------------------
public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
   return series(m)*series(n);   
   }
   public static int series (int x){
   int sum = 0; 
   for (int i = x; i>0; i--){
   sum += i;
   }return sum;
   }
}
--------------------------------------------------------------
public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
        return triangular(m) * triangular(n);
    }
  public static int triangular(int n) {
        return n * (n + 1) / 2;
    }
}
--------------------------------------------------------------
public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
  int total = 0;
    for(int i = 1 ; i < ( m + 1) ; i++){
      for(int j = 1 ; j < (n + 1) ; j++){
        total += (m - i + 1) * (n - j + 1);
      }
    }
       
    return total;
  }
  
}    
*/