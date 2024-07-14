/* 7KYU CodeWars Simple Fun Shape Area

Task

Below we will define what and n-interesting polygon is 
and your task is to find its area for a given n.

A 1-interesting polygon is just a square with a side of 
length 1. An n-interesting polygon is obtained by taking 
the n - 1-interesting polygon and appending 1-interesting 
polygons to its rim side by side. You can see the 1-, 2- 
and 3-interesting polygons in the picture below.

Example

For n = 1, the output should be 1;

For n = 2, the output should be 5;

For n = 3, the output should be 13.

Input/Output

[input] integer n

Constraints: 1 ≤ n < 10000.

[output] an integer

The area of the n-interesting polygon.

*/
public class ShapeArea {
    public static int shapeArea(int n) {
        return 2 * n * (n - 1) + 1;
    }
}
/*---------------------------------------------
public class Kata {
    public static int shapeArea(int n) {

        int fieldsOnLongDiagonals = n*n;
        int fieldsOnShortDiagonals = (n-1) * (n-1);
        return fieldsOnLongDiagonals + fieldsOnShortDiagonals;

    }    
}
-----------------------------------------------
public class Kata {
    public static int shapeArea(int n) {
        return 2 * n * n - 2 * n + 1;
    }
}
-----------------------------------------------
public class Kata {
    public static int shapeArea(int n) {
        return (n * (n - 1) << 1) + 1;
    }
}
----------------------------------------------
public class Kata {
    public static int shapeArea(int n) {
        return n < 2 ? n : 4 * --n + shapeArea(n);
    }
}
-----------------------------------------------
public class Kata {
    public static int shapeArea(int n) {
      return countCross(n) + countOther(n);
    }
  
    private static int countCross(int n) {
        if (n == 1) return 1;
        return 4 + countCross(n - 1);
    }

    private static int countOther(int n) {
        if (n == 1) return 0;
        if (n == 2) return 0;
        return (n - 2) * 4 + countOther(n - 1);
    }
}
------------------------------------------------
public class Kata {
    public static int shapeArea(int n) {
       int p = (2*(n*n)) - (2*n)+1;
       
        return p;
    }
}
---------------------------------------------------
public class Kata {
    public static int shapeArea(int n) {
        int nSquared = n*n;
        int previousNSquared = (n-1)*(n-1);
        return nSquared + previousNSquared;
    }
}
*/