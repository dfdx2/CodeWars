/* 6KYU CodeWars Bit Counting

Write a function that takes an integer as input, and returns the number 
of bits that are equal to one in the binary representation of that number. 
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function 
should return 5 in this case

*/

import java.io.*;
public class BitCounting {

	public static int countBits(int n){
		return Integer.bitCount(n);
	}
}
/*----------------------------------------------------------------------------
public class BitCounting {

	public static int countBits(int n){
		int ret = n % 2;
    while ((n /= 2) > 0) ret += n % 2;
    return ret;
	}	
}
-------------------------------------------------------------------------------
public class BitCounting {

	public static int countBits(int n){
		return (int) Integer.toBinaryString(n).chars()
              .filter(c -> c == '1')
              .count();
	}	
}
-------------------------------------------------------------------------------
public final class BitCounting {

    public static int countBits(int n) {
        int i = 0;
        for (int j = n; j > 0; j >>= 1) {
            i += j & 1;
        }
        return i;
    }
}
-------------------------------------------------------------------------------



*/