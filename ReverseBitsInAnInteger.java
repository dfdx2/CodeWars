/* 7KYU CodeWars Reverse The Bits In An Integer

Write a function that reverses the bits in an integer.

For example, the number 417 is 110100001 in binary. Reversing 
the binary is 100001011 which is 267.

You can assume that the number is not negative.

*/
import static java.lang.Integer.*;
public class ReverseBitsInAnInteger {
  public static int reverseBits(int n){
    return parseInt(new StringBuilder(toBinaryString(n)).reverse() + "", 2);
  }
}
/*------------------------------------------------------------------------
import static java.lang.Integer.*;

interface BitsOfInteger {
  static int reverse_bits(int n) {
    return parseInt(new StringBuilder(toBinaryString(n)).reverse() + "", 2);
  }
}
--------------------------------------------------------------------------
public class BitsOfInteger {
  public static int reverse_bits(int n) {
    int r = 0;
    for (; n > 0; n >>= 1) r = (r << 1) | (n & 1);
    return r;
  }
}
--------------------------------------------------------------------------
import java.util.*;
import java.math.BigInteger;
public class BitsOfInteger{
  public static int reverse_bits(int number){
        String b = "";
        String cevrilmish_reqem = "";
        BigInteger rev_num;
        if (number == 0) {
            return 0;
        } else {
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<String> arr_son = new ArrayList<>();
            while (number != 0) {
                arr.add(number);
                number /= 2;
            }
            for (int i = 0; i < arr.size(); i++) {
                arr_son.add(String.valueOf(arr.get(i) % 2));
            }

            for (int i = arr_son.size() - 1; i >= 0; i--) {
                b += String.valueOf(arr_son.get(i));
            }
            char[] reqems = b.toCharArray();
            ArrayList<String> arr_reqems = new ArrayList<>();
            for (int i = reqems.length - 1; i >= 0; i--) {
                arr_reqems.add(String.valueOf(reqems[i]));
            }
            for (String arr_reqem : arr_reqems) {
                cevrilmish_reqem += arr_reqem;
            }
            rev_num=new BigInteger(cevrilmish_reqem);
            // STAT REVERSE 
            ArrayList<String> arr_ikinci = new ArrayList<>();
            int hesablama = 0;
            char[] reqemler = String.valueOf(rev_num).toCharArray();
            for (int i = reqemler.length - 1; i >= 0; i--) {
                arr_ikinci.add(String.valueOf(reqemler[i]));
            }
            String bs = "";
            for (String stirng : arr_ikinci) {
                bs += stirng;
            }
            for (int i = String.valueOf(rev_num).length() - 1; i >= 0; i--) {
                hesablama += Math.pow(2, i) * Integer.parseInt(String.valueOf(bs.charAt(i)));
            }
            return hesablama;
        }
  }
}
--------------------------------------------------------------------------
public class BitsOfInteger{
  public static int reverse_bits(int n){
    
        char[] bits = Integer.toBinaryString(n).toCharArray();
        String reversedBits = "";
    
        for(int i = bits.length-1; i >=0; i--)reversedBits += bits[i];
        
        return Integer.parseInt(reversedBits, 2);
  }
}
--------------------------------------------------------------------------
public class BitsOfInteger{
  public static int reverse_bits(int n){
    return Integer.parseInt(new StringBuilder().append(Integer.toBinaryString(n)).reverse().toString(), 2);
  }
}
--------------------------------------------------------------------------
public class BitsOfInteger{
  public static int reverse_bits(int n){
    return Integer.reverse(n) >>> Integer.numberOfLeadingZeros(n);
  }
}
--------------------------------------------------------------------------
public class BitsOfInteger{
  public static int reverseBits(int n){
      int start=0; 
      while(n!=0){ 
        start=start*2+(n%2);
        n=n/2;
      }
    return start;
  }
}

--------------------------------------------------------------------------
public class BitsOfInteger{
  public static int reverseBits(int n){
    //Your code here :)
    int i = 0;
    while(n > 0) {
      i<<=1;
      i += n & 1;
      n>>=1;
    }
    return i;
  }
}
*/