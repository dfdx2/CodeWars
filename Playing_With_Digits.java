/* 6KYU CodeWars Playing With Digits

In other words, writing the consecutive digits of n as a, b, c, d ..., is 
there an integer k such that :

(ap + bp+1 + cp+2 +dp+3 +...) = n∗k
If it is the case we will return k, if not return -1.

Note: n and p will always be strictly positive integers.

Examples:

n = 89; p = 1 ---> 1 since 8¹ + 9² = 89 = 89 * 1

n = 92; p = 1 ---> -1 since there is no k such that 9¹ + 2² equals 92 * k

n = 695; p = 2 ---> 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2

n = 46288; p = 3 ---> 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

*/
import static java.util.stream.IntStream.range;
public class DigPow {
	
	public static long digPow(int n, int p) {
    int result = range(0, (n + "").length()).map(i -> (int) Math.pow((n + "").charAt(i) - 48.,i + p)).sum();
    return result % n == 0 ? result / n : -1;
	}
}
/*-------------------------------------------------------------------------
public class DigPow {
	
	public static long digPow(int n, int p) {
    String intString = String.valueOf(n);
    long sum = 0;
    for (int i = 0; i < intString.length(); ++i, ++p)
      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
    return (sum % n == 0) ? sum / n : -1;
	}
	
}
---------------------------------------------------------------------------
class DigPow {
	
	public static long digPow(int n, int p) {
		long s = 0;
		String nstr = String.valueOf(n);
		for (int i = 0; i < nstr.length(); i++) {
			s += (long)Math.pow((int)(nstr.charAt(i) -'0'), p+i);
		}
		if (s % n == 0) 
			return s / n;
		else return -1;
	}
	
}
----------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DigPow {
	
	public static long digPow(int n, int p) {
		List<Integer> digits = new ArrayList<>();
        int temp = n;
        while (temp > 0) {
            digits.add(0, temp%10);
            temp /= 10;
        }
        final AtomicInteger value = new AtomicInteger(p);
        int sum = (int)digits
            .stream()
            .mapToDouble(Integer::doubleValue)
            .map(i -> Math.pow(i, value.getAndIncrement()))
            .sum();
        if(sum%n == 0)
            return sum/n;
        return -1;
	}
	
}
-----------------------------------------------------------------------------
public class DigPow {

    public static long digPow(int n, int p) {
        System.out.println("n = " + n + " p = " + p); 
        int number = 0;
        p = p + (int)(Math.log10(n));
        for (int i = n; i > 0; i/=10 ) {
            number += Math.pow(i%10,p);
            p--;
        }
        if(number%n == 0 && number/n > 0)
            return number/n;
        else 
        return -1;
    }
  }
-----------------------------------------------------------------------------
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.LongStream;

public class DigPow {
	
	public static long digPow(int n, int p) {
		final long sum = successivePower(n, p);
		return sum % n == 0L ? sum / n : -1L;
	}

	static long successivePower(final int n, final int p) {
		final List<Integer> digits = digits(n);
		return LongStream.range(0L, digits.size())
				.map(i -> (long) Math.pow(digits.get((int) i), p + i))
				.sum();
	}

	static List<Integer> digits(final int n) {
		return String.valueOf(n).chars()
				.mapToObj(c -> (char) c)
				.map(String::valueOf)
				.map(Integer::valueOf)
				.collect(toList());
	}
	
}
------------------------------------------------------------------------------
public class DigPow {
	
	public static long digPow(int n, int p) {
    int sum = 0, digit[] = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
    for(int a:digit) sum += Math.pow(a, p++);
    return sum%n==0?sum/n:-1;
	}
	
}
-----------------------------------------------------------------------------
public class DigPow {
	
	public static long digPow(int n, int p) {
    char[] array = Integer.toString(n).toCharArray();
    long sum = 0L;

    for (int i = 0; i < array.length; i++){
      int digit = Integer.parseInt(Character.toString(array[i]));
      sum += (long) Math.pow(digit, p + i);
    }

    if (sum % n == 0){
      return (long) (sum / n);
    }
		
    return -1;
	}
}
*/