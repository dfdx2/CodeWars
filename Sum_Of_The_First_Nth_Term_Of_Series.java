/* 7KYU CodeWars Sum Of The First Nth Term Of Series

Task
Your task is to write a function which returns the n-th term 
of the following series, which is the sum of the first n terms 
of the sequence (n is the input parameter).

You will need to figure out the rule of the series to complete this.

Rules
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return "0.00".

You will only be given Natural Numbers as arguments.

Examples (Input --> Output)
n
1 --> 1 --> "1.00"
2 --> 1 + 1/4 --> "1.25"
5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"

*/

import static java.util.stream.IntStream.range;
public class NthSeries {
	public static String seriesSum(int n) {
		return String.format("%.2f", range(0, n).mapToDouble(num -> 1. / (num * 3 + 1)).sum());	
	}
}
/*----------------------------------------------------------------------
public class NthSeries {
	
	public static String seriesSum(int n) {
		
    double sum = 0.0;
    for (int i = 0; i < n; i++)
      sum += 1.0 / (1 + 3 * i);
    
    return String.format("%.2f", sum);
    
	}
}
-------------------------------------------------------------------------
import java.util.stream.IntStream;

public class NthSeries {
	
	public static String seriesSum(int n) {
        return String.format("%.2f", IntStream.range(0, n).mapToDouble(num -> 1.0 / (1 + num * 3)).sum());
    }
}
------------------------------------------------------------------------
public class NthSeries {
	
	public static String seriesSum(int n) {
    double sum = 0;
    for (int i = 1; i < n*3; i+=3) {
      sum += 1.0/i;
    }
    return String.format("%.2f", sum);
	}
}
-------------------------------------------------------------------------
import java.text.DecimalFormat;
public class NthSeries {
	public static String seriesSum(int n) {
    DecimalFormat df = new DecimalFormat("0.00");
		// Happy Coding ^_^	
    double result = 0;
    for(int i = 1;i<=n;i++){
      result = result + 1.0/(3*i-2);
    }
    return df.format(result);
	}
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class NthSeries {
	
	public static String seriesSum(int n) {
    return String.format("%.2f", IntStream.range(0, n).mapToDouble(x -> 1.0 / (3 * x + 1)).sum());
	}
}
-------------------------------------------------------------------------
import java.util.*;
public class NthSeries {
	
	public static String seriesSum(int n) {
		// Happy Coding ^_^		
    double sum=0.0;
    while(n>0){
        sum+=1.0/(3*n-2);
        n--;
    }
    return String.format("%.2f",sum ).toString();
	}
}
-------------------------------------------------------------------------
public class NthSeries {
	
	public static String seriesSum(int n) {
		String sum;
    double summo = 1 , x = 4;
        for (int i = 1; i < n; i++) {
            summo = summo + 1 / x;
            x = x + 3;
        }
        summo = (double) Math.round(summo * 100) / 100;
        sum = "" + summo;
        while(sum.length() < 4)
          sum += "0" ;
        return sum;		
	}
}
-------------------------------------------------------------------------
public class NthSeries {
	
	public static String seriesSum(int n) {
    float result = 1;
    
    for(int i = 4; i < n * 3; i += 3){
      result += 1.0f / i; 
    }
    
    return n > 0 ? String.format("%.2f", result) : "0";
	}
  
}
*/