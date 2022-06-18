/*Since we cannot define keywords in Javascript 
(well, at least I don't know how to do it), your task 
is to define a function xor(a, b) where a and b are the 
two expressions to be evaluated. Your xor function should 
have the behaviour described above, returning true if exactly 
one of the two expressions evaluate to true, false otherwise.
 */

public class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        //your code here:
      if (a != b) {
        return true;
      }
          else {
        return false;
       }
    }
}
/*________________________________________________________________________
 * 
 * public class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        return a!=b;
    }
}
__________________________________________________________________________
 * public class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        return !(a==b);
    }
}
 * ________________________________________________________________________
 * public class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        //your code here:
        return a!=b?true:false;
    }
}
 */