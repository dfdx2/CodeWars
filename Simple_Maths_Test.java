/* 7KYU CodeWars Simple Maths Test

Create a function which checks a number for three different properties.

is the number prime?
is the number even?
is the number a multiple of 10?
Each should return either true or false, which should be given 
as an array. Remark: The Haskell variant uses data Property.

Examples

SimpleMath.numberProperty(7)  => new boolean[] {true, false, false}
SimpleMath.numberProperty(10) => new boolean[] {false, true, true}
The number will always be an integer, either positive or negative. 
Note that negative numbers cannot be primes, but they can be multiples of 10:

SimpleMath.numberProperty(-7)  => new boolean[] {false, false, false}
SimpleMath.numberProperty(-10) => new boolean[] {false, true, true}

*/

public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
		boolean[] result = new boolean[3];
    result[0] = isPrime(n);
    result[1] = n % 2 == 0;
    result[2] = n % 10 == 0;
    return result;    
	}
  
  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
            }
        }
        return true;
    }
}
/*---------------------------------------------------------------------
public class SimpleMath {
    private static boolean isPrime(int n) {
        if (n > 2) {
            for (int i = 2;i <= Math.sqrt(n);i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return n == 2;
        }
    }
    public static boolean[] numberProperty(int n) {
        return new boolean[]{isPrime(n), n % 2 == 0, n % 10 == 0};
    }
}
-----------------------------------------------------------------------
public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
    boolean[] result = {isPrime(n), isEven(n), isAMultipleOf10(n)};
		return result;
	}
  
  public static boolean isPrime(int n) {
    if(n<2) return false;
    for (int i = 2; i<=Math.sqrt(n); i++) {
      if (n%i == 0) return false;
    }
    return true;
  }
  
  public static boolean isEven(int n) {
    return n%2 == 0;
  }
  
  public static boolean isAMultipleOf10(int n) {
    return n%10 == 0;
  }
}
-----------------------------------------------------------------------
public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
		boolean[] res = new boolean[3];
    res[0] = true;
    if (n <= 1) res[0]=false;
    res[1] = false;
    res[2] = false;
    for(int i = 2; i<=Math.sqrt(n);i++){
      if (n%i==0) res[0] = false;
    }
    if (n%2==0) res[1] = true;
    if (n%10==0) res[2] = true;
    return res;
	}
  
}
-----------------------------------------------------------------------
public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
    
    boolean isPrime = true; // Assume n is prime until proven otherwise
    boolean isEven = false;
    boolean isMultipleOfTen = false;
    
    // Check if n is prime
    if (n <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    
    // Check if n is even
    if (n % 2 == 0) {
        isEven = true;
    }
    
    // Check if n is a multiple of ten
    if (n % 10 == 0) {
        isMultipleOfTen = true;
    }
    
    // Create and return the boolean array
    boolean[] answer = {isPrime, isEven, isMultipleOfTen};
    return answer;
	}
}
-----------------------------------------------------------------------
public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
    
    Boolean prime = true;
    Boolean even = n % 2 == 0;
    Boolean mult10 = n % 10 == 0;
    
    if (n <= 1 || (even && n != 2)) prime = false;
      
      else {
        for(int i = 3; i <= Math.sqrt(n); i+=2){
          if((n % i == 0 && n != 2) || n <= 1){
            prime = false;
            break;
          }
        }    
      }
    
    
    return new boolean[]{prime, even, mult10};
	}
}

-----------------------------------------------------------------------
public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
		 return new boolean[]{isPrime(n), n % 2 == 0, n % 10 == 0};
	}
  public static boolean isPrime(int n){
         if (n < 2){
            return false;
        }
        if (n % 2 == 0){
            return n == 2;
        }
        if (n % 3 == 0){
            return n == 3;
        }
        for (int i = 5; i <= Math.sqrt(n); i+=6){
            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}

-----------------------------------------------------------------------
public class SimpleMath {
	
	public static boolean[] numberProperty(int n) {
		return new boolean[]{isPrime(n), n % 2 == 0, n % 10 == 0};
	}
  
  public static boolean isPrime(int n) {
    for(int i = 2; i <= Math.pow(n, 0.5); i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return n > 1;
  }
}
*/