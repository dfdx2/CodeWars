/* 6KYU CodeWars Roman Numerals Encoder

Create a function taking a positive integer between 1 and 3999 
(both included) as its parameter and returning a string containing 
the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit 
separately starting with the leftmost digit and skipping any 
digit with a value of zero. There cannot be more than 3 identical 
symbols in a row.

In Roman numerals:

1990 is rendered: 1000=M + 900=CM + 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.
Example:

   1 -->       "I"
1000 -->       "M"
1666 --> "MDCLXVI"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000



*/

public class RomanNumeralsEncoder1 {

    public String solution(int n) {
        return "I".repeat(n).replace("IIIII", "V").replace("IIII", "IV")
          .replace("VV", "X").replace("VIV", "IX").replace("XXXXX", "L")
          .replace("XXXX", "XL").replace("LL", "C").replace("LXL", "XC")
          .replace("CCCCC", "D").replace("CCCC", "CD").replace("DD", "M")
          .replace("DCD", "CM");
    }
}
/*--------------------------------------------------------------------
import java.util.*;

public class Conversion {

    private static TreeMap<Integer, String> MAP;
    static { 
      MAP = new TreeMap<Integer, String>(Collections.reverseOrder());
      MAP.put( 1, "I" );
      MAP.put( 4, "IV" );
      MAP.put( 5, "V" );
      MAP.put( 9, "IX" );
      MAP.put( 10, "X" );
      MAP.put( 40, "XL" );
      MAP.put( 50, "L" );
      MAP.put( 90, "XC" );
      MAP.put( 100, "C" );
      MAP.put( 400, "CD" );
      MAP.put( 500, "D" );
      MAP.put( 900, "CM" );
      MAP.put( 1000, "M" );
    }
    
    public String solution(int n) {     
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Integer, String> entry: MAP.entrySet() ){
          int i = entry.getKey();
          String s = entry.getValue();
          while( n>=i ){
            builder.append(s);
            n -= i;
          }      
        }
        return builder.toString();
    }
    

}

----------------------------------------------------------------------
public class Conversion {

    public String solution(int n) {
        final String[] digit = {"", "I", "II", "III", "IV", "V", "VI", "VII",
                                  "VIII", "IX"};
        final String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX",
                                  "LXXX", "XC"};
        final String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
                                  "DCCC", "CM"};
        final String[] thousand = {"", "M", "MM", "MMM"};
        
        String result="";
        result = thousand[n/1000] + hundred[n%1000/100] + ten[n%100/10] +
                  digit[n%10];
        return result;
    }
}
----------------------------------------------------------------------
public class Conversion {

    public String solution(int number) {
        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (number > 0 || arab.length == (i - 1)) {
            while ((number - arab[i]) >= 0) {
                number -= arab[i];
                result.append(romanNumbers[i]);
            }
            i++;
        }
        return result.toString();
    }
}
-----------------------------------------------------------------------
public class Conversion {

    static final String R1[]    = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
    static final String R10[]   = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    static final String R100[]  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    static final String R1000[] = {"", "M", "MM", "MMM" };
    
    public String solution(int n) {    
        return R1000[n/1000]+R100[n%1000/100]+R10[n%100/10]+R1[n%10];
    }
}
-----------------------------------------------------------------------
public class Conversion {
  private static final int[] arabs = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1, };
  private static final String[] romans = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  public String solution(int n) {
    final StringBuilder roman = new StringBuilder();
    int i = 0;
    while (n > 0) {
      if (n >= arabs[i++]) {
        roman.append(romans[--i]);
        n = n - arabs[i];
      }
    }
    return roman.toString();
  }
}
----------------------------------------------------------------------
import java.util.TreeMap;

public class Conversion {

	private final static TreeMap<Integer, String> ROMAN_NUMBERS_MAP = new TreeMap<Integer, String>(); // Must use TreeMap -> floorKey Method

	static {
		ROMAN_NUMBERS_MAP.put(1000, "M");
		ROMAN_NUMBERS_MAP.put(900, "CM");
		ROMAN_NUMBERS_MAP.put(500, "D");
		ROMAN_NUMBERS_MAP.put(400, "CD");
		ROMAN_NUMBERS_MAP.put(100, "C");
		ROMAN_NUMBERS_MAP.put(90, "XC");
		ROMAN_NUMBERS_MAP.put(50, "L");
		ROMAN_NUMBERS_MAP.put(40, "XL");
		ROMAN_NUMBERS_MAP.put(10, "X");
		ROMAN_NUMBERS_MAP.put(9, "IX");
		ROMAN_NUMBERS_MAP.put(5, "V");
		ROMAN_NUMBERS_MAP.put(4, "IV");
		ROMAN_NUMBERS_MAP.put(1, "I");
	}

	public static String solution(int number) {
		Integer key = ROMAN_NUMBERS_MAP.floorKey(number);
		if (key == null)
			return "No roman equivalent";
      
		if (number == key.intValue()) // Fits perfectly
			return ROMAN_NUMBERS_MAP.get(number);
      
		return ROMAN_NUMBERS_MAP.get(key) + solution(number - key); // Add rest recursively
	}
}
---------------------------------------------------------------------
public class Conversion {

  String[][] c={
			{"","I","II","III","IV","V","VI","VII","VIII","IX"},
			{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
			{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
			{"","M","MM","MMM"}
	};

    public String solution(int num) {
    	
    	StringBuffer roman = new StringBuffer();
        roman.append(c[3][num / 1000 % 10]);
        roman.append(c[2][num / 100 % 10]);
        roman.append(c[1][num / 10 % 10]);
        roman.append(c[0][num % 10]);
    	
        return roman.toString();
    }
}

*/