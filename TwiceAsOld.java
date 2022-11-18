/*  8KYU CodeWars  Twice As Old

Your function takes two arguments:

1. current father's age (years)
2. current age of his son (years)

Сalculate how many years ago the father was twice as old 
as his son (or in how many years he will be twice as old). 
The answer is always greater or equal to 0, no matter if 
it was in the past or it is in the future.

*/

public class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
    return Math.abs(sonYears * 2 - dadYears);
  }

}
/*-----------------------------------------------------------
public class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
    int diff = dadYears - sonYears * 2;
    return diff > 0 ? diff : -diff;
  }

}
-------------------------------------------------------------






*/