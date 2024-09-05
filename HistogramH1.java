/* 7KYU CodeWars Histogram H1      

A 6-sided die is rolled a number of times and the results 
are plotted as a character-based histogram.

Example:

6|##### 5
5|
4|# 1
3|########## 10
2|### 3
1|####### 7

Task

You will be passed the dice value frequencies, and your task 
is to write the code to return a string representing a histogram, 
so that when it is printed it has the same format as the example.

Notes

There are no trailing spaces on the lines
All lines (including the last) end with a newline \n
A count is displayed beside each bar except where the count is 0
The number of rolls may vary but there are never more than 100

*/

public class HistogramH1 {
  public static String histogram(final int results[]) {
    StringBuilder sb = new StringBuilder();
    for (int i = results.length - 1; i >= 0; i--) {
      sb.append(i + 1).append("|");
      if (results[i] != 0) {
        sb.append("#".repeat(results[i])).append(" ").append(results[i]);
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
/*------------------------------------------------------------------------
public class Dinglemouse {

  public static String histogram(final int results[]) {
  	String result = "";
  	for (int i = results.length - 1; i >= 0; i--){
    	result += i+1 + "|";
      if (results[i] == 0) result += "\n";
      else {
        for (int x = results[i]; x > 0; x--) {
          result += "#";
        }
        result += " " + results[i] + "\n";
      }
    }
    return result;
  }
  
}
--------------------------------------------------------------------------
public class Dinglemouse {
  public static String histogram(final int M []) { 
     StringBuilder sb = new StringBuilder();
     for (int i=5;i>=0;i--){   
         sb.append((i+1)+"|"); 
         if(M[i]!=0)sb.append("#".repeat(M[i])+" "+M[i]); 
         sb.append("\n");
       }
      return sb.toString();
    }
}
--------------------------------------------------------------------------
public class Dinglemouse {
  public static String histogram(final int results[]) {
    StringBuilder result = new StringBuilder();
    for (int i = results.length - 1; i >= 0; i--) {
      result.append(i + 1)
        .append('|')
        .append(results[i] == 0 ? "" : "#".repeat(results[i]))
        .append(results[i] == 0 ? "" : " " + results[i])
        .append("\n");
    }
    return result.toString();
  }
}
--------------------------------------------------------------------------
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Dinglemouse {

  public static String histogram(final int results[]) {
    return IntStream.iterate(5, i -> i >= 0, i -> --i)
                    .mapToObj(i -> createHistBar(i + 1, results[i]))
                    .collect(joining());
  }
  
  private static String createHistBar(int val, int freq) {
    return String.format("%d|%s", val, "#".repeat(freq)) 
                      + (freq != 0 ? " " + freq : "") + "\n";
  }
}
--------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dinglemouse {

  public static String histogram(final int results[]) {
    return IntStream.iterate(results.length, i -> i > 0, i -> i - 1)
				.mapToObj(e -> e + "|" + "#".repeat(results[e - 1]) + (results[e - 1] != 0 ? " " + results[e - 1] + "\n" : "\n"))
				.collect(Collectors.joining());
  }
}
--------------------------------------------------------------------------
public class Dinglemouse {

  public static String histogram(final int results[]) {
    String var = "";
    for (int i = 5; i>-1; i--){
      var += (i+1)+"|"+ "#".repeat(results[i]) + (results[i] == 0 ? "" : " "+results[i]) + "\n";
    }
    return var;
  }
}

--------------------------------------------------------------------------
public class Dinglemouse {
    
    static String repeat(String target, int times) {
        
        if(times < 0){
            throw new IllegalArgumentException("Times can not be negative!");
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(times-- > 0){
            sb.append(target);
        }
        
        return sb.toString();
    }

    public static String histogram(final int results[]) {
        
        String res = "";
        
        for(int i=results.length-1;i>=0;i--){
            int curFrequency = results[i];
            String curBar = (i + 1) + "|" + repeat("#", curFrequency);
            if(curFrequency > 0){
                curBar += " " + curFrequency;
            }
            curBar += "\n";
            res += curBar;
        }
        
        return res;
    }
  
}
--------------------------------------------------------------------------
public class Dinglemouse {

  public static String histogram(final int results[]) {
    String histogram = "";
    
    for(int i = results.length; i >= 1; i--) {
      histogram += i + "|" + generateLine(results[i - 1]) + "\n";
    }
    
    return histogram;
  }
  
  static String generateLine(int rolls) {
    if (rolls == 0) {
      return "";
    }
    
    String side = "";

    for(int i = 0; i < rolls; i++) {
      side += "#";
    }
    
    return side + " " + rolls;
  }
}

*/