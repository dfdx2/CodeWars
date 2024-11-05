/*  7KYU CodeWars  Is This A Triangle

Implement a function that accepts 3 integer 
values a, b, c. The function should return true 
if a triangle can be built with the sides of 
given length and false in any other case.

(In this case, all triangles must have surface 
greater than 0 to be accepted).

*/
class IsThisATriangle {
  public static boolean isTriangle(int a, int b, int c){
    return ((a + b) > c && (b + c) > a && (a + c) > b);
  }
}
/*-----------------------------------------------------------------------------
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    if ((a + b) > c && (b + c) > a && (a + c) > b) {
      return true;
    }
    return false;
  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;

class TriangleTester {

  public static boolean isTriangle(int a, int b, int c) {
    
   int[] sides = {a, b, c};
   Arrays.sort(sides);
   int highest = sides[2];
   
   if (sides[0] + sides[1] > highest)
    return true;
    
   else
    return false;
  }
}
-------------------------------------------------------------------------------
class TriangleTester
{
  public static boolean isTriangle(int a, int b, int c)
  {
      if (a > 0 && b > 0 && c > 0)
      {
        if(a + b > c)
        {
          if(a + c > b)
          {
              if(b + c > a)
              {
                  return true;
                }
                else
                {
                    return false;
                }
            }
        }
      }
      return false;
  }
}
-------------------------------------------------------------------------------
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    return ((a + b) > c && (a + c) > b && (b + c) > a) ? true : false;
  }
}
-------------------------------------------------------------------------------
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
  
      if (a <= 0) {
          return false;
      }
      
      if (b <= 0) {
          return false;
      }
      
      if (c <= 0) {
          return false;
      }
      
      boolean first = b + c > a;
      boolean second = a + c > b;
      boolean thrid = a + b > c;
      
      if (first && second && thrid) {
          return true;
      }
      
      return false;
  }
}
-------------------------------------------------------------------------------
class TriangleTester
{
  public static boolean isTriangle(int a, int b, int c)
  {
    return (Math.max(Math.max(a,b),c) < (a+b+c-Math.max(Math.max(a,b),c)));
    //no side can be larger than the sum of the two other sides
  }
}
-------------------------------------------------------------------------------
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
  if (a<b+c && b<a+c &&  c<a+b)
  {
  return true;
  }
  else 
  {
  return false;
  }
}}
-------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    List<Integer> tmp = Stream.of(a, b, c).sorted().collect(Collectors.toList());
    return tmp.get(0) + tmp.get(1) > tmp.get(2);
  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;

class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    int [] sides = {a, b, c};
    Arrays.sort(sides);
    return sides[0] + sides[1] > sides[2];
  }
}
-------------------------------------------------------------------------------
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    int max = 0;
    int AB = 0; 
    boolean result1 = false;
    boolean result2 = true;
    if (a > 0 || b > 0 || c > 0){ 
        int[] arrSide = {a,b,c}; 
        //-----------Looping check highest value-----------
        for (int i = 0 ; i < arrSide.length ; i++){
            if (arrSide[i] >= max){ 
                max = arrSide[i];
            }
            AB += arrSide[i];
        }
        //-----------Looping check highest value-----------
        
        AB = AB - max;
        System.out.println(max);
        if (AB > max){
            result1 = true;}
            
        //-----------Looping check value are same-----------
        for (int value : arrSide){
            if (value == a){
                result2 &= true;
            } else {
                result2 &= false;
            }
        }
        //-----------Looping check value are same-----------
    }
    result1 |= result2;
     return result1;
   }
  }
-------------------------------------------------------------------------------
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c) {
        int[] s = { a, b, c };
        java.util.Arrays.sort(s);
        return s[0] + s[1] > s[2] ;
    }
}
*/  