/* 7KYU CodeWars Building Blocks

Write a class Block that creates a block (Duh..)

Requirements

The constructor should take an array as an argument, this will 
contain 3 integers of the form [width, length, height] from which 
the Block should be created.

Define these methods:

`getWidth()` return the width of the `Block`

`getLength()` return the length of the `Block`

`getHeight()` return the height of the `Block`

`getVolume()` return the volume of the `Block`

`getSurfaceArea()` return the surface area of the `Block`

Examples

    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
    b.getWidth() // -> 2
    
    b.getLength() // -> 4
    
    b.getHeight() // -> 6
    
    b.getVolume() // -> 48
    
    b.getSurfaceArea() // -> 88

    Note: no error checking is needed





*/

public class BuildingBlocks{
  private int [] x;
  private int y;
  private int z;
  
  Block(int[] sides) {
    x = sides;
    y = x[0] * x[1] * x[2];
    z = 2 * (x[0] * x[1] + x[1] * x[2] + x[0] * x[2]);
  }
  
  int getWidth() {
    return x[0];
  }
  
  int getLength() {
    return x[1];
  }
  
  int getHeight() {
    return x[2];
  }
  
  int getVolume() {
    return y;
  }
  
  int getSurfaceArea() {
    return z;
  }
}
/*---------------------------------------------------------------------
public class Block{
	private int width;
  private int length;
  private int height;
  private int volume;
  private int surface_area;
  
  // Constructor
  public Block(int[] params) {
    width = params[0];
    length = params[1];
    height = params[2];
    
    volume = width * length * height;
    surface_area = 2 * (width * length + width * height + length * height);
  }
  
  public int getWidth() {
    return width;
  }
  
  public int getLength() {
    return length;
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getVolume() {
    return volume;
  }
  
  public int getSurfaceArea() {
    return surface_area;
  }
}
-----------------------------------------------------------------------
public class Block {

    private final int width;
    private final int length;
    private final int height;

    public Block(int... corners) {
        this.width = corners[0];
        this.length = corners[1];
        this.height = corners[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        return 2 * (length * height + length * width + height * width);
    }
}
-----------------------------------------------------------------------
public class Block{
   private int width;
   private int height;
   private int length;
  
   * @param int[] dimensions : width, length, height
  
	public Block(int [] dimensions) {
    if (dimensions.length < 3 ) {
       throw new IllegalArgumentException("Three dimensions required to create a block");
    }
    this.width = dimensions[0];
    this.length = dimensions[1];
    this.height = dimensions[2];
 }
 
 public int getWidth(){
     return this.width;
 }
 public int getLength(){
     return this.length;
 }
 public int getHeight(){
     return this.height;
 }
 public int getVolume(){
    //the interwebs agree if any of these dimensions
    //are 0 then the volume is 0.
    return width * height * length;
 }
 public int getSurfaceArea(){
    
    int side = (width * length);
    int side2 = (width * height);
    int side3 = (length * height);
    //if any of the dimensions is 0
    //would surface area still be front and back?
    return 2 * (side + side2 + side3);
 }
}
------------------------------------------------------------------------
public class Block {
  private int w, l, h;
	public Block(int[] dim) {
    w = dim[0]; l = dim[1]; h = dim[2];
  }
  public int getWidth() {return w;}
  public int getLength() {return l;}
  public int getHeight() {return h;}
  public int getVolume() {return w * l * h;}
  public int getSurfaceArea() {
    return 2 * w * l + 2 * w * h + 2 * l * h;
  }
}
-----------------------------------------------------------------------
public class Block{
	int width;
    int length;
    int height;
    
    Block(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }
    int getWidth() {
        return width;
    }
    int getLength() {
        return length;
    }
    int getHeight() {
        return height;
    }
    int getVolume() {
        return getWidth() * getLength() * getHeight();
    }
    int getSurfaceArea() {
        return getWidth() * getLength() * 2
                + getHeight() * getLength() * 2
                + getWidth() * getHeight() * 2;
    }
}
-----------------------------------------------------------------------
public class Block{

	private int width;
  private int length;
  private int height;
  private int volume;
  private int surfaceArea;
  
  public Block(int[] recInfos) throws IllegalArgumentException{
       if(recInfos==null || recInfos.length !=3) throw new IllegalArgumentException();
       
       width = recInfos[0];
       length = recInfos[1];
       height = recInfos[2];
       volume = width*length*height;
       surfaceArea = (width*length + width*height + length*height)*2;
  }
  
  public int getWidth(){
    return width;
  }
  public int getLength(){
    return length;
  }
  public int getHeight(){
    return height;
  }
  public int getVolume(){
    return volume;
  }
  public int getSurfaceArea(){
    return surfaceArea;
  }
}
-----------------------------------------------------------------------
public class Block {
    private int[] parameters;

    public Block(int[] info) {
        this.parameters = info;
    }

    public int getWidth() {
        return parameters[0];
    }

    public int getLength() {
        return parameters[1];
    }

    public int getHeight() {
        return parameters[2];
    }

    public int getVolume() {
        return getHeight() * getLength() * getWidth();
    }

    public int getSurfaceArea() {
        return (2*((getWidth() * getLength()) + (getHeight() * getLength()) + (getWidth() * getHeight()))); //formula SA=2lw+2lh+2hw
    }
}
-----------------------------------------------------------------------
public class Block{
   private int width = 0;
    private int length = 0;
    private int height = 0;

    // int[]{width, length, height}
    public Block(int[] blockSize){
        width = blockSize[0];
        length = blockSize[1];
        height = blockSize[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    
    // V = w * l * h 
    public int getVolume(){
        return width * length * height;
    }

    // S = 2 * (w*l + w*h + l*h)
    public int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
    }
}
-----------------------------------------------------------------------
public class Block{
  
  private int[] r;
  
  public Block(int[] r) {
    this.r = r;
  }
  
  public int getWidth() {return r[0];}

  public int getLength() {return r[1];}

  public int getHeight() {return r[2];}

  public int getVolume() {return r[0] * r[1] * r[2];}

  public int getSurfaceArea() {
    return (r[0] * r[1] + r[0] * r[2] + r[1] * r[2]) << 1;
  }
 
*/