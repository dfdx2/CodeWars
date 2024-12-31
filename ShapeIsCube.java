/* 8KYU CodeWars Find Out Whether The Shape Is A Cube

To find the volume (centimeters cubed) of a cuboid you use the formula:

volume = Length * Width * Height

But someone forgot to use proper record keeping, so we only have the volume, 
and the length of a single side!

It's up to you to find out whether the cuboid has equal sides (= is a cube).

Return true if the cuboid could have equal sides, return false otherwise.

Return false for invalid numbers too (e.g volume or side is less than or equal to 0).

Note: side will be an integer

*/
class ShapeIsCube {
  public static boolean isCube(int volume, int side) {
    return volume > 0 && side > 0 && volume == side * side * side;
  }
}
/*-----------------------------------------------------------------------
class Cube {
    public static boolean isCube(int volume, int side) {
        return side > 0 && Math.pow(side, 3) == volume;
    }
}
-------------------------------------------------------------------------
class Cube {
  public static boolean isCube(int volume, int side) {
    // your code here
    //we will return true if the cuboid equal sides 
    //otherwise we will return false.
    if(volume == (side*side*side) && volume > 0 && side > 0){
      return true;
    }
    return false;
  }
}
-------------------------------------------------------------------------
class Cube {
  public static boolean isCube(int volume, int side) {
   double numero = side;
      
		 int cubo = side * side * side;
    
        if(volume <=0||side<=0) {
       
        	return false;
        }else {
        	if(cubo==volume) {
    		
    			 return true;
    		}else {
    	
    			 return false;
    		}
        }
  }
}
-------------------------------------------------------------------------
class Cube {
  public static boolean isCube(int volume, int side) {
    if (side > 0 && volume > 0 && volume % pow(side, 3) == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public static int pow(int value, int powValue) {
    if (powValue == 1) {
      return value;
    } else {
      return value * pow(value, powValue - 1);
    }
  }
}
*/