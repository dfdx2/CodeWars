/*  8KYU CodeWars  Count Odd Numbers Below N 

Given a number n, return the number of positive odd numbers below n, EASY!

Examples (Input -> Output)
7  -> 3 (because odd numbers below 7 are [1, 3, 5])
15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
Expect large Inputs!

*/
public class CountOddNumbersBelowN {
  public static int oddCount(int n){
    return n / 2;
  }
}
/*-------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){

    return n % 2 == 0 ? n / 2 : (n-1) / 2;
  }

}
---------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){
    return (n >>> 1);
  }
}
---------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){
    // divide the number by 2 and return an integer of that
    return (int) Math.floor( n/2 );
  }

}
---------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){
        if (n % 2 == 0) {
            return n / 2;
        } else {
            if (n == 1) return 0;
            else return (int) Math.ceil((double) n / 2) - 1;
        }
  }

}
---------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){
    int i = 1, count = 0;
    if (n > 1 && n < 1000000) {
      while (i < n) {count++; i+=2;}
      return count;
    }
    else if (n >= 1000000 && n < 1000000000){
      i = 1000001; count = 500000;
      while (i < n) {count++; i+=2;}
      return count;
    }
    else if (n >= 1000000000){
      i = 1000000001; count = 500000000;
      while (i < n) {count++; i+=2;}
      return count;
    }
    else {return 0;}
  }

}
---------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){
        double d =n;
        d = Math.round((d/2)-0.5);
        n= (int) d;
        return n;
    }

}
---------------------------------------------------------------------------
public class Kata {

  public static int oddCount(int n){
        n = Math.abs(n);
        return n>>1;
  }

}
---------------------------------------------------------------------------
public class Kata {
  public static int oddCount(int n){
    int answer = Math.floorDiv(n, 2);
    return answer;
  }
}
*/