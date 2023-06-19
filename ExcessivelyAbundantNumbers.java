/* 7KYU CodeWars Excessively Abundant Numbers

An abundant number or excessive number is a number for which the sum of its 
roper divisors is greater than the number itself.

The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 
4 and 6 for a total of 16 (> 12).

Derive function abundantNumber(num)/abundant_number(num) which returns 
true/True/.true. if num is abundant, false/False/.false. if not.

*/

public class Kata {
    
  public static boolean abundantNumber(int num) {
    int count = 0;
    int i = 1;
    while (i < num) {
      if (num % i == 0) {
        count += i;
        i++;
      }
      else {
        i++;
      }
    }
    return count > num;
  }
}
/*--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
    
    public static boolean abundantNumber(int num) {
        return num < IntStream.rangeClosed(1, num/2).filter(i -> num % i == 0).sum();
    }
    
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  
  public static boolean abundantNumber(int n) {
    return IntStream.rangeClosed(1, n / 2).reduce(0, (s, m) -> s + (n % m == 0 ? m : 0)) > n;
  }
}
----------------------------------------------------------------------------
import java.util.ArrayList;

public class Kata {
    
    public static boolean abundantNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) list.add(i);
        }
        return list.stream().mapToInt(a -> a).sum() > num;
    }
    
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;
  
public class Kata {
    public static boolean abundantNumber(int num) {
        return num < IntStream.range(1,num).filter(x -> num%x==0).sum();
    }
}
------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {
  public static boolean abundantNumber(int num) {
    return num < IntStream.rangeClosed(1, num/2)
        .filter(n -> num % n == 0)
        .sum();
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    
    public static boolean abundantNumber(int num) {
        int[] properDivisors = IntStream.range(1, num)
				        		.filter(a -> num % a== 0)
				        		.toArray();
        int sum = Arrays.stream(properDivisors).sum();
        return sum >= num;
    }
    
}



*/