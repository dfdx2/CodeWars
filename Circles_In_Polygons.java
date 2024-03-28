/* 8KYU CodeWars Circle In Polygons

You are the owner of a box making company.

Your company can produce any equal sided polygon box, 
but plenty of your customers want to transport circular 
objects in these boxes. Circles are a very common shape 
in the consumer industry. Tin cans, glasses, tyres and 
CD's are a few examples of these.

As a result you decide to add this information on your boxes: 
The largest (diameter) circular object that can fit into a 
given box.

*/

public class Polygon {
    int sides;
    int sideLength;
    double diameter;
    
    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
        this.diameter = sideLength / Math.tan(Math.toRadians(180d / sides));
    }
    
    public double circleDiameter(){
        return this.diameter;
    }  
}
/*-------------------------------------------------------------------------
public class Polygon {

    private final double diameter;

    public Polygon(int sides, int sideLength) {
      this.diameter = sideLength / Math.tan(Math.toRadians(180d/sides));
    }
    
    public double circleDiameter(){
      return this.diameter;
    }
    
}
-----------------------------------------------------------------------------
public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }
    
    public double circleDiameter(){
        double angle_in_radian =  Math.PI / sides;
        return sideLength / Math.tan(angle_in_radian);
    }
    
}
-----------------------------------------------------------------------------
public class Polygon {
  int sides, sideLength;

  public Polygon(int sides, int sideLength) {
    this.sides = sides; this.sideLength = sideLength;
  }
    
  public double circleDiameter() {
    return sideLength/Math.tan(Math.PI/sides);
  } 
}
-----------------------------------------------------------------------------
public class Polygon {
    private int sides;
    private int sideLength;
    private double biggestCircleDiameter;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
        this.biggestCircleDiameter = sideLength/Math.tan(Math.PI/sides);
    }
    
    public double circleDiameter(){
        return this.biggestCircleDiameter;
    }
    
}
------------------------------------------------------------------------------
final class Polygon {
  int sides;
  int sideLength;

  public Polygon(int sides, int sideLength) {
      this.sides = sides;
      this.sideLength = sideLength;
  }

  public double circleDiameter(){
    double apothem = sideLength / (2 * Math.tan(Math.PI / sides));
    return 2 * apothem;
  }
}

------------------------------------------------------------------------------
public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }
    
    public double circleDiameter(){
        double sumOfInteriorAnglesInRadians = (sides - 2) * Math.PI;
        double alpha = sumOfInteriorAnglesInRadians / sides / 2;
        return Math.tan(alpha) * sideLength;
    }
    
}
*/