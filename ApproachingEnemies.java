/* 7KYU CodeWars Approaching Enemies

You are in a military mission in the middle of the 
jungle where your enemies are really hard to spot 
because of their camouflage. Luckily you have a device 
that shows the position of your enemies!

Your device is a radar that computes the x and y 
coordinates of an enemy in meters every 5 seconds. 
You are always at the point (0, 0) and your enemies 
are always heading towards you.

Your task
The radar will give you two consecutive points P1(x, y) 
and P2(x, y) of an enemy and you should write a function 
that will return the estimated time in seconds that the 
enemy will take to reach you, so you can defend! Python 
results should be rounded to 3 decimal places.

Hints

Distance between two points. Remember that you are working 
with only 2 dimensions!

Tests will have a precision of 3 decimal points. Good luck!

*/
public class ApproachingEnemies {
  public static double calculateTime(double[] p1, double[] p2) {
     return Math.hypot(p2[1], p2[0]) / Math.hypot(p1[1] - p2[1], p1[0] - p2[0]) * 5;
  }
}
/*-------------------------------------------------------------------
public class Radar {

  public double CalculateTime(double[] p1, double[] p2) {
    
        double time = 5;

        double l = Math.hypot(p2[0]-p1[0], p2[1]-p1[1]);

        double v = l/time;


        return Math.hypot(p2[0], p2[1])/v;
    
  }
  
}
---------------------------------------------------------------------
import static java.lang.Math.hypot;

public class Radar {

  public double CalculateTime(double[] p1, double[] p2) {
    return hypot(p2[1],p2[0])/hypot(p1[1]-p2[1],p1[0]-p2[0])*5;    
  }
  
}
---------------------------------------------------------------------
public class Radar {
  public static double calculateTime(double[] p1, double[] p2) {
    return p2[0]*5/(p1[0]-p2[0]);   
  }
}
---------------------------------------------------------------------
import java.text.DecimalFormat;

public class Radar {
  public double CalculateTime(double[] p1, double[] p2) {
    //track the enemy!
    double changeX = Math.abs(p1[0]-p2[0]);
    double changeY = Math.abs(p1[1]-p2[1]);
    double distInFive = Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
    double speed = distInFive / 5;
    
    double toZero = Math.sqrt(Math.pow(p2[0], 2) + Math.pow(p2[1], 2));
    
    double timeAway = toZero / speed;
    
    return timeAway; 
  }
}
---------------------------------------------------------------------
public class Radar {

  public double CalculateTime(double[] p1, double[] p2) {
    double speedOfEnemy = 0;
		double distanceOfEnemyFromMe = 0;
		double distanceBetweenPoints=0;
		double timeForEnemyToGetToMe = 0;

		distanceBetweenPoints= Math.sqrt(((p2[1] - p1[1]) * (p2[1] - p1[1]) + (p1[0] - p2[0]) * (p1[0] - p2[0])));
		speedOfEnemy= distanceBetweenPoints/5;
		distanceOfEnemyFromMe = Math.sqrt(((p2[1]) * (p2[1]) + (p2[0]) * (p2[0])));
		timeForEnemyToGetToMe = distanceOfEnemyFromMe /speedOfEnemy;
		return timeForEnemyToGetToMe;

  }
  
}
---------------------------------------------------------------------
public class Radar {
  public double CalculateTime(double[] p1, double[] p2) {
    //Only need 1 dimension: use x if x is not zero. Otherwise, use y
    double distanceIn5Seconds = ((p1[0] == 0) ? calculateDistance(p1[1], p2[1]) : calculateDistance(p1[0], p2[0]));
    double totalDistance = Math.abs((p2[0] == 0) ? p2[1] : p2[0]);
    return totalDistance / distanceIn5Seconds * 5;
  }
  
  private double calculateDistance(double p1, double p2) {
    return Math.abs(p1 - p2);
  }
}
---------------------------------------------------------------------
public class Radar 
{

  public double CalculateTime(double[] p1, double[] p2) 
  {
    double speed = Math.sqrt(Math.pow((p2[0] - p1[0]),2) + Math.pow((p2[1] - p1[1]),2)) / 5;
    double distance = Math.sqrt(Math.pow((0 - p2[0]),2) + Math.pow((0- p2[1]),2));
    return distance/speed;
  }
  
}
---------------------------------------------------------------------
import java.text.*;

public class Radar {

  public double CalculateTime(double[] p1, double[] p2) {
    double v = Math.sqrt(Math.abs(Math.pow(p2[0] -p1[0], 2) + Math.pow(p2[1] - p1[1], 2))) / 5;
    double s = Math.sqrt(Math.abs(Math.pow(p2[0], 2) + Math.pow(p2[1], 2)));
    return s/v;
  }
}
*/