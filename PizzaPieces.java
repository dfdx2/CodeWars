/* 6KYU CodeWars Pizza Pieces

In her trip to Italy, Elizabeth Gilbert made it her duty to eat perfect pizza. 
One day she ordered one for dinner, and then some Italian friends appeared at 
her room. The problem is that there were many people who ask for a piece of 
pizza at that moment, and she had a knife that only cuts straight.

Given the number of pizza cuts, find the maximum amount of pieces of pizza that 
you can get (not necessarily of equal size). If the number of cuts is negative, 
return -1 instead (or Nothing in Haskell).

*/

public class Pizza {
    public static int maxPizza(int cuts) {
      return (cuts >= 0) ? (cuts * cuts + cuts + 2) / 2 : -1;
    }
}
/*------------------------------------------------------------------------------
public class Pizza {

    public static int  maxPizza(int cut) {
          if(cut<0)
            return -1;
          else return (cut+1)*cut/2+1;
    }
}
-------------------------------------------------------------------------------
public class Pizza {
  public static int maxPizza(int k) {
    return k < 0 ? -1 : k * (k + 1) / 2 + 1;
  }
}
-------------------------------------------------------------------------------
public class Pizza {

    public static int  maxPizza(int cut) {
          int cuts = 1;
          if(cut<0) cuts = -1;
          else{
            for(int i = 0; i <= cut; i++)
              cuts+=i;
          }
          return cuts;
    }
}
-----------------------------------------------------------------------------
public class Pizza {

    public static int  maxPizza(int cut) {
          if (cut < 0) { return -1; }        
          //Plane Division by Lines
          return ((cut*cut)+cut+2)/2;
           
    }
}
--------------------------------------------------------------------------------
public class Pizza {

    public static int  maxPizza(int cut) {
          
      double ans = 0.5*(Math.pow(cut, 2) +cut+ 2);
      return (cut < 0) ? -1 : (int)ans;
    }
}



*/