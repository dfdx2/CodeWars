/* 6KYU CodeWars Basics 08: Find next higher number with same Bits(1s)

Your task is to find the next higher number (int) with same '1'- Bits.

I.e. as much 1 bits as before and output next higher than input. Input 
is always an int in between 1 and 1<<30 (inclusive). No bad cases or 
special tricks...

Some easy examples:
Input: 129  => Output: 130 (10000001 => 10000010)
Input: 127 => Output: 191 (01111111 => 10111111)
Input: 1 => Output: 2 (01 => 10)
Input: 323423 => Output: 323439 (1001110111101011111 => 1001110111101101111)
First some static tests, later on many random tests too;-)!

Hope you have fun! :-)
*/
public class Kata {
  public static int nextHigher(int n) {
     return Integer.parseInt(Integer.toBinaryString(n).replaceAll("0?1(1*)(0*)$", "10$2$1"), 2);
  }
}

/*---------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
    int o = n & -n;
    return n + o | ((n ^ n + o) / o >> 2);
  }
}
-----------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
  int right, nextHi, rightOnPat, next=0;
  
  if(n>0){
  
  right= n&-n;
  
  nextHi=n+right;
  
  rightOnPat= n^nextHi;
  rightOnPat= (rightOnPat)/right;
  
  rightOnPat>>=2;
  
  next= nextHi| rightOnPat;
}  
    // your code here
 return next;   
  }
}
-----------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
    return n > 0 ? (n + (n & -n)) | ((n ^ (n + (n & -n))) / (n & -n)) / 4 : 0;
  }
}
-----------------------------------------------------------------
import java.util.*;

public class Kata {
  public static int nextHigher(int n) {
    int i = 0;
    int ogn=n;
    while(true){
      int temp = n+1;
      int nbog = Integer.bitCount(ogn);
//       System.out.println(nbog);
      int nb = Integer.bitCount(temp);
//       System.out.println(nb);
      if(nb==nbog){
        return temp;
      }
      else{
        n=temp;
        i++;
      }
    }
// return 0;
  }
}
----------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
    int t = n | (n - 1);
    return t + 1 | Integer.lowestOneBit(~t) - 1 >> Integer.numberOfTrailingZeros(n) + 1;
  }
}
-----------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
    int c = n;
    int c0 = 0;
    int c1 = 0;
    
    while((c & 1) == 0 && c != 0){
      c0++;
      c >>= 1;
    }
    while((c & 1) == 1){
      c1++;
      c >>= 1;
    }
    if( c0 +c1 ==31 || c0 +c1 ==0){
      return -1;
    }
    
    int pos = c0 + c1;
    
    n|= (1 << pos);
    n&= ~((1L << pos)-1);
    n|= (1 << (c1 - 1)) - 1;;
    
    return n;
  }
}
------------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
		int c = n & -n;
		int r = n+c;
		return (((r^n) >>> 2)/c)|r;
	}
}
-----------------------------------------------------------------
public class Kata {
  
  public static int nextHigher(int n) {
    int c = n;   // Copy of n used for manipulation
    int c0 = 0;  // Counter for trailing zeros
    int c1 = 0;  // Counter for consecutive ones following the trailing zeros

    // Count trailing zeros (c0)
    while (((c & 1) == 0) && (c != 0)) {
      c0++;
      c >>= 1;
    }

    // Count the number of ones (c1) following the trailing zeros
    while ((c & 1) == 1) {
      c1++;
      c >>= 1;
    }

    // If n is of the form 111...1100...00, return -1 as there's no higher number with the same number of 1 bits
    if (c0 + c1 == 31 || c0 + c1 == 0) {
      return -1;
    }

    // Position of rightmost non-trailing zero
    int p = c0 + c1;

    // Flip the rightmost non-trailing zero (Step 1)
    n |= (1 << p);

    // Clear all bits to the right of p (Step 2)
    n &= ~((1 << p) - 1);

    // Insert (c1-1) ones on the right (Step 3)
    n |= (1 << (c1 - 1)) - 1;

    return n;
  }
}
------------------------------------------------------------------
public class Kata {
  public static int nextHigher(int n) {
       int smallest = n & -n;
        int ripple = n + smallest;
        int newSmallest = n ^ ripple;
        newSmallest = (newSmallest >> 2) / smallest ;
        return ripple | newSmallest;
  }
}
*/