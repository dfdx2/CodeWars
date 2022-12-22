/* 8KYU CodeWars Holiday VI - Shark Pontoon

Your friend invites you out to a cool floating pontoon around 
1km off the beach. Among other things, the pontoon has a huge 
slide that drops you out right into the ocean, a small way from 
a set of stairs used to climb out.

As you plunge out of the slide into the water, you see a shark 
hovering in the darkness under the pontoon... Crap!

You need to work out if the shark will get to you before you can 
get to the pontoon. To make it easier... as you do the mental 
calculations in the water you either freeze when you realise you 
are dead, or swim when you realise you can make it!

You are given 5 variables;

sharkDistance = distance from the shark to the pontoon. The shark 
will eat you if it reaches you before you escape to the pontoon.

sharkSpeed = how fast it can move in metres/second.

pontoonDistance = how far you need to swim to safety in metres.

youSpeed = how fast you can swim in metres/second.

dolphin = a boolean, if true, you can half the swimming speed of 
          the shark as the dolphin will attack it.

The pontoon, you, and the shark are all aligned in one dimension.

If you make it, return "Alive!", if not, return "Shark Bait!".

*/

public class SharkPontoon {
	public static String shark(int pontoonDistance, int sharkDistance,
                             int youSpeed, int sharkSpeed, boolean dolphin) {
    if (sharkDistance == 0) {
      return "Shark Bait!";
    }
    if (pontoonDistance == 0) {
      return "Alive!";
    }
    int a = pontoonDistance / youSpeed;
    int d = sharkDistance / sharkSpeed;
    int h = (sharkSpeed / 2);
    if (dolphin == true) {
      return (a < sharkDistance / h) ? "Alive!" : "Shark Bait!";
    }
    else if (dolphin == false) {
      return (a < d) ? "Alive!" : "Shark Bait!";
    }
    return "Shark Bait";
    }
}
/*--------------------------------------------------------------
public class SharkPontoon {
	public static String shark(int pontoonDistance, int sharkDistance,
                             int youSpeed, int sharkSpeed, boolean dolphin) {
    if(pontoonDistance/youSpeed < sharkDistance/sharkSpeed){
      return "Alive!";
    }else if (dolphin == true && pontoonDistance/youSpeed < sharkDistance/(0.5*sharkSpeed)){
      return "Alive!";
    }else{
      return "Shark Bait!";
    }
    
    
  }
}
---------------------------------------------------------------------
interface SharkPontoon {
  static String shark(int dist1, int dist2, double speed1, double speed2, boolean slow) {
    return dist1 / speed1 < (slow ? 2 : 1) * dist2 / speed2 ? "Alive!" : "Shark Bait!";
  }
}
---------------------------------------------------------------------
public class SharkPontoon {
	public static String shark(int pontoonDistance, int sharkDistance, int youSpeed, int sharkSpeed, boolean dolphin) {
    if (dolphin){
      sharkSpeed /= 2;
    }
    if (pontoonDistance / youSpeed < sharkDistance / sharkSpeed) {
      return "Alive!";
    } else {
      return "Shark Bait!";
    }
  }
}
------------------------------------------------------------------
public class SharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        double k = dolphin ? 2.0 : 1.0; // Тернарный (тройной) оператор
        double sharkTime = k * sharkDistance / sharkSpeed;
        double youTime = (double) pontoonDistance / youSpeed;        
        return youTime < sharkTime ? "Alive!" : "Shark Bait!"; // Don't get eaten!
    }
}


*/