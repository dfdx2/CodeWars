/* 6KYU CodeWars Matrix Multiplier

In mathematics, a matrix (plural matrices) is a rectangular 
array of numbers. Matrices have many applications in programming, 
from performing transformations in 2D space to machine learning.

One of the most useful operations to perform on matrices is matrix 
multiplication, which takes a pair of matrices and produces another 
matrix – known as the dot product. Multiplying matrices is very 
different to multiplying real numbers, and follows its own set of rules.

Unlike multiplying real numbers, multiplying matrices is non-commutative: 
in other words, multiplying matrix a by matrix b will not give the same 
result as multiplying matrix b by matrix a.

Additionally, not all pairs of matrix can be multiplied. For two matrices 
to be multipliable, the number of columns in matrix a must match the number 
of rows in matrix b.

There are many introductions to matrix multiplication online, including at 
Khan Academy, and in the classic MIT lecture series by Herbert Gross.

To complete this kata, write a function that takes two matrices - a and b - 
and returns the dot product of those matrices. If the matrices cannot be 
multiplied, return null/None/Nothing or similar.

Each matrix will be represented by a two-dimensional list (a list of lists). 
Each inner list will contain one or more numbers, representing a row in the 
matrix.

For example, the following matrix:

|1 2|
|3 4|

Would be represented as:

[[1, 2], [3, 4]]

It can be assumed that all lists will be valid matrices, composed of lists 
with equal numbers of elements, and which contain only numbers. The numbers 
may include integers and/or decimal points.

*/
public class Kata {
  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
		if (a[0].length != b.length) {
      return null;
    }
    double[][] result = new double[a.length][b[0].length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b[0].length; j++) {
        for (int k = 0; k < a[0].length; k++) {
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return result;
	}
}
/*-------------------------------------------------------------------------
public class Kata {
	
  	public static double[][] getMatrixProduct(double[][] a, double[][] b) {
		double[][] result;
		if (a[0].length == b.length) {
			result = new double[a.length][b[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						result[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		} else {
			result = null;
		}

		return result;
	}
}
---------------------------------------------------------------------------
public class Kata {
	
  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
    if(b.length!=a[0].length)
      return null;
    double[][] result=new double[a.length][b[0].length];
    for(int i =0;i<a.length;i++){
      for(int j =0;j<b[0].length;j++){
        result[i][j]=arrMultiply(a[i],getColumn(b,j));
      } 
    }
		return result;
	}
  
  public static double arrMultiply(double[] a, double[] b){
    double res=0;
    for(int i =0;i<a.length;i++){
      res+=a[i]*b[i];
    }
    return res;
  }
  
  public static double[] getColumn(double[][] a,int index){
    double[] res=new double[a.length];
    for(int i =0;i<a.length;i++){
      res[i]=a[i][index];
    }
    return res;
  }
}
---------------------------------------------------------------------------
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

interface Kata {
  static double[][] getMatrixProduct(double[][] a, double[][] b) {
    return b.length == a[0].length ? new Array2DRowRealMatrix(a).multiply(new Array2DRowRealMatrix(b)).getData() : null;
  }
}
---------------------------------------------------------------------------
public class Kata {
	
  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
        if (a[0].length != b.length) return null;
        double[][] res = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            double sumOfMult = 0;
            int ref = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumOfMult += (a[i][j] * b[j][ref]);
                if (j == a[i].length - 1) {
                    System.out.println(sumOfMult);
                    res[i][ref] = sumOfMult;
                    if (ref < b[j].length-1) {
                        j = -1;
                        sumOfMult = 0;
                    }
                    ref++;
                }
            }
        }
        return res;
	}
}
---------------------------------------------------------------------------
public class Kata {
	
	  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
	    if(a[0].length!=b.length)return null;
	    else{
	      double[][] m= new double[b.length][a[0].length];
	      m=multiplyMatrices(a,b);
	
	      return m;
	    }
		}
	  static double[][] multiplyMatrices(double[][] a, double[][] b) {
		    double[][] result = new double[a.length][b[0].length];

		    for (int row = 0; row < result.length; row++) {
		        for (int col = 0; col < result[row].length; col++) {
		            result[row][col] = multiplyMatricesCell(a, b, row, col);
		        }
		    }

		    return result;
		}
	  static double multiplyMatricesCell(double[][] a, double[][] b, int row, int col) {
		    double cell = 0;
		    for (int i = 0; i < b.length; i++) {
		        cell += a[row][i] * b[i][col];
		    }
		    return cell;
		}
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {

    public static double[][] getMatrixProduct(double[][] a, double[][] b) {
        if (a[0].length != b.length)
            return null;

        final var result = new double[a.length][b[0].length];
        IntStream.range(0, a.length).forEach(
                x -> IntStream.range(0, b[0].length).forEach(
                        y -> IntStream.range(0, b.length).forEach(
                                z -> result[x][y] += a[x][z] * b[z][y])));
        return result;
    }
}
---------------------------------------------------------------------------
public class Kata {
	
  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
		 if (a[0].length != b.length) {
      return null;  // Matrices cannot be multiplied
    }

    int numRowsA = a.length;
    int numColsA = a[0].length;
    int numColsB = b[0].length;

    double[][] result = new double[numRowsA][numColsB];

    // Perform matrix multiplication
    for (int i = 0; i < numRowsA; i++) {
      for (int j = 0; j < numColsB; j++) {
        for (int k = 0; k < numColsA; k++) {
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    return result;
	}
}
---------------------------------------------------------------------------
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

import static org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible;

public class Kata {

    public static double[][] getMatrixProduct(double[][] a, double[][] b) {
        final var matrixA = new Array2DRowRealMatrix(a);
        final var matrixB = new Array2DRowRealMatrix(b);
        try {
            checkMultiplicationCompatible(matrixA, matrixB);
            return matrixA.multiply(matrixB).getData();
        } catch (DimensionMismatchException e) {
            return null;
        }
    }
}
---------------------------------------------------------------------------
public class Kata {
	
 public static double[][] getMatrixProduct(double[][] a, double[][] b) {
        if(a[0].length!=b.length)
            return null;
        double[][] c=new double[a.length][b[0].length];
        for (int y = 0; y < a.length; y++) {
            for (int x = 0; x < b[0].length; x++) {
                for (int i = 0; i < a[0].length; i++) {
                    c[y][x] +=(a[y][i] *b[i][x]);
                }
            }
        }
        return c;
    }
}
---------------------------------------------------------------------------
public class Kata {
	
  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
    if (a[0].length != b.length)return null;
    
    double[][] sol = new double[a.length][b[0].length];
    
    for (int i = 0; i < a.length;i++){
     
      for (int j=0; j<b[0].length;j++){
        double res = 0;
         for (int k=0;k<a[0].length;k++){
          
           res+=a[i][k]*b[k][j];
           
         
         }
        sol[i][j]= res;
      
      }
      
    }
    return sol;
    
	}
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {

  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
		if (a[0].length != b.length) {
            return null;
        }
        double[][] product = IntStream.range(0, a.length)
                .mapToObj(i -> IntStream.range(0, b[0].length)
                        .mapToDouble(j -> IntStream.range(0, a[0].length)
                                .mapToDouble(k -> a[i][k] * b[k][j])
                                .sum())
                        .toArray())
                .toArray(double[][]::new);
        return product;
	}
}
*/