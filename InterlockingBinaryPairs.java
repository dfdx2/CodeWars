/* 7KYU CodeWars Interlocking Binary Pairs

Write a function that checks if two non-negative integers make an "interlocking binary pair".

Interlock ?

numbers can be interlocked if their binary representations have no 1's in the same place

comparisons are made by bit position, starting from right to left (see the examples below)

when representations are of different lengths, the unmatched left-most bits are ignored

Examples

a = 9, b = 4

Stacking representations shows how they can interlock.

 9    1001
 4     100

Here, no 1's share any position, so the function returns true.

a = 3, b = 6

These representations do not interlock.

 3      11
 6     110

Finding they both have a 1 in the same position, the function returns false.

Input

Two non-negative integers.

Output

Boolean true or false whether or not these integers are interlockable.

*/
public class InterlockingBinaryPairs {
  public static boolean interlockable(long a, long b) {
    return (a & b) == 0;
  }
}
/*--------------------------------------------------------------------
public class Kata
{
  public static boolean interlockable(long a, long b)
  {
    String A = Long.toBinaryString(a);
    String B = Long.toBinaryString(b);
    int n = Math.min(A.length(), B.length());
    A = A.substring(A.length() - n);
    B = B.substring(B.length() - n);
    
    for (int i = 0; i < n; i++)
    {
      if (A.charAt(i) == '1' && B.charAt(i) == '1')
        return false;
    }
    
    return true;
  }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {
    return (a | b) == a + b;
  }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {
    return (~a | ~b) == -1;
  }
}
----------------------------------------------------------------------
import java.util.ArrayList;

public class Kata {
  public static boolean interlockable(long a, long b) {
        String firstBinary = Long.toBinaryString(a);
        String secondBinary = Long.toBinaryString(b);

        int maxLength = Math.max(firstBinary.length(), secondBinary.length());
        firstBinary = String.format("%" + maxLength + "s", firstBinary).replace(' ', '0');
        secondBinary = String.format("%" + maxLength + "s", secondBinary).replace(' ', '0');

        ArrayList<Integer> firstIndexes = new ArrayList<>();
        ArrayList<Integer> secondIndexes = new ArrayList<>();
        
        for (int i = 0; i < firstBinary.length(); i++) {
            if (firstBinary.charAt(i) == '1') {
                firstIndexes.add(i);
            }
        }

        for (int i = 0; i < secondBinary.length(); i++) {
            if (secondBinary.charAt(i) == '1') {
                secondIndexes.add(i);
            }
        }

        for (int firstIndex : firstIndexes) {
            for (int secondIndex : secondIndexes) {
                if (firstIndex == secondIndex) {
                    return false;
                }
            }
        }

        return true;
  }
}
----------------------------------------------------------------------
public class Kata {
    public static boolean interlockable(long a, long b) {
        String sA = toBinary(a);
        String sB = toBinary(b);
        int lengthMin = Math.min(sA.length(), sB.length());
        for (int i = 0; i < lengthMin; i++) {
            if (sA.charAt(i) == '1' && sB.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }

    public static String toBinary(long i) {
        StringBuilder result = new StringBuilder();
        while (i > 0) {
            result.append(i % 2);
            i /= 2;
        }
        return result.toString();
    }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {
    String aBin =  toBin(a);
    String bBin = toBin(b);
    if (aBin.length() > bBin.length()) {
      bBin = " ".repeat(Math.abs(aBin.length() - bBin.length())) + bBin;
    } else if (aBin.length() < bBin.length()) {
      aBin = " ".repeat(Math.abs(bBin.length() - aBin.length())) + aBin;
    }
    for (int i = 0; i < aBin.length(); i++) {
      char aChar = aBin.charAt(i);
      char bChar = bBin.charAt(i);
      if (aChar == bChar && aChar == '1') {
        return false;
      }
    }
    return true;
  }
  
  private static String toBin(long num) {
    String result = "";
    for (long i = num; i > 0; i /= 2) {
      result = "" + (i % 2) + result;
    }
    return result;
  }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {

    //  <----  hajime!
    
    // If one number is 0, the condition is met
    if (a == 0 || b == 0) {
      return true;
    }
    
    // Conditions cannot be met if both numbers are equal
    if (a == b) {
      return false;
    }
    
    long biggerNum, smallerNum;
    
    if (a > b) {
      biggerNum = a;
      smallerNum = b;
    }
    else {
      biggerNum = b;
      smallerNum = a;
    }
    
    String longerBinary = longToBinaryString(biggerNum);
    String shorterBinary = longToBinaryString(smallerNum);
    
    int lengthOfShorterBinary = shorterBinary.length();
    
    for(int i = 0; i < lengthOfShorterBinary; i++) {
      char c1 = getCharWithIndexFromEnd(shorterBinary, i);
      char c2 = getCharWithIndexFromEnd(longerBinary, i);
      
      if (c1 == '1' && c2 == '1') {
        return false;
      }
    }

    return true;
  }
  
  private static String longToBinaryString(long num) {
    if (num == 0) {
      return "0";
    }
    
    String output = "";
    
    while (num > 0) {
      if (num % 2 == 1) {
        output = "1" + output;
      }
      else {
         output = "0" + output;
      }
      
      num /= 2;
      
    }
    
    return output;
  }
  
  private static char getCharWithIndexFromEnd(String s, int indexFromEnd) {
    if (indexFromEnd > s.length()) {
      return 'x';
    }
    
    char[] c = s.toCharArray();
    return c[c.length - 1 - indexFromEnd];
  }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {

    //  <----  hajime!
    char[] arrayA = Long.toBinaryString(a).toCharArray();
    char[] arrayB = Long.toBinaryString(b).toCharArray();
    int size = arrayA.length < arrayB.length ? arrayA.length : arrayB.length;
    
    for(int i=0; i<size; i++) {
      if(arrayA[arrayA.length-1-i] == '1' && arrayB[arrayB.length-1-i] == '1')
        return false;
    }
    return true;
  }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {
    
    String new_a = Long.toBinaryString(a);
    String new_b = Long.toBinaryString(b);
    if(a > b){
      int j = new_a.length() - 1 ;
      for(int i = new_b.length() - 1 ; i >= 0 ; i--){
        if(new_a.charAt(j) == '1' && new_b.charAt(i) == '1'){
          return false;
        }
        j--;
      }
    }else{
      int j = new_b.length() - 1 ;
      for(int i = new_a.length() - 1 ; i >= 0 ; i--){
        if(new_a.charAt(i) == '1' && new_b.charAt(j) == '1'){
          return false;
       }
        j--;
      }
    }
    return true;
  }
}
----------------------------------------------------------------------
public class Kata {
  public static boolean interlockable(long a, long b) {

    String binaryA = Long.toBinaryString(a);
    String binaryB = Long.toBinaryString(b);
    
    int extra = Math.abs(binaryA.length() - binaryB.length());
    
    if (binaryA.length() > binaryB.length()) binaryA = binaryA.substring(extra);
    else if (binaryA.length() < binaryB.length()) binaryB = binaryB.substring(extra);

    char[] charArrayA = binaryA.toCharArray();
    char[] charArrayB = binaryB.toCharArray();

    for (int i = 0; i < binaryA.length(); i++) {
        if (charArrayA[i] == '1' && charArrayB[i] == '1') return false;
    }
    return true;
    
  }
}
*/