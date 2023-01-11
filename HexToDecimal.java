/*  8KYU CodeWars   Hex To Decimal

Complete the function which converts hex number 
(given as a string) to a decimal number.

*/

public class Kata {

  public static int hexToDec(final String hexString) {
    return Integer.parseInt(hexString, 16);
  }
}
/*------------------------------------------------------------------
public class HexToDecimal {

  public static int hexToDec(final String hexString) {
    // Your code here
    int decimal = (Integer.parseInt(hexString,16));
    return decimal;
  }
  
}
-------------------------------------------------------------------
public class Kata {
  public static int hexToDec(final String hexString) {
    int sign = (hexString.charAt(0)=='-' ? -1 : 1);
    String tmp = (sign == 1 ? hexString : hexString.substring(1));
    int i = tmp.length();
    int res = 0; int p = 1;
    while (i-->0) {
      int c = tmp.charAt(i);
      if ('A' <= c && c <= 'Z')
        c = c - 'A' + 10;
      else if ('a' <= c && c <= 'z')
        c = c - 'a' + 10;
      else
        c = c - '0';
      res = res + c * p;
      p <<= 4;
    }
    return sign * res;
  } 
}
-----------------------------------------------------------------
public class Kata {

  public static int hexToDec(final String hexString) {
    return parseInt(hexString, 16);
  }
  
  public static int parseInt(String s, int radix)
            throws NumberFormatException {
        if (s == null) {
            throw new NumberFormatException("null");
        }

        if (radix < Character.MIN_RADIX) {
            throw new NumberFormatException("radix " + radix +
                    " less than Character.MIN_RADIX");
        }

        if (radix > Character.MAX_RADIX) {
            throw new NumberFormatException("radix " + radix +
                    " greater than Character.MAX_RADIX");
        }

        boolean negative = false;
        int i = 0, len = s.length();
        int limit = -Integer.MAX_VALUE;

        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') { // Possible leading "+" or "-"
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+') {
                    throw NumberFormatException.forInputString(s);
                }

                if (len == 1) { // Cannot have lone "+" or "-"
                    throw NumberFormatException.forInputString(s);
                }
                i++;
            }
            int multmin = limit / radix;
            int result = 0;
            while (i < len) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                int digit = Character.digit(s.charAt(i++), radix);
                if (digit < 0 || result < multmin) {
                    throw NumberFormatException.forInputString(s);
                }
                result *= radix;
                if (result < limit + digit) {
                    throw NumberFormatException.forInputString(s);
                }
                result -= digit;
            }
            return negative ? result : -result;
        } else {
            throw NumberFormatException.forInputString(s);
        }
    }

    public static
    class NumberFormatException extends IllegalArgumentException {
        static final long serialVersionUID = -2848938806368998894L;

        public NumberFormatException() {
            super();
        }

        public NumberFormatException(String s) {
            super(s);
        }

        static java.lang.NumberFormatException forInputString(String s) {
            return new java.lang.NumberFormatException("For input string: \"" + s + "\"");
        }

        static java.lang.NumberFormatException forCharSequence(CharSequence s,
                                                               int beginIndex, int endIndex, int errorIndex) {
            return new java.lang.NumberFormatException("Error at index "
                    + (errorIndex - beginIndex) + " in: \""
                    + s.subSequence(beginIndex, endIndex) + "\"");
        }
    }
}
-------------------------------------------------------------------
import java.util.Deque;
import java.util.LinkedList;

public class Kata {

  public static int hexToDec(final String hexString) {
        
    Deque<Integer> hexStringElAsInt = new LinkedList<Integer>();
    Boolean isNegative = hexString.charAt(0) == '-' ? true : false;
    
    int result = 0;
    
    for(int i = isNegative ? 1 : 0; i < hexString.length(); i++){  
      switch(Character.toUpperCase(hexString.charAt(i))){
          case 'A':
            hexStringElAsInt.addFirst(10);
          break;
          case 'B':
            hexStringElAsInt.addFirst(11);
          break;
          case 'C':
            hexStringElAsInt.addFirst(12);
          break;
          case 'D':
            hexStringElAsInt.addFirst(13);
          break;
          case 'E':
            hexStringElAsInt.addFirst(14);
          break;
          case 'F':
            hexStringElAsInt.addFirst(15);
          break;
          default:
            hexStringElAsInt.addFirst(Integer.parseInt(String.valueOf(hexString.charAt(i))));
          break;
      }
    }

    int listSize = hexStringElAsInt.size();
    
    for(int i = 0; i < listSize ; i++){
      result += hexStringElAsInt.removeFirst() * (Math.pow(16, i));
    }
    
    
    return isNegative ? result * -1 : result;
  }
  
}
------------------------------------------------------------------
public class Kata {

  public static int hexToDec(final String hexString) {
    String hex = new StringBuilder(hexString).reverse().toString();

    return getDec(hex);
  }
  
  private static int getDec(String hex) {
    int result = 0;

    for (int index = 0; index < hex.length(); index++) {
      if (hex.charAt(index) == '-') {
        result = -1 * result;
        break;
      }  
      result += getDecimalChar(hex.charAt(index), index);
    }
    return result;
  }
  
  private static int getDecimalChar(char c, int index) {
      if (c == 'a' || c == 'A') return (10 * (int) (Math.pow(16,index)));
      else if (c == 'b' || c == 'B') return 11 * (int) (Math.pow(16,index));
      else if (c == 'c' || c == 'C') return 12 * (int) (Math.pow(16,index));
      else if (c == 'd' || c == 'D') return 13 * (int) (Math.pow(16,index));
      else if (c == 'e' || c == 'E') return 14 * (int) (Math.pow(16,index));
      else if (c == 'f' || c == 'F') return 15 * (int)(Math.pow(16,index));
      else if ((int)c >= 0 ) return Character.getNumericValue(c) * (int)(Math.pow(16,index));
      return 0;
  }
  
}



*/