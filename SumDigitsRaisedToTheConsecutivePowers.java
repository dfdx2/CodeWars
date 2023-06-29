/* 6KYU CodeWars Take A Number And Sum Its Digits Raised To The Consectutive Powers

The next number in having this property is 
135
135:

See this property again: 
135
=
1
1
+
3
2
+
5
3
135=1 
1
 +3 
2
 +5 
3
 

Task
We need a function to collect these numbers, that may receive two integers
a, b that defines the range [a,b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.

Examples
Let's see some cases (input -> output):

1, 10  --> [1, 2, 3, 4, 5, 6, 7, 8, 9]
1, 100 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]

If there are no numbers of this kind in the range [a,b] the function should output an empty list.

90, 100 --> []


*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.range(a, b + 1)
          .filter(i -> {
            String result = Long.toString(i);
            long total = 0;
            for (int j = 0; j < result.length(); j++) {
              total += Math.pow(Character.getNumericValue(result.charAt(j)), j + 1);
            }
            return total == i;
          })
          .boxed()
          .collect(Collectors.toList());
    }
}
/*---------------------------------------------------------------------------
import java.util.List;
import java.util.stream.*;


class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.rangeClosed(a, b)
          .filter(i -> isValid(i))
          .boxed()
          .collect(Collectors.toList());
    }
    
    private static boolean isValid(long x){
      String value = Long.toString(x);
      return IntStream.range(0, value.length())
         .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
         .sum() == x;
    }
}
----------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++)
            if(isEureka(i))
                result.add(i);
        return result;
    }

    private static boolean isEureka(long n) {
        long tmp = n;
        long sum = 0;
        int power = length(n);
        while (tmp > 0) {
            sum += (long) Math.pow(tmp % 10, power);
            tmp /= 10;
            power--;
        } 
        return sum == n;    
    }

    private static int length(long n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }
}
---------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;
class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> retList = new ArrayList<Long>();
        for(int i = (int)a; i<= (int)b; i++){
          char[] number = String.valueOf(i).toCharArray();
          int sum = 0;
          for(int j=0; j<number.length;j++){
            sum += (int)Math.pow((number[j] - 48),j+1);
          }
          if(sum == i)
            retList.add(Long.valueOf(i));
        }       
        return retList;
    }
}





*/