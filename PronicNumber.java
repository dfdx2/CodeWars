/* 7KYU CodeWars Pronic Number

Task:

You have to create a function to check whether the argument passed 
is a Pronic Number and return true if it is & false otherwise.

Description:

Pronic Number -A pronic number, oblong number, rectangular number or 
heteromecic number, is a number which is the product of two consecutive 
integers, that is, n(n + 1).

The first few Pronic Numbers are - 0, 2, 6, 12, 20, 30, 42...

Explanation:
  0 = 0 × 1   // ∴  0 is a Pronic Number
  2 = 1 × 2   // ∴  2 is a Pronic Number
  6 = 2 × 3   // ∴  6 is a Pronic Number
 12 = 3 × 4   // ∴ 12 is a Pronic Number
 20 = 4 × 5   // ∴ 20 is a Pronic Number
 30 = 5 × 6   // ∴ 30 is a Pronic Number
 42 = 6 × 7   // ∴ 42 is a Pronic Number

Note:

Negative numbers are tested as well.

*/

public class PronicNumber {
	public static boolean isPronic(int n) {
		if (n == 0 || n == 2) {
      return true;
    }
    for (int i = 2; i < n; i++) {
      if (i * (i + 1) == n) {
        return true;
      }
    }
    return false;
	}
}
/*-------------------------------------------------------------- 
public class Pronic {

	public static boolean isPronic(int n) {
    if(n==0||n==2) return true;
    for(int i = 2; i<=n; i++) {
      if(i*(i+1)==n) return true;
    }
		return false;
	}
}
----------------------------------------------------------------
public class Pronic {

	public static boolean isPronic(int n) {
        int mult = 0;
        for (int i = 0; mult <= n; i++) {
            mult = i * (i + 1);
            if (mult == n) {
                return true;
            }
        }
        return false;
	}
}
----------------------------------------------------------------
public class Pronic {
  public static boolean isPronic(int n) {
    int p = (int) Math.pow(Math.abs(n),0.5);
    return p*(p+1) == n || p*(p-1) == n;
	}
}
----------------------------------------------------------------
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Pronic {

    public static boolean isPronic(int n) {
        Set<Long> numbers = LongStream.range(0, 999).map(x -> x * (x + 1)).boxed().collect(Collectors.toSet());
        return numbers.contains((long) n);
    }
}
----------------------------------------------------------------
public class Pronic {

	public static boolean isPronic(int n) {
    // Happy Coding ^_^
    if (n == 0) {return true;}
    
    for(int i = 0; i < n; i++)
      {
        System.out.println(i);
        int num  = i * (i + 1);
        if (n == num) {return true;}
      }
    
		return false;
	}
}
----------------------------------------------------------------
public class Pronic {

    public static boolean isPronic(int n) {
        // Loop through potential factors up to the square root of n
        for (int i = 0; i <= Math.sqrt(n); i++) {
            // Check if n equals i * (i + 1)
            if (i * (i + 1) == n) {
                return true;
            }
        }
        return false;
    }
}
----------------------------------------------------------------
public class Pronic {

	public static boolean isPronic(int n) {
		  return (int) Math.sqrt(n) * (int) (Math.sqrt(n) + 1) == n;
	}
}
*/