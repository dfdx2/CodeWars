/* 8KYU CodeWars Grassopper Messi Goals Function

Messi goals function
Messi is a soccer player with goals in three leagues:

LaLiga
Copa del Rey
Champions
Complete the function to return his total number of goals in all three leagues.

Note: the input will always be valid.

For example:

5, 10, 2  -->  17

*/
public class GrasshopperMessiGoals {
  public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
    return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
  }
}
/*------------------------------------------------------------------------------------------
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
      int total = (laLigaGoals + copaDelReyGoals + championsLeagueGoals);
      return total;
    }
}
-----------------------------------------------------------------------------------------------
public class Goals {
    public static int goals(int l, int c, int ch) {
        return (l+c+ch);
    }
}
-----------------------------------------------------------------------------------------------
import java.util.Arrays;
public class Goals {
    public static int goals(int...array) {
        return Arrays.stream(array).sum();
    }
}
-----------------------------------------------------------------------------------------------
import java.util.*;

public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        //I'm practicing functional programming. This is not the best solution.
        
        return Arrays.asList(laLigaGoals, copaDelReyGoals, championsLeagueGoals)
               .stream()
               .reduce(0, (s, c) -> s + c);
    }
}
-----------------------------------------------------------------------------------------------
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
        int sum_goals=0;   
        if(laLigaGoals<0||copaDelReyGoals<0||championsLeagueGoals<0)
        {
        System.out.print("Goals cann`t be a negative value.Please enter correct value!\n");
        return 0;
        }
        else{
        sum_goals=laLigaGoals+copaDelReyGoals+championsLeagueGoals;}
        return sum_goals;
    }
}
-----------------------------------------------------------------------------------------------
import java.util.stream.*;

public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
       return IntStream.of(laLigaGoals, copaDelReyGoals, championsLeagueGoals).sum();
    }
}
------------------------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Goals {
    public static int goals(int ... values) {
        return IntStream.of(values).sum();
    }
}
------------------------------------------------------------------------------------------------
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return java.util.stream.IntStream.of(laLigaGoals, copaDelReyGoals, championsLeagueGoals)
          .sum();
    }
}
------------------------------------------------------------------------------------------------
import java.util.Arrays;
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
    return Arrays.asList(laLigaGoals, copaDelReyGoals, championsLeagueGoals)
    .stream().reduce(0, (subtotal, element) -> subtotal + element);
    
    }
}
*/