/* 7KYU CodeWars Folding Your Way To The Moon

Have you heard about the myth that if you fold a paper 
enough times, you can reach the moon with it? Sure you 
have, but exactly how many? Maybe it's time to write a 
program to figure it out.

You know that a piece of paper has a thickness of 0.0001m. 
Given distance in units of meters, calculate how many times 
you have to fold the paper to make the paper reach this 
distance.

(If you're not familiar with the concept of folding a paper: 
Each fold doubles its total thickness.)

Note: Of course you can't do half a fold. You should know 
what this means ;P

Also, if somebody is giving you a negative distance, it's 
clearly bogus and you should yell at them by returning null 
(or whatever equivalent in your language). In Shell please 
return None. In C and COBOL please return -1.

*/
public class PaperFolder {
  public static Long fold(Double distance) {
    return distance < 0 ? null : distance > 10e-5 ? fold(distance / 2) + 1 : 0;
  }
}
/*---------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(Double distance) {
    long count = 0;
    if (distance < 0) return null;
    for (double thickness = 0.0001; thickness < distance; thickness *= 2) count++; 
    return count;
  }
}
-----------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(double d) {
    return d < 0 ? null : d <= 0.0001 ? 0 : 1 + fold(d/2);
  }
}
-----------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(Double d) {
    return d<0?null:d<=0.0001?0:(long)Math.ceil(Math.log(d/0.0001)/Math.log(2));
    
  }
}
-----------------------------------------------------------------------------
public class PaperFolder {
  private static final double PAPER_THICKNESS = 0.0001;
  
  public static Long fold(final Double distance) {
    if (distance == null || distance < 0) return null;
    long count = 0;
    for (double paper = PAPER_THICKNESS; paper < distance; paper += paper) count++;
    return count;
  }
}
-----------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(Double distance) {
    
    if(distance==0)return 0L;
    if(distance<0)return null;
    Double summa=0.0001;
    Long tracker=0L;
    while(summa<distance){
       ++tracker;
       summa=summa*2;
       
    }
    return tracker;
  }
}
------------------------------------------------------------------------------
public class PaperFolder {

    public static Long fold(Double distance) {
        return new Solver(distance).solve();
    }
}

class Solver {

    private double thickness = 0.0001;
    private long timesFolded = 0;
    private final double distance;

    Solver(double distance) {
        this.distance = distance;
    }

    Long solve() {
        if (distance >= 0) {
            while (thickness < distance) {
                fold();
            }
            return timesFolded;
        } else {
            return null;
        }
    }

    private void fold() {
        thickness *= 2;
        timesFolded++;
    }

}
------------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(Double distance) {
    return distance < 0. ? null : distance > .0001 ? fold(distance / 2) + 1 : 0;
  }
}
------------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(Double distance) {
    if(distance <0) return null;
    if(distance<0.0001){
      return 0L;
    }
    double thick = 0.0001;
    long fold = 0L;
    while(thick<distance){
      thick*=2;
      fold++;
    }
  return fold;
  }
  
}
------------------------------------------------------------------------------
public class PaperFolder {
  public static Long fold(Double distance) {
        final double thickness = 0.0001;
        if (distance < 0)
            return null;
        if (distance < thickness)
            return 0L;
        return (long) Math.ceil(Math.log(distance / thickness) / Math.log(2));
  }
}
*/