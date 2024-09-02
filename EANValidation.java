/* 7KYU CodeWars EAN Validation

A lot of goods have an International Article Number 
(formerly known as "European Article Number") abbreviated "EAN". 
EAN is a 13-digits barcode consisting of 12-digits data followed 
by a single-digit checksum (EAN-8 is not considered in this kata).


The single-digit checksum is calculated as followed (based upon the 12-digit data):

The digit at the first, third, fifth, etc. position (i.e. at the odd position) has 
to be multiplied with "1".

The digit at the second, fourth, sixth, etc. position (i.e. at the even position) 
has to be multiplied with "3".

Sum these results.

If this sum is dividable by 10, the checksum is 0. Otherwise the checksum has the following formula:

checksum = 10 - (sum mod 10)

For example, calculate the checksum for "400330101839" (= 12-digits data):

4·1 + 0·3 + 0·1 + 3·3 + 3·1 + 0·3 + 1·1 + 0·3 + 1·1 + 8·3 + 3·1 + 9·3
= 4 + 0 + 0 + 9 + 3 + 0 + 1 + 0 + 1 + 24 + 3 + 27
= 72
10 - (72 mod 10) = 8 ⇒ Checksum: 8

Thus, the EAN-Code is 4003301018398 (= 12-digits data followed by single-digit checksum).

Your Task

Validate a given EAN-Code. Return true if the given EAN-Code is valid, otherwise false.

Assumption

You can assume the given code is syntactically valid, i.e. it only consists of numbers 
and it exactly has a length of 13 characters.

Examples

EANValidator.validate("4003301018398") // true

EANValidator.validate("4003301018392") // false

Good Luck and have fun.

*/
import static java.util.stream.IntStream.range;
public class EANValidation {    
    public static boolean validate(final String eanCode) {
      int total = range(0, 12).map(i -> (eanCode.charAt(i) - 48) * (i % 2 > 0 ? 3 : 1)).sum();
      return eanCode.charAt(12) - 48 == (total % 10 > 0 ? 10 - total % 10 : 0);
    }
}
/*-----------------------------------------------------------------------
public class EANValidator {    
    
    private static int factor = 3;

    public static boolean validate(final String eanCode) {

        int checksum = eanCode
                .chars()
                .limit(eanCode.length() - 1)
                .map(i -> Character.getNumericValue((char) i))
                .reduce(0, (sum, i) -> {
                    factor = factor == 1 ? 3 : 1;
                    return sum + i * factor;
                });
        checksum = (checksum % 10 == 0 ? 0 : 10 - (checksum % 10));
        return checksum == Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
    }
}
-------------------------------------------------------------------------
public class EANValidator {    
    public static boolean validate(final String eanCode) {
      int sum = 0, count = 0;
      for(String s : eanCode.substring(0,eanCode.length()-1).split("")){
        sum += (count%2==1)?(s.charAt(0)-'0')*3:s.charAt(0)-'0';
        count++;
      }
      return ((sum%10==0 && eanCode.charAt(eanCode.length()-1)-'0'==0) || (10-(sum%10)==(eanCode.charAt(eanCode.length()-1)-'0')));
    }
}
-------------------------------------------------------------------------
public class EANValidator {    
    public static boolean validate(final String eanCode) {
       // Store the last digit of the eanCode as the given checksum
       int givenchecksum = (int)eanCode.charAt(eanCode.length()-1) - 48;
       // computedchecksum will store the calculated checksum
       int computedchecksum = 0;
       
       // for every digit (- the checksum one)
       for (int i = 0; i < eanCode.length()-1; i++){
           // add to computedchecksum: (digitvalue)*(1 if odd, 3 if even)
           computedchecksum += ((int)eanCode.charAt(i)-48) * ((i%2 * 2) + 1);
       }
       // using the formula 10-(checksum mod 10) we'll get the final value of the checksum
       // Perform another (% 10) to handle the case were the sum was divisible by 10
       computedchecksum = (10 - (computedchecksum % 10)) % 10;
       
       // Return true if the two checksums match, false o.w.
       return givenchecksum == computedchecksum;
    }
}

--------------------------------------------------------------------------
public class EANValidator {    
    //Solution favours readability over conciseness
    public static boolean validate(final String eanCode) {
       int sum = 0;
       int checksum = Integer.parseInt(eanCode.substring(12));
       
       for(int i=1; i<eanCode.length(); i++) {
         int currentIntFromString = Integer.parseInt(eanCode.substring(i-1, i));          
         sum += (i % 2 == 0) ? 3 * currentIntFromString : currentIntFromString;
       }
       
       boolean sumDivisibleByTen = sum%10==0;    
       return (sumDivisibleByTen && checksum == 0) || 10-(sum%10) == checksum;
    }
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class EANValidator {    
    public static boolean validate(final String eanCode) {
        final int sumToCheck = IntStream
                .range(0, eanCode.length() - 1)
                .reduce(0, (acc, index)
                        -> acc + Character.getNumericValue(eanCode.charAt(index)) * (1 + 2 * (index % 2)));
        final int checksum = sumToCheck % 10 == 0 ? 0 : 10 - (sumToCheck % 10);
        return Character.getNumericValue(eanCode.charAt(eanCode.length() - 1)) == checksum;
    }
}
--------------------------------------------------------------------------
public class EANValidator {
    private static int factor;

    public static boolean validate(final String eanCode) {
        factor = 1;
        int checksum = eanCode.substring(0, eanCode.length() - 1)
                              .chars()
                              .map(i -> Character.getNumericValue((char) i))
                              .map(i -> { int result = i * factor;
                                          factor = factor == 1 ? 3 : 1;
                                          return result; 
                                        })
                              .sum();

        checksum = (checksum % 10 == 0 ? 0 : (10 - checksum % 10));
        
        return Character.getNumericValue(eanCode.charAt(eanCode.length() - 1)) == checksum;
    }
}
--------------------------------------------------------------------------
import java.util.stream.IntStream;

public class EANValidator {
  public static boolean validate(final String eanCode) {
    return getCheckSum(eanCode.substring(0, 12)) == Character.getNumericValue(eanCode.charAt(12));
  }
  
  private static int getCheckSum(String code) {
    int sum = getSum(code);
    return sum % 10 == 0 ? 0 : 10 - (sum % 10);
  }
  
  private static int getSum(String code) {
    return IntStream.range(0, code.length())
                    .map(i -> i % 2 == 0 ? Character.getNumericValue(code.charAt(i)) : 
                                           Character.getNumericValue(code.charAt(i)) * 3)
                    .sum();
  }
}
*/