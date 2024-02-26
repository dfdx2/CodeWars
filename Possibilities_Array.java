/* 7KYU CodeWars Possibilities Array

A non-empty array a of length n is called an array of 
all possibilities if it contains all numbers between 
[0,a.length-1].Write a method named isAllPossibilities 
that accepts an integer array and returns true if the 
array is an array of all possibilities, else false.

Example:

a=[1,2,0,3]
a.length-1=3 
a includes [0,3] ,hence the function should return true


*/

import java.util.Arrays;
import static java.util.stream.IntStream.range;
public class Solution {
	public static boolean isAllPossibilities(int[] arg) {
    Arrays.sort(arg);
    return arg.length > 0 && range(0, arg.length).allMatch(i -> arg[i] == i);
	}
}
/*---------------------------------------------------------------
public class Solution {

	public static boolean isAllPossibilities(int[] arg) {
    if(arg.length==0) return false;
		java.util.Arrays.sort(arg);
    return arg[0]==0 && arg[arg.length-1]==arg.length-1;
	}

}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Solution {

	public static boolean isAllPossibilities(int[] arg) {
		IntSummaryStatistics iss = Arrays.stream(arg).summaryStatistics();
		return iss.getMin() == 0 && iss.getMax() == arg.length - 1;
	}

}
------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class Solution {

	public static boolean isAllPossibilities(int[] arg) {
		Set<Integer> s = Arrays.stream(arg).boxed().collect(Collectors.toSet());
    return arg.length > 0 && s.size() == arg.length &&
           0L == IntStream.range(0,arg.length)
                          .filter( n -> !s.contains(n) )
                          .count();
	}
}
-------------------------------------------------------------------
import java.util.*;
public class Solution {

	public static boolean isAllPossibilities(int[] arg) {
		Arrays.sort(arg);
    int[] p;
    if(arg.length == 0) {
      return false;
    } else {
    p = new int[arg.length];
      }
    for(int i = 0; i < p.length; i++) {
      p[i] = i;
    }
    int max = arg[0];
    for(int i = 0; i < arg.length; i++) {
      if(max <= arg[i]) {
        max = arg[i];
      }
    }
    
    return arg.length-1 == max && Arrays.equals(arg, p) ? true : false;
	}

}
-------------------------------------------------------------------
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Solution {
    public static boolean isAllPossibilities(int[] arg) {
        IntSummaryStatistics stats = IntStream.of(arg).summaryStatistics();
        return (stats.getMax() == arg.length - 1) && (stats.getMin() == 0);
    }
}
---------------------------------------------------------------------
public class Solution {

   public static boolean isAllPossibilities(int[] arg) {
		// Your code here...
    if(arg.length == 0)
      return false;
    sortArray(arg);
    for(int i = 0; i < arg.length; i++)
      if(arg[i] == i)
        continue;
      else
        return false;
        
    return true;
	}
  
  public static int[] sortArray(int[] inArray)
  {
     boolean sorted = false;

     while(!sorted)
     {
       sorted = true;
       int temp;
       for(int i = 0; i < inArray.length - 1; i++)
       {
          if(inArray[i] > inArray[i + 1])
          {
             sorted = false; // array is not yet sorted
             temp = inArray[i];
             inArray[i] = inArray[i + 1];
             inArray[i + 1] = temp;
          }
       }
     }
     return inArray;
  } //END sortArray
  

}
--------------------------------------------------------------------
public class Solution {
	public static boolean isAllPossibilities(int[] arg) {
    if(arg.length==0) return false;
		for(int i=0;i<arg.length;i++){
      for(int q=0;q<arg.length;q++){
        if(arg[q]==i) break;
        if(q==arg.length-1) return false;
      }
    }
    return true;
	}
}
-------------------------------------------------------------------
import java.util.stream.*;

public class Solution {

	public static boolean isAllPossibilities(int[] arg) {
		return arg.length <= 0 ? false : IntStream
      .range(0, arg.length)
      .allMatch(x -> 
        IntStream.of(arg).boxed().collect(Collectors.toList()).contains(x));
	}

}
-------------------------------------------------------------------
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Solution {
    public static boolean isAllPossibilities(int[] arg) {
        IntSummaryStatistics stats = IntStream.of(arg)
            .distinct()
            .summaryStatistics();
        return arg.length != 0
            && (stats.getCount() == arg.length)
            && (stats.getMax() < arg.length)
            && (stats.getMin() >= 0);
    }
}
*/