/* 7KYU CodeWars Cogs 2

Kata Task
You are given a list of cogs in a gear train

Each element represents the number of teeth of that cog

e.g. [100, 50, 25] means

1st cog has 100 teeth
2nd cog has 50 teeth
3rd cog has 25 teeth
If the nth cog rotates clockwise at 1 RPM what is the RPM of the cogs at each end of the gear train?

Notes

no two cogs share the same shaft
return an array whose two elements are RPM of the first and last cogs respectively
use negative numbers for anti-clockwise rotation
for convenience n is zero-based
For C and NASM coders, the returned array will be free'd.

*/
public class Dinglemouse {
  public static double[] cogRpm(final int[] cogs, final int n) {
    return new double[] {(n % 2 == 0 ? 1. : -1.) * cogs[n] / cogs[0], ((cogs.length - 1 - n) % 2 == 0 ? 1. : -1.) * cogs[n] / cogs[cogs.length - 1]};
  }
}
/*--------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    final double[] dir = {1,-1};
    return new double[] { 
      dir[n % 2] * cogs[n] / cogs[0], 
      dir[(cogs.length - n + 1) % 2] * cogs[n] / cogs[cogs.length-1] 
    };
  }

}
----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    double[] result = {cogs[n]/(double)cogs[0], cogs[n]/(double)cogs[cogs.length-1]};
		    result[0] = (n == 0 || n%2 == 0) ? result[0] : -result[0];
		    result[1] = (n - cogs.length)%2 != 0 ? result[1] : -result[1];
		    return result;
  }

}
----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    double first = 1;
    double last = 1;
    
    for (int i = n - 1; i >= 0; i--) {
      first *= cogs[i + 1] / (double) -cogs[i];
    }
    
    for (int i = n + 1; i < cogs.length; i++) {
      last *= cogs[i - 1] / (double) -cogs[i];
    }
    
    return new double[]{first, last};
  }

}
----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    for( int a : cogs){
      System.out.println(a);
    }
    double first = 1;
    for (int i=n; i > 0; i--){
      first *= (double)cogs[i] / cogs[i-1] * -1; 
    } 
    double last = 1;
    for (int i=n+1; i < cogs.length; i++){
      last *= (double)cogs[i-1] / cogs[i] * -1; 
    }
    return new double[]{first, last};
  }
  

}
-----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    
    double[] speed = new double[cogs.length];
    speed[n] = 1;
    
    for (int i = n ; i > 0; i--){
      speed[i - 1] = (double)(cogs[i])/ (double)(cogs[i - 1]) * (-speed[i]);
    } 
    
    for(int i = n; i < cogs.length - 1; i++)
      speed[i + 1] = (double)(cogs[i]) /(double)(cogs[i + 1]) * (-speed[i]);
    
    
    
    
    return new double[]{speed[0], speed[speed.length - 1]};
  }

}
-----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {

    double rpm = 1.0;
    int direction = 1;
    
    double rpmFirst = rpm;
    int directionFirst = direction;
    for (int i = n-1; i >= 0; i--) {
      rpmFirst = (cogs[i+1] / (double)cogs[i]) * rpmFirst;
      directionFirst *= -1;
    }
    
    double rpmLast = rpm;
    int directionLast = direction;
    for (int i = n; i < cogs.length - 1; i++) {
      rpmLast = (cogs[i] / (double)cogs[i+1]) * rpmLast;
      directionLast *= -1;
    }
    
    rpmFirst *= directionFirst;
    rpmLast *= directionLast;
    
    return new double[]{rpmFirst, rpmLast};
  }
}
-----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    double rpm = cogs[n];
    double firstRpm = (n % 2 == 0 ? rpm : -rpm) / cogs[0];
    double lastRpm = ((cogs.length - 1 - n) % 2 == 0 ? rpm : -rpm) / cogs[cogs.length - 1];
    
    return new double[]{ firstRpm, lastRpm };
  }

}
-----------------------------------------------------------------------------------
public class Dinglemouse {

  public static double[] cogRpm(final int[] cogs, final int n) {
    double firstCogSpeed = 1;
    double lastCogSpeed = 1;
    
    // if next one has more teeth it goes slower
    // if next one has less teeth it goes faster
    
    for(int i=n;i>0;i--){
      firstCogSpeed*=(double)cogs[i]/(double)cogs[i-1];
      firstCogSpeed*=-1;
    }
    
    for(int i=n;i<cogs.length-1;i++){
      lastCogSpeed*=(double)cogs[i]/(double)cogs[i+1];
      lastCogSpeed*=-1;
    }
    
    double[] result = {firstCogSpeed, lastCogSpeed};
    
    System.out.println(result[0]);
    System.out.println(result[1]);
    return result;
  }

}
*/