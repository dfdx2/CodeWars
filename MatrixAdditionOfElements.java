/* 7KYU CodeWars Matrix Addition Of Elements

#Matrix Addition of Elements

As the name suggests you just have to add all the elements of the matrix and output a single Integer.

Matrix can be of any size, not necessarily a square matrix.
Matrix can have negative elements as well.
Method should take an input 2-Dimentional Array.
Constraints

1 <= rows, columns < 20

-100 <= elements <= 100

Example

SumOfElements({{1,0},{0,1}}) should return 2.
SumOfElements({{7,9},{3,6}}) should return 25.




*/
public class Sid {
    public static int sumOfElements(int matrix[][]) {
      int result = 0;
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          result += matrix[i][j];
        }
      }
      return result;
    }    
}
/*----------------------------------------------------------------------------
import java.util.Arrays;

public class Sid {
    public static int sumOfElements(int matrix[][]) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }    
}
------------------------------------------------------------------------------
public class Sid {
    public static int sumOfElements(int matrix[][]) {
        int myVar = 0;
        for(int i = 0; i<matrix.length; i ++){
          for(int j = 0; j<matrix[i].length; j ++){
              myVar = myVar + matrix[i][j];
          }
        }
        return myVar;
    }    
}
------------------------------------------------------------------------------
public class Sid {
  public static int sumOfElements(int matrix[][]) {
    int sum=0;
    for (int[] rows: matrix) for (int e: rows) sum+=e;
    return sum;
  }    
}
------------------------------------------------------------------------------
public class Sid {
    public static int sumOfElements(int matrix[][]) {
      int sum = 0;
      for(int x = 0; x<matrix.length; x++){  //定位行  
            for(int y = 0; y<matrix[x].length; y++){  //定位每行的元素个数  
                sum+=matrix[x][y];  
            }  
      }
      return sum;
    }    
}
-------------------------------------------------------------------------------
import static java.util.stream.Stream.of;

import java.util.Arrays;

class Sid {
  static int sumOfElements(int[][] matrix) {
    return of(matrix).flatMapToInt(Arrays::stream).sum();
  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;

public class Sid {
    public static int sumOfElements(int matrix[][]) {
        return Arrays.stream(matrix).flatMapToInt(x -> Arrays.stream(x)).sum();
    }
}

-------------------------------------------------------------------------------
public class Sid {
    public static int sumOfElements(int matrix[][]) {
        return java.util.Arrays.stream(matrix).mapToInt(row -> java.util.stream.IntStream.of(row).sum()).sum();
    }    
}
-------------------------------------------------------------------------------
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Sid {
    public static int sumOfElements(int matrix[][]) {
        return Stream.of(matrix).flatMapToInt(array -> IntStream.of(array)).sum();
    }    
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Sid {

    public static int sumOfElements(int matrix[][]) {
        return IntStream.range(0, matrix.length)
                        .map(i -> IntStream.range(0, matrix[i].length).map(x -> matrix[i][x]).sum())
                        .sum();
    }    
}

*/