/* 8KYU CodeWars Swap Values

I would like to be able to pass an array with two elements to my 
swapValues function to swap the values. However it appears that 
the values aren't changing.

Can you figure out what's wrong here?

*/

class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments = args;
  }
  
  public void swapValues() {
    Object[] args = new Object[]{arguments[0],arguments[1]};
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}
/*---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Collections;

class Swapper{

  final public Object[] arguments;
    
   * Constructs a new Swapper
   *
   * @params args values to be swapped
   
  public Swapper(final Object[] args){
    if (args == null || args.length != 2) {
      throw new IllegalArgumentException("Argument must be array of length 2, was: " + Arrays.toString(args));
    }
    arguments=args;
  }
    
   * Swaps the stored values
   
  public void swapValues() {
    Collections.reverse(Arrays.asList(arguments));
  }
}
---------------------------------------------------------------------------------
class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    this.arguments=new Object[]{args[1],args[0]};
  }
  
  public void swapValues() { }
}




*/