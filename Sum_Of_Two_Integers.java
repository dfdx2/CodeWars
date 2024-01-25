/* 6KYU CodeWars Sum Of Two Integers

Task
Given Two integers a , b , find The sum of them , BUT You are not allowed to use the operators + and -

Notes
The numbers (a,b) may be positive , negative values or zeros .

Returning value will be an integer .

Java: the following methods are prohibited: addExact, average, collect, decrement, increment, nextAfter, nextDown, nextUp, reduce, subtractExact, sum, summing . The following classes are prohibited: BigDecimal and BigInteger .
Input >> Output Examples
1- Add (5,19) ==> return (24) 

2- Add (-27,18) ==> return (-9)

3- Add (-14,-16) ==> return (-30)

*/
public class Solution {
    public static int add(int x, int y) {
        while (y != 0) {
            int a = x & y;
            x = x ^ y;
            y = a << 1;
        }
        return x;
    }
}
/*------------------------------------------------------------
public class Solution
{
    public static int add(int x, int y)
    {
        if (y == 0) return x;
        
        return add((x^y),(x&y)<<1);
    }
}
--------------------------------------------------------------
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
  static int add(int x, int y) {
    return new AtomicInteger(x).addAndGet(y);
  }
}
---------------------------------------------------------------
public class Solution
{
    public static int add(int x, int y)
    {
        return x \u002b y;
    }
}
---------------------------------------------------------------
public class Solution
{
    public static int add(int x, int y)
    {
        return x \u002b y;
    }
}
--------------------------------------------------------------
import java.util.concurrent.atomic.AtomicInteger;

public class Solution
{
    public static int add(int x, int y)
    {
        AtomicInteger a = new AtomicInteger(x);
        return a.addAndGet(y);
    }
}
---------------------------------------------------------------
import java.util.concurrent.atomic.AtomicInteger;
public class Solution
{
    public static int add(int a, int b)
    {
        return (int)(new AtomicInteger(a)).addAndGet(b);
    }
}
----------------------------------------------------------------
public class Solution
{
    public static int add(int x, int y)
    {
        // I saw a similar solution and it blew my mind. This actually works‽
        return \u0078\u002b\u0079;
    }
}
----------------------------------------------------------------
public class Solution
{
    public static int add(int x, int y)
    {
        double num1=x/10000000.0;
        double num2=y/10000000.0;
        
        double aux=Math.pow(10, num1)*Math.pow(10, num2);
        double res=Math.log10(aux);
        
        res=res*10000000.0;
        
        return (int)Math.round(res);  
    }
}
*/