/* 6KYU CodeWars Build Tower

Build Tower
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ", 
  "*****"
]
And a tower with 6 floors looks like this:

[
  "     *     ", 
  "    ***    ", 
  "   *****   ", 
  "  *******  ", 
  " ********* ", 
  "***********"
]
Go challenge Build Tower Advanced once you have finished this :)


*/

import static java.util.stream.IntStream.range;
public class Kata {
  public static String[] towerBuilder(int nFloors) {
    return range(0, nFloors).mapToObj(i -> String.format("%1$s%2$s%1$s", " ".repeat(nFloors - i - 1), "*".repeat(2 * i + 1))).toArray(String[]::new);
  }
}
/*----------------------------------------------------------------------------
public class Kata {
  
  public static String[] TowerBuilder(int n) {
    String t[] = new String[n], e;
    
    for (int i = 0; i < n; i++)
      t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;
    
    return t;
  }
  
}
------------------------------------------------------------------------------
public class Kata {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++)
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
        return tower;
    }
}
------------------------------------------------------------------------------
public class Kata
{
    private static final String SYMBOL = "*";
    private static final String SPACE = " ";

    public static String[] towerBuilder(int nFloors)
    {
        var tower = new String[nFloors];
        var floorLength = 1;
        for (var i = 1; i <= nFloors; i++) {
            String spaces = SPACE.repeat(nFloors - i);
            String symbols = SYMBOL.repeat(floorLength);
            tower[i - 1] = spaces + symbols + spaces;
            floorLength += 2 ;
        }

        return tower;
    }
}
------------------------------------------------------------------------------
public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {
    return java.util.stream.IntStream.rangeClosed(1, nFloors).mapToObj(x -> " ".repeat(nFloors-x) + "*".repeat(x*2-1) + " ".repeat(nFloors-x)).toArray(String[]::new);
  }
}
------------------------------------------------------------------------------
public class Kata
{
  public static String[] towerBuilder(int nFloors){

    int i = nFloors-1;
    int j = i;
    
    String [] stars = new String[nFloors];
    
    for (int k = 0 ; k < nFloors ;k++){
      
        stars[k] = funStars(nFloors*2-1,i,j);
        i++;
        j--;
      
    }

    return stars;
    
  }
  public static String funStars(int starsLength, int i, int j){

        StringBuilder stars = new StringBuilder("");
        for(int h = 0 ; h < starsLength ;h++){
            if ( j <= h && h <= i)
                stars.append('*');
            else
                stars.append(' ');
        }
        return stars.toString();
    }
}
------------------------------------------------------------------------------
public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {
    String[] floors = new String[nFloors];
    int pointCount = 1;
    int spaceCount = nFloors - 1;
    
    for (int i = 0; i < nFloors; i++) {
      String floor = "";
      for (int q = 0; q < spaceCount; q++) floor += " ";
      for (int w = 0; w < pointCount*2 - 1; w++) floor += "*";
      for (int e = 0; e < spaceCount; e++) floor += " ";
      floors[i] = floor;
      spaceCount--;
      pointCount++;
    }
    return floors;
  }
}
*/