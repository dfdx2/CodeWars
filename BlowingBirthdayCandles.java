/* 7KYU CodeWars Blowing Birthday Candles

Background

Today is the special day you've been waiting for — it's your birthday! 
It's 8 AM and you're setting up your birthday cake for the party. It's 
time to put the candles on top.

You take out all the candles you've bought. As you are about to put them
on the cake, you just realize that there are numbers on each candles. 
What are these numbers?! After searching about it on the internet, turns 
out these are special candles. These candles need to be blown a certain 
number of times before they're finally extinguished, and those numbers on 
the candles are the required times to blow them.

Being one who plans meticulously, you want to determine the total number 
of blows you need to extinguish all the candles once you've put them on 
the cake.

Task

Given a string containing digits (representing the strength of the candles), 
calculate the number of blows you need to extinguish all the candles.

Starting at the beginning of the string, each blow can only reach 3 candles, 
reducing their strength by one each. You can only reach more candles once 
those directly in front of you are extinguished.

Examples

Input: "1321"

Move 1 | "(132)1" -> "0211"
Move 2 | "0(211)" -> "0100"
Move 3 | "0(100)" -> "0000"

This should return 3.
Input: "0323456"

Move 1 | "0(323)456" -> "0212456"
Move 2 | "0(212)456" -> "0101456"
Move 3 | "0(101)456" -> "0000456"   
Move 4 | "0000(456)" -> "0000345"
Move 5 | "0000(345)" -> "0000234"
Move 6 | "0000(234)" -> "0000123"
Move 7 | "0000(123)" -> "0000012"
Move 8 | "00000(12)" -> "0000001"
Move 9 | "000000(1)" -> "0000000"

This should return 9.
Input: "2113"

Move 1 | "(211)3" -> "1003"
Move 2 | "(100)3" -> "0003"
Move 3 | "000(3)" -> "0002"
Move 4 | "000(2)" -> "0001"
Move 5 | "000(1)" -> "0000"

This should return 5.
Good luck blowing all those candles ;-)

*/

class BlowingBirthdayCandles {
  public static int blowCandles(String str) {
    int[] result = new int[4];
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      result[0] = Math.max(ch - 48 - result[1] - result[2], 0);
      result[2] = result[1];
      result[1] = result[0];
      result[3] += result[0];
    }
    return result[3];
  }
}
/*------------------------------------------------------------------
class Kata {
  public static int blowCandles(String str) {
    int n = str.length();
    int[] candles = new int[n];
    for (int i = 0; i < n; i++) {
      candles[i] = str.charAt(i) - '0';
    }

    int blows = 0;

    // Loop over the candle array
    for (int i = 0; i < n; i++) {
      // If the current candle has a strength greater than zero
      if (candles[i] > 0) {
        // Calculate the number of blows needed to extinguish the current candle
        int blowCount = candles[i];
        // Apply the blows to the current and the next two candles
        for (int j = i; j < i + 3 && j < n; j++) {
          candles[j] -= blowCount;
        }
        // Increment the blow counter by the number of blows applied
        blows += blowCount;
      }
    }

    return blows;
  }
}
--------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.stream.Collectors;
class Kata{
public static int blowCandles(String str) {
    var u = 0;
    while (!str.matches("0*")) {
        str = Pattern.compile("[^0].{0,2}").matcher(str)
                .replaceFirst(x -> x.group().chars().mapToObj(y -> Math.max(y - '1', 0) + "")
                        .collect(Collectors.joining("")));
        u++;
    }
    return u;
}
}

---------------------------------------------------------------------
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;
class Kata
{
     record StoreTimeAndStringValue(int times, String currentString) {
    }

    public static int blowCandles(String str) {
        StringBuilder builder = new StringBuilder(str);
        var timesCounter = 0;
        var moveRight = 0;
        if (builder.toString().length() == 1 && builder.toString().charAt(0) == '0'){
            return 0;
        }
        for (int index = 0; index < builder.toString().length(); index++) {
            if (validateDigitWhenTheInitialOneIsZero(builder.toString())){
                moveRight = loopUpToTheFinalZero(builder.toString());
            }
            var setOfNumbers = getSetOfNumbers(moveRight, builder.toString());
            StoreTimeAndStringValue storeTimeAndStringValue = timesToSubtract(setOfNumbers);
            builder.replace(moveRight, storeTimeAndStringValue.currentString().length() + moveRight,
                    storeTimeAndStringValue.currentString());
            timesCounter += storeTimeAndStringValue.times();
        }

        return timesCounter;
    }

    private static int loopUpToTheFinalZero(String string) {
        for (int index = 0; index < string.length(); index++) {
            if (string.charAt(index) != '0'){
                return index;
            }
        }
        return 1;
    }

    private static String getSetOfNumbers(final int index, final String split) {

        final var offset = (split.length() - 1) - index;

        if (offset == 0) {
            return Character.toString(split.charAt(index));
        }

        String indexOne = Character.toString(split.charAt(index + 1));
        if (offset == 1) {
            return split.charAt(index) + indexOne;
        }

        return split.charAt(index) + indexOne + split.charAt(index + 2);

    }

    public static StoreTimeAndStringValue timesToSubtract(String setOfNumbers) {
        var time = 0;
        final var numberToSubstract = getNumberToSubstract(setOfNumbers, 1);
        final var numberToReach = getNumberToSubstract(setOfNumbers, 0);
        while (!setOfNumbers.equals(numberToReach)) {
            if (validateDigit(setOfNumbers)) {
                setOfNumbers = subtractStringNumber(setOfNumbers, numberToSubstract);
            } else {
                setOfNumbers = subtractStringNumber(setOfNumbers,
                        subtractWhenThereIsAZeroDigit(setOfNumbers));
            }
            time++;
            if (validateDigitWhenTheInitialOneIsZero(setOfNumbers)) {
                return new StoreTimeAndStringValue(time, setOfNumbers);
            }
        }
        return new StoreTimeAndStringValue(time, setOfNumbers);

    }

    private static boolean validateDigitWhenTheInitialOneIsZero(String setOfNumbers) {
        return setOfNumbers.charAt(0) == '0';
    }

    private static String subtractStringNumber(final String stringToBeSubtracted, final String stringThatSubtracts) {
        final String[] stringsA = stringToBeSubtracted.split("");
        final String[] stringsB = stringThatSubtracts.split("");
        final StringBuilder storeNewValue = new StringBuilder();
        for (int index = 0; index < stringToBeSubtracted.length(); index++) {
            storeNewValue.append(
                    parseInt(stringsA[index]) -
                            parseInt(stringsB[index]));
        }
        return storeNewValue.toString();
    }

    private static String subtractWhenThereIsAZeroDigit(final String validateDigit) {
        final StringBuilder storeNewValues = new StringBuilder();
        IntStream.range(0, validateDigit.length())
                .forEach(index -> {
                    if (validateDigit.charAt(index) == '0') {
                        storeNewValues.append(0);
                    } else {
                        storeNewValues.append(1);
                    }
                });
        return storeNewValues.toString();
    }

    private static boolean validateDigit(final String validateDigit) {
        return IntStream.range(0, validateDigit.length())
                .noneMatch(index -> validateDigit.charAt(index) <= '0');
    }

    private static String getNumberToSubstract(String setOfNumbers, int numberToSubtract) {
        return Integer.toString(numberToSubtract).repeat(setOfNumbers.length());
    }
}
--------------------------------------------------------------------
class Kata
{
  public static int blowCandles(String str)
  {
    int a = 0, b = 0, result = 0;
    
    for(char res : str.toCharArray()){
      int num = (int)res - '0' - a - b;
      b = a;
      a = Math.max(num, 0);
      result += a;
    }
    return result;
  }
}
---------------------------------------------------------------------
class Kata
{
  public static int blowCandles(String str)
  {
    int a = 0, b = 0, res = 0;
    for (char x : str.toCharArray()) {
      int t = (int)x - '0' - a - b;
      b = a;
      a = Math.max(t, 0);
      res += a;
    }
    return res;
  }
}
----------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static org.apache.commons.lang3.StringUtils.stripStart;
import static org.apache.commons.lang3.StringUtils.substring;

class Kata {

  public static int blowCandles(String str) {
    String trimedStr = stripStart(str, "0");
    
    if (trimedStr.length() == 0) {
      return 0;
    }
    
    return 1 + blowCandles(
      trimedStr.chars()
        .limit(3)
        .map(n -> n - '0' - 1)
        .map(n -> Math.max(0, n))
        .mapToObj(Integer::toString)
        .collect(joining())
        .concat(substring(trimedStr, 3))
    );
  }

}
---------------------------------------------------------------------
import java.util.stream.Collectors;

class Kata {
  public static int blowCandles(String str) {
    // Let's see how we gonna blow these candles...
    int count = 0;
    while (str.length() != 0) {
      
      // create substring from input string
      String subStr = str.chars().limit(3)
              .mapToObj(ch -> (ch - 48) + "")
              .collect(Collectors.joining());
      
      // reduce the input string by the previously created substring
      str = str.chars().skip(subStr.length())
              .mapToObj(ch -> (ch - 48) + "")
              .collect(Collectors.joining());
      
      //check the first character of the created substring for '0'
      if (subStr.charAt(0) == '0') {
        subStr = subStr.substring(1)
                + str.chars().limit(1)
                .mapToObj(ch -> (ch - 48) + "")
                .collect(Collectors.joining());
        str = str.chars().skip(1)
                .mapToObj(ch -> (ch - 48) + "")
                .collect(Collectors.joining());
      }
      
      // processing the substring
      // max length substring is '3'
      while (!subStr.matches("0*")) {
        
        // check the first character of the substring for '0'
        if (subStr.charAt(0) == '0') {
          subStr = subStr.substring(1)
                  + str.chars().limit(1)
                  .mapToObj(ch -> ch - 48 + "").collect(Collectors.joining());
          str = str.chars().skip(1)
                  .mapToObj(ch -> (ch - 48) + "")
                  .collect(Collectors.joining());
          
          // check the second character of the substring for '0'
          if (subStr.charAt(0) == '0') {
            subStr = subStr.substring(1) + str.chars().limit(1)
                    .mapToObj(ch -> ch - 48 + "").collect(Collectors.joining());
            str = str.chars().skip(1)
                    .mapToObj(ch -> (ch - 48) + "")
                    .collect(Collectors.joining());
          }
        }
       
        // substring processing after character checking
        subStr = subStr.chars().map(ch -> ((ch - 48) - 1))
                .map(num -> Math.max(num, 0))
                .mapToObj(ch -> ch + "")
                .collect(Collectors.joining());
        count++;
      }
    }
    return count;
  }
}
*/