/*  8KYU CodeWars Is He Gonna Survive

A hero is on his way to the castle to complete his mission. However, 
he's been told that the castle is surrounded with a couple of powerful 
dragons! each dragon takes 2 bullets to be defeated, our hero has no 
idea how many bullets he should carry.. Assuming he's gonna grab a 
specific given number of bullets and move forward to fight another 
specific given number of dragons, will he survive?

Return true if yes, false otherwise :)

*/

class Solution {
  public static boolean hero(int bullets, int dragons) {
    return (bullets / dragons >= 2);
  }
}
/*----------------------------------------------------------------------
class Solution {
  public static boolean hero(int bullets, int dragons) {
    return true ? bullets/dragons>=2 : false;
    
  }
}
------------------------------------------------------------------------
class Solution {
  public static boolean hero(long bullets, long dragons) {
	      boolean tru = bullets >= dragons * 2 ?  true : false;
		    return tru;
  }
}
-------------------------------------------------------------------------
class Solution {
  public static boolean hero(int bullets, int dragons) {
    // right shift to avoid overflow
    return bullets >> 1 >= dragons;
  }
}

*/