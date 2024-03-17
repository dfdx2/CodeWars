/* 6KYU CodeWars The Lost Beginning

Problem Statement

You're given a string of digits representing a sequence of 
consecutive natural numbers concatenated together. Your task 
is to find the smallest possible first number in the sequence. 
The sequence starts with a single or multi-digit number and 
continues with numbers each incremented by 1. If multiple 
sequences can be formed, choose the one that starts with the 
smallest number.

Examples

"123" -> [1, 2, 3] -> 1
"91011" -> [9, 10, 11] -> 9
"17181920" -> [17, 18, 19, 20] -> 17
"9899100" -> [98, 99, 100] -> 98
"91" -> [91] -> 91
"121122123" -> [121, 122, 123] -> 121
"1235" -> [1235] -> 1235
"101" -> [101] -> 101

Constraints

Input string length: 1 - 200 characters.

Smallest possible first number: 1 - 1,000,000,000.

Remember, the key is to form a sequence of consecutive natural 
numbers. If the sequence matches the input string, you've found 
the smallest possible first number. Experiment with different 
lengths for the first number until you find a match or exhaust 
all possibilities.

*/
public class Kata {
  public static long beginning(String s) {
    for (int i = 1; i <= s.length(); i++) {
      StringBuilder sb = new StringBuilder();
      int counter = Integer.parseInt(s.substring(0,i));
      for (int j = counter; sb.length() < s.length(); j++) {
        sb.append(j);
      }
      if (sb.toString().equals(s)) {
        return counter;
      }
    }
    return -1;
  }
}
/*------------------------------------------------------------------
import java.util.ArrayList;
public class Kata {
  
  public static long beginning(String s) {
    
    int cutEnd = 1;
    int cutStart = 0;
    int diff = 1;
    boolean valid = true;
    
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    double num1, num2, div;
    
    while(cutEnd < s.length()){
      
      if(s.length()-cutEnd < diff ){
        result.clear();
        result.add(Integer.parseInt(s));
        cutEnd= s.length();
      }else{
        div = Math.pow(10, diff);
        num1 = Double.parseDouble(s.substring(cutStart, cutEnd)) / div;
        num2 = (Double.parseDouble(s.substring(cutEnd, cutEnd+diff)) - 1) / div;
      
        switch(Double.compare(num1, num2)){
          case 0:
            result.add(Integer.parseInt(s.substring(cutStart, cutEnd)));
            valid = true;
            cutStart = cutEnd;
            cutEnd += diff;
            break;
          case 1:
              diff++;
            valid = false;
            break;
          default :
            valid = false;
              result.clear();
              diff = cutEnd;
              cutEnd = ((s.substring(0, cutEnd).length()) > 1 && cutStart != 0) ? cutEnd : cutEnd+1;
              cutStart = 0;
            
            break;
        }
      }
      
    }
    
    if(result.size() < 1){
      return Integer.parseInt(s);
    }
    
    return result.get(0);
  }
}
--------------------------------------------------------------------
public class Kata {
  public static long beginning(String s) {
      int n = s.length(); 
      for (int i=1; i<=n/2; i++){  
          if(go(s,i,n))return Long.parseLong(s.substring(0,i));
      }
     return Long.parseLong(s);
  }
  public static boolean go (String s,int index,int n ){  
       StringBuilder sb = new StringBuilder();
       long start =Long.parseLong(s.substring(0,index)); 
       while (sb.length()<n)sb.append(start++);
       return sb.toString().equals(s);
  }
}
---------------------------------------------------------------------
public class Kata {
  
  public static long beginning(String s) {
    
     int length = s.length();

         for (int i = 1; i <= length; i++) {
            int candidate = Integer.parseInt(s.substring(0, i));
            int current = candidate;

             StringBuilder expectedSequence = new StringBuilder();
            while (expectedSequence.length() < length) {
                expectedSequence.append(current);
                current++;
            }

             if (expectedSequence.toString().equals(s) && candidate <= 1000000000) {
                return candidate;
            }
        }

         return -1;
  
    
  }
}
--------------------------------------------------------------------
import java.util.ArrayList;

public class Kata {

	public static long beginning(String s) {
		for (int x = 1; x < s.length() - 1; x++) {
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			int extra = 0;
			int extraExtra = 0;
			try {
				for (int y = 0; y < s.length() - x + 1; y += x + extraExtra) {
					int num = (Integer.valueOf(String.valueOf(s.subSequence(y, y + x + extra))));
					if (extra > extraExtra) {
						extraExtra++;
					}
					numeros.add(num);
					if (String.valueOf(num).length() != String.valueOf(num + 1).length()) {
						extra += 1;
					}
				}
				System.out.println(numeros);
				int tam = 0;
				for (int m : numeros) {
					tam += String.valueOf(m).length();
				}
				boolean estabien = true;
				if (tam != s.length()) {
					estabien = false;
				}
				if (estabien) {
					for (int n = 0; n < numeros.size() - 1; n++) {
						if (estabien) {
							if (numeros.get(n) != numeros.get(n+1) - 1) {
								estabien = false;
							}
						}
					}
				}
				if (estabien) {
					return numeros.get(0);
				}
			} catch (Exception e) {
				
			}
		}
		return (Integer.valueOf(s));
	}
}
---------------------------------------------------------------------
import java.util.ArrayList;
import java.math.BigInteger;

public class Kata {
  
  static long beginning(String s)
    {
        BigInteger firstNumber = null;

        // Iterate over the range [1, N] and
        // try each possible starting number
        for (int size = 1; size <= s.length(); ++size) {
            ArrayList<BigInteger> consecutiveList = new ArrayList<>();
            firstNumber = new BigInteger(s.substring(0, size));
            consecutiveList.add(firstNumber);
            String unprocessedStr = s.substring(size);
            // Build up a sequence
            // starting with the number
            while (unprocessedStr.startsWith(firstNumber.add(BigInteger.ONE).toString())) {
                consecutiveList.add(firstNumber.add(BigInteger.ONE));
                firstNumber = consecutiveList.get(consecutiveList.size()-1);
                unprocessedStr = unprocessedStr.substring((consecutiveList.get(consecutiveList.size()-1).toString()).length());
            }

            // Compare it with the
            // original String s
            StringBuilder test = new StringBuilder();
            for (BigInteger consecutiveNumber : consecutiveList) {
                test.append(consecutiveNumber);
            }
            if (test.toString().equals(s)){
                firstNumber = consecutiveList.get(0);
                break;
            }

        }
        return firstNumber != null ? firstNumber.longValue() : -1;
    }
}
----------------------------------------------------------------------
public class Kata {
  public static long beginning(String s) {
    for (int i = 1; i <= s.length(); i++) {
      StringBuilder sb = new StringBuilder();
      int counter = Integer.parseInt(s.substring(0,i));
      for (int j = counter; sb.length() < s.length(); j++) {
        sb.append(j);
      }
      if (sb.toString().equals(s)) {
        return counter;
      }
    }
    return -1;
  }
}
----------------------------------------------------------------------
public class Kata {
  
  public static long beginning(String s) {
    for (int i = 1; i <= s.length(); i++) {
	            int firstNumber = Integer.parseInt(s.substring(0, i));
	            if (consec(s.substring(i), firstNumber)) {
	               return firstNumber;
	            }
            
	        }
    return -1;
  }
  
  public static boolean consec(String a,int num) {
		int siguiente=num+1;
		int inicio=0;
		while(inicio<a.length()) {
			String siguienteString=String.valueOf(siguiente);
			int fin=inicio+siguienteString.length();
			if (fin<=a.length()) {
				if(a.substring(inicio,fin).equals(siguienteString)) {
					siguiente++;
					inicio=fin;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
}
-----------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static long beginning(String input) {
        for (int i = 1; i <= input.length(); i++) {
            long candidate = Long.parseLong(input.substring(0, i));
            if (isConsecutiveSequence(candidate, input)) {
                return candidate;
            }
        }
        return 0;
    }

    private static boolean isConsecutiveSequence(long start, String input) {
        StringBuilder expectedSequence = new StringBuilder();

        for (long i = start; expectedSequence.length() < input.length(); i++) {
            expectedSequence.append(i);
        }

        return expectedSequence.toString().equals(input);
    }
}
*/