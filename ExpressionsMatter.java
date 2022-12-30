/* 8KYU CodeWars Expressions Matter

Task
Given three integers a ,b ,c, return the largest number obtained 
after inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and 
return the Maximum Obtained (Read the notes for more detail about it)

Example
With the numbers are 1, 2 and 3 , here are some ways of placing signs 
and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.

Notes
The numbers are always positive.
The numbers are in the range (1  ≤  a, b, c  ≤  10).
You can use the same operation more than once.
It's not necessary to place all the signs and brackets.
Repetition in numbers may occur .
You cannot swap the operands. For instance, in the given 

example you cannot get expression (1 + 3) * 2 = 8.
Input >> Output Examples:
expressionsMatter(1,2,3)  ==>  return 9

Explanation:
After placing signs and brackets, the Maximum value obtained from 
the expression (1+2) * 3 = 9.

expressionsMatter(1,1,1)  ==>  return 3

Explanation:
After placing signs, the Maximum value obtained from the expression 
is 1 + 1 + 1 = 3.

expressionsMatter(9,1,1)  ==>  return 18

Explanation:
After placing signs and brackets, the Maximum value obtained from the 
expression is 9 * (1+1) = 18. ___# Task

Given three integers a ,b ,c, return the largest number obtained after 
inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and 
return the Maximum Obtained

Example
With the numbers are 1, 2 and 3 , here are some ways of placing signs 
and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.

Notes
The numbers are always positive.
The numbers are in the range (1  ≤  a, b, c  ≤  10).
You can use the same operation more than once.
It's not necessary to place all the signs and brackets.
Repetition in numbers may occur .
You cannot swap the operands. For instance, in the given example you 
cannot get expression (1 + 3) * 2 = 8.
Input >> Output Examples:

expressionsMatter(1,2,3)  ==>  return 9

Explanation:
After placing signs and brackets, the Maximum value obtained from the 
expression (1+2) * 3 = 9.

expressionsMatter(1,1,1)  ==>  return 3
Playing with Numbers Series
Playing With Lists/Arrays Series
Bizarre Sorting-katas
For More Enjoyable Katas
ALL translations are welcomed
Enjoy Learning !!
Zizou

*/

public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        // Your Code here... Happy Coding!
      int d = a + b + c;
      int e = (a * b) + c;
      int f = a + (b * c);
      int g = (a * c) + b;
      int h = (b * c) + a;
      int i = (a * b) * c;
      int j = (a + b) * c;
      int k = a * (b + c);
      if (d > e && d > f && d > g && d > h && d > i && d > j && d > k) {
        return d;
      }
      else if (e > d && e > f && e > g && e > h && e > i && e > j && e > k) {
        return e;
      }
      else if (f > d && f > e && f > g && f > h && f > i && f > j && f > k) {
        return f;
      }
      else if (g > d && g > e && g > f && g > h && g > i && g > j && g > k) {
        return g;
      }
      else if (h > d && h > e && h > f && h > g && h > i && h > j && h > k) {
        return h;
      }
      else if (i > d && i > e && i > f && i > h && i > g && i > j && i > k) {
        return i;
      }
      else if (j > d && j > e && j > f && j > g && j > h && j > i && j > k){
        return j;
      }
      else {
        return k;
      }
    }
}

/*---------------------------------------------------------------------
public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
      return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
    }
}
------------------------------------------------------------------------
public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
     
      int[] myArray = {a+b+c, a*b*c, a+b*c, a*b+c, (a+b)*c, a*(b+c)};
      int max = 0;
      for(int i = 0; i<myArray.length; i++ ){
        if(myArray[i] > max ){
          max = myArray[i];
        }
      }
      return max;
    }
}
------------------------------------------------------------------
public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        int max = 0;
        if (a+b+c>max) max = a+b+c;
        if (a*b+c>max) max = a*b+c;
        if (a+b*c>max) max = a+b*c;
        if (a*b*c>max) max = a*b*c;
        if ((a+b)*c>max) max = (a+b)*c;
        if ((a*b)+c>max) max = (a*b)+c;
        if (a*(b+c)>max) max = a*(b+c);
        if (a+(b*c)>max) max = a+(b*c);
        return max;
    }
}
------------------------------------------------------------------
import java.util.*;

public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        Vector <Integer> sol = new Vector();

        sol.add(a + b + c);
        sol.add(a * b * c);
        sol.add((a+b)*c);
        sol.add(a*(c+b));

        Collections.sort(sol);
        
        return sol.lastElement();
    }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        return IntStream.of(a + b + c, a * b * c, a + b * c, a * b + c, (a + b) * c, a * (b + c)).max().getAsInt();
    }
}
--------------------------------------------------------------------
public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        int [] array = new int [6];
        array [0] = a + b + c;
        array [1] = a * b * c;
        array [2] = a + b * c;
        array [3] = a * b + c;
        array [4] = (a + b) * c;
        array [5] = a * (b + c);
        
        int max = array[0];
        
        for (int item : array){
            if (item > max) {
                max = item;
            }
        }
        
        return max;
        
    }
}
----------------------------------------------------------------------





*/