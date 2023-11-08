/* 7KYU CodeWars Number Of People In The Bus

There is a bus moving in the city which takes and drops some people at 
each bus stop.

You are provided with a list (or array) of integer pairs. 
Elements of each pair represent the number of people that get on 
the bus (the first item) and the number of people that get off the 
bus (the second item) at a bus stop.

Your task is to return the number of people who are still on the bus 
after the last bus stop (after the last array). Even though it is the 
last bus stop, the bus might not be empty and some people might still 
be inside the bus, they are probably sleeping there :D

Take a look on the test cases.

Please keep in mind that the test cases ensure that the number of people 
in the bus is always >= 0. So the returned integer can't be negative.

The second value in the first pair in the array is 0, since the bus 
is empty in the first bus stop.

*/

import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int result = 0;
    for (int[] stop : stops) {
      result += stop[0];
      result -= stop[1];
    }
    return result;
  }
}
/*-------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
  }
}
--------------------------------------------------------------------------
import java.util.ArrayList;
class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    int res = 0;
    for(int[] onOff : stops) res += onOff[0] - onOff[1];
    return res;
  }
}
----------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

   public static int countPassengers(ArrayList<int[]> stops) {
		  //Code here!
		 int result = 0;
		 for(int i = 0; i < stops.size();i++) {
			 result += stops.get(i)[0];
			 result -= stops.get(i)[1];
		 }
		 return result;
	 }
}
---------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
      int total = 0;
		  for (int[] i : stops) {
			    total += i[0];
			    total -= i[1];
		  }
		  return total;
  }
}
---------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(a -> a[0] - a[1]).sum();
  }
}
---------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
	  int peopleIn = 0;
	  int peopleOut = 0;
	  int peopleInBus = 0;
	  for(int[] element: stops){
		  peopleIn = peopleIn + element[0];
		  peopleOut = peopleOut + element[1]; 
	  }
	  peopleInBus = peopleIn - peopleOut;
	  return peopleInBus;
  }
}
---------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for(int[] i : stops) result += i[0] - i[1];           
        return result;
    }
}
----------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(s->s[0] - s[1]).sum();
  }
}
----------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
  return stops.stream().map(stop -> stop[0]-stop[1]).reduce(Integer::sum).get();
  }
}
-----------------------------------------------------------------------------
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    final int passengersIn = 0;
    final int passengersOut = 1;
    return stops.stream().mapToInt(stop -> stop[passengersIn] - stop[passengersOut]).sum();
  }
}





*/