/* 7KYU CodeWars Smoking Timmy

Timothy (age: 16) really likes to smoke. Unfortunately, he is too 
young to buy his own cigarettes and that's why he has to be extremely 
efficient in smoking.

It's now your task to create a function that calculates how many 
cigarettes Timothy can smoke out of the given amounts of bars 
and boxes:

a bar has 10 boxes of cigarettes,

a box has 18 cigarettes,

out of 5 stubs (cigarettes ends) Timothy is able to roll a new one,
of course the self made cigarettes also have an end which can be used 
to create a new one...

Please note that Timothy never starts smoking cigarettes that aren't 
"full size" so the amount of smoked cigarettes is always an integer.

*/

public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes){
    return (int) (225 * bars + 22.5 * boxes - .5);
  }
}
/*---------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes) {
    int smoked = (bars * 10 + boxes) * 18;
    int stubs = smoked;
    while (stubs >= 5) {
      smoked += stubs / 5;
      stubs = stubs / 5 + stubs % 5;
    }
    return smoked;
  }
}
-----------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes){
    int cigarettesInTheBox = 18;
    int cigarettesInTheBar = 10 * cigarettesInTheBox;
    
    int cigarettes = boxes*cigarettesInTheBox + bars*cigarettesInTheBar;
    
    for (int i = 1; i <= cigarettes; i++) {
      if (i % 5 == 0) cigarettes += 1;
    }
    
    
    return cigarettes;
  }
}
------------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes) {
    int smoked = 0;
    int notYetSmoked = (bars * 10 + boxes) * 18;
    int endsNotYetUsed = 0;
    while (notYetSmoked > 0) {
      int justSmoked = notYetSmoked;
      smoked += justSmoked;
      int endsAvailable = justSmoked + endsNotYetUsed;
      int justSelfMade = endsAvailable / 5;
      endsNotYetUsed = endsAvailable % 5;
      notYetSmoked = justSelfMade;
    }
    return smoked;
  }
}
------------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes){
    int cigarettes = bars * 180 + boxes * 18;
    int stubs = 0;
    int noStubs = cigarettes;
    while (noStubs > 5){
      noStubs -= 4;
      stubs += 1;
    }
    return cigarettes + stubs; 
  }
}
------------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes) {
    int cigarettes = (bars * 10 + boxes) * 18;
    return cigarettes + reuseStubs(cigarettes);
  }
  
  private static int reuseStubs(int stubs) {
    if (stubs < 5) return 0;
    
    return stubs / 5 + reuseStubs(stubs / 5 + stubs % 5);
  }
}
------------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes){
    
    int totalCigarette = ((bars * 10) + boxes) * 18;
    int extraCigarette = 0;
    int baseCigarette = totalCigarette;
    
    while (baseCigarette - 5 > 0){
      baseCigarette = baseCigarette - 4;
      extraCigarette = extraCigarette + 1;
    }
    return totalCigarette + extraCigarette;
  }
}
------------------------------------------------------------------------------
public class SmokingTimmy{
  public static int startSmoking(int bars, int boxes) {
    int cigarettes = (bars * 10 + boxes) * 18;
    int count = cigarettes;
    
    while (cigarettes > 5) {
      int num = cigarettes / 5;
      count += num;
      cigarettes = num + cigarettes % 5;
    }
    
    return count;
  }
}
-------------------------------------------------------------------------------
class SmokingTimmy {
  static int startSmoking(int bars, int boxes) {
    double cigarettes = 180 * bars + 18 * boxes, ends = cigarettes;
    while (ends > 1) {
      cigarettes += ends /= 5.;
    }
    return (int) cigarettes;
  }
}
*/