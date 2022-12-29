/* 7KYU CodeWars The Highest Profit Wins!

Story
Ben has a very simple idea to make some profit: he buys 
something and sells it again. Of course, this wouldn't 
give him any profit at all if he was simply to buy and sell 
it at the same price. Instead, he's going to buy it for the 
lowest possible price and sell it at the highest.

Task

Write a function that returns both the minimum and maximum 
number of the given list/array.

Examples (Input --> Output)
[1,2,3,4,5] --> [1,5]
[2334454,5] --> [5,2334454]
[1]         --> [1,1]

Remarks

All arrays or lists will always have at least one element, so you 
don't need to check the length. Also, your function will always 
get an array or a list, you don't have to check for null, undefined 
or similar.

*/

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
      Arrays.sort(arr);
      int[] result = new int[2];
      result[0] = arr[0];
      result[1] = arr[arr.length - 1];
      return result;
    }
}
/*---------------------------------------------------------
import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
         Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
--------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
    
    int min = Integer.MAX_VALUE; 
    int max = Integer.MIN_VALUE; 
    for(int i : arr) {         
        if(i < min) min = i;      
        if(i > max) max = i;     
    }
    return new int[] {min, max};
}
}
-----------------------------------------------------------------
import java.util.*;
class MinMax {
    public static int[] minMax(int[] arr) {
       return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }
}
-------------------------------------------------------------------
class MinMax {
    public static int[] minMax(int[] arr) {
        int[] numbers=new int [2];
        numbers[0]=arr[0];
        numbers[1]=arr[0];
        for (int i=1;i<arr.length;i++){
            if (numbers[0]>arr[i]) numbers[0]=arr[i];
            if (numbers[1]<arr[i]) numbers[1]=arr[i];
        }
        return numbers;
    }
}
------------------------------------------------------------------
class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = min;
        for (int i : arr) {
           min = Math.min(i, min);
           max = Math.max(i, max);
        }
        return new int[] { min, max };
    }
}
-----------------------------------------------------------------
import java.util.stream.IntStream;

class MinMax {
    public static int[] minMax(int[] arr) {
        return (arr == null || arr.length == 0)
                ? new int[0]
                : new int[]{IntStream.of(arr).min().getAsInt(), IntStream.of(arr).max().getAsInt()};
    }
}



*/