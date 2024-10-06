/* 7KYU CodeWars Odder Than The Requirements

Create a method that takes an array/list as an input, and outputs 
the index at which the sole odd number is located.

This method should work with arrays with negative numbers. 
If there are no odd numbers in the array, then the method should 
output -1.

Examples:

oddOne([2,4,6,7,10]) # => 3
oddOne([2,16,98,10,13,78]) # => 4
oddOne([4,-8,98,-12,-7,90,100]) # => 4
oddOne([2,4,6,8]) # => -1


*/
public class OdderThanTheRest{
  public static int oddOne(int[] arr){
    int result = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        return i;
      }
    }
    return result;
  }
}
/*------------------------------------------------------------------
public class Solution{
  public static int oddOne(int[] arr){
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==1 || arr[i]%2==-1)
        return i;
    }
    return -1;
  }
}
--------------------------------------------------------------------
public class Solution{
  public static int oddOne(int[] arr){
      for(int i = 0; i < arr.length; i++){
        if(Math.abs(arr[i]) % 2 == 1){
          return i;
        }
      }
    return -1;
  }
}
--------------------------------------------------------------------
public class Solution{
  public static int oddOne(int[] arr){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 != 0)
        return i;
    }
    return -1;
  }
}
--------------------------------------------------------------------
public class Solution{
  public static int oddOne(int[] arr){
    //put your lovely code here ^_^
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        return i; 
      }
    }
    return -1;
  }
}
--------------------------------------------------------------------
public class Solution{
  public static int oddOne(int[] arr){
    //put your lovely code here ^_^
    int result = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        result = i;
      } else {
        continue;
      }
    }
    
    return result;
  }
}
--------------------------------------------------------------------
public class Solution{
    public static int oddOne(int[] arr){
        int index = 0;
        for (int num : arr){
            if (Math.abs(num % 2) == 1) return index;
            index++;
        }
        return -1;
    }

}
--------------------------------------------------------------------
import java.util.Arrays;


public class Solution{
  public static int oddOne(int[] arr){
      for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
  }
}
--------------------------------------------------------------------
import java.util.stream.IntStream;
public class Solution{
  public static int oddOne(int[] arr){
    return IntStream.range(0, arr.length)
                    .filter(i -> arr[i] % 2 != 0)
                    .findAny()
                    .orElse(-1);
  }
}
--------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution{
  public static int oddOne(int[] arr){
    return IntStream.range(0, arr.length).filter(i -> (arr[i] & 1) == 1).findFirst().orElse(-1);
  }
}
*/