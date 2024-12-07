/* 6KYU CodeWars +1 Array

Given an array of integers of any length, return an array that 
has 1 added to the value represented by the array.

If the array is invalid (empty, or contains negative integers or 
integers with more than 1 digit), return nil (or your language's 
equivalent).

Examples

Valid arrays

[4, 3, 2, 5] would return [4, 3, 2, 6] (4325 + 1 = 4326)
[1, 2, 3, 9] would return [1, 2, 4, 0] (1239 + 1 = 1240)
[9, 9, 9, 9] would return [1, 0, 0, 0, 0] (9999 + 1 = 10000)
[0, 1, 3, 7] would return [0, 1, 3, 8] (0137 + 1 = 0138)
Invalid arrays

[] is invalid because it is empty
[1, -9] is invalid because -9 is not a non-negative integer
[1, 2, 33] is invalid because 33 is not a single-digit integer

*/
public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr.length <= 0) {
          return null;
        }
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0 || arr[i] > 9) {
          return null;
        }
      }
      for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] < 9) {
          ++arr[i];
          return arr;
        }
        arr[i] = 0;
      }
      int[] result = new int[arr.length + 1];
      result[0] = 1;
      return result;
    }
}
/*--------------------------------------------------------------------------
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
----------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;

import java.math.BigInteger;

interface PlusOneArray {
  static int[] upArray(int[] arr) {
    return arr.length < 1 || of(arr).anyMatch(n -> n < 0 || n > 9) ? null :
        new BigInteger(of(arr).mapToObj(n -> n + "").collect(joining()))
            .add(BigInteger.ONE).toString().chars().map(c -> c - '0').toArray();
  }
}
----------------------------------------------------------------------------
import java.util.Arrays;
public class PlusOneArray {
    public static int[] upArray(final int[] baseArray) {
        if(isArrayInvalid(baseArray)){
            return null; 
        }
      
        for(int i = baseArray.length-1; i>=0;i--){

            if(baseArray[i]!=9){
                baseArray[i] = (baseArray[i] +1); 
                break;
            }
            else{
                    baseArray[i] = 0;
            }
           if(i==0)
           return(arrayAll9s(baseArray));
        }
       
      return baseArray;
    }

        public static boolean isArrayInvalid(int[] arrayToTest){
            if(arrayToTest.length == 0)
                return true;

            for(int j = 0; j<arrayToTest.length;j++){
                if(arrayToTest[j]<0||arrayToTest[j]>9){
                    return true;
                  }
              }
            return false;
            }
            
        
        public static int[] arrayAll9s(int[] array){
            int[] returnArray = new int[(array.length+1)];
            Arrays.fill(returnArray,0);
            returnArray[0] = 1;
            return returnArray;
        }
}
-----------------------------------------------------------------------------
public class PlusOneArray {
    public static int[] upArray(int[] x) { 
      int n =x.length; int min=9;
      if(n==0)return null;
      for(int i=n-1,j=0;i>=0;i--){
        if(x[i]>-1&&x[i]<10){
           min=Math.min(min,x[i]);
           if(i==n-1)x[i]++;
           int end =(x[i]+j)%10;
           j=x[i]/10;
           x[i]=end;
        }
        else return null;
      }
      int set [] = new int [n+1]; set[0]=1;
      return min==9?set:x;
    }
}
------------------------------------------------------------------------------
public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
         if (arr.length == 0) {
            return null;
        }

        int[] num = new int[arr.length];
        int carry = 1; // add 1 to last digit

        for (int i = arr.length - 1; i >= 0; i--) {
            // edge cases
            String snum = arr[i] + "";
            if (snum.contains("-") || snum.length() > 1) {
                return null;
            }

            int sum = arr[i];
            if (carry == 1) {
                sum++;
                carry = 0;

                // check 2 digit
                if (sum % 10 == 0) {
                    sum = 0;
                    carry = 1;
                }
            }
            num[i] = sum;
        }

        if (carry == 1) {
            int[] newnum = new int[arr.length + 1];
            newnum[0] = 1;
            for (int i = 0; i < num.length; i++) {
                newnum[i + 1] = num[i];
            }
            return newnum;
        }
        return num;
    }
}
-----------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr == null || arr.length == 0 || Arrays.stream(arr).mapToObj(Integer::toString).collect(Collectors.joining()).length() != arr.length) {
            return null;
        }
        int plus = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i] + plus;
            if (current > 9) {
                plus = 1;
                list.add(current % 10);
            } else {
                plus = 0;
                list.add(current);
            }
        }
        if (plus == 1) {
            list.add(1);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(list.size() - 1 - i);
        }
        return result;
    }
}
------------------------------------------------------------------------------
public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int plus = 1;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 0 || arr[i] >= 10) {
                return null;
            }

            arr[i] = (arr[i] + plus) % 10;
            if (arr[i] != 0) {
                plus = 0;
            }
        }

        if (plus == 1) {
            int[] newArray = new int[arr.length + 1];
            newArray[0] = plus;
            for (int i = newArray.length - 1; i > 0; i--) {
                newArray[i] = arr[i - 1];
            }
            return newArray;
        }

        return arr;
    }
}
-----------------------------------------------------------------------------
import java.math.BigInteger;
import java.util.*;
public class PlusOneArray {
  public static int[] upArray(int[] arr) {
    System.out.println(Arrays.stream(arr).boxed().toList());
    if (arr.length == 0){
      return null;
    }
    String[] str = new String[arr.length];
    for (var x = 0; x < arr.length; x++){
      if (arr[x] < 0 || arr[x] > 9){
        return null;
      }
      str[x] = String.valueOf(arr[x]);
    }
    String joinedStr = String.join("", str);
    BigInteger num = new BigInteger(joinedStr).add(BigInteger.ONE);
    var splt = String.valueOf(num).split("");
    int[] result = new int[splt.length];
    for (var x = 0; x < splt.length; x++){
      System.out.println(Arrays.stream(result).boxed().toList());
      result[x] = Integer.valueOf(splt[x]);
    }
    System.out.println(Arrays.stream(result).boxed().toList());
    return result;
  }
}
------------------------------------------------------------------------------
import java.math.BigInteger;
public class PlusOneArray {
  public static int[] upArray(final int[] arr) {
    if (arr.length == 0) {
      return null;
    }
    String strnum = "";
    for (int i: arr) {
      if (i < 0 || i > 9) {
        return null;
      }
      else {
        strnum += i + "";
      }
    }
    strnum = new BigInteger(strnum).add(BigInteger.ONE) + "";
    int[] result = new int[strnum.length()];
    for (int i = 0; i < result.length; i ++) {
      result[i] = Integer.parseInt(strnum.split("")[i]);
    }
    return result;
  }
}
------------------------------------------------------------------------------
import java.util.*;
import java.math.BigInteger;
public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr.length==0) return null;
        for (int a: arr) if (a>9||a<0) return null;

        StringBuilder str = new StringBuilder();

        for (Integer a: arr) str.append(a);

        BigInteger num = new BigInteger(str.toString()).add(BigInteger.ONE);

        str = new StringBuilder(num.toString());

        int[] fArr = new int[str.length()];

        for (int i=0; i<fArr.length; i++)
            fArr[i]=Character.getNumericValue(str.charAt(i));
            return fArr;
    }
}
*/