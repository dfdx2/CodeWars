/* 7KYU CodeWars Name That Number!

In this kata, you'll be given an integer of range 0 <= x <= 99 and 
have to return that number spelt out in English. A few examples:

nameThatNumber(4)  // returns "four"
nameThatNumber(19) // returns "nineteen"
nameThatNumber(99) // returns "ninety nine"
Words should be separated by only spaces and not hyphens. No need 
to validate parameters, they will always be in the range [0, 99]. 
Make sure that the returned String has no leading of trailing spaces. 
Good luck!

*/
public class Kata {
  public static String nameThatNumber(int x) {
    String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String teen = "teen";
    if (x <= 0) {
      return "zero";
    }
    if (x < 10) {
      return ones[x - 1];
    }
    if (x % 10 == 0) {
      return tens[x / 10 - 1];
    }
    if (x == 18) {
      return "eighteen";
    }
    if (x == 11) {
      return "eleven";
    }
    if (x / 10 == 1) {
      return ones[x % 10 - 1] + teen;
    }
    return tens[x / 10 - 1] + " " + ones[x % 10 - 1];
  }
}
/*-------------------------------------------------------------------------
public class Kata {
  public static String nameThatNumber(int x) {
    String[] unit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
    if(x < 20)
      return unit[x];
    else if(x < 100)
      return (x % 10 == 0) ? tens[x / 10 - 2] : tens[x / 10 - 2] + " " + unit[x % 10];
    else
      return "";
  }
}
----------------------------------------------------------------------------
public class Kata {
  
  static String[] num1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
  "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
  static String[] num2 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
 
  public static String nameThatNumber(int x) {
    if (x >= 0 && x < 20) {
      return num1[x];
    } else {
      return num2[x / 10 - 2] + ((x % 10 == 0) ? "" : " " + num1[x % 10]);
    }
  }
}
---------------------------------------------------------------------------
class Kata {
  static String nameThatNumber(int x) {
    String[] unit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    return x < 20 ? unit[x] : tens[x / 10 - 2] + (x % 10 == 0 ? "" : " " + unit[x % 10]);
  }
}
---------------------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;

public class Kata {

    private static Map<Integer, String> numbers = new HashMap<>();

    static {
        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");
        numbers.put(11, "eleven");
        numbers.put(12, "twelve");
        numbers.put(13, "thirteen");
        numbers.put(14, "fourteen");
        numbers.put(15, "fifteen");
        numbers.put(16, "sixteen");
        numbers.put(17, "seventeen");
        numbers.put(18, "eighteen");
        numbers.put(19, "nineteen");
        numbers.put(20, "twenty");
        for (int i = 21; i <= 29; i++) {
            numbers.put(i, numbers.get(20) + " " + numbers.get(i % 20));
        }
        numbers.put(30, "thirty");
        for (int i = 31; i <= 39; i++) {
            numbers.put(i, numbers.get(30) + " " + numbers.get(i % 30));
        }
        numbers.put(40, "forty");
        for (int i = 41; i <= 49; i++) {
            numbers.put(i, numbers.get(40) + " " + numbers.get(i % 40));
        }
        numbers.put(50, "fifty");
        for (int i = 51; i <= 59; i++) {
            numbers.put(i, numbers.get(50) + " " + numbers.get(i % 50));
        }
        numbers.put(60, "sixty");
        for (int i = 61; i <= 69; i++) {
            numbers.put(i, numbers.get(60) + " " + numbers.get(i % 60));
        }
        numbers.put(70, "seventy");
        for (int i = 71; i <= 79; i++) {
            numbers.put(i, numbers.get(70) + " " + numbers.get(i % 70));
        }
        numbers.put(80, "eighty");
        for (int i = 81; i <= 89; i++) {
            numbers.put(i, numbers.get(80) + " " + numbers.get(i % 80));
        }
        numbers.put(90, "ninety");
        for (int i = 91; i <= 99; i++) {
            numbers.put(i, numbers.get(90) + " " + numbers.get(i % 90));
        }
    }

    public static String nameThatNumber(int x) {
        return numbers.get(x);
    }
}
---------------------------------------------------------------------------
public class Kata {
  public static String nameThatNumber(int x) {
    
    String[] tensNames = {
    "",
    "ten",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"};
      String[] numNames = {
    "",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"};
    
      if(x==0) return "zero";      
      else if(x<20) return numNames[x];     
      else if (x%10 == 0) return tensNames[x/10%10];      
      else return tensNames[x/10%10] + " " +numNames[x%10];
         
  }
}
----------------------------------------------------------------------------
public class Kata {
    public static String nameThatNumber(int x) {

        String result = "";

        String zero = "zero";
        String[] firstDigits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] secondDigits = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] exceptions = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        int firstDigit = x % 10;
        int secondDigit = x / 10;

        if(x == 0)
            result = zero;

        if(x > 0 && x < 10)
            result = String.valueOf(firstDigits[firstDigit - 1]);

        if(x == 10)
            result = secondDigits[0];

        if(x >= 11 && x < 20)
            result = String.valueOf(exceptions[firstDigit - 1]);

        if (x >= 20 && x <= 99) {

            result = firstDigit == 0 ?
                    String.valueOf(secondDigits[secondDigit - 1]) :
                    String.valueOf(secondDigits[secondDigit - 1]) + " " + String.valueOf(firstDigits[firstDigit - 1]);

        }

        return result;

    }
}
--------------------------------------------------------------------------
import java.util.*;

public class Kata {
    public static String nameThatNumber(int x) {
        
        switch (x) {
            case 0: return "zero";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
        }

        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        numbers.put(50, "fifty");
        numbers.put(60, "sixty");
        numbers.put(70, "seventy");
        numbers.put(80, "eighty");
        numbers.put(90, "ninety");

        return (x < 10 || x % 10 == 0) ? numbers.get(x) : numbers.get(x / 10 * 10) + " " + numbers.get(x % 10);
    }
}
-------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Kata {
static Map <Integer, String> ones = new HashMap<Integer, String>();
static Map <Integer, String> teens = new HashMap<Integer, String>();
static Map <Integer, String> tens = new HashMap<Integer, String>();

  public static String nameThatNumber(int x) {
  Kata.createMaps();
    if (x < 10) return ones.get(x);
    if (x < 20) return teens.get(x);
    if (x%10 == 0) {
        return tens.get(x/10);
    } else {
        return tens.get(x/10) + " " + ones.get(x%10);
    }
  }
  
  public static void createMaps(){
    ones.put(0, "zero");
    ones.put(1, "one");
    ones.put(2, "two");
    ones.put(3, "three");
    ones.put(4, "four");
    ones.put(5, "five");
    ones.put(6, "six");
    ones.put(7, "seven");
    ones.put(8, "eight");
    ones.put(9, "nine");
    teens.put(10, "ten");
    teens.put(11, "eleven");
    teens.put(12, "twelve");
    teens.put(13, "thirteen");
    teens.put(14, "fourteen");
    teens.put(15, "fifteen");
    teens.put(16, "sixteen");
    teens.put(17, "seventeen");
    teens.put(18, "eighteen");
    teens.put(19, "nineteen");
    tens.put(2, "twenty");
    tens.put(3, "thirty");
    tens.put(4, "forty");
    tens.put(5, "fifty");
    tens.put(6, "sixty");
    tens.put(7, "seventy");
    tens.put(8, "eighty");
    tens.put(9, "ninety");
  }
}

*/