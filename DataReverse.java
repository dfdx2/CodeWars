/* 6KYU CodeWars Data Reverse

A stream of data is received and needs to be reversed.

Each segment is 8 bits long, meaning the order of these segments 
needs to be reversed, for example:

11111111  00000000  00001111  10101010
 (byte1)   (byte2)   (byte3)   (byte4)
should become:

10101010  00001111  00000000  11111111
 (byte4)   (byte3)   (byte2)   (byte1)
The total number of bits will always be a multiple of 8.

The data is given in an array as such:

[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]

Note: In the C and NASM languages you are given the third parameter 
      which is the number of segment blocks.

*/
import static java.util.stream.IntStream.range;
public class DataReverse {
    public static int[] DataReverse(int[] data) {
        return range(0, data.length).map(i -> data[data.length + 2 * (i % 8) - i - 8]).toArray();
    }
}
/*-----------------------------------------------------------------------------------------
public class Kata {
  public static int[] DataReverse(int[] data) {
    int bytes[] = new int[data.length];
    for (int i = data.length-8, j=0; i>=0; i-=8, j+=8) {
      System.arraycopy(data, i, bytes, j, 8);
    }
    return bytes;
  }
}
-------------------------------------------------------------------------------------------
public class Kata {
  public static int[] DataReverse(int[] data) {
    int[] reversed = new int[data.length];
    for (int i = 0; i < data.length; i += 8) {
      System.arraycopy(data, i, reversed, data.length - 8 - i, 8);
    }
    return reversed;
  }
}
-------------------------------------------------------------------------------------------
public class Kata {
  public static int[] DataReverse(int[] data) {
    return java.util.stream.IntStream.range(0, data.length)
        .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
        .toArray();
  }
}
-------------------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static int[] DataReverse(int[] data) {
        ArrayList<int[]> myList = new ArrayList<>();
        
        for(int i=0; i<data.length; i=i+8){
            myList.add(Arrays.copyOfRange(data, i, i+8));
        }

        Collections.reverse(myList);

        return myList.stream().flatMapToInt(i -> Arrays.stream(i)).toArray();
    }
}
-------------------------------------------------------------------------------------------
public class Kata {
	
	private static final int SEGMENT_LENGTH = 8;
	
	public static int[] DataReverse(int[] data) {
		if ((data.length % SEGMENT_LENGTH) != 0) throw new InvalidInputLengthException(data);
		
		int[] dest = new int[data.length];
		for (int i = 0; i < (data.length / 8); i++) {
			int srcIndex = (data.length - (i * 8)) - 8;
			int destIndex = i * 8;
			
			System.arraycopy(data, srcIndex, dest, destIndex, 8);
		}
		
		return dest;
	}
	
	static class InvalidInputLengthException extends RuntimeException {
		InvalidInputLengthException(int[] data) {
			super(String.format("Array length must be dividable by %d but isn't able to with size %d",
					SEGMENT_LENGTH, data.length));
		}
	}
}
-------------------------------------------------------------------------------------------
public class Kata {
    public static int[] DataReverse(int[] data) {
        int[] result = new int[data.length];
        int counter = data.length - 8;
        for (int i = 0; i < data.length; i++) {
            result[i] = data[counter];
            counter = (i + 1) % 8 == 0 ? counter - 15 : counter + 1;
        }
        return result;
    }
}
-------------------------------------------------------------------------------------------
import java.util.stream.*;
import java.util.*;

public class Kata {
  public static int[] DataReverse(int[] data) {
        return IntStream.iterate(data.length - 8, x -> x - 8)
                .limit(data.length/8)
                .flatMap(i -> Arrays.stream(Arrays.copyOfRange(data, i, i + 8)))
                .toArray();
  }
}
-------------------------------------------------------------------------------------------
public class Kata {
  public static int[] DataReverse(int[] data) {
    int x [] = new int [data.length];  
    int x1 = data.length/8 ; 
    for (int i = 0 ;i < data.length ; i ++) {
      x[i]= data[(x1-1)*8+(i%8)] ; 
      if ((i+1)%8 == 0 )x1--; 
      }
  return x ; 
  }
} 
*/