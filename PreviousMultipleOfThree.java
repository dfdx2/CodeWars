/* 7KYU CodeWars Previous Multiple Of Three

Given a positive integer n: 0 < n < 1e6, remove the last digit until you're 
left with a number that is a multiple of three.

Return n if the input is already a multiple of three, and if no such number 
exists, return null, a similar empty value, or -1.

Examples
1      => null
25     => null
36     => 36
1244   => 12
952406 => 9

*/

public class Kata {
    public static Integer prevMultOfThree(int n){
      //your solution
      int result = 0;
      while (n > 0) {
        if (n % 3 == 0) {
          return n;
        }
        else {
          result = n % 10;
          n = n / 10;
        }
      }
      return (result >= 3) ? result : null;
    }
}
/*---------------------------------------------------------------------------
public class Kata {
  
  public static Integer prevMultOfThree(int n) {
    for (; n > 0; n /= 10)
      if (n % 3 == 0) return n;
  
    return null;
  }
  
}
-----------------------------------------------------------------------
interface Kata {
  static Integer prevMultOfThree(Integer n) {
    return n % 3 == 0 ? n : n > 10 ? prevMultOfThree(n / 10) : null;
  }
}
------------------------------------------------------------------------
public class Kata {
  public static Integer prevMultOfThree(int n){
    Integer result = Integer.valueOf(n);
    String resultStr = result + "";
    int resultLen = resultStr.length();
      while (resultLen != 1){
        System.out.println(resultLen);
        if (result % 3 == 0){
          return result;
        }
        else{
          String shorterResult = resultStr.substring(0, resultLen - 1);
          result = Integer.parseInt(shorterResult);
        }
        if (result == 9){
          return result;
        }
        resultLen --;
      }
      if (resultLen == 1){
        return null;
      }
      else{
        return result;
      } 
  }
}
---------------------------------------------------------------------------
public class Kata {
    public static Integer prevMultOfThree(int n){
      
      while(n > 0) {
        if(n/3 == n/3.0) return n;
        n = n/10;
      }     
      
      return null;
    }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  
  public static Integer prevMultOfThree(int n) {
    return IntStream.iterate(n, i -> i > 0, i -> i / 10)
                    .filter(i -> i % 3 == 0)
                    .boxed()
                    .findFirst()
                    .orElse(null);
  }
}

*/