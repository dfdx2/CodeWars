/* 7KYU CodeWars A Man and His Earthly Measurement

Background

Eratosthenes of Cyrene was a greek philosopher, mathematician, 
geographer, and so much more. He was a man of learning who became 
the chief librarian at the Library of Alexandria. He invented the 
principle of geography and is best known for his remarkably accurate 
calculation of Earth's circumference.

He measured Earth's circumference without ever leaving Egypt. He knew 
that on a certain day in his hometown of Cyrene that the sun would be 
directly overhead, and a well would cast no shadow. However on that 
same day due north in Alexandria, a rod would cast a shadow. Using the 
height of the rod, the length of its shadow, the distance to the well,　
and a little bit of geometric know-how he was able to calculate the 
circumference of the Earth.

Your Task

Given the rod's height, the shadow's length, and the distance from the 
rod to the well(in km): Calculate the circumference of Earth (within 5% 
error).(and other spheres)

Resources

https://en.wikipedia.org/wiki/Eratosthenes

*/
public class A_Man_And_His_Earthly_Measurement {  
 public static double circumference(double rodHeight,double shadowLength,double distanceToWell) {
   return distanceToWell * 6.28 / Math.atan(shadowLength / rodHeight);
 } 
}
/*-------------------------------------------------------------
public class Eratosthenes {  
 public static double circumference(double rodHeight,double shadowLength,double distanceToWell) {
    return (360 * distanceToWell) / Math.toDegrees(Math.atan(shadowLength/rodHeight));
 }
}
---------------------------------------------------------------
public class Eratosthenes
{  
 public static double circumference(double rodHeight,double shadowLength,double distanceToWell){
        double alpha = Math.atan(shadowLength / rodHeight); 
        return 2 * Math.PI / alpha * distanceToWell;
 } 
}
---------------------------------------------------------------
public class Eratosthenes {  
  public static double circumference(double h, double l, double d) {
    return 2 * Math.PI * d / Math.atan2(l, h);
  }
}
--------------------------------------------------------------
public class Eratosthenes {  
  public static double circumference(double rodHeight,double shadowLength,double distanceToWell) {
    double angle = Math.atan(shadowLength / rodHeight);
    return (2 * Math.PI) * distanceToWell / angle;
  }
}
----------------------------------------------------------------
public class Eratosthenes {  
  public static double circumference(double rodHeight, double shadowLength,double distanceToWell) {
    
    return (distanceToWell + shadowLength/1000)*(2*Math.PI/(Math.PI/2 - Math.atan(rodHeight/shadowLength)));
  }
}
----------------------------------------------------------------
public class Eratosthenes
{  
 public static double circumference(double rodHeight,double shadowLength,double distanceToWell)
 {
        double angleRadians = Math.atan(shadowLength / rodHeight);
        
        double angleDegrees = Math.toDegrees(angleRadians);
        
        double circumference = (360.0 * distanceToWell) / angleDegrees;
        return circumference;
    }

}
*/