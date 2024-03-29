/*  8KYU CodeWars Keep Hydrated!

Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, 
he drinks 0.5 litres of water per hour of cycling.

You get given the time in hours and you need to return 
the number of litres Nathan will drink, rounded to the 
smallest value.

For example:

time = 3 ----> litres = 1

time = 6.7---> litres = 3

time = 11.8--> litres = 5

*/

public class KeepHydrated  {

  public int Liters(double time)  {
    
      return (int)(time / 2);
    }
}
/*---------------------------------------------------------------
public class KeepHydrated  {

  public int Liters(double time)  {
    
    //Your code goes here! Hint: You should change that -1
    return (int) (time * 0.5);
  
  }

}
-------------------------------------------------------------------
public class KeepHydrated  {

  public int Liters(double time)  {
    
    //Your code goes here! Hint: You should change that -1
    
    if ( time < 0 ) 
      throw new IllegalArgumentException("non-positive number");
      
    int hour;
    hour = (int) Math.floor(time);
    int result = (int)(hour * 0.5);
    return result;
  }
}
-------------------------------------------------------------------
*/