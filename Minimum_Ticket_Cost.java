/* 7KYU CodeWars Minimum Ticket Cost

A few years ago, Aaron left his old school and registered 
at another due to security reasons. Now he wishes to find 
Jane, one of his schoolmates and good friends.

There are n schools numbered from 1 to n. One can travel 
between each pair of schools by buying a ticket. The ticket 
between schools i and j costs (i + j) modulo (n + 1) and can 
be used multiple times. Help Aaron find the minimum total cost 
to visit all schools. He can start and finish at any school.

Range : 1 ≤ n ≤ 106

*/

public class MinimumTicketCost {
    public static int findJane(final int n) {
        return (n - 1) / 2;
    }
}
/*-------------------------------------------------------------
public class Kata {
    public static int findJane(final int n) {
    return (n%2 != 0)? n/2: n/2-1;
   
    }
}
---------------------------------------------------------------
public class Kata{static int findJane(int n){return~-n>>1;}}
---------------------------------------------------------------
public class Kata {
    public static int findJane(final int n) {
        if (n == 0) {
          return 0;
        }
        return n % 2 == 0 ? n / 2 - 1 : n / 2;
    }
}
---------------------------------------------------------------
public class Kata {
  public static int findJane(final int n) {
    int result = (int) Math.ceil(((double) n) / 2);
    result--;
    return result;
  }
}
---------------------------------------------------------------
public class Kata {
    public static int findJane(final int n) {
      
      //1 to n -> cost=0
      //n to 2 -> cost=1
      //2 to n-1 -> cost=0
      //n-1 to 3 -> cost=1
      //3 to n-2 -> cost=0
      //n-2 to 4 -> cost=1
      //4 to n-3 -> cost=0
      //n-3 to 5 -> cost=1
      //5 to n-4 -> cost=0
      //n-4 to 6 -> cost=0
      
      
      int result = n/2;
      if(n % 2 == 0) {
        result --;
      }
      return result;
    }
}

---------------------------------------------------------------
public class Kata {
    public static int findJane(final int n) {
    int i=1;
    int j=n;
    int findJane=(i+j)%(n+1);
    if(j==2)
      return 0;
    else
      while(j-1>i)
      {
        i++;  
        findJane+=(i+j)%(n+1);
        j--;
        findJane+=(i+j)%(n+1);
      }
      return (int)findJane;
      
    }
}
---------------------------------------------------------------
public class Kata {
    public static int findJane(final int n) {
        if (n%2==0)
          return ((n-2)/2);
      return ((n-1)/2);
    }
}
---------------------------------------------------------------
public class Kata {
    public static int findJane(final int n) {
        int index = 0;
        int i= 1;
        int j= n;
        int count = 0;
      while(i < j){
        count+= ((i +j)%(n+1));
        if(index%2 == 0)
          i++;
        else
          j--;
        index++;
      }
      return count;
    }
}
*/