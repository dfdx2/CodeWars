/* 7KYU CodeWars Cats and Shelves      

An infinite number of shelves are arranged one above the other 
in a staggered fashion. The cat can jump either one or three 
shelves at a time: from shelf i to shelf i+1 or i+3 (the cat 
cannot climb on the shelf directly above its head), according 
to the illustration:

                 ┌────────┐
                 │-6------│
                 └────────┘
┌────────┐       
│------5-│        
└────────┘  ┌─────► OK!
            │    ┌────────┐
            │    │-4------│
            │    └────────┘
┌────────┐  │
│------3-│  │     
BANG!────┘  ├─────► OK! 
  ▲  |\_/|  │    ┌────────┐
  │ ("^-^)  │    │-2------│
  │ )   (   │    └────────┘
┌─┴─┴───┴┬──┘
│------1-│
└────────┘

Input

Start and finish shelf numbers (always positive integers, 
finish no smaller than start)

Task

Find the minimum number of jumps to go from start to finish

Example

Start 1, finish 5, then answer is 2 (1 => 4 => 5 or 1 => 2 => 5)

*/

public class CatsAndShelves {
  public static int solution(int start, int finish) {
    return (finish - start) / 3 + (finish - start) % 3;
  }
}

/*-------------------------------------------------------------------------
public class Kata 
{
  public static int solution(int start, int finish)
  {
    int diff = (finish - start);
    return diff/3 + diff % 3;
}
  }
---------------------------------------------------------------------------
public class Kata {
  public static int solution(int start, int finish) {
    int totalTravel = finish - start;
    int bigJumps = totalTravel / 3;
    int smallJumps = totalTravel % 3;
    return bigJumps + smallJumps;
  }
}
---------------------------------------------------------------------------
interface Kata {
  static int solution(int start, int finish) {
    return (finish -= start) / 3 + finish % 3;
  }
}
---------------------------------------------------------------------------
public class Kata 
{
  public static int solution(int start, int finish)
  {
    return (finish - start) / 3 + (finish - start) % 3;
  }
}
---------------------------------------------------------------------------
public class Kata 
{
  public static int solution(int start, int finish)
  {
    if (start > finish || start < 0 || finish < 0) {
            return 0;
        }
        int countSteps = 0;
        while (start != finish) {
            if (finish - start >= 3) {
                start += 3;
            } else start++;
            countSteps++;
        }
        return countSteps;
  }
}
---------------------------------------------------------------------------
public class Kata 
{
  public static int solution(int start, int finish){

        int a = finish - start;
        int sol = a/3;
        int fin = sol + (a % 3);
        
        return fin;
    }
}
---------------------------------------------------------------------------
public class Kata 
{
  public static int solution(int start, int finish)
  {
    return (finish - start) % 3 == 0 ? (finish - start) / 3 : (finish - start) / 3 + (finish-start) % 3 ;
  }
}
*/