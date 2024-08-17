/* 7KYU CodeWars Survive the Attack

Given two Arrays in which values are the power of each soldier, 
return true if you survive the attack or false if you perish.

CONDITIONS

Each soldier attacks the opposing soldier in the same index of 
the array. The survivor is the number with the highest value.

If the value is the same they both perish

If one of the values is empty(different array lengths) the non-empty 
value soldier survives.

To survive the defending side must have more survivors than the attacking side.

In case there are the same number of survivors in both sides, the winner 
is the team with the highest initial attack power. If the total attack 
power of both sides is the same return true.

The initial attack power is the sum of all the values in each array.

EXAMPLES

attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4, 6, 8 ]  
//0 survivors                4 survivors
//return true


attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4 ]  
//2 survivors  (16 damage)   2 survivors (6 damage)
//return false

attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4, 0, 8 ]  
//1 survivors                3 survivors 
//return true

*/
import static java.util.stream.IntStream.of;
public class SurviveTheAttack {
  public static boolean block(int[] attackers, int[] defenders){
    int result = defenders.length - attackers.length;
    for (int i = 0; i < Math.min(defenders.length, attackers.length); i++) {
      result += Math.signum((float) defenders[i] - attackers[i]);
    }
    return result > 0 || result == 0 && of(defenders).sum() >= of(attackers).sum();
    }
}
/*---------------------------------------------------------------------
import static java.util.stream.IntStream.of;

interface Kumite {
  static boolean block(int[] attackers, int[] defenders) {
    int survived = defenders.length - attackers.length;
    for (int i = 0; i < Math.min(defenders.length, attackers.length); i++) {
      survived += Math.signum(defenders[i] - attackers[i]);
    }
    return survived > 0 || survived == 0 && of(defenders).sum() >= of(attackers).sum();
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;
public class Kumite{
  public static boolean block(int[] attackers, int[] defenders){
        int survived = 0;
        survived += defenders.length - attackers.length;
        for (int i = 0; i < attackers.length && i <defenders.length; i++) {
            if(attackers[i] < defenders[i]){
                survived++;
            }else if(attackers[i] != defenders[i]){
                survived--;
            }
        }
        return survived > 0 || survived == 0 && Arrays.stream(defenders).sum() >= Arrays.stream(attackers).sum();
    }
  }
-----------------------------------------------------------------------
public class Kumite{
  public static boolean block(int[] attackers, int[] defenders){
     int dmg=0;
        int survivors=0;
        if(attackers.length>=defenders.length){
            survivors+=attackers.length-defenders.length;
            for(int i=0;i<defenders.length;i++){
                if(attackers[i]-defenders[i]!=0){
                    survivors+=attackers[i]>defenders[i]? 1:-1;
                }
                dmg+=attackers[i]-defenders[i];
            }
            for(int i=defenders.length;i< attackers.length;i++){
                dmg+=attackers[i];
            }
        }
        else{
                survivors+=attackers.length-defenders.length;
                for(int i=0;i<attackers.length;i++){
                    if(attackers[i]-defenders[i]!=0){
                        survivors+=attackers[i]>defenders[i]? 1:-1;
                    }
                    dmg+=attackers[i]-defenders[i];
                }
            for(int i=attackers.length;i<defenders.length;i++){
                dmg-=defenders[i];
            }
                
        }
        System.out.println(survivors);
        if(survivors<0){
            return true;
        }
        else if(survivors==0){
            return dmg <= 0;
        }
        return false;
    }
  }
-----------------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.Arrays;

public class Kumite {
  public static boolean block(int[] attackers, int[] defenders) {
    int defCount = getSurvivorsCount(defenders, attackers);
    int attCount = getSurvivorsCount(attackers, defenders);
    return defCount != attCount ?
      defCount - attCount > 0 :
      getTotalDemage(defenders) >= getTotalDemage(attackers);
  }
  
  private static int getSurvivorsCount(int[] sideA, int[] sideB) {
    return IntStream.range(0, sideA.length)
      .mapMulti((i, consumer) -> {
        if (i >= sideB.length || i < sideB.length && sideA[i] - sideB[i] > 0) 
          consumer.accept(1);
      })
      .sum();
  }
  
  private static int getTotalDemage(int[] demage) {
    return Arrays.stream(demage).sum();
  }
}
-----------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kumite{
    public static boolean block(int[] at, int[] def) {
        List<Integer> a = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        if (at.length > def.length) for (int i = at.length - 1; i >= def.length; --i) a.add(at[i]);
        if (def.length > at.length) for (int i = def.length - 1; i >= at.length; --i) d.add(def[i]);
        for (int i = 0; i < at.length; ++i) {
            if (at.length - 1 < i || def.length - 1 < i) break;
            if (at[i] > def[i]) a.add(at[i]);
            else if (def[i] > at[i]) d.add(def[i]);
        }
        if (a.size() == d.size()) return Arrays.stream(def).sum() >= Arrays.stream(at).sum();
        else return d.size() > a.size();
    }
}
-----------------------------------------------------------------------
import java.util.*;
public class Kumite{
  public static boolean block(int[] attackers, int[] defenders){
         int deflen = defenders.length;
         int attlen = attackers.length;
         
         int len = Math.min(deflen, attlen);
         int defScore =0, attScore= 0;
         for (int i=0 ;i < len; i++){
              if (attackers[i]< defenders[i])
                  defScore++;
              else if (attackers[i]> defenders[i])  
                  attScore++;
         }
         if (deflen >  attlen)
             defScore+= deflen - attlen;
         else if (attlen > deflen)
             attScore += attlen - deflen;
         
         if (defScore > attScore)
             return true;
         else if ( attScore > defScore)
              return false;
         else {
            int attsum = Arrays.stream(attackers).sum();
            int defsum = Arrays.stream(defenders).sum();
            return (defsum >= attsum)? true : false;   
         }
    }
  }
-----------------------------------------------------------------------
public class Kumite{
  public static boolean block(int[] attackers, int[] defenders){
    boolean res = false;
    int survivoursDef = 0;
    int survivoursAtt = 0;
    int bothPerish = 0;
    if (defenders.length <= attackers.length){
    for (int i = 0; i < defenders.length; i++){
      if (defenders[i] > attackers[i]){
         survivoursDef++;
      }
      if (defenders[i] == attackers[i]){
         bothPerish++;
      }
    }
    survivoursAtt = attackers.length - survivoursDef - bothPerish;
    }
    if (defenders.length > attackers.length){
    for (int i = 0; i < attackers.length; i++){
      if (attackers[i] > defenders[i]){
         survivoursAtt++;
      }
      if (defenders[i] == attackers[i]){
         bothPerish++;
      }
    }
    survivoursDef = defenders.length - survivoursAtt - bothPerish;
    }
    if (survivoursDef > survivoursAtt){
      res = true;
    }
    int sumA = 0;
    int sumD = 0;
    for (int i = 0; i < defenders.length; i++){
      sumD += defenders[i];
    }
    for (int i = 0; i < attackers.length; i++){
      sumA += attackers[i];
    }
    if (survivoursDef == survivoursAtt && sumD >= sumA){
      res = true;
    }
    return res;
    }
  }
-----------------------------------------------------------------------
import java.util.Arrays;

public class Kumite{
  public static boolean block(int[] attackers, int[] defenders) {
    int res = defenders.length - attackers.length;
    for (int i = 0; i < Math.min(attackers.length, defenders.length); i++) {
      res += attackers[i] < defenders[i] ? 1 : attackers[i] > defenders[i] ? -1 : 0;
    }
    return res > 0 || (res == 0 && Arrays.stream(defenders).sum() >= Arrays.stream(attackers).sum());
  }
}
-----------------------------------------------------------------------
import java.util.Arrays;

public class Kumite{
 public static boolean block(int[] attackers, int[] defenders){
		 
		 int poderAtaque = Arrays.stream(attackers).sum();
		 int poderDefensa = Arrays.stream(defenders).sum();
		 
		 int supervivientes = 0;
		 supervivientes = supervivientes + defenders.length - attackers.length;
		 
		 for (int i = 0; i < defenders.length && i < attackers.length; i++) {
			
			 if(attackers[i] < defenders[i]) {
				 supervivientes++;
			 }
			 else if(attackers[i] != defenders[i]) {
				 supervivientes--;
			 }
		}
		 if(supervivientes > 0 || supervivientes == 0 && poderDefensa  >= poderAtaque) {
			 return true;
		 }
		 else {
			 return false;
		 }
		    }
  }
*/