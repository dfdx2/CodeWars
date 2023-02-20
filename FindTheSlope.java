/* 8KYU CodeWars Find The Slope

Given an array of 4 integers
[a,b,c,d] representing two points (a, b) and (c, d), return a string 
representation of the slope of the line joining these two points.

For an undefined slope (division by 0), return undefined . Note that 
the "undefined" is case-sensitive.

   a:x1
   b:y1
   c:x2
   d:y2
Assume that [a,b,c,d] and the answer are all integers (no floating numbers!). 
Slope: https://en.wikipedia.org/wiki/Slope

*/

public class Slope
{

  public String slope(int[] points)
    {
    if (points[2] - points[0] == 0) {
      return "undefined";
    }
    else {
      return String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
    }

		}

}
/*-------------------------------------------------------------------------------------
public class Slope
{

  public String slope(int[] points)
    {
    int nominator = points[3] - points[1], denominator = points[2] - points[0];

		return denominator == 0 ? "undefined" : String.format("%s", (nominator) / (denominator));
    }

}
---------------------------------------------------------------------------------------------
public class Slope
{

  public String slope(int[] points)
    {
        int deltaY = points[3] - points[1];
        int deltaX = points[2] - points[0];
        if (deltaX == 0) {
          return "undefined";
        }
        return String.valueOf(deltaY / deltaX);
		}

}
--------------------------------------------------------------------------------------
public class Slope
{

  public String slope(int[] points)
    {
      try
      {
        int slope = ((points[3] - points[1]) / (points[2] - points[0]));
        return Integer.toString(slope);
      }
      catch(Exception e){
        return("undefined");
      }
		}

}
-------------------------------------------------------------------------------------
public class Slope{

  public String slope(int[] points){
    int a = points[0];
    int b = points[1];
    int c = points[2];
    int d = points[3];
    try{
      int slope = (d-b)/(c-a);
      return Integer.toString(slope);
		  }
    catch (Exception e){
      return "undefined";
    }
  }
}

*/