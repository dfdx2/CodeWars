/* 7KYU CodeWars Going to the cinema

My friend John likes to go to the cinema. He can choose between system A and system B.

System A : he buys a ticket (15 dollars) every time
System B : he buys a card (500 dollars) and a first ticket for 0.90 times the ticket price, 
then for each additional ticket he pays 0.90 times the price paid for the previous ticket.
Example:
If John goes to the cinema 3 times:

System A : 15 * 3 = 45
System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)
John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.

The function movie has 3 parameters: card (price of the card), ticket (normal price of a ticket), perc (fraction of what he paid for the previous ticket) and returns the first n such that

ceil(price of System B) < price of System A.
More examples:
movie(500, 15, 0.9) should return 43 
    (with card the total price is 634, with tickets 645)
movie(100, 10, 0.95) should return 24 
    (with card the total price is 235, with tickets 240)


*/
public class GoingToTheCinema {
    public static int movie(int card, int ticket, double perc) {
      int result = 0;
      double x = card;
      while (ticket * result <= Math.ceil(x)) {
        x += ticket * Math.pow(perc, ++result);
      }
      return result;
    }
}
/*---------------------------------------------------------------------
public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        int count = 0;
        double totalB = card;
        
        while (ticket * count <= Math.ceil(totalB)) totalB += ticket * Math.pow(perc, ++count);

        return count;
    }
}
-----------------------------------------------------------------------
public class Movie {

    public static int movie(int card, int ticket, double perc) {
        double systemA = 0, systemB = card, tempTicket = ticket;
        int numberOfVisits = 0;
        do {
            systemA += ticket;
            tempTicket *= perc;
            systemB += tempTicket;
            numberOfVisits++;
        } while (systemA <= Math.ceil(systemB));

        return numberOfVisits;
    }
}
-----------------------------------------------------------------------
class Movie{static int movie(int r,int t,double p){float a=0,b=r,c=t;while(b+1>=a){a+=t;b+=c;c*=p;}return(int)a/t-1;}}
-----------------------------------------------------------------------
public class Movie {
    public static int movie(int card, int ticket, double perc) {
        int systemAValue = 0, timesCinema = 1;
        double systemBValue = card;
        while(Math.ceil(systemBValue)>=systemAValue){
            systemAValue+=ticket;
            systemBValue+=(ticket*Math.pow(perc,timesCinema));
            timesCinema++;
        }
        return --timesCinema;
    }
}
-----------------------------------------------------------------------
public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        // your code
        int ticketPrice = 0; // price of just the ticket
        double percPrice =  card; //price with card and perc
        int visits = 0;
        
        do {
        visits = visits + 1; //increments visit
        
          ticketPrice = ticketPrice + ticket; //sums up just ticket price 
          percPrice = percPrice + (ticket*Math.pow(perc, visits)); //takes sum of to date perc price
       
        } while(ticketPrice <= Math.ceil(percPrice)); // Math.ceil allows the perc value to always be rounded up tothe next int.
     
     return visits;
    }
}
-----------------------------------------------------------------------
public class Movie {
  public static int movie(int card, int ticket, double perc) {
    int result = 0;
    int a = 0;
    double b = card;
    while (Math.ceil(b) >= a) {
      a += ticket;
      b += ticket * Math.pow(perc, result);
      result ++;
    }
    return result - 1;
  }
}
-----------------------------------------------------------------------
public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        // your code
      int n = 0;
      double systemA = 0.0;
      double systemB = card;
      
      
      do {
        n++;
        systemA = ticket * n;
        systemB += ticket * Math.pow(perc,n);
      } while (systemA <= Math.ceil(systemB));
    return n;
    }
}
*/