/*    8KYU CodeWars  How Good Are You Really?

There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better 
than the average student in your class.
You receive an array with your peers' test scores. Now calculate 
the average and compare your score!

Return True if you're better, else False!

Note:
Your points are not included in the array of your class's points. 
For calculating the average point you may add your point to the given array!


*/
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    int result = 0;
    for (int i = 0; i < classPoints.length; i++) {
      result = result + classPoints[i];
    }
    result = result / classPoints.length;
    return result < yourPoints;
  }
}


/*------------------------------------------------------------------
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    long results = 0;
    for (int i = 0; i < classPoints.length; ++i) {
      results += classPoints[i];
    }
    if ((results / classPoints.length) > yourPoints) 
      return false;
    else 
      return true;
  }
  
}
----------------------------------------------------------------------------------------

import java.util.Arrays;

class Kata {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}

-------------------------------------------------------------------------------------------

import java.util.stream.*;

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return IntStream.of(classPoints).sum()/classPoints.length < yourPoints;
  }
}
--------------------------------------------------------------------------------------------






*/