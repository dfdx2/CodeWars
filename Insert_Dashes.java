/* 7KYU CodeWars Insert Dashes

Write a function insert_dash(num) / insertDash(num) / InsertDash(int num) 
that will insert dashes ('-') between each two odd digits in num. 

For example: if num is 454793 the output should be 4547-9-3.

Note that the number will always be non-negative (>= 0).

*/

public class Solution {
  
  public static String insertDash(int num) {
    String a = String.valueOf(num);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < a.length() - 1; i++) {
      int c = Integer.valueOf(a.charAt(i));
      int d = Integer.valueOf(a.charAt(i + 1));
      if (c % 2 != 0 && d % 2 != 0) {
        sb.append(a.charAt(i));
        sb.append("-");
       // sb.append(a.charAt(i + 1));
      }
      else {
        sb.append(a.charAt(i));
      }
    }
    String x = sb.toString();
    x = x + a.charAt(a.length() - 1);
    return x;
  } 
}
/*------------------------------------------------------------------
public class Solution {
  
  public static String insertDash(int num) {
    return (num+"").replaceAll("([13579])(?=[13579])", "$1-");
  }
  
}
--------------------------------------------------------------------
public class Solution {

  public static String insertDash(int num) {
    return Integer.toString(num).replaceAll("[13579](?=[13579])", "$0-");
  }

}
---------------------------------------------------------------------
public class Solution {
  
  public static String insertDash(int num) {
    String oddNumber = "13579";
    String answer = "";
    String input = String.valueOf(num);
    
    for(int i=0; i<input.length()-1;i++){
      answer+=input.charAt(i);
      if(oddNumber.indexOf(input.charAt(i))!=-1 && oddNumber.indexOf(input.charAt(i+1))!=-1 ){
        if(i<input.length()-1){
          answer+="-";
        }
      }
    }
    answer+=input.charAt(input.length()-1);
    return answer;
  }
  
}
---------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Solution {
  
    public static String insertDash(int num) {
        String s = String.valueOf(num);
        return IntStream.range(0, s.length()-1)
                        .mapToObj(i -> s.charAt(i) + (s.charAt(i) % 2 != 0 && s.charAt(i+1) % 2 != 0 ? "-" : ""))
                        .collect(Collectors.joining("")) + s.charAt(s.length()-1);
    }
}
---------------------------------------------------------------------
public class Solution {
  public static String insertDash(int num) {
    String result = "";
    String[] arr = (num + "").split("");
    for (int i = 0; i < arr.length - 1; i ++) {
      int current = Integer.parseInt(arr[i]);
      int next = Integer.parseInt(arr[i + 1]);
      if (current % 2 != 0 && next % 2 != 0) {
        result += current + "-";
      }
      else {
        result += current;
      }
    }
    return result + arr[arr.length - 1];
  }
}
---------------------------------------------------------------------
public class Solution {
  
  public static String insertDash(int num) {

        int lengthNum = (int) (Math.log10(num) + 1);
        int divider = 1;
        while (lengthNum > 1) {
            divider = divider * 10;
            lengthNum--;
        }

        StringBuilder result = new StringBuilder();

        while (divider != 10) {
            if ((num / divider % 2 == 1) && ((num / (divider / 10)) % 2 == 1)) {
                result.append(num / divider % 10).append('-');
            } else {
                result.append(num / divider % 10);
            }
            num = num % divider;
            divider = divider / 10;
        }
        
        if ((num / 10 % 2 == 1) && (num % 2) == 1) {
            result.append(num / 10).append('-').append(num % 10);
        } else {
            result.append(num / 10).append(num % 10);
        }

        return result.toString();
    }
  
}
----------------------------------------------------------------------
public class Solution {
  
  public static String insertDash(int num) {
    String numStr = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        result.append(numStr.charAt(0));
        for (int i = 1; i < numStr.length(); i++) {
            int prevDigit = numStr.charAt(i - 1) - '0';
            int currDigit = numStr.charAt(i) - '0';
            if (prevDigit % 2 != 0 && currDigit % 2 != 0) {
                result.append("-");
            }
            result.append(currDigit);
        }
        return result.toString();
 }
  }
---------------------------------------------------------------------
public class Solution {
  
  public static String insertDash(int num) {
		String[] arr = String.valueOf(num).split("");
		StringBuilder sb = new StringBuilder();
		int n = arr.length - 1;
		for (int i = 0; i < n; i++) {
			if (arr[i].isEmpty())
				continue;
			
			if (isOdd(arr[i]) && isOdd(arr[i + 1]))
				sb.append(arr[i]).append("-");
			else
				sb.append(arr[i]);
		}
		sb.append(arr[n]);
		return sb.toString();
	}
	
	private static boolean isOdd(String n) {
		return Integer.parseInt(n) % 2 != 0;
	}
  
}
----------------------------------------------------------------------
public class Solution {
  
	public static String insertDash(int num) {
		return String.valueOf(num).replaceAll("(?<=[13579])(?=[13579])", "-");
	}
  
}
*/