/* 8KYU CodeWars Total Amount Of Points

Our football team finished the championship. The result of each match look like "x:y". 
Results of all matches are recorded in the collection.
For example: ["3:1", "2:2", "0:1", ...]
Write a function that takes such collection and counts the points of our team 
in the championship. Rules for counting points for each match:

if x > y: 3 points
if x < y: 0 point
if x = y: 1 point

Notes:
there are 10 matches in the championship

0 <= x <= 4
0 <= y <= 4

*/
public class TotalPoints {
  
  public static int points(String[] games) {
    int result = 0;
    for (String list : games) {
      int x = (int) list.charAt(0);
      int y = (int) list.charAt(2);
      if (x > y) {
        result += 3;
      }
      else if (x == y) {
        result++;
      }
    }
    return result;
    }
}
/*--------------------------------------------------------------------
public class TotalPoints {
  
    public static int points(String[] games) {
      
     int points = 0;
     for (String item: games) {
        int x = (int) item.charAt(0);
        int y = (int) item.charAt(2);
        if (x > y) points += 3;
          else if (x == y) points ++;
        }
        return points;
        }
}
--------------------------------------------------------------------------
public class TotalPoints {
  
    public static int points(String[] games) {
        int sum = 0;
        
        for (String s : games) {
          char x = s.charAt(0),
               y = s.charAt(2);
          
          sum += x > y ? 3 : x == y ? 1 : 0;
        }
        
        return sum;
    }
}
-----------------------------------------------------------------------
import java.util.Arrays;
public class TotalPoints {
  
    public static int points(String[] games) {
       return Arrays.stream(games)
                     .mapToInt(score -> score.charAt(0) - score.charAt(2))
                     .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                     .sum();
    }
}
-------------------------------------------------------------------------
public class TotalPoints {
  
    public static int points(String[] games) {
      int total = 0;
        for(String s : games){
          int x = Integer.parseInt(s.split(":",2)[0],10);
          int y = Integer.parseInt(s.split(":",2)[1],10);
          if(x > y){ total += 3;}
          if(x == y){ total += 1;}
        }
      return total;
    }
}
--------------------------------------------------------------------------
import java.util.stream.Stream;

public class TotalPoints {
  
    public static int points(String[] games) {
      return Stream.of(games)
                .mapToInt(TotalPoints::scoreMatchResult)
                .sum();
    }

    private static int scoreMatchResult(String score) {
        String[] split = score.split(":");
        int comparison = split[0].compareTo(split[1]);
        if (comparison > 0)
            return 3;
        else if (comparison == 0)
            return 1;
        else
            return 0;
    }
}
--------------------------------------------------------------------------
public class TotalPoints {
  
    public static int points(String[] games) {
      return java.util.Arrays.stream(games)
        .map(game -> game.split(":"))
        .map(arr -> new int[]{Integer.parseInt(arr[0]), Integer.parseInt(arr[1])})
        .mapToInt(arr -> arr[0] > arr[1] ? 3 : arr[0] == arr[1] ? 1 : 0)
        .sum();
    }
}




*/