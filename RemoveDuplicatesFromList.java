/* 8KYU CodeWars Remove Duplicates From List

Define a function that removes duplicates from an array 
of non negative numbers and returns it as a result.

The order of the sequence has to stay the same.

Examples:

Input -> Output

[1, 1, 2] -> [1, 2]

[1, 2, 1, 1, 3, 2] -> [1, 2, 3]

*/
import java.util.*;
import java.util.Map.Entry;
public class RemoveDuplicatesFromList {
  public static int[] distinct(int[] array){
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < array.length; i++) {
      if (!map.containsKey(array[i])) {
        map.put(array[i], 1);
      }
      else {
        int total = map.get(array[i]);
        map.put(array[i], total + 1);
      }
    }
    int count = 0;
    int[] result = new int[map.size()];
    for(Entry<Integer, Integer> entry: map.entrySet()) {
      result[count] = entry.getKey();
      count++;
    }
    return result;
  }
}
/*-------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] distinct(int[] array){
        List<Integer> output = new ArrayList<>();
        for (int x : array){
            boolean present = false;
            for (int y :output){
                if (y==x){
                    present = true;
                    break;
                }
            }
            if (!present){
                output.add(x);
            }
        }
        int[] outputList = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            outputList[i] = output.get(i);
        }
        return outputList;
    }
  }
---------------------------------------------------------------------------------
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Solution {
  public static int[] distinct(int[] array){
      LinkedHashSet<Integer> set = new LinkedHashSet<>();
      for(int number : array) {
        set.add(number);
      }
    
     Integer[] integerArray = set.toArray(new Integer[0]);
     int[] resultArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            resultArray[i] = integerArray[i];
        }
        
        return resultArray;
  }
}
---------------------------------------------------------------------------------
public class Solution {
  public static int[] distinct(int[] array){
      // your solution here
      return java.util.stream.IntStream.of(array).distinct().toArray();
  }
}
---------------------------------------------------------------------------------
import java.util.ArrayList;

public class Solution {
  public static int[] distinct(int... numbers) {
      var resultList = new ArrayList<Integer>();

      // Iterate over the array
      for (var number : numbers) {
          // If the number has not been seen, add it to the result list
          if (!resultList.contains(number)) {
              resultList.add(number);
          }
      }

      // Convert the result list back to an array
      var size = resultList.size();
      var resultArray = new int[size];
      for (int i = 0; i < size; i++) {
          resultArray[i] = resultList.get(i);
      }

      return resultArray;
  }
}
---------------------------------------------------------------------------------
import java.util.ArrayList;
public class Solution {
  public static int[] distinct(int[] array){
    if(array.length == 0)
            return array;
              ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(array[0]);
        for(int num: array){
            if(!(nums.contains(num))){
                nums.add(num);}}
        int[] result = new int[nums.size()];
        for(int num: nums){
            result[nums.indexOf(num)] = num;
        }
        
        return result;
  }
}
---------------------------------------------------------------------------------
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Solution {
  public static int[] distinct(int[] array){
      Set<Integer> set = new HashSet<>();
					List<Integer> resultList = new ArrayList<>();

					for (int num : array) {
						if (!set.contains(num)) {
							set.add(num);
							resultList.add(num);
						}
					}

					int[] result = new int[resultList.size()];
					for (int i = 0; i < resultList.size(); i++) {
						result[i] = resultList.get(i);
					}

					return result;
  }
}
---------------------------------------------------------------------------------
import java.util.*;

public class Solution {
  public static int[] distinct(int[] array){
      // your solution here
      return Arrays.stream(array).distinct().toArray();
  }
}

*/