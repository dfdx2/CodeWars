/* 8KYU CodeWars Collatz Conjecture (3n + 1)

The Collatz conjecture (also known as 3n+1 conjecture) is a conjecture 
that applying the following algorithm to any number we will always 
eventually reach one:

[This is writen in pseudocode]
if(number is even) number = number / 2
if(number is odd) number = 3*number + 1
#Task

Your task is to make a function hotpo that takes a positive n as input
and returns the number of times you need to perform this algorithm to 
get n = 1.

#Examples

hotpo(1) returns 0
(1 is already 1)

hotpo(5) returns 5
5 -> 16 -> 8 -> 4 -> 2 -> 1

hotpo(6) returns 8
6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

hotpo(23) returns 15
23 -> 70 -> 35 -> 106 -> 53 -> 160 -> 80 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

#References

Collatz conjecture wikipedia page: https://en.wikipedia.org/wiki/Collatz_conjecture

*/

public class CollatzConjecture {  
  public static int hotpo(int n) {
    if (n == 1) {
      return 0;
    }
    int count = 0;
    while (n > 1) {
      if (n % 2 != 0) {
        n = (n * 3) + 1;
        count++;
      }
      else {
        n = (n / 2);
        count++;
      }
    }
    return count;
  } 
}
/*------------------------------------------------------------------------------

public class CollatzConjecture {

  public static int hotpo(int n) {
    int i = 0;
    while(n != 1) {
      n = n % 2 == 1 ? 3 * n + 1 : n / 2; i++;
    }
    return i;
  }
}
------------------------------------------------------------------------------
public class CollatzConjecture {  
  public static int hotpo(int n) { 
     double d [] = {0.5 , 3}; int res=0; 
     while(n!=1){  
          n=(int)(n*d[n%2])+(n%2);
          res++;
     }
    return res;
    }
}
-------------------------------------------------------------------------------



*/