/*   8KYU CodeWars  Even or Odd

Create a function that takes an integer as an argument and 
returns "Even" for even numbers or "Odd" for odd numbers.

*/
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
      String result = (number % 2 == 0) ? "Even" : "Odd"; 
      return result;
    }
}

/*-------------------------------------------------------------------
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
        if (number % 2 == 0) {
          return "Even";
          } else {
            return "Odd";
        }
    }
}
--------------------------------------------------------------------------
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
    }
}
---------------------------------------------------------------------

*/