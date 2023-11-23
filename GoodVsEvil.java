/* 6KYU CodeWars Good vs Evil

Description
Middle Earth is about to go to war. The forces of good will have many battles with the forces of evil. Different races will certainly be involved. Each race has a certain worth when battling against others. On the side of good we have the following races, with their associated worth:

Hobbits: 1
Men: 2
Elves: 3
Dwarves: 3
Eagles: 4
Wizards: 10
On the side of evil we have:

Orcs: 1
Men: 2
Wargs: 2
Goblins: 2
Uruk Hai: 3
Trolls: 5
Wizards: 10
Although weather, location, supplies and valor play a part in any battle, if you add up the worth of the side of good and compare it with the worth of the side of evil, the side with the larger worth will tend to win.

Thus, given the count of each of the races on the side of good, followed by the count of each of the races on the side of evil, determine which side wins.

Input:
The function will be given two parameters. Each parameter will be a string of multiple integers separated by a single space. Each string will contain the count of each race on the side of good and evil.

The first parameter will contain the count of each race on the side of good in the following order:

Hobbits, Men, Elves, Dwarves, Eagles, Wizards.
The second parameter will contain the count of each race on the side of evil in the following order:

Orcs, Men, Wargs, Goblins, Uruk Hai, Trolls, Wizards.
All values are non-negative integers. The resulting sum of the worth for each side will not exceed the limit of a 32-bit integer.

Output:
Return "Battle Result: Good triumphs over Evil" if good wins, "Battle Result: Evil eradicates all trace of Good" if evil wins, or "Battle Result: No victor on this battle field" if it ends in a tie.

*/

