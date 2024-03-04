/* 7KYU CodeWars Find Your Caterer

You need to hire a catering company out of three for 
lunch in a birthday party. The first caterer offers 
only a basic buffet which costs $15 per person. The 
second one has an economy buffet at $20 per person 
and the third one has a premium buffet at $30 per 
person. The third one gives a 20% discount if the 
number of persons to be served is greater than 60. 
You want to spend the maximum that fits into the budget.

The function takes two arguments denoting the budget 
in $ and the number of people. Return 1, 2 or 3 for 
the three caterers as per the above criteria. Return 
-1 if there are no people or the budget is lower than 
the cost of buffets from the first caterer.

Number of orders is always equal to number of people.

For example,


budget, people => (200, 9) will return 2.

budget, people => (300, 9) will return 3 and so on.

*/
public class Budget {
    
  public static int find_caterer(int budget, int people) {
    return (people < 1 || budget < 15 * people) ? -1 : (people > 60 ? 24 : 30) * people <= budget ? 3 : 20 * people <= budget ? 2 : 1;
  }
}
/*-------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int b, int p) {
        int []x={0,15*p,20*p,p*(p>60?24:30)}; int i=3; 
        while(i>0&&b<x[i])i--; 
        return p*i==0?-1:i;
    }
}
---------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int budget, int people) {
    if (people != 0) {
      double pp = budget / people;
        if (pp < 15) {
          return -1;
        }
        else if (pp < 20) 
          return 1;        
        else if ((pp < 24) || (pp < 30 && people <= 60)) 
          return 2;        
        else 
          return 3;        
    }
  return -1;
  }
}
----------------------------------------------------------------
public class Budget {
  public static int find_caterer(int budget, int people) {
    return people == 0 || people * 15 > budget ? -1
      : people > 60 && people * 24 <= budget || people * 30 <= budget ? 3
      : people * 20 <= budget ? 2 : 1;
  }
}
----------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int budget, int people) {
 if(people != 0) {
            if (people * 30 * 0.8 <= budget && people > 60) {
                return 3;
            } else if (people * 30 <= budget) {
                return 3;
            } else if (people * 20 <= budget) {
                return 2;
            } else if (people * 15 <= budget) {
                return 1;
            }
        }
        return -1;
  }
}
----------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int budget, int people) {
    if (people == 0) return -1;
    double discount = people > 60 ? 0.8 : 1;
    if (people * 30 * discount <= budget) return 3;
    if (people * 20 <= budget) return 2;
    if (people * 15 <= budget) return 1;
    return -1;
  }
}
-----------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int budget, int people) {
  int res = -1;
    int[] buffets = {15, 20, 30};
    int num = 60;
    int costPerPerson = 0;
    if(people > 0) {
      costPerPerson = budget/people;
    }
    
    if(costPerPerson >= buffets[2] || costPerPerson >= buffets[2]*0.8 && people > num) {
      res = 3;
    } else if(costPerPerson >= buffets[1] && costPerPerson < buffets[2]) {
      res = 2;
    } else if(costPerPerson >= buffets[0] && costPerPerson < buffets[1]) {
      res = 1;
    }
    
  return res;
  }
}
-----------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Budget {
    
    public static int find_caterer(int budget, int people) {
        if (people == 0) return -1;

        Map<Integer, Integer> x = new HashMap<>();
        x.put(1, people * 15);
        x.put(2, people * 20);
        x.put(3, people * 30);

        if (people > 60) {
            int discount = (int) (x.get(3) * 0.2);
            x.put(3, x.get(3) - discount);
        }

        if (budget < x.get(1)) return -1;

        int max = 0;
        int selectedCaterer = 0;
        for (var entry : x.entrySet()) {
            int cost = entry.getValue();
            if (cost <= budget && cost > max) {
                max = cost;
                selectedCaterer = entry.getKey();
            }
        }

        return selectedCaterer;
    }
}
-----------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int budget, int people) {
        return people == 0 || budget < 15 * people ? -1
                : budget >= (people > 60 ? 24 : 30) * people ? 3 
                : budget >= 20 * people ? 2 : 1;
  }
}
----------------------------------------------------------------
public class Budget {
    
  public static int find_caterer(int budget, int people) {
        final int basicBuffet = 15;
        final int economicBuffet = 20;
        final int premiumBuffet = 30;
        final double premiunBuffetWithDiscount = premiumBuffet - 0.2 * premiumBuffet;
        return people == 0 || budget < 15 ? -1 : people > 60 ? people *  premiunBuffetWithDiscount <= budget ? 3 : people * economicBuffet <= budget ? 2 : basicBuffet * people <= budget ? 1 : -1 : people * premiumBuffet <= budget ? 3 : people * economicBuffet <= budget ? 2 : people * basicBuffet <= budget ? 1 : -1;
  }
}
*/