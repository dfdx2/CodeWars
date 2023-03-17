/* 8KYU CodeWars Get Nth Even Number

Return the Nth Even Number

Example(Input --> Output)

1 --> 0 (the first even number is 0)
3 --> 4 (the 3rd even number is 4 (0, 2, 4))
100 --> 198
1298734 --> 2597466

*/

public class Num {
  public static int nthEven(int n) {
    return (n - 1) * 2;
  }
}
/*---------------------------------------------------------------------
class Num {
    static int nthEven(final int n) {
        return 2*n - 2;
    }
}
------------------------------------------------------------------------
class Num {
  static int nthEven(int n) {
    return --n + n;
  }
}
------------------------------------------------------------------------
public class Num {
  public static int nthEven(int n) {
    int result = 0;
    int counter = 0;
    while(counter<n){
      result+=2;
      counter++;
    }
    return result-2;
  }
}
------------------------------------------------------------------------
public class Num {
  public static int nthEven(int n) {
  int number = 1;
        for (int i = 0; i < n * 2; i += 2) {
            number = i;
        }
        return number;
  }
}


*/