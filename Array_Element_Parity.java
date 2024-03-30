/* 7KYU CodeWars Array Element Parity

In this Kata, you will be given an array of integers whose 
elements have both a negative and a positive value, except 
for one integer that is either only negative or only positive. 
Your task will be to find that integer.

Examples:

[1, -1, 2, -2, 3] => 3

3 has no matching negative appearance

[-3, 1, 2, 3, -1, -4, -2] => -4

-4 has no matching positive appearance

[1, -1, 2, -2, 3, 3] => 3

(the only-positive or only-negative integer may appear more than once)

Good luck!

*/
import java.util.*;
class Solution{
    public static int solve(int [] arr){
      int result = 0;
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
        if (!map.containsKey(arr[i])) {
          map.put(arr[i], 1);
        }
        else {
          int total = map.get(arr[i]);
          map.put(arr[i], total + 1);
        }
      }
      for (int i = 0; i < arr.length; i++) {
        int a = arr[i];
        int b = -a;
        if (map.containsKey(a) && map.containsKey(b)) {
          continue;
        }
        else {
          result = arr[i];
        }
      }
      return result;
    }
}
/*--------------------------------------------------------------------
import java.util.Arrays;

class Solution{
    public static int solve(int [] arr){
        return Arrays.stream(arr).distinct().sum();
    }
}
-----------------------------------------------------------------------
import static java.util.stream.IntStream.of;

interface Solution {
  static int solve(int[] arr) {
    return of(arr).distinct().sum();
  }
}
-----------------------------------------------------------------------
class Solution{
    public static int solve(int [] arr){
      int sol=0,count;
    //Iterate thru the array
      for(int i=0; i<arr.length; i++)
        {
        count=0;
        for(int j=0; j<arr.length; j++)
          {
          if(j==i)
            {
            if(j+1<arr.length)
              j++;
          }
          //Add each number to every number in the array 
          sol=arr[i]+arr[j];
          //find the one that does not have a value that = 0
          if(sol==0)
            {
            count=1;
          break;}
        }
        //return value that does not =0
        if(count==0)
          {
          return arr[i];
        }
      }
      return 0;
    }
}
-----------------------------------------------------------------------
import java.util.stream.*;

class Solution{
    public static int solve(int [] arr){
        return IntStream.of(arr)
          .boxed()
          .collect(Collectors.collectingAndThen(Collectors.toSet(), set -> set.stream()
                                                           .filter( num -> !set.contains(-num))
                                                           .findFirst()
                                                           .orElse(0)));
    }
}
-----------------------------------------------------------------------
class Solution{
    public static int solve(int [] arr){
      int a=0;
        for(int i=0;i<arr.length;i++)
            {
              for(int j=1;j<arr.length;j++)
              {
              if(arr[i]!=0 &&arr[i]+arr[j]==0)
                {
                  arr[i]=0;
                  arr[j]=0;
                }
             }
                if(arr[i]!=0)
                {
                  a=arr[i];
                 }
            }
     
      return a;
    }
}
-----------------------------------------------------------------------
import java.util.*;
class Solution{
  public static int solve(int [] arr){
    Set<Integer> set = new HashSet<Integer> ();
    for (var x : arr){
      if (set.contains(-x)){
        set.remove(-x);
      }
      else{
        set.add(x);
      }
    }
    Integer[] result = set.stream().toArray(Integer[]::new);
    return result[0];
  }
}
------------------------------------------------------------------------
import java.util.*;
class Solution{
  
    public static int solve(int [] arr){
      System.out.println(Arrays.toString(arr));
      int index=0;int count=1;boolean flag=false;
        for(int i=index+1;i<arr.length;i++)
          {
          if(arr[index]!=0)
            { 
           if(arr[i]!=0)
             {  
             
                  if(0>arr[index])
                      arr[index]*=-1;
                 else if(0<arr[index])
                    arr[index]*=-1;
               
               System.out.println(arr[index]+","+arr[i]);
                  if(arr[i]==arr[index])
                    {
                    
                    arr[i]=0;
                    arr[index]=0;
                    index++;
                    i=index;
                    count=1;
                  }
             else
               {
                if(0>arr[index])
                      arr[index]*=-1;
                 else if(0<arr[index])
                    arr[index]*=-1;
             }
             }
          }
          else
            {
            index++;
            i=index;
            }
          
        }
    
      return arr[index];
    }
}
------------------------------------------------------------------------
class Solution{
    public static int solve(int [] arr){
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int outerCurr = arr[i];
            boolean pairFound = false;
            inner: for (int j = 0; j < arr.length; j++) {
                int innerCurr = arr[j];
                if (outerCurr == -innerCurr) {
                    pairFound = true;
                    break inner; // No need to search further
                }
            }

            if (!pairFound) {
                index = i;
            }
        }

        return arr[index];
    }
}
*/