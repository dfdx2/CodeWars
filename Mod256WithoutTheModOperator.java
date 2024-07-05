/* 7KYU CodeWars MOD 256 without the MOD operator

The MOD-operator % (aka mod/modulus/remainder):

Returns the remainder of a division operation.
The sign of the result is the same as the sign of the first operand.
(Different behavior in Python!)
The short unbelievable mad story for this kata:
I wrote a program and needed the remainder of the division by 256. And then it happened: The "5"/"%"-Key did not react. It must be broken! So I needed a way to:

Calculate the remainder of the division by 256 without the %-operator.
Also here some examples:

Input 254  -> Result 254
Input 256  -> Result 0
Input 258  -> Result 2 
Input -258 -> Result -2 (in Python: Result: 254!)
It is always expected the behavior of the MOD-Operator of the language!

The input number will always between -10000 and 10000.

For some languages the %-operator will be blocked. If it is not blocked and you know how to block it, tell me and I will include it.

For all, who say, this would be a duplicate: No, this is no duplicate! There are two katas, in that you have to write a general method for MOD without %. But this kata is only for MOD 256. And so you can create also other specialized solutions. ;-)

Of course you can use the digit "5" in your solution. :-)

I'm very curious for your solutions and the way you solve it. I found several interesting "funny" ways.



*/
public class Mod256WithoutTheModOperator {
  public static int mod256WithoutMod(int number) {
    return number - number / 256 * 256;
  }
}
/*---------------------------------------------------------------------
public class Kata
{
  public static int mod256WithoutMod(int n)
  {
     return n<0?-(-n&255):n&255;
  }
}
-----------------------------------------------------------------------
public class Kata {
  public static int mod256WithoutMod(int number) {
    while (number >= 256) number -= 256;
    while (number <= -256) number += 256;
    return number;
  }
}
-----------------------------------------------------------------------
public class Kata
{
  public static int mod256WithoutMod(int number)
  {
    return (number<0) ? 0-Math.floorMod(Math.abs(number),256) : Math.floorMod(number,256);
  }
}
-----------------------------------------------------------------------
public class Kata
{
  public static int mod256WithoutMod(int number)
  {
    int x = 1;
    if (number < 0){
      x = -1;
      number *= -1;
    }
    while (number > 255)
      number -= 256;
    return number * x;
  }
}
-----------------------------------------------------------------------
class Kata {
  static int mod256WithoutMod(int number) {
    return number % 256;
  }
}
*/