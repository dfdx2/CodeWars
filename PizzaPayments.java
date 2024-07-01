/* 7KYU CodeWars Pizza Payments

Kate and Michael want to buy a pizza and share it. Depending on the price of the pizza, 
they are going to divide the costs:

If the pizza is less than €5,- Michael invites Kate, so Michael pays the full price.
Otherwise Kate will contribute 1/3 of the price, but no more than €10 (she's broke :-) 
and Michael pays the rest.
How much is Michael going to pay? Calculate the amount with two decimals, if necessary.

*/
public class PizzaPayments {
  public static double michaelPays(double cost) {
    return Math.round(100 * (cost > 5 ? cost - Math.min(10, cost / 3) : cost)) / 100.;
  }
}
/*--------------------------------------------------------------------------------- 
public class PizzaPayments {
  public static double michaelPays(double cost) {
    double share;
    if(cost < 5) {
      share = cost;
    } else {
     double oneThird = (cost / 3);
     if (oneThird > 10) {
      share = cost - 10;
     } else {
      share = oneThird * 2;
     }
    }  
    return (double) Math.round(share * 100) / 100;
  }
}
-----------------------------------------------------------------------------------
class PizzaPayments {
  static double michaelPays(double cost) {
    return Math.round(100 * (cost > 5 ? cost - Math.min(10, cost / 3) : cost)) / 100.;
  }
}
-----------------------------------------------------------------------------------
import java.text.DecimalFormat;

public class PizzaPayments 
{
  public static double michaelPays(double cost) 
  {
    if (cost < 5)
    {
      return Math.round(cost * 100) / 100.0;
    }
    if (cost / 3 > 10)
    {
      return Math.round((cost - 10) * 100) / 100.0;
    }
    cost = Math.round((cost - (cost / 3)) * 100) / 100.0;
    return cost;
  }
}
-----------------------------------------------------------------------------------
public class PizzaPayments {
  public static double michaelPays(double cost) {
    double katesAmount = (cost / 3);
    
    if (cost < 5){
      return (Math.round(cost * 100.0) / 100.0);
    }
    if (katesAmount > 10){
      return (Math.round((cost - 10) * 100.0) / 100.0);
    }
    return (Math.round((cost - katesAmount) * 100.0) / 100.0);
  }
}
----------------------------------------------------------------------------------
import java.math.*;
public class PizzaPayments {
  public static double michaelPays(double cost) {
  BigDecimal result;

    if (cost < 5) {
       result = new BigDecimal(cost);
         result = result.setScale(2, RoundingMode.HALF_UP);
         return result.doubleValue();
    } else if ((cost > 5) && (cost <= 30)) {
        result = new BigDecimal((cost / 3) * 2);
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
    } else if (cost > 30) {
        result = new BigDecimal((cost / 3) * 2 + (cost / 3) - 10);
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    return 0;
}
}
----------------------------------------------------------------------------------
public class PizzaPayments {
  public static double michaelPays(double c) { 
     double R =(c<=5?c:c-Math.min(c/3,10.0))*100; 
     return Math.round(R)/100.0;
  }
}
-----------------------------------------------------------------------------------
public class PizzaPayments {
  public static double michaelPays(double cost) {
    return cost < 5 ? round(cost) :
          cost > 30 ? round(cost - 10) : round(cost * 2 / 3);
  }
  
  private static double round(double cost) {
    return Math.round(cost * 100) / 100.0;
  }
}
*/