/* 7KYU CodeWars Driving School Series # 2

Fast & Furious Driving School's (F&F) charges for lessons are as below:

Time	Cost
Up to 1st hour	$30
Every subsequent half hour**	$10
** Subsequent charges are calculated by rounding up to nearest half hour.
For example, if student X has a lesson for 1hr 20 minutes, he will be 
charged $40 (30+10) for 1 hr 30 mins and if he has a lesson for 5 minutes, 
he will be charged $30 for the full hour.

Out of the kindness of its heart, F&F also provides a 5 minutes grace 
period. So, if student X were to have a lesson for 65 minutes or 1 hr 35 mins, 
he will only have to pay for an hour or 1hr 30 minutes respectively.

For a given lesson time in minutes (min) , write a function cost to 
calculate how much the lesson costs. Input is always > 0.

*/
public class Kata {
    public static int cost(int mins){
       return 10 * Math.max(3, (mins + 54) / 30);
    }
}
/*----------------------------------------------------------------------
public class Kata {
    public static int cost(int mins){
       return mins > 60 ? (int) Math.ceil((mins - 5 - 60) / 30d) * 10 + 30 : 30;
    }
}
-------------------------------------------------------------------------
public class Kata {
    public static int cost(int mins){
      if (mins <= 60){
        return 30;
      }
      else if (mins % 30 > 5){
        return 30 + (((mins-60)/30) * 10) + 10;
      }
      else{
        return 30 + (((mins-60)/30) * 10);
      }
    }
}
------------------------------------------------------------------------
public class Kata {
    public static int cost(int mins){
      var cost = 30;
      if(mins <= 65) {
        return cost;
      }
      var time = mins - 60;
      cost += 10;
      
      for(int i = time; i > 35; i = i - 30) {
        cost += 10;
      }
      return cost;
    }
}
------------------------------------------------------------------------
public class Kata {
    private final static int FULL_HOUR_PRICE = 30;
    private final static int HALF_HOUR_COST = 10;

    public static int cost(int mins) {
        int minsStudent = 65;
        int cost = FULL_HOUR_PRICE;

        if (mins < 65) {
            return FULL_HOUR_PRICE;
        } else {
            while (minsStudent < mins) {
                minsStudent += 30;
                cost += HALF_HOUR_COST;
            }
        }

        return cost;
    }
}
------------------------------------------------------------------------
public class Kata {
    public static int cost(int mins){
      int firstHourCost = 30, sbseqHalfHourCost = 10, cost = 0;
      if (mins <= 65) {
        cost = firstHourCost;
      } else {
        int fullHalfHours = (mins - 60) / 30;
        int costWholeHalfHours = sbseqHalfHourCost * fullHalfHours + firstHourCost;
        int rest = (mins - 60) % 30;
        if (rest <= 5) {
          cost = costWholeHalfHours;
        } else {
          cost = costWholeHalfHours + sbseqHalfHourCost;
        }
      }
       return cost;
    }
}
------------------------------------------------------------------------
public class Kata {
    public static int cost(int mins){
       return 30 + Math.max((mins - 36) / 30, 0) * 10;
    }
}
*/