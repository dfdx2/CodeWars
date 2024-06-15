/* 8KYU CodeWars Points Of Reflection

"Point reflection" or "point symmetry" is a basic concept 
in geometry where a given point, P, at a given position 
relative to a mid-point, Q has a corresponding point, P1, 
which is the same distance from Q but in the opposite direction.

Task

Given two points P and Q, output the symmetric point of 
point P about Q. Each argument is a two-element array of 
integers representing the point's X and Y coordinates. Output 
should be in the same format, giving the X and Y coordinates 
of point P1. You do not have to validate the input.

This kata was inspired by the Hackerrank challenge Find Point

*/


public class Reflections {
  
  public static int[] reflectPoint(int[] p, int[] q) {
    int[] result = new int[2];
    result[0] = 2 * q[0] - p[0];
    result[1] = 2 * q[1] - p[1];
    return result;
  }
}
/*-----------------------------------------------------
package cw;

public interface Reflections {
  static int[] reflectPoint(int[] p, int[] q) {
    return new int[]{2 * q[0] - p[0], 2 * q[1] - p[1]};
  }
}
------------------------------------------------------
package cw;

public class Reflections {
  
  public static int[] reflectPoint(int[] p, int[] q) {
    return new int[] {reflect(p[0], q[0]), reflect(p[1], q[1]) };
  }
  
  
  // (a + b) / 2 = c
  // (a + b) = 2c
  // 2c - a = b
  
  private static int reflect(int x, int midpoint) {
    return 2 * midpoint - x;
  }
  
}
------------------------------------------------------
package cw;

public class Reflections{
  
  public static int[] reflectPoint(int[] p, int[] q){
    int[] b = {0,0};
        b[0] = q[0] * 2 - p[0];
        b[1] = q[1] * 2 - p[1];

        return b;
  }
  
}
------------------------------------------------------
package cw;

public class Reflections{
  
  public static int[] reflectPoint(int[] p, int[] q){
    return new int[]{2*q[0]-p[0], 2*q[1]-p[1]};
  }
  
}
------------------------------------------------------
package cw;

public class Reflections {
  
  public static int[] reflectPoint(int[] p, int[] q) {
        int deltaX = p[0] - q[0];
        int deltaY = p[1] - q[1];
        int p1X = q[0] + deltaX * -1;
        int p1Y = q[1] + deltaY * -1;

        return new int[]{p1X, p1Y};
    }
}
------------------------------------------------------
package cw;

public class Reflections{
  
	public static int[] reflectPoint(int[] p, int[] q) {
		int x = q[0] - (p[0] - q[0]);
		int y = q[1] - (p[1] - q[1]);
		return new int[] { x, y };
	}
  
}
------------------------------------------------------
package cw;

import java.util.stream.IntStream;

public class Reflections {

    public static int[] reflectPoint(int[] p, int[] q) {
        return IntStream.range(0, p.length).map(i -> q[i]*2 - p[i]).toArray();
    }
}
------------------------------------------------------
package cw;
import java.util.stream.IntStream;
public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {
        return IntStream.range(0, p.length)
                .mapToObj(i -> 2 * q[i] - p[i])
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
*/