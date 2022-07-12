/*
In this kata you have to correctly return who is the "survivor", ie: the last element 
of a Josephus permutation.
Basically you have to assume that n people are put into a circle and that they are 
eliminated in steps of k elements, like this:

josephus_survivor(7,3) => means 7 people in a circle;
one every 3 is eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!

The above link about the "base" kata description will give you a more thorough 
insight about the origin of this kind of permutation, but basically that's all 
that there is to know to solve this kata.

Notes and tips: using the solution to the other kata to check your function 
may be helpful, but as much larger numbers will be used, using an array/list 
to compute the number of the survivor may be too slow; you may assume that both 
n and k will always be >=1.

*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> people = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        int index = 0;
        while (people.size() > 1) {
            index = (index + (k - 1)) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }
}
/* ------------------------------------------------------------------------------------
import java.util.Arrays;

public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    if(n == 1)
      return 1;
    
    return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;
  }  
}
--------------------------------------------------------------------------------------------
public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    int remaining = 0;
    for (int i = 2; i <= n; i++) {
      remaining = (remaining + k) % i;
    }
    
    return remaining + 1;
  }  
}
--------------------------------------------------------------------------------------------
public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    // Source: https://en.wikipedia.org/wiki/Josephus_problem#The_general_case
    // (I couldn't come up with the formula myself :p)
    return n == 1 ? 1 : ((josephusSurvivor(n - 1, k) + k - 1) % n) + 1;
  }  
}
-------------------------------------------------------------------------------------------
public class JosephusSurvivor {
  static int f(int n,int k){return n==1?0:(f(n-1,k)+k)%n;}  
  public static int josephusSurvivor(final int n, final int k) {
    return f(n,k)+1;
  }  
}
*/