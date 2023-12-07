/* 7KYU CodeWars Swapping Cards

Two players draw a pair of numbered cards so that both players 
can form a 2 digit number. A winner can be decided if one player's 
number is larger than the other.

However, there is a rule where a player can swap any one of their 
cards with any one of the other player's cards in a gamble to get 
a higher number! Note that it is illegal to swap the order of your 
own cards. That means if you draw a 1 then a 9, you cannot swap them 
to get 91.

Paul's strategy is to always swap his lowest number with the opponent's 
ten's digit. Return whether this results in Paul winning the round.

n1 is Paul's number
n2 is his opponent's number
Worked Example
(41, 79) ➞ true
# Paul's lowest number is 1
# The opponent's ten's digit is 7
# After the swap: 47 > 19
# Paul wins the round
Examples
(41, 98) ➞ true

(12, 28) ➞ true

(67, 53) ➞ false

(77, 54) ➞ false

Notes

If both of Paul's digits are the same, swap the ten's digit with 
the opponent's (paul likes to live riskily).

The cards don't include the number 0.

11 <= All numbers <= 99 (excluding numbers containing 0)

*/

public class Solution{
  public static boolean swapCards(int n1, int n2) {
    System.out.println("n1: " + n1 + " n2: " + n2);
    int a = n1 / 10;
    int b = n1 % 10;
    int c = n2 / 10;
    int d = n2 % 10;
    String e = String.valueOf(a) + String.valueOf(c); // n1 b swap with c 
    String f = String.valueOf(c) + String.valueOf(b); // n1 a swap with c
    String g = String.valueOf(a) + String.valueOf(d); // n2 a swap with c
    String h = String.valueOf(b) + String.valueOf(d); // n2 b swap with c 
    if (a < b) {
      return (Integer.valueOf(f) > Integer.valueOf(g));
    }
    if (b < a) {
      return (Integer.valueOf(g) > Integer.valueOf(h));
    }
    if (a == b) {
      return (Integer.valueOf(f) > Integer.valueOf(g));
    }
    return n1 > n2;
  }
}
/*--------------------------------------------------------------------------
public class Solution{
  public static boolean swapCards(int n1, int n2) {
    int d11 = n1 / 10; //n1 tens place
    int d12 = n1 % 10; //n1 ones place
    int d21 = n2 / 10; //n2 tens place
    int d22 = n2 % 10; //n2 ones place
    return d11 > d12 || d11 * 10 + d22 < d21 * 10 + d12 ;
  }
}
----------------------------------------------------------------------------
interface Solution {
  static boolean swapCards(int n1, int n2) {
    return n1 / 10 > n1 % 10 || (n1 / 10 - n2 / 10) * 10 < (n1 - n2) % 10;
  }
}
----------------------------------------------------------------------------
public class Solution{
  public static boolean swapCards(int n1, int n2) {
    int tens = n1 / 10;
    int ones = n1 % 10;
    
    int otherTens = n2 / 10;
    int otherOnes = n2 % 10;
    
    if (tens <= ones) {
      return (otherTens * 10 + ones) > (tens * 10 + otherOnes);
    } else {
      return (tens * 10 + otherTens) > (ones * 10 + otherOnes);
    }
  }
}
----------------------------------------------------------------------------
public class Solution{
    public static boolean swapCards(int n1, int n2) {
        return n1 % 10 < n1 / 10 
                ? n1 - (n1 % 10) + n2 / 10 > (n1 % 10) * 10 + n2 % 10 
                : n2 / 10 * 10 + n1 % 10 > n1 / 10 * 10 + n2 % 10;
    }
}
-----------------------------------------------------------------------------
public class Solution{
  public static boolean swapCards(int n1, int n2) {
    String paulNumber = String.valueOf(n1);
        String opponentNumber = String.valueOf(n2);

        int min = Math.min(Integer.parseInt(String.valueOf(paulNumber.charAt(0))), Integer.parseInt(String.valueOf(paulNumber.charAt(1))));
        int index = paulNumber.indexOf(String.valueOf(min));

        paulNumber = paulNumber.replace(paulNumber.charAt(index), opponentNumber.charAt(0));
        opponentNumber = opponentNumber.replace(opponentNumber.charAt(0), String.valueOf(min).charAt(0));

        return Integer.parseInt(paulNumber) > Integer.parseInt(opponentNumber);
  }
}
-----------------------------------------------------------------------------
public class Solution{
  public static boolean swapCards(int n1, int n2) {
    int tens = n1 / 10;
    int rem = n1 % 10;
    int low = Math.min(tens, rem);
    int high = Math.max(tens, rem);
    int swap = n2 / 10;
    int w = low * 10 + n2 % 10;
    return ((tens > rem) ? high * 10 + swap: swap * 10 + high) > w;
  }
}
-----------------------------------------------------------------------------
public class Solution{
  public static boolean swapCards(int n1, int n2) {
    int p1Card = n1 % 10;
    int p1TenCard = n1 / 10 % 10;
    int p2Card = n2 % 10;
    int p2TenCard = n2 / 10 % 10;
    
    if (p1Card == p1TenCard) {
      int tmp = p1TenCard;
      p1TenCard = p2TenCard;
      p2TenCard = tmp;
    } else if (p1Card < p1TenCard) {
      int tmp = p1Card;
      p1Card = p2TenCard;
      p2TenCard = tmp;
    } else {
      int tmp = p1TenCard;
      p1TenCard = p2TenCard;
      p2TenCard = tmp;
    }
    
    return p1TenCard * 10 + p1Card > p2TenCard * 10 + p2Card;
  }
}
-------------------------------------------------------------------------------
public class Solution{
  public static boolean swapCards(int n1, int n2) {
    int[] numArray = new int[4];
    int number1 = 0 , number2 = 0;
    numArray[0] = n1 / 10;
    numArray[1] = n1 % 10; 
    numArray[2] = n2 / 10;
    numArray[3] = n2 % 10; 
    
    if (numArray[0] <= numArray[1]) {
      number1 = (numArray[2]*10) + numArray[1];
      number2 = (numArray[0]*10) + numArray[3];
    } else {
      number1 = (numArray[0]*10) + numArray[3];  
      number2 = (numArray[1]*10) + numArray[2];    
    }
    return (number1 > number2);    
  }
}
*/