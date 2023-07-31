/* 7KYU CodeWars Sum A List But Ignore Any Duplicates

Please write a function that sums a list, but ignores any duplicate items in the list.

For instance, for the list [3, 4, 3, 6] , the function should return 10.

*/

import java.util.*;

public class Solution{
    public static int sumNoDuplicates(int[] arr){
      //Put your code here ʌ_ʌ
      int result = 0;
      Map<Integer, Integer> ans = new HashMap<>();
      for (int i : arr) {
        if (!ans.containsKey(i)) {
          ans.put(i, 1);
        }
        else {
          int total = ans.get(i);
          ans.put(i, total + 1);
        }
      }
        for (Map.Entry<Integer, Integer> item : ans.entrySet()) {
          if ((int)item.getValue() < 2) {
            result += item.getKey();
          }
        }
     // System.out.println(arr);
      return result;
    }
}
/*-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution{
    public static int sumNoDuplicates(int[] arr){
      Set<Integer> setOfDuplicates = new HashSet<>();
      Set<Integer> setOfUniques = new HashSet<>();
        
      for (int i : arr){
            if (!setOfUniques.add(i)){
                setOfDuplicates.add(i);
            }
      }
        
      return Arrays.stream(arr).filter(i -> !setOfDuplicates.contains(i)).sum();
    }
}
-------------------------------------------------------------------------------
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

interface Solution {
  static int sumNoDuplicates(int[] arr) {
    return of(arr).boxed().collect(groupingBy(i -> i, counting())).entrySet()
            .stream().mapToInt(e -> e.getValue() > 1 ? 0 : e.getKey()).sum();
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
  public static int sumNoDuplicates(int[] arr) {
    return Arrays.stream(arr)
      .boxed()
      .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
      .entrySet()
      .stream()
      .mapToInt(e -> e.getValue() == 1 ? e.getKey() : 0)
      .sum();
  }
}
-------------------------------------------------------------------------
import java.util.ArrayList;
public class Solution{
    public static int sumNoDuplicates(int[] arr){
	  int result = 0;
	  for(int i = 0; i < arr.length; i++) {
		  int count = 0;
      for(int j = 0; j < arr.length; j++) {
          if(arr[i] == arr[j]) {
            count++;
          }
      }
      if(count == 1) {
        result += arr[i];
      }
	  }
	  return result;
    }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class Solution{
    public static int sumNoDuplicates(int[] arr){
      //Put your code here ʌ_ʌ
      int sum = 0;
      
      for(int i = 0; i < arr.length; i++) {
        int currentNum = arr[i];
        for(int j = 0; j < arr.length; j++) {
          if(j != i)
            if(currentNum == arr[j]) {
              arr[i] = 0;
              arr[j] = 0;
            }
        }
        sum += arr[i];
      }
      
      return sum;
    }
}
-------------------------------------------------------------------------
import java.util.*;

public class Solution{
  public static int sumNoDuplicates(int[] nums){
    Map<Integer, Integer> counts = new HashMap<>();
    
    for (int num: nums) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }
    
    return (int) counts
      .entrySet()
      .stream()
      .filter(e -> e.getValue() == 1)
      .mapToInt(e -> e.getKey())
      .sum();
  }
}
---------------------------------------------------------------------------
import java.util.Set;
import java.util.HashSet;

public class Solution{
    public static int sumNoDuplicates(int[] arr){
      
      
        Set<Integer> uniqueNums = new HashSet<>();
        Set<Integer> repeatedNums = new HashSet<>();
        for (int num : arr) {
            if (!uniqueNums.add(num)) { 
                repeatedNums.add(num); 
            }
        }
        uniqueNums.removeAll(repeatedNums); 
        int sum = 0;
        for (int num : uniqueNums) {
            sum += num; 
        }
        return sum;
      
      
    }
}



*/