/* 8KYU CodeWars Playing with Cubes I

Create a public class called Cube without a constructor which gets one 
single private integer variable Side, a getter GetSide() and a setter 
SetSide(int num) method for this property. Actually, getter and setter 
methods are not the common way to write this code in C#. In the next 
kata of this series, we gonna refactor the code and make it a bit more 
professional...

Notes:

There's no need to check for negative values!
initialise the side to 0.

*/

public class Cube{
    // note: use primitive data type for the side of the cube
  private int Side;
  
  public int getSide() {
    return Side;
  }
  public void setSide(int num) {
    this.Side = num;
  }
}
/* ------------------------------------------------------------------------
public class Cube{

//create a class member integers called "side"
private int Side;

  // Get method
  public int getSide() {
    return Side;
  }
  
  //set method
  public void setSide(int num){
  this.Side = num;
  }


}




*/