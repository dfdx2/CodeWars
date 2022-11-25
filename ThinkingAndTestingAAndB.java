/* 7KYU CodeWars Thinking & Testing A & B

DESCRIPTION:

No Story

No Description

Only by Thinking and Testing

Look at result of testcase, guess the code!

*/

public class ThinkingAndTesting {

  public static int testAB(int a, int b) {
  
    return a | b;
  }
}
/*------------------------------------------------------------------------------------- 
public class ThinkingAndTesting {

  public static int testAB(int a, int b) {
    /*
      Since the expected values for the test cases do
      not work with basic arithmentic operators. Lets
      use bitwise operators. 
     
      If we look at the input and output integer values 
      as 8 bit values, we can see that the operator being
      used is an '|' (bitwise or).
     
      e.g. 
             a:  0000 1010 base 2  (10 decimal)
             b:  0001 0100 base 2  (20 decimal)
        output:  0001 1110 base 2  (30 decimal)
     
    return a | b;
  }
}
----------------------------------------------------------------------------------------
public class ThinkingAndTesting {
  // presented by someone I don't know but dislike A LOT
  public static int testAB(int aKataMadeBy, int toxicAsshole) {
    
    String hatePeopleLikeAuthor = String.format("%10s", Integer.toString(aKataMadeBy, 2)).replaceAll(" ", "0");
    String wishHimAllTheWorst = String.format("%10s", Integer.toString(toxicAsshole, 2)).replaceAll(" ", "0");

    var goddamnPervert = new StringBuilder();

    for (int spittingAtHim = 0; spittingAtHim < 10; spittingAtHim++) {
        if ((hatePeopleLikeAuthor.substring(spittingAtHim, spittingAtHim+1).equals("1") ||
                wishHimAllTheWorst.substring(spittingAtHim, spittingAtHim+1).equals("1")))
        {
            goddamnPervert.append(1);
        }
        else goddamnPervert.append(0);
    }

    return Integer.parseInt(goddamnPervert.toString(), 2);
  } // God why can't it just be about coding and learning Java like it should
    // why do I have to solve ill-minded puzzles from an unknown no lifer 
    // ugly
    // ugly
    // ugly
}
-------------------------------------------------------------------------------------------------------
public class ThinkingAndTesting {

  public static int testAB(int a, int b) {
    // Good luck!
    String binaryA = toBinary("",a);
    String binaryB = toBinary("",b);
    Long sum = Long.parseLong(binaryA) + Long.parseLong(binaryB);
   String binarySum = sum + "";
    if (binarySum.contains("23456789")){
      return a;
    }
    return toDecimal (binarySum.toCharArray(),0,0,binarySum.length()-1);
    
  }
  public static String toBinary(String binary, int prevDivRes) {
        if (prevDivRes < 2) {
            return prevDivRes + binary;
        }
        return toBinary(prevDivRes%2 + binary,prevDivRes/2);
    }
  public static Integer toDecimal(char[] chars, Integer result, int currentIndex, int pow) {
        if (currentIndex == chars.length) {
            return result;
        }
        Double d = Math.pow(2,pow);
        int i = (int)d.doubleValue() * (chars[currentIndex] == '0' ? 0 : 1);
        return toDecimal(chars,
                result + i,
                currentIndex + 1, pow - 1);
    }
}
-------------------------------------------------------------------------------------------------------------


*/