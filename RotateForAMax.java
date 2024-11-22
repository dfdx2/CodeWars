/* 7KYU CodeWars Rotate For A Max

Let us begin with an example:

Take a number: 56789. Rotate left, you get 67895.

Keep the first digit in place and rotate left the other digits: 68957.

Keep the first two digits in place and rotate the other ones: 68579.

Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains only one digit which rotated is itself.

You have the following sequence of numbers:

56789 -> 67895 -> 68957 -> 68579 -> 68597

and you must return the greatest: 68957.

Task

Write function max_rot(n) which given a positive integer n returns the maximum number you got doing rotations similar to the above example.

So max_rot (or maxRot or ... depending on the language) is such as:

max_rot(56789) should return 68957

max_rot(38458215) should return 85821534


*/
public class RotateForAMax {
    public static long maxRot(long n) {
      long result = n;
      String x = String.valueOf(n);
      for (int i = 1; i < x.length(); i++) {
        x = x.substring(0, i - 1) + x.substring(i) + x.charAt(i - 1);
        result = Math.max(result, Long.parseLong(x));
      }
      return result;
    }
}
/*-----------------------------------------------------------------
public class MaxRotate {
    
    public static long maxRot (long n) {
        String num = String.valueOf(n);

        for (int i = 0; i < num.length() - 1; i++) {
            num = num.substring(0, i) + 
                    num.substring(i + 1) + 
                    num.charAt(i);
            
            if (Long.parseLong(num) > n) {
                n = Long.parseLong(num);
            }
        }

        return n;
    }
}
-------------------------------------------------------------------
import java.util.Set;
import java.util.TreeSet;

public class MaxRotate {
    
    public static long maxRot (long n) {
       TreeSet<Long> r = new TreeSet<Long>();
       r.add(n);
        
       StringBuilder o = new StringBuilder(String.valueOf(n)); 
       for (int index=0;index<o.length();index++)
         r.add(swap(o,index));
       
       return r.last();
    }
    
    public static Long swap(StringBuilder o,int index) {
       char c = o.charAt(index);
       o.deleteCharAt(index);
       o.append(c);
       return Long.parseLong(o.toString());
    }
}
--------------------------------------------------------------------
public class MaxRotate {
    
    public static long maxRot (long n) {
        String val = String.valueOf(n); //converted to string so we can use substring
        String temp = "";
        long max = n;
        
        for(int i=1; i<val.length(); i++){
			    val = temp.substring(0,i-1)+val.substring(i)+val.substring(i-1,i); //rotation
			    max = Math.max(max,Long.parseLong(val)); //get maximum as program operates
			    temp = val; //temporary storage of previous state of string
          
		    }
        
        return max;
    }
}
--------------------------------------------------------------------
public class MaxRotate {

    public static int length(long n){
      int i=0;
      while(n!=0){
        i++; n/=10;
      }
      return i;
    }
    
    public static long pow(int x, int n){
    	int i;
    	long m = 1;
    	for(i=1;i<=n;i++){
    		m = m*x;
    	}
    	return m;
    }
    
    public static long rotate(int i, long n){
      int len = length(n);
      return n - n%(pow(10,len-i)) + n%(pow(10,len-i-1))*10 + (n/(pow(10,len-i-1)))%10  ;
      
    }
    public static long maxRot (long n) {
        // your code
    	int i;
    	long max = n;
    	//System.out.println(length(n));
    	for(i=0;i<length(n);i++){
    		System.out.println(n);
    		n = rotate(i,n);
    		if(max < n) max = n;
    	}
    	return max;
    }
}
--------------------------------------------------------------------
public class MaxRotate {
    public static long maxRot (long n) {
      String input = String.valueOf(n);
      for (int i = 0; i < input.length()-1; i++) {
         input = input.substring(0, i) + input.substring(i+1, input.length()) + input.charAt(i);
         long current = Long.parseLong(input);
         if (n < current) n = current;
      }
      return n;
   }
}
---------------------------------------------------------------------
public class MaxRotate {
    
    public static long maxRot(long n) {
        String number = String.valueOf(n);
        long result = n;
        for(int i = 0; i<number.length(); i++) {
            number = determineNewValue(number, i);
            if(Long.parseLong(number) > result){
                result = Long.parseLong(number);
            }
        }
        return result;
    }

    private static String determineNewValue(String stringOfLong, int numberOfRotations) {
        return stringOfLong.substring(0, numberOfRotations) +
                stringOfLong.substring(numberOfRotations + 1) +
                stringOfLong.substring(numberOfRotations, numberOfRotations + 1);
    }
}
--------------------------------------------------------------------
public class MaxRotate {
    
    public static long maxRot (long n) {
        String s = String.valueOf(n); String res = ""; long mx = n;
        if (s.length() == 1) return n;
        while (true) {
            // left rotate s
            String r = s.substring(1) + s.charAt(0);
            s = r;
            // keep first char
            res += s.charAt(0);
            // new s
            s = s.substring(1);
            long nb = Long.parseLong(res + s);
            if (nb > mx) mx = nb;
            if (s.length() == 1) break;
        }
        return mx;
    }
}
---------------------------------------------------------------------
public class MaxRotate {
    
    public static long maxRot (long n) {
        String numstr = String.valueOf(n);
        long result = n;
        for (int i = 0; i < numstr.length() - 1; i++) {
            numstr = numstr.substring(0, i) + numstr.substring(i + 1) + numstr.charAt(i);
            if (Long.parseLong(numstr) > result) result = Long.parseLong(numstr);
            System.out.println(result);
        }
        return result;
    }
  
}
---------------------------------------------------------------------
import java.util.Arrays;

public class MaxRotate {
    
    public static long maxRot (long n) {
        char[] c_arr = Long.toString(n).toCharArray();
        Long[] numbers = new Long[c_arr.length];
        numbers[0] = Long.valueOf(String.valueOf(c_arr));                
        for(int i = 0 ; i < c_arr.length-1; i++){
          char saveDigit;
          saveDigit = c_arr[i];
          for(int j = i; j<c_arr.length; j++){
            if(j+1 < c_arr.length)
              c_arr[j] = c_arr[j+1];
            else{
              c_arr[j] = saveDigit;            
            }
          }
           numbers[i+1] = Long.valueOf(String.valueOf(c_arr));        
        }
        Arrays.sort(numbers);        
        return numbers[numbers.length - 1];
    }
}
-----------------------------------------------------------------------
public class MaxRotate {    
    public static long maxRot (long n) {
        String str = String.valueOf(n);
        long max = n;
      
        for (int i = 0; i < str.length() - 1; i++) {
            str = str.substring(0, i) + str.substring(i + 1) + str.substring(i, i + 1);
            max = Math.max(Long.valueOf(str), max);
        }
      
        return max;
    }
}
---------------------------------------------------------------------------
import java.util.*;

public class MaxRotate {
    
    public static long maxRot (long n) {
        ArrayList<String> array = new ArrayList<>();
        array.add(Long.toString(n));
        for(int j = 0; j < array.get(0).length() - 1; j++) {
            array.add(array.get(j).substring(0,j)
                    + array.get(j).substring(j + 1)
                    + array.get(j).substring(j, j + 1)
            );
        }

        long[] sortedArray = Arrays
                .stream(array.toArray(new String[0]))
                .mapToLong(Long::parseLong)
                .toArray();

        Arrays.sort(sortedArray);

        return sortedArray[sortedArray.length - 1];
    }
}
*/