/* 7KYU CodeWars Remove The Minimum

The museum of incredibly dull things
The museum of incredibly dull things wants to get rid of some exhibits. Miriam, the interior architect, comes up with a plan to remove the most boring exhibits. She gives them a rating, and then removes the one with the lowest rating.

However, just as she finished rating all exhibits, she's off to an important fair, so she asks you to write a program that tells her the ratings of the exhibits after removing the lowest one. Fair enough.

Task
Given an array of integers, remove the smallest value. Do not mutate the original array/list. If there are multiple elements with the same value, remove the one with the lowest index. If you get an empty array/list, return an empty array/list.

Don't change the order of the elements that are left.

Examples
* Input: [1,2,3,4,5], output = [2,3,4,5]
* Input: [5,3,2,1,4], output = [5,3,2,4]
* Input: [2,2,1,2,1], output = [2,2,2,1]




*/
import java.util.Arrays;
public class Remover {

  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length < 1) {
      return numbers;
    }
    int[] n = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      n[i] = numbers[i];
    }
    Arrays.sort(n);
    int j = n[0];
    int o = 0;
    int count = 0;
    int[] result = new int[n.length - 1];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == j && o == 0) {
        o++;
        continue;
      }
      else {
        result[count] = numbers[i];
        count++;       
      }
    }
    return result;
  }
}
/*---------------------------------------------------------------
import java.util.Arrays;

public class Remover {

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length <= 1) {
            return new int[0];
        }

        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        int[] result = new int[numbers.length - 1];
        

        System.arraycopy(numbers, 0, result, 0, minIndex);
        

        System.arraycopy(numbers, minIndex + 1, result, minIndex, numbers.length - minIndex - 1);
        
        return result;
    }
}
------------------------------------------------------------------
public class Remover {

  public static int[] removeSmallest(int[] numbers) {
    if(numbers.length == 0){
      return new int[0];
    }
    boolean flag = true;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < numbers.length; i++){
      min = min < numbers[i] ? min : numbers[i];
    }
    
    int[] array = new int[numbers.length - 1];
    for(int i = 0,l = 0; i < array.length; i++, l++){
      if(flag && numbers[i] == min){
        l++;
        flag = false;
      }
      array[i] = numbers[l];
    }
    return array;
  }
}
------------------------------------------------------------------
import java.util.*;
public class Remover {
  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length == 1) {
      return new int[0];
    }
    ArrayList<Integer> al = new ArrayList<Integer>();
    int smallest = 99999999;
    boolean remove = true;
    for (int i: numbers) {
      if (smallest > i) {
        smallest = i;
      }
    }
    for (int i: numbers) {
      if (remove == true && i == smallest) {
        remove = false;
      }
      else {
        al.add(i);
      }
    }
    return al.stream().mapToInt(Integer::intValue).toArray();
  }
}
-----------------------------------------------------------------
public class Remover {
  

  public static int[] removeSmallest(int[] numbers) {
    
    if(numbers.length==0) return new int[]{};

     int o=0;
     int min_index=idx_min(numbers);
    
    int[] y=new int [numbers.length-1];
    for(int i=0;i<numbers.length;i++)
      {
      if(i==min_index) continue;
      y[o]=numbers[i];
      o++;
    }
      

    return y;
    
  } // the end of the remove mehtod
  
  
      public static int idx_min(int []arr)
    {
  
    int min=min(arr);
      int i;
    for(i=0;i<arr.length;i++)
    {
      if(arr[i]==min)
      break;
    }
    return i;
    }
  
    public static int min(int[]arr)
    {
      int min =arr[0];
      for(int u:arr) 
        {
        if(u<min) min=u;
        
      }
      return min;
      
    }
    
    
  }
---------------------------------------------------------------------
public class Remover {

  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length < 1) {
      return new int[0];
    }
    
    int minIndex = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < numbers[minIndex]) {
        minIndex = i;
      }
    }
    int[] result = new int[numbers.length - 1];
    System.arraycopy(numbers, 0, result, 0, minIndex);
    System.arraycopy(numbers, minIndex + 1, result, minIndex, numbers.length - minIndex - 1);

    return result;
  }
}
-------------------------------------------------------------------
public class Remover {

  public static int[] removeSmallest(int[] numbers) {
    if(numbers.length == 0) return new int[]{};
    int res[] = new int[numbers.length -1];
    int idx=0, count=0;
    for(int i =0; i<numbers.length; i++)if(numbers[i]<numbers[idx]) idx = i;
    for(int i=0; i<numbers.length; i++)if(i!=idx) res[count++] = numbers[i];
    return res;
  }
}
-------------------------------------------------------------------
import java.util.Arrays;

public class Remover {

  public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0){
            return new int[0];
        }
    
        int min = Arrays.stream(numbers).sorted().toArray()[0];
        int[] buf = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < buf.length; i++) {
            if (buf[i] == min) {
                buf[i] = -1;
                break;
            }
        }
        int[] result = new int[numbers.length - 1];
        int j = 0;
        for (int x : buf) {
            if (x != -1) {
                result[j++] = x;
            }

        }
        return result;
    }
}
-------------------------------------------------------------------
public class Remover {

    public static int[] removeSmallest(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return new int[0];
        }
        // Initialize minValue with the first element of the array
        int minValue = numbers[0];
        // Loop to find the smallest value
        for (int i = 1; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        // Create a new array that is one element smaller
        int[] copyArray = new int[numbers.length - 1];
        boolean found = false;
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] == minValue && !found) {
                found = true; // Skip the first occurrence of the minValue
            } else {
                // Copy the element to the new array
                copyArray[j++] = numbers[i];
            }
        }
        return copyArray;
    }
}
*/