public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    String[] good = goodAmounts.split(" ");
    String[] evil = evilAmounts.split(" ");
    int a = 0;
    int b = 0;
    for (int i = 0; i < good.length; i++) {
      if (i == 0) {
        String c = good[i];
        a += Integer.valueOf(c);
      }
      else if (i == 1) {
        String d = good[i];
        a += Integer.valueOf(d) * 2;
      }
      else if (i == 2) {
        String e = good[i];
        a += Integer.valueOf(e) * 3;
      }
      else if (i == 3) {
        String f = good[i];
        a += Integer.valueOf(f) * 3;
      }
      else if (i == 4) {
        String g = good[i];
        a += Integer.valueOf(g) * 4;
      }
      else if (i == 5) {
        String h = good[i];
        a += Integer.valueOf(h) * 10;
      }
    } 
    for (int i = 0; i < evil.length; i++) {
      if (i == 0) {
        String c = evil[i];
        b += Integer.valueOf(c);
      }
      else if (i == 1) {
        String d = evil[i];
        b += Integer.valueOf(d) * 2;
      }
      else if (i == 2) {
        String e = evil[i];
        b += Integer.valueOf(e) * 2;
      }
      else if (i == 3) {
        String f = evil[i];
        b += Integer.valueOf(f) * 2;
      }
      else if (i == 4) {
        String g = evil[i];
        b += Integer.valueOf(g) * 3;
      }
      else if (i == 5) {
        String h = evil[i];
        b += Integer.valueOf(h) * 5;
      }
      else if (i == 6) {
        String k = evil[i];
        b += Integer.valueOf(k) * 10;
      }
    }
    return (a == b) ? "Battle Result: No victor on this battle field" : (a > b) ? "Battle Result: Good triumphs over Evil" : (a < b) ? "Battle Result: Evil eradicates all trace of Good" : "Null";
  }
}
/*--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;
public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};
        int[] good = Arrays.stream(goodAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int[] evil = Arrays.stream(evilAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int goodSum = IntStream.rangeClosed(0,good.length-1).map(i->good[i]*goodWorth[i]).sum();
        int evilSum = IntStream.rangeClosed(0,evil.length-1).map(i->evil[i]*evilWorth[i]).sum();
        return goodSum > evilSum ?  "Battle Result: Good triumphs over Evil" :
                evilSum > goodSum ? "Battle Result: Evil eradicates all trace of Good" :
                                    "Battle Result: No victor on this battle field";
  }
}
---------------------------------------------------------------------------------
import java.util.Arrays;

public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
        String[] s1= goodAmounts.split(" ")  ;
        String[] s2= evilAmounts.split(" ")  ;

        int[] good =  {1,2,3,3,4,10};
        int[] evil =  {1,2,2,2,3,5,10};
        for (int i=0; i<6;i++){
            good[i] = good[i] * Integer.parseInt(s1[i]);
            evil[i] = evil[i] * Integer.parseInt(s2[i]);
        }
        evil[6]   = evil[6] * Integer.parseInt(s2[6]);

        int sum1 = Arrays.stream(good).sum();
        int sum2 = Arrays.stream(evil).sum();

        if (sum1 > sum2 )
            return "Battle Result: Good triumphs over Evil";
        else if (sum1< sum2)
            return "Battle Result: Evil eradicates all trace of Good";

        return "Battle Result: No victor on this battle field";
    }
}
---------------------------------------------------------------------------------
import java.util.Arrays;

public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    int sumGood = 0;
    int sumEvil = 0;
    int[] goodCount = {1, 2, 3, 3, 4, 10};
    int[] evilCount = {1, 2, 2, 2, 3, 5, 10};
    String[] arrGood = goodAmounts.split(" ");
    String[] arrEvil = evilAmounts.split(" ");
    
    for (int i = 0; i < arrGood.length; i++) sumGood += Integer.parseInt(arrGood[i]) * goodCount[i];
    for (int x = 0; x < arrEvil.length; x++) sumEvil += Integer.parseInt(arrEvil[x]) * evilCount[x];
    
    if (sumGood > sumEvil) {
      return "Battle Result: Good triumphs over Evil";
    } else if (sumGood < sumEvil) {
      return "Battle Result: Evil eradicates all trace of Good";
    } else {
      return "Battle Result: No victor on this battle field";
    }
  }
}
----------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

import java.util.function.BiFunction;

interface GoodVsEvil {
  static String battle(String goodAmounts, String evilAmounts) {
    BiFunction<String[], int[], Integer> f = (u, w) -> range(0, w.length).reduce(0, (s, i) -> s + Integer.parseInt(u[i]) * w[i]);
    int score = f.apply(goodAmounts.split(" "), new int[] {1, 2, 3, 3, 4, 10}) - f.apply(evilAmounts.split(" "), new int[] {1, 2, 2, 2, 3, 5, 10});
    if (score > 0) {
      return "Battle Result: Good triumphs over Evil";
    }
    if (score < 0 ) {
      return "Battle Result: Evil eradicates all trace of Good";
    }
    return "Battle Result: No victor on this battle field";
  }
}
----------------------------------------------------------------------------------
public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    int g = calculateGoodPower(goodAmounts);
    int b = calculateEvilPower(evilAmounts);
   
    
    if(g<b) return"Battle Result: Evil eradicates all trace of Good";
    if(g>b) return"Battle Result: Good triumphs over Evil";
    return "Battle Result: No victor on this battle field";
  }
  
  private static int calculateEvilPower(String evilAmounts){
    int b=0;
    String[] bad = evilAmounts.split(" ");
    b+= Integer.valueOf(bad[0])*1;
    b+= Integer.valueOf(bad[1])*2;
    b+= Integer.valueOf(bad[2])*2;
    b+= Integer.valueOf(bad[3])*2;
    b+= Integer.valueOf(bad[4])*3;
    b+= Integer.valueOf(bad[5])*5;    
    b+= Integer.valueOf(bad[6])*10;
    return b;
    
  }
  
  private static int calculateGoodPower(String goodAmounts){
    int g=0;
    String[] good = goodAmounts.split(" ");
    g+= Integer.valueOf(good[0])*1;
    g+= Integer.valueOf(good[1])*2;
    g+= Integer.valueOf(good[2])*3;
    g+= Integer.valueOf(good[3])*3;
    g+= Integer.valueOf(good[4])*4;
    g+= Integer.valueOf(good[5])*10;
    return g;
    
  }
  
}
-----------------------------------------------------------------------------------
  public static String battle(String goodAmounts, String evilAmounts) {
        int goodSum = 0;
        int evilSum = 0;

        String[] goodGuys = {
                "Hobbits",
                "Men",
                "Elves",
                "Dwarves",
                "Eagles",
                "Wizards"
        };

        String[] evilGuys = {
                "Orcs",
                "Men",
                "Wargs",
                "Goblins",
                "Uruk Hai",
                "Trolls",
                "Wizards"
        };

        String[] goodArray = goodAmounts.split("\\s");
        String[] evilArray = evilAmounts.split("\\s");
        HashMap<String, Integer> good = new HashMap<>();
        HashMap<String, Integer> evil = new HashMap<>();

        for (int i = 0; i < 6; i++) {

            if (goodGuys[i] == "Hobbits") {
                good.put(goodGuys[i], Integer.valueOf(goodArray[i]));
            }

            if (goodGuys[i] == "Men") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 2));
            }

            if (goodGuys[i] == "Elves" || goodGuys[i] == "Dwarves") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 3));
            }

            if (goodGuys[i] == "Eagles") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 4));
            }

            if (goodGuys[i] == "Wizards") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 10));
            }

            goodSum += good.get(goodGuys[i]);

        }

        System.out.println(goodSum);


        for (int i = 0; i < 7; i++) {

            if (evilGuys[i] == "Orcs") {
                evil.put(evilGuys[i], Integer.valueOf(evilArray[i]));
            }

            if (evilGuys[i] == "Men" || evilGuys[i] == "Wargs" || evilGuys[i] == "Goblins") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 2));
            }

            if (evilGuys[i] == "Uruk Hai") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 3));
            }

            if (evilGuys[i] == "Trolls") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 5));
            }

            if (evilGuys[i] == "Wizards") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 10));
            }

            evilSum += evil.get(evilGuys[i]);
        }

        System.out.println(evilSum);



        if (goodSum > evilSum) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilSum > goodSum) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }
}
----------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    Map<Integer, Integer> good = new HashMap<>();
        good.put(0, 1);
        good.put(1, 2);
        good.put(2, 3);
        good.put(3, 3);
        good.put(4, 4);
        good.put(5, 10);
    
        String[] arrayGood = goodAmounts.split(" ");
        int resultGood = 0;
        for (int i = 0; i < arrayGood.length; i++) {
            String entity = arrayGood[i];
            if (!entity.equals("0")){
                for (Map.Entry<Integer, Integer> amount: good.entrySet()) {
                    if (amount.getKey().equals(i)){
                        resultGood = resultGood + (Integer.parseInt(entity) * amount.getValue());
                    }
                }
            }
        }

        Map<Integer, Integer> evil = new HashMap<>();
        evil.put(0, 1);
        evil.put(1, 2);
        evil.put(2, 2);
        evil.put(3, 2);
        evil.put(4, 3);
        evil.put(5, 5);
        evil.put(6, 10);

        String[] arrayEvil = evilAmounts.split(" ");
        int resultEvil = 0;
        for (int i = 0; i < arrayEvil.length; i++) {
            String entity = arrayEvil[i];
            if (!entity.equals("0")){
                for (Map.Entry<Integer, Integer> amount: evil.entrySet()) {
                    if (amount.getKey().equals(i)){
                        resultEvil = resultEvil + (Integer.parseInt(entity) * amount.getValue());
                    }
                }
            }
        }

        if (resultGood < resultEvil) return "Battle Result: Evil eradicates all trace of Good";
        else if (resultGood > resultEvil) return "Battle Result: Good triumphs over Evil";
        else return "Battle Result: No victor on this battle field";
  }
}
----------------------------------------------------------------------------------
public class GoodVsEvil {

    final private static int[] goodWorthTable = {1, 2, 3, 3, 4, 10};
    final private static int[] evilWorthTable = {1, 2, 2, 2, 3, 5, 10};

    public static String battle(String goodAmounts, String evilAmounts) {
        int goodWorth = computeWorth(goodWorthTable, goodAmounts.split(" "));
        int evilWorth = computeWorth(evilWorthTable, evilAmounts.split(" "));

        if (goodWorth > evilWorth) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilWorth > goodWorth) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    private static int computeWorth(int[] worthTable, String[] amountTable) {
        int accumulatedWorth = 0;
        for (int i=0; i<worthTable.length; i++) {
            int worth = worthTable[i];
            int amount = Integer.parseInt(amountTable[i]);
            accumulatedWorth += worth * amount;
        }
        return accumulatedWorth;
    }
}
*/