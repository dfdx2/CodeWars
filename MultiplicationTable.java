/* 6KYU CodeWars Multiplication Table

Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]


*/
import static java.util.stream.IntStream.rangeClosed;
public class MultiplicationTable {
  public static int [][] multiplicationTable(int n){
    return rangeClosed(1, n).mapToObj(i -> rangeClosed(1, n).map(j -> i * j).toArray()).toArray(int[][]::new);
  }
}
/*-------------------------------------------------------------------------
public class Multiplication{

      public static int[][] multiplicationTable(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        
        return array;
    }
  
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;
public class Multiplication{
  public static int [][] multiplicationTable(int n){
    return IntStream.rangeClosed(1, n).mapToObj(i -> IntStream.rangeClosed(1, n).map(j -> i * j).toArray()).toArray(int[][]::new);
  }
}

----------------------------------------------------------------------------
public class Multiplication{
    public static int[][] multiplicationTable(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[i][j] = (j + 1) * (i + 1);
            }
        }
        return res;
    }
}
-----------------------------------------------------------------------------
public class Multiplication{
  public static int [][] multiplicationTable(int n){
    int[][] table = new int[n][n];
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        table[i][j] = j+1+(j+1)*i;
      }
    }
    return table;
  }
}
-----------------------------------------------------------------------------
public class Multiplication{
  public static int [][] multiplicationTable(int n){
    		int matriz[][] = new int[n][n];
 		int cont = 1;
		
		for (int i = 0; i < matriz.length; i++) {
			
			int aumento = 1;
			for (int j = 0; j < matriz.length; j++) {

				matriz[i][0] = cont;
				
				matriz[i][j] = matriz[i][0] * aumento;
				aumento++;
				
			}
			cont++;
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		return matriz;
  }
}

-----------------------------------------------------------------------------
public class Multiplication{
  public static int [][] multiplicationTable(int n){
    int matrice[][] = new int[n][n];
    

    for(int i=0;i<matrice.length;i++){
      
      for(int j=0;j<matrice[i].length;j++){
      if(i>0){matrice[i][j]=matrice[i-1][j]+j+1;}else{ matrice[i][j]=j+1;}
      }
      
    }
    return matrice;
  }
}
-----------------------------------------------------------------------------
public class Multiplication {
  public static int [][] multiplicationTable(int n) {
    int[][] result = new int[n][n];
    for (int i = 1; i <= n; i ++) {
      int[] arr = result[i - 1];
      for (int i2 = 1; i2 <= n; i2 ++) {
        arr[i2 - 1] = i * i2;
      }
    }
    return result;
  }
}

*/