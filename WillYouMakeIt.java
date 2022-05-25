public class WillYouMakeIt {
  
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        if ((distanceToPump / mpg) <= fuelLeft) {
          return true;
        }
        else {
          return false;
        }
      }
      
    }