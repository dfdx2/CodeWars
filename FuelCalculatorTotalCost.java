/* 8KYU CodeWars Fuel Calculator: Total Cost

In this kata you will have to write a function that takes litres 
and pricePerLitre (in dollar) as arguments.

Purchases of 2 or more litres get a discount of 5 cents per litre, 
purchases of 4 or more litres get a discount of 10 cents per litre, 
and so on every two litres, up to a maximum discount of 25 cents per litre. 
But total discount per litre cannot be more than 25 cents. Return the 
total cost rounded to 2 decimal places. Also you can guess that there 
will not be negative or non-numeric inputs.

Good Luck!

Note
1 Dollar = 100 Cents

*/

public class Kata{
    public static double fuelPrice(int litres, double pricePerLitre) {
      double result = 0;
      double smalldis = 0.05;
      double largedis = 0.10;
      double biggerdis = 0.25;
      if (litres >= 2 && litres < 4) {
        result = litres * (pricePerLitre - smalldis);
      }
      else if (litres >= 4 && litres < 6) {
        result = litres * (pricePerLitre - largedis);
      }
      else if (litres >= 6 && litres < 8) {
        result = litres * (pricePerLitre - 0.15);
      }
      else if (litres >= 8 && litres < 10) {
        result = litres * (pricePerLitre - 0.20); 
      }
      else {
        result = litres * (pricePerLitre - 0.25);
      }
      return result;
    }
}
/*------------------------------------------------------------------------------------
public class Kata {
  public static double fuelPrice(int litres, double price) {
    return litres * (price - Math.min(litres / 2 * 0.05, 0.25));
  }
}
--------------------------------------------------------------------------------------
public class Kata{
  public static double fuelPrice(int litres, double pricePerLiter) {
    if (litres < 12) return litres * (pricePerLiter- litres/2 * 0.05);
    return litres * (pricePerLiter - 0.25);
  }
}



*/