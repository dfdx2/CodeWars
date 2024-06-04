/* 7KYU CodeWars How many days are we represented in a foreign country?

How many days are we represented in a foreign country?

My colleagues make business trips to a foreign country. We must find the number of days our company is represented in a country. Every day that one or more colleagues are present in the country is a day that the company is represented. A single day cannot count for more than one day.

Write a function that recieves a list of pairs and returns the number of days that the company is represented in the foreign country. The first number of the pair is the number of the day of arrival and the second number of the pair is the day of departure of someone who travels, i.e. 1 january is number 1 and 31 of december is 365.

Example:

daysRepresented (new int[][] {{10,17},{200,207}}) 
Returns 16 because there are two trips of 8 days, which add up to 16.

Happy coding and rank this kata if you wish ;-)

*/

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.rangeClosed;

public class Representation {
	public static int daysRepresented (int [][] trips){
    return (int) stream(trips).flatMapToInt(t -> rangeClosed(t[0], t[1])).distinct().count(); 
  }
}
/*--------------------------------------------------------------------
import java.util.Arrays;

import java.util.stream.IntStream;

public class Representation {
	public static int daysRepresented (int[][] trips) {
    return (int)Arrays.stream(trips)
                 .flatMapToInt(trip -> IntStream.rangeClosed(trip[0], trip[1]))
                 .distinct()
                 .count();
  }
}
----------------------------------------------------------------------
import java.util.*;

public class Representation {

	public static int daysRepresented (int [][] trips) {
    final int[] day = new int[366];
    for (final int[] trip : trips) Arrays.fill(day,trip[0],trip[1]+1,1);
    return Arrays.stream(day).sum();
  }
  
}
----------------------------------------------------------------------
import java.util.Arrays;
public class Representation {
	public static int daysRepresented (int [][] trips){
   your code here 
  int arrival=0;
  int depart=0;
  int days=0;
  int [] arr = new int[366];
  Arrays.fill(arr,1);
  for (int i = 0; i < trips.length; i++) {
      arrival=trips[i][0];
      depart=trips[i][1];
      for (int j = arrival; j <= depart; j++) {
          if (arr[j]!=0){
              days++;
              arr[j]=0;
          }
      }
  }
  return days;
}
}
----------------------------------------------------------------------
public class Representation {
	public static int daysRepresented (int [][] t){ 
     int x [] = new int [367]; int sum=0; 
     for (int y [] : t){  
        x[y[0]]++; x[y[1]+1]--;
      }
    for (int i=1;i<366;i++){  
       x[i]+=x[i-1]; 
       if(x[i]!=0)sum++;
     }
    return sum;
    }
  }
----------------------------------------------------------------------
import java.util.stream.*;

public class Representation {
	public static int daysRepresented (int[][] trips) {
    return (int) Stream.of(trips)
                    .flatMapToInt(arr -> IntStream.rangeClosed(arr[0], arr[1]))
                    .distinct()
                    .count();
  }
}
------------------------------------------------------------------------
import java.util.HashSet;   // For usage of HashSet

public class Representation 
{
	public static int daysRepresented (int [][] trips)
  { 
     // Since the input arrays we get in the matrix may have repeated values in them (E.g: In the matrix, one array may be ranging from [10,15], other array may be ranging from [9,12], so here 10,11,12 are repeated values and hence we DON'T want to consider them as 2 separate day values) so we use a HashSet to store the unique values from ALL the arrays of the matrix
     HashSet<Integer> hset = new HashSet<>();
    
     // 2D Matrix is basically collection of multiple 1D Arrays
     // So now, we would iterate over EACH Array from the input-provided 2D Matrix via the 'for-each' loop
     // In EACH Iteration, the array encountered would be denoted by 'arr'
     // ALSO, the SIZE of EACH Array would be the SAME i.e 2 because every array represents a PAIR
     for(int[] arr: trips)
     {
        // Now that we have obtained the individual array from the matrix in 'arr', we would iterate from 'arr[0]' till 'arr[1]' (i.e the range of 'arr')
        for(int i = arr[0]; i <= arr[1]; i++)
        { 
            // The value obtained at the 'i' index would be added to the HashSet via the 'add()' method
            hset.add(i);
        }  
     }  
  
    // Thus, at the end of the OUTER loop, we would have the number of days we represented in the foreign country as the SIZE of the HashSet because ALL the unique day values from the arrays of the matrix were added to the HashSet one-by-one 
    // So, all the day values are now stored in the HashSet and we just obtain the count of ALL the day values present in the HashSet by invoking the 'size()' method upon the HashSet
    // By invoking the 'size()' method, we basically get the number of days we represented in a foreign country
    // At the end, we return the size of the HashSet i.e 'hset.size()'
    return hset.size();
  }
}
*/