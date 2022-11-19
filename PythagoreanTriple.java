/*   8KYU Pythagorean Triple 
Given an array of 3 integers a, b and c, determine if they form a pythagorean triple.

A pythagorean triple is formed when:

c2 = a2 + b2
where c is the largest value of a, b, c.

For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42

Return Values
1 if a, b and c form a pythagorean triple
0 if a, b and c do not form a pythagorean triple
For Python: return True or False

*/
import java.util.Arrays;

public class PythagoreanTriple {
	
	public int pythagoreanTriple(int[] triple){
		int a = triple[0] * triple[0];
    int b = triple[1] * triple[1];
    int c = triple[2] * triple[2];
    return (a + b == c) ? 1 : 0;    
	}
}


/*--------------------------------------------------------------
public class PythagoreanTriple {
	
	public int pythagoreanTriple(int[] triple){
		int x = triple[0] * triple[0];
    int y = triple[1] * triple[1];
    int z = triple[2] * triple[2];
    int a = x + y;
    if (a == z) 
      return 1;
    else 
      return 0;
  }
}
---------------------------------------------------------------
 public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
    }
}
-------------------------------------------------------------------
import java.util.Arrays;

public class PythagoreanTriple {
  
  public int pythagoreanTriple(int[] triple){
    
    return Math.pow(triple[2],2)==Math.pow(triple[0],2)+Math.pow(triple[1],2)?1:0;
  }

  
}
-------------------------------------------------------------------
import java.util.Arrays;

public class PythagoreanTriple {
  
  public int pythagoreanTriple(int[] triple){
    
    int a = triple[0] * triple[0];
    int b = triple[1] * triple[1];
    int c = triple[2] * triple[2];
    
    return ((a + b == c) || (a + c == b) || (b + c == a)) ? 1 : 0;
  }
}
---------------------------------------------------------------------
import java.util.Arrays;

public class PythagoreanTriple {
  public int pythagoreanTriple(int[] a) {
    return a[0] * a[0] + a[1] * a[1] == a[2] * a[2] ? 1 : 0;
  }
}



*/