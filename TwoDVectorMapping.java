/*  7KYU CodeWars 2D Vector Mapping

Introduction

Imagine a function that maps a number from a given range, 
to another, desired one. If this is too vague - let me 
explain a little bit further: let's take an arbitrary number 
- 2 for instance - and map it with this function from range 
0-5 to, let's say - 10-20. Our number lies in 2/5 of the way 
in it's original range, so in order to map it to the desired 
one we need to find a number that lies exactly in the same 
place, but in our new range. This number, in this case, is 14. 
You can visualize this as taking a 5cm piece of rubber, putting 
it next to the ruler, marking the dot on the second centimeter, 
then stretching the rubber between 10th and 20th centimeter and 
reading the value next to the dot.

Task

The task in this kata is, unfortunately, a little bit more complex. 
We will take the same idea, but apply it to the 2-dimensional plane, 
so instead of single numbers, we will consider vectors with their 
x-position and y-position, instead of ranges, we will look at the 
circles with given centers and radii.

You need to write a function called map_vector (or mapVector) that 
takes 3 arguments - vector, circle1, circle2 and returns a 
tuple/array/slice of x, y positions of the mapped vector. All three 
arguments will be tuples (arrays), the first one with x, y positions 
of a base vector, the second and third with x, y positions of the 
center of a circle and it's radius. The base vector will always be 
within the first circle and you need to map it from the first circle 
to the second. The coordinates should be precise up to second decimal 
place.

Examples

Let's take a look at a simple example:

vector = 5, 5
circle1 = 10, 20, 42
circle2 = -100, -42, 69
As we see, the vector's cartesian coordinates are x=5, y=5, first's 
circle's center is in x=10, y=20, it's radius is 42, and so on. 

So, to represent this with code:

mapVector([5, 5], [10, 20, 42], [-100, -42, 69]) == [-108.21, -66.64]
Two, very important things to notice here are:

The distance between a vector and a circle's center is scaled accordingly 
to the second circle's radius The angle between the vector and the line 
x=c1.x is preserved (c1.x == first circle's center's x position)
It is also worth to mention, that when both circles' radii are equal, this 
is equivalent of just translating the vector by the distance between them, 
and when the circles are concentric this is roughly equivalent to the mapping 
function mentioned in the introduction.

Notes

Although it is not really a problem, but for simplicity the given vector will 
always be contained within the first circle. The plane in random tests is a 
square with sides ranging between -400 to 400.

Tip

It may not be necessary, but if you're stuck, think about the most iconic 
animal that pops to mind when thinking about the negative influence of the 
climate changes on our planet's habitat.

Enjoy, and don't hesitate to comment on any mistakes or problems with this kata.

*/

public class TwoDVectorMapping {
    public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {  
      double[] result = new double[2];
      result[0] = circle2[0] - (circle1[0] - vector[0]) * (circle2[2] / circle1[2]);
      result[1] = circle2[1] - (circle1[1] - vector[1]) * (circle2[2] / circle1[2]);
      return result;
    }
}
/*------------------------------------------------------------------------
  class Kata {
    static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
      for (int i = 0; i < 2; i++) vector[i] = circle2[i] - (circle1[i] - vector[i]) * circle2[2] / circle1[2];
      return vector;
    }
  }
--------------------------------------------------------------------------
public class Kata {
    public static double[] mapVector(double[] v, double[] c1, double[] c2) {
      double k = c2[2] / c1[2];
      return new double[] { (v[0] - c1[0]) * k + c2[0], (v[1] - c1[1]) * k + c2[1] };
    }
}
--------------------------------------------------------------------------
public class Kata {

    public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
        double circle1X = circle1[0];
        double circle1Y = circle1[1];
        double lengthX = circle1X - vector[0];
        double lengthY = circle1Y - vector[1];
        double newX = pointPosition(lengthX, circle1[2], circle2[2]);
        double newY = pointPosition(lengthY, circle1[2], circle2[2]);
        return new double[]{circle2[0] - newX, circle2[1] - newY};
    }
    public static double pointPosition(double len, double radius1, double radius2) {
        return radius2 * len / radius1;
    }
    
}
---------------------------------------------------------------------------
ublic class Kata {

    public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
        final double ratio = circle2[2] / circle1[2];
        final var mappedVector = new double[2];
        
        for(int i=0;i<2;++i){
          final var diff=vector[i]-circle1[i];
          mappedVector[i]=circle2[i]+diff*ratio;
        }
      
        return mappedVector;
    }
    
}
---------------------------------------------------------------------------
public class Kata {

    public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
        double[] result = new double[2];
        double scaleFactor = circle2[2] / circle1[2];        
        double newX = (vector[0] - circle1[0]) * scaleFactor + circle2[0];
        double newY = (vector[1] - circle1[1]) * scaleFactor + circle2[1];
        result[0] = newX;
        result[1] = newY;
        return result;
    }
    
}
---------------------------------------------------------------------------
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kata {

  public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
    var vectorX = (vector[0] - circle1[0]);
    var vectorY = (vector[1] - circle1[1]);

    var newX = circle2[0] + (vectorX * circle2[2]) / circle1[2];
    var newY = circle2[1] + (vectorY * circle2[2]) / circle1[2];

    newX = BigDecimal.valueOf(newX).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    newY = BigDecimal.valueOf(newY).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

    return new double[] { newX, newY };
  }

}
---------------------------------------------------------------------------
public class Kata {

  public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
    double ratio = circle2[2] / circle1[2];
    return new double[] {((vector[0] - circle1[0]) * ratio) + circle2[0], ((vector[1] - circle1[1]) * ratio) + circle2[1]};
  }
}
*/