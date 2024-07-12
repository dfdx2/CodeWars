/* 7KYU CodeWars Prison Break

A prison can be represented as an array of cells, where each 
cell contains exactly one prisoner. A 'True' represents an 
unlocked cell, and 'False' represents a locked cell.

[True, True, False, False, False, True, False]

Starting inside the leftmost cell, you are tasked with determining 
how many prisoners you can set free, with a catch. You are the 
prisoner in the first cell. If the first cell is locked (denoted 
as 'False'), you cannot free anyone. Each time you free a prisoner, 
the locked cells become unlocked, and the unlocked cells become 
locked again.

So, if we use the example above:

[True, True, False, False, False, True, False]

// You free the prisoner in the 1st cell.

[False, False, True, True, True, False, True] 

// You free the prisoner in the 3rd cell (the 2nd one is locked).

[True, True, False, False, False, True, False]

// You free the prisoner in the 6th cell (the 3rd, 4th, and 5th cells are locked).

[False, False, True, True, True, False, True]

// You free the prisoner in the 7th cell - and you are done!

Here, we have set free '4' prisoners in total.

Create a function that, given this unique prison arrangement, 
returns the number of freed prisoners.

Examples

([True, True, False, False, False, True, False]) ➞ 4

([True, True, True]) ➞ 1

([False, False, False]) ➞ 0

([False, True, True, True]) ➞ 0

Notes

You are the prisoner in the first cell. You must be freed to free 
anyone else.
You must free a prisoner to change the locks. So in the second example 
where the input is [True, True, True], after you release the first 
prisoner, the locks change to [False, False, False]. Since all cells 
are locked, you can release no more prisoners.
You always start with the leftmost element in the array (the first prison 
cell). If all the prison cells to your right are 'False', you cannot free 
any more prisoners.

*/
public class Prison_Break {
  public static int freedPrisoners(Boolean[] prison) {
    if (Boolean.FALSE.equals(prison[0])) {
      return 0;
    }
    int free = 0;
    for (Boolean x : prison) {
      if (x.equals(prison[0])) {
        free++;
        prison[0] = !prison[0];
      }
    }
    return free;
  }
}
/*------------------------------------------------------------------
public class Solution {
  public static int freedPrisoners(Boolean[] prison) {
    if (!prison[0]) { // locked in!
      return 0;
    }
    boolean flipped = false;
    int sum = 0;
    for (boolean prisoner : prison) {
      if (prisoner ^ flipped) {
        sum++;
        flipped = !flipped;
      }
    }
    return sum;
  }
}
--------------------------------------------------------------------
public class Solution {
  public static int freedPrisoners(Boolean[] p) { 
       if(!p[0])return 0; 
       boolean b = true; int sum = 0 ; 
       for (Boolean d : p){  
            if(d==b){  
               sum++; 
               b=!b;
            }
        }
      return sum;
    }
}
--------------------------------------------------------------------
public class Solution {
  public static int freedPrisoners(Boolean[] prison) {
    if(!prison[0])
      return 0;
    int c = 0;
    boolean flag = true;
    for(int i=0; i<prison.length; i++) {
      if(prison[i] == flag) {
        c++;
        flag = !flag;
      }
    }
    return c;
  }
}
--------------------------------------------------------------------
public class Solution {
  public static int freedPrisoners(Boolean[] prison) {
    if (prison[0] == false) {
      return 0;
    }
    int result = 0;
    boolean alt = false;
    Boolean[] altprison = new Boolean[prison.length];
    for (int i = 0; i < prison.length; i ++) {
      altprison[i] = !prison[i];
    }
    for (int i = 0; i < prison.length; i ++) {
      Boolean bool = prison[i];
      if (alt) {
        bool = altprison[i];
      }
      if (bool) {
        result ++;
        alt = !alt;
      }
      else {
        continue;
      }
    }
    return result;
  }
}
--------------------------------------------------------------------
import static java.util.stream.Stream.of;

interface Solution {
  static int freedPrisoners(Boolean[] prison) {
    return prison[0] ? (int) of(prison).filter(c -> c == prison[0] && c != (prison[0] = !prison[0])).count() : 0;
  }
}
*/