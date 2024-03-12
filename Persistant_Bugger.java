/* 6KYU CodeWars Persistant Bugger

Write a function, persistence, that takes in a positive 
parameter num and returns its multiplicative persistence, 
which is the number of times you must multiply the digits 
in num until you reach a single digit.

For example (Input --> Output):

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)


*/

class Persist {
	public static int persistence(long n) {
		int result = 0;
    while (n > 9) {
      n = (n + "").chars().reduce(1, (a,b) -> a * (b - 48));
      result++;
    }
    return result;
	}
}
/*--------------------------------------------------------------------
class Persist {
	public static int persistence(long n) {
		long m = 1, r = n;

    if (r / 10 == 0)
      return 0;

    for (r = n; r != 0; r /= 10)
      m *= r % 10;

    return persistence(m) + 1;
    
	}
}
----------------------------------------------------------------------
class Persist {
	public static int persistence(long n) {
    int times = 0;
		while (n >= 10) {
      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
      times++;
    }
    return times;
	}
}
-----------------------------------------------------------------------
class Persist {
	  public static int persistence(long n) {
        int i = 0;
        
        while(n >= 10) {
            int m = 1;
            
            while (n > 0) {
                m *= (n % 10);
                n /= 10;
            }
            n = m;
            i += 1;
        }
        return i;
	  }
}
----------------------------------------------------------------------
import java.util.Arrays;

class Persist {

    public static int persistence(long n) {
		    if (n < 10) return 0;

        final long newN = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::valueOf)
                .reduce(1, (acc, next) -> acc * next);

        return persistence(newN) + 1;
	  }
}
-----------------------------------------------------------------------
class Persist {
    	public static int persistence(long n) {
            int count = 1;
            if(n<9){
                return 0;
            }
            while(needsMorePersistence(n)>9){
                n = needsMorePersistence(n);
                count++;
            }
            return count;
	}
        
        public static long needsMorePersistence(long n){
            String p = Long.toString(n);
            long value=1;
            for (int i = 0; i < p.length(); i++) {
                value = value * Long.parseLong(p.substring(i, i+1));
            }
            return value;
        }
}
-----------------------------------------------------------------------
class Persist {
	public static int persistence(long n) {
    int i = 0;
		for (; n >= 10; i++) n = per("" + n);
    return i;
	}
  public static long per(String s) {
    long ans = 1;
    for(int i = 0; i < s.length(); i++) ans *= (long) Character.getNumericValue(s.charAt(i));
    return ans;
  }
}
-----------------------------------------------------------------------
class Persist {
    public static int persistence(long n) {

        return recursivePersistence(n, 0);
    }

    private static int recursivePersistence(long n, int level) {
        if (n <= 9) return level;

        final int reduced = Long.toString(n).chars()
                .map(i -> i - '0')
                .reduce(1, (left, right) -> left * right);
        return recursivePersistence(reduced, level+1);
    }
}

*/