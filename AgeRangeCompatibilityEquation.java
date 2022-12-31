/* 8KYU CodeWars Age Range Compatibility Equation

Everybody knows the classic "half your age plus seven" 
dating rule that a lot of people follow (including myself). 
It's the 'recommended' age range in which to date someone.

minimum age <= your age <= maximum age #Task

Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.

This equation doesn't work when the age <= 14, so use this equation instead:

min = age - 0.10 * age
max = age + 0.10 * age
You should floor all your answers so that an integer is given instead of a float (which doesn't represent age). Return your answer in the form [min]-[max]

##Examples:

age = 27   =>   20-40
age = 5    =>   4-5
age = 17   =>   15-20

*/

public class Kata{
  public static String datingRange(int age) {
    //return min-max
    
    if (age <= 14) {
      double min = age - (0.10 * age);
      double max = age + (0.10 * age);
      return (int)min + "-" + (int)max;
    }
    
    int min = (age / 2) + 7;
    int max = (age - 7) * 2;
    return min + "-" + max;
    
  }
}
/*----------------------------------------------------------------
public class Kata{
  public static String datingRange(int age) {
    return age > 14
    ? (age/2 + 7) + "-" + ((age - 7)*2)
    : (int)(0.90*age) + "-" + (int)(1.10*age);
  }
}
-------------------------------------------------------------------
public class Kata{
  public static String datingRange(int age) {
     String minmax = (age<=14) ? Integer.toString((int)(age-0.10*age)) + "-" + Integer.toString((int)(age+0.10*age)) : Integer.toString((int)(age/2+7)) + "-" + Integer.toString((int)((age-7)*2));
     return minmax;
  }
}
-------------------------------------------------------------------
public class Kata{
  public static String datingRange(int age) {
    var minAge = age <= 14 ? (int)(age - 0.1 * age) : age / 2 + 7;
    var maxAge = age <= 14 ? (int)(age + 0.1 * age) : (age - 7) * 2;
    
    return minAge + "-" + maxAge;
  }
}
-------------------------------------------------------------------
public class Kata {
  public static String datingRange(int a) {
    return ""+(a<15?(int)(a-.1*a):a/2+7)+"-"+(a<15?(int)(a+.1*a):(a-7)*2);
  }
}
----------------------------------------------------------------------
public class Kata{
  public static String datingRange(int age) {
    return age>14? String.format("%s-%s",age/2+7,2*(age-7))
      : String.format("%s-%s",(int)(age-0.1*age),(int)(age+0.1*age));
  }
}

*/