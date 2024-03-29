/* 6KYU CodeWars Circly Sorted Array

An array is circularly sorted if the elements are sorted in ascending order, 
but displaced, or rotated, by any number of steps.

Complete the function/method that determines if the given array of integers 
is circularly sorted.

Examples
These arrays are circularly sorted (true):

[2, 3, 4, 5, 0, 1]       -->  [0, 1] + [2, 3, 4, 5]
[4, 5, 6, 9, 1]          -->  [1] + [4, 5, 6, 9]
[10, 11, 6, 7, 9]        -->  [6, 7, 9] + [10, 11]
[1, 2, 3, 4, 5]          -->  [1, 2, 3, 4, 5]
[5, 7, 43, 987, -9, 0]   -->  [-9, 0] + [5, 7, 43, 987]
[1, 2, 3, 4, 1]          -->  [1] + [1, 2, 3, 4]
While these are not (false):

[4, 1, 2, 5]
[8, 7, 6, 5, 4, 3]
[6, 7, 4, 8]
[7, 6, 5, 4, 3, 2, 1]

*/

public class CircleSorted {


    public boolean isCircleSorted(int[] a) {
      boolean fact = false;
      for (int i = 1; i < a.length; i++) {
        if (a[i - 1] > a[i]) {
          if (fact) {
            return false;
          }
          else {
            fact = true;
          }
        }
      }
      if (fact && a[a.length - 1] > a[0]) {
        return false;
      }
      return true;
    }
}
/*-------------------------------------------------------------------
public class CircleSorted {
    public boolean isCircleSorted(int[] a) {
        int disorder = 0;
        for (int i = 0; i < a.length; ++i)
            if (a[(i==0 ? a.length : i)-1] > a[i])
                ++disorder;
        return disorder <= 1;
    }
}
-----------------------------------------------------------------------
public class CircleSorted {
  public boolean isCircleSorted(int[] a) {
    boolean pivot = false;
    for (int i=0; i < a.length; i++)
      if (a[i] > a[(i+1)%a.length])
        if (pivot) return false; else pivot = true;
    return true;
  }
}
-----------------------------------------------------------------------
public class CircleSorted {

    public boolean isCircleSorted(int[] a) {
          
          // Count the number of high to low transitions in the array while considering it circular
          int numTran = 0;
          for (int i=0; i<a.length; i++) {
            if (a[i] > a[(i+1) % a.length]) numTran++;
          }
          
          return numTran <= 1;
    }
}




*/