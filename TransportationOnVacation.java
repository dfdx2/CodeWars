public class TransportationOnVacation {
  public static int rentalCarCost(int d) {
    // Your solution here
    if (d <= 2) {
      return 40 * d;
    }
    else if ((d >=3) && (d < 7 )) {
      return ((40 * d) - 20);
    }
    else {
      return ((40 * d) - 50);
    }        
  }
}