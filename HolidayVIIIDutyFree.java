/* 8KYU CodeWars Holiday VIII - Duty Free

The purpose of this kata is to work out just how many bottles of duty 
free whiskey you would have to buy such that the saving over the normal 
high street price would effectively cover the cost of your holiday.

You will be given the high street price (normPrice), the duty free discount
 (discount) and the cost of the holiday.

For example, if a bottle cost £10 normally and the discount in duty free was 
10%, you would save £1 per bottle. If your holiday cost £500, the answer you 
should return would be 500.

All inputs will be integers. Please return an integer. Round down.

*/
public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
    double d = (discount / 100.00) * normPrice;
    double result = hol / d;
    return (int) result;
  }
}
/*----------------------------------------------------------------------
public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
    
    return hol*100/(normPrice*discount); 
  }
}
------------------------------------------------------------------------
public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
  
    return (int)(hol / (normPrice / 100.0f * discount));
  }

}
----------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata {

  public static int dutyFree(int normPrice , int discount , int hol){
        double a = discount;
        return IntStream.of(normPrice , discount , hol)
                .map(i -> (int) (hol / (normPrice * a / 100)))
                .findAny().orElse(0);
    }

}



*/