/* 7KYU CodeWars Fizz/Buzz

Write a function that takes an integer and returns an array [A, B, C], 
where A is the number of multiples of 3 (but not 5) below the given integer, 
B is the number of multiples of 5 (but not 3) below the given integer 
and C is the number of multiples of 3 and 5 below the given integer.

For example, solution(20) should return [5, 2, 1]

*/
public class FizzBuzz{
    public static int[] solution(int number) {
      int t = 0;
      int f = 0;
      int tf = 0;
      int i = number - 1;
      while (i > 0) {
        if (i % 3 == 0 && i % 5 == 0) {
          tf++;
          i--;
        }
        else if (i % 5 == 0 && i % 3 != 0) {
          f++;
          i--;
        }
        else if (i % 3 == 0 && i % 5 != 0) {
          t++;
          i--;
        }
        else {
          i--;
        }
      }
      return new int[] {t, f, tf};
    }
}
/*------------------------------------------------------------------------
public class FizzBuzz{
    public static int[] solution(int number) {
      int n = number - 1;
      int a = n / 3;
      int b = n / 5;
      int c = n / 15;
      return new int[]{a - c, b - c, c};
    }
}
--------------------------------------------------------------------------
interface FizzBuzz {
  static int[] solution(int n) {
    int c = --n / 15;
    return new int[]{n / 3 - c, n / 5 - c, c};
  }
}
--------------------------------------------------------------------------
public class FizzBuzz{
    public static int[] solution(int number) {
        int[] solved={0,0,0};
        if (number >0) {
            for (int i = 1; i < number; i++) {
                if ((i%3==0)&&(i%5!=0)){solved[0]++;}
                if ((i%5==0)&&(i%3!=0)){solved[1]++;}
                if ((i%3==0)&&(i%5==0)){solved[2]++;}
            }
        }
        return solved;    }
}



*/