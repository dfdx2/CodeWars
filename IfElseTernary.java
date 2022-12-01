/* 8KYU CodeWars If..else and Ternary Operator 

Task:
Complete function saleHotdogs/SaleHotDogs/sale_hotdogs, 
function accept 1 parameters:n, n is the number of 
customers to buy hotdogs, different numbers have 
different prices (refer to the following table), return 
a number that the customer need to pay how much money.

number	            price (cents)
n < 5	                  100
n >= 5 and n < 10	       95
n >= 10	                 90

You can use if..else or ternary operator to complete it.

*/

public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    // show me the code
    return (n < 5) ? n * 100 : ((n >= 5 && n < 10) ? n * 95 : n * 90);
  }
}
/*---------------------------------------------------------------------
public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    return ( n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90 ) * n;
  }
}
----------------------------------------------------------------------
public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    return (n < 5) ? 100 * n : (n < 10) ? 95 * n : 90 * n;
  }
}
---------------------------------------------------------------------
public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    if (n == 0) return 0;
    
    int price = 90;
    
    if (n >= 5 && n < 10) price = 95;
    else if (n < 5) price = 100;
    
    return n*price;
    
  }
}
-------------------------------------------------------------------
public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    return n*(n<5?100:n<10?95:90);
  }
}
-------------------------------------------------------------------
public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    if(n < 5){
      return n * 100;
    }else if(n < 10){
      return n * 95;
    }else{
      return n * 90;
    }
  }
}


*/