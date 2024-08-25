/* 7KYU CodeWars Single Digit

The goal of this Kata is to reduce the passed integer to a 
single digit (if not already) by converting the number to 
binary, taking the sum of the binary digits, and if that 
sum is not a single digit then repeat the process.

If the passed integer is already a single digit there is 
no need to reduce

For example given 5665 the function should return 5:

5665 --> (binary) 1011000100001
1011000100001 --> (sum of binary digits) 5

Given 123456789 the function should return 1:

123456789 --> (binary) 111010110111100110100010101
111010110111100110100010101 --> (sum of binary digits) 16
16 --> (binary) 10000
10000 --> (sum of binary digits) 1

*/
import static java.util.stream.IntStream.iterate;
class SingleDigit {
  static int singleDigit(int n) {
    return iterate(n, Integer::bitCount).filter(i -> i < 10).findFirst().orElse(0);
  }
}
/*--------------------------------------------------------------------------
class Kata {
   
  static int singleDigit(int n) {
    return n < 10 ? n : singleDigit(Integer.bitCount(n));
  }
  
}
----------------------------------------------------------------------------
class Kata {   
  static int singleDigit(int n) {
    int result = n;
    String bin = Integer.toBinaryString(result);
    while ((result + "").length() > 1){
      result = 0;
      for (String i: bin.split("")){
        if (i.equals("1")){
          result ++;
        }
      }
      bin = Integer.toBinaryString(result);
    }
    return result;
  }
}
----------------------------------------------------------------------------
class Kata {
  static int singleDigit(int n) {
    while (n > 9)
      n = Integer.bitCount(n);
    return n;
  }
}
----------------------------------------------------------------------------
class Kata {
   
  static int singleDigit(int n) {
    while (String.valueOf(n).length() > 1){
      var bin = Integer.toBinaryString(n);    
      int sum = 0;
      for (var x : String.valueOf(bin).split("")){
        sum += Integer.valueOf(x);
      }
      if (String.valueOf(sum).length() == 1){
        return sum;
      }
      else{
        n = sum+0;
      }
    }
    return n;
  }
}
----------------------------------------------------------------------------
class Kata {
  static int singleDigit(int n) {
    while (n > 9)
      n = (int) Integer.toBinaryString(n).chars().filter(c -> c == '1').count();
    return n;
  }
}
----------------------------------------------------------------------------
public class Kata {   
  public static int singleDigit(int n) {
    if (n < 10) return n;
    return singleDigit(reduce(n));
  }
  
  public static int reduce(int n) {
    return Integer.toBinaryString(n).chars()
                  .map(Character::getNumericValue)
                  .sum();
  }
}
----------------------------------------------------------------------------
interface Kata {
  static int singleDigit(int n) {
    return n > 9 ? singleDigit(Integer.bitCount(n)) : n;
  }
}
*/