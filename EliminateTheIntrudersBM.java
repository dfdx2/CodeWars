/* 7KYU CodeWars Eliminate The Intruders! Bit Manipulation

You are given a string representing a number in binary. Your task is 
to delete all the unset bits in this string and return the corresponding 
number (after keeping only the '1's).

In practice, you should implement this function:

public long eliminateUnsetBits(String number);

Examples

eliminateUnsetBits("11010101010101") ->  255 (= 11111111)
eliminateUnsetBits("111") ->  7
eliminateUnsetBits("1000000") -> 1
eliminateUnsetBits("000") -> 0

*/

public class SetBits {
    public static long eliminateUnsetBits(String number) {
      if (number.length() < 1) {
        return 0;
      }
      if (number == "") {
        return 0;
      }
      number = number.replaceAll("0", "");
      long result = Long.parseLong(number, 2);
      System.out.println(number);
      return result;
    }
  }
/*-------------------------------------------------------------------------
class SetBits {
  static long eliminateUnsetBits(String number) {
    return (1L << number.replace("0", "").length()) - 1;
  }
}
-----------------------------------------------------------------------------
public class SetBits {
  public static long eliminateUnsetBits(String number) {
        return number.isBlank() ? 0 : Long.parseLong(number.replace("0", ""), 2);
    }
}
-----------------------------------------------------------------------------
public class SetBits {
  public static long eliminateUnsetBits(String number) {
    number = number.replace("0", "");
        return number.isEmpty() ? 0 : Long.parseLong(number, 2);
  }
}
------------------------------------------------------------------------------
public class SetBits {
  public long eliminateUnsetBits(String number){
    int conta=0;
    for(int x=0;x<number.length();x++){
      if(number.charAt(x)=='1'){
        conta++;
      }
    }
    long salida = (long)(Math.pow(2,conta))-1;
    return salida;
  }
}




*/