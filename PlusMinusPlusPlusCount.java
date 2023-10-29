/* 7KYU CodeWars Plus - Minus - Plus - Plus - ___ - Count

Count how often sign changes in array.

result
number from 0 to ... . Empty array returns 0

example
const arr = [1, -3, -4, 0, 5];


| elem | count |
|------|-------|
|  1   |  0    |
| -3   |  1    |
| -4   |  1    |
|  0   |  2    |
|  5   |  2    |

catchSignChange(arr) == 2;

*/

public class Solution {

  public static int signChange(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] >= 0 && arr[i + 1] < 0 || arr[i] < 0 && arr[i + 1] >= 0) {
        result++;
      }
    }
    return result;
  }
}
/*------------------------------------------------------------------------------
public class Solution {

  public static int signChange(int[] arr) {
    int count = 0;
    for (int i = 1; i < arr.length; i++) {
      if ((arr[i] >= 0 && arr[i - 1] < 0)||(arr[i] < 0 && arr[i - 1] >= 0)) count++;
    }
    return count;
  }

}
--------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Solution {
  static int signChange(int[] arr) {
    return range(1, arr.length).map(i -> (arr[i] ^ arr[i - 1]) < 0 ? 1 : 0).sum();
  }
}
---------------------------------------------------------------------------------
public class Solution {

  public static int signChange(int[] arr) {
        int count = 0;
        
        if(arr.length < 2){
            return count;
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] < 0 && arr[i] >= 0){
                count++;
            }else if (arr[i-1] >= 0 && arr[i] < 0){
                count++;
            }
        }
        return count;
    }

}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {
  public static int signChange(int[] arr) {
    return (int) IntStream.range(0, arr.length - 1).filter(i -> (arr[i] ^ arr[i + 1]) < 0).count();
  }
}
---------------------------------------------------------------------------------
*/