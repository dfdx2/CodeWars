/* CodeWars Phase Transitions

This kata is an issue from Effective Java (by Joshua Bloch).

You have 3 Phases:

SOLID
LIQUID
GAS
And there are certain transitions between these phases:

SOLID -> LIQUID = MELT
LIQUID -> SOLID = FREEZE
LIQUID -> GAS = BOIL
GAS -> LIQUID = CONDENSE
SOLID -> GAS = SUBLIME
GAS -> SOLID = DEPOSIT
Your task is to return the correct transition when you got the first and second phase as String paramters.

Note:

no invalid input
all input and output is CAPS
no identical transition eg: SOLID -> SOLID is not a valid input
Happy coding!

*/
public class PhaseTransitions {

    public static String getTransition(String phase1, String phase2) {
      String m = "MELT";
      String f = "FREEZE";
      String b = "BOIL";
      String c = "CONDENSE";
      String s = "SUBLIME";
      String d = "DEPOSIT";
      return phase1.equals("SOLID") && phase2.equals("LIQUID") ? m : phase1.equals("LIQUID") && phase2.equals("SOLID") ? f : phase1.equals("LIQUID") && phase2.equals("GAS") ? b : phase1.equals("GAS") && phase2.equals("LIQUID") ? c : phase1.equals("SOLID") && phase2.equals("GAS") ? s : phase1.equals("GAS") && phase2.equals("SOLID") ? d :"No valid input"; 
    }
}
/*--------------------------------------------------------------------------------------------
import java.util.*;

public class PhaseTransitions {

  private static final Map<String,String> map = new HashMap<String,String>() {{
    put("SOLID->LIQUID", "MELT");
    put("LIQUID->SOLID", "FREEZE");
    put("LIQUID->GAS", "BOIL");
    put("GAS->LIQUID", "CONDENSE");
    put("SOLID->GAS", "SUBLIME");
    put("GAS->SOLID", "DEPOSIT");
  }};
  
  public static String getTransition(String from, String to) {
      return map.get(from+"->"+to);
  }
  
}
---------------------------------------------------------------------------------------------
public class PhaseTransitions {

	public static String getTransition(String phase1, String phase2) {
		switch (phase1) {
		case "SOLID":
			return phase2.equals("LIQUID") ? "MELT" : "SUBLIME";
		case "LIQUID":
			return phase2.equals("SOLID") ? "FREEZE" : "BOIL";
		default:
			return phase2.equals("SOLID") ? "DEPOSIT" : "CONDENSE";
		}
	}
}
----------------------------------------------------------------------------------------------
public class PhaseTransitions {

   private static enum Phase {SOLID, LIQUID, GAS}
   private static enum Transition {
     MELT(Phase.SOLID, Phase.LIQUID),
     FREEZE(Phase.LIQUID, Phase.SOLID),
     BOIL(Phase.LIQUID, Phase.GAS),
     CONDENSE(Phase.GAS, Phase.LIQUID),
     SUBLIME(Phase.SOLID, Phase.GAS),
     DEPOSIT(Phase.GAS, Phase.SOLID);
   
     private final Phase from;
     private final Phase to;
     private Transition(Phase p1, Phase p2) {
       from = p1;
       to = p2;
     }
     public static Transition find(Phase from, Phase to) {
       for (var t : values()) {
         if (t.from == from && t.to == to)
           return t;
       }
       throw new IllegalArgumentException();
     }
   }

    public static String getTransition(String phase1, String phase2) {
        return Transition.find(Phase.valueOf(phase1), Phase.valueOf(phase2)).name();
    }
}
---------------------------------------------------------------------------------------------
import java.util.EnumMap;
import java.util.Map;

public class PhaseTransitions {

    public static String getTransition(String phase1, String phase2) {
        Phase p1 = Phase.valueOf(phase1);
        Phase p2 = Phase.valueOf(phase2);
        return Phase.Transition.from(p1, p2).name();

    }

    public enum Phase {
        SOLID, LIQUID, GAS;

        public enum Transition {
            MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
            BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
            SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

            final Phase src;
            final Phase dst;

            Transition(Phase src, Phase dst) {
                this.src = src;
                this.dst = dst;
            }

            private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<>(Phase.class);

            static {
                for (Phase p : Phase.values())
                    m.put(p, new EnumMap<>(Phase.class));

                for (Transition trans : Transition.values())
                    m.get(trans.src).put(trans.dst, trans);
            }

            public static Transition from(Phase src, Phase dst) {
                return m.get(src).get(dst);
            }
        }
    }
}
---------------------------------------------------------------------------------------------
import static java.util.Map.of;

class PhaseTransitions {
  static String getTransition(String phase1, String phase2) {
    return of("SL", "MELT", "LS", "FREEZE", "LG", "BOIL", "GL", "CONDENSE", "SG", "SUBLIME", "GS", "DEPOSIT").get(phase1.charAt(0) + "" + phase2.charAt(0));
  }
}
--------------------------------------------------------------------------------------------
public class PhaseTransitions
{
  public static String getTransition(String phase1, String phase2)
  {
    switch(phase1.compareTo(phase2))
    {
      case -5: return "CONDENSE";
      case -7: return "FREEZE";
      case -12: return "DEPOSIT";
      case 5: return "BOIL";
      case 7: return "MELT";
      case 12: return "SUBLIME";
    }
    
    return "BAD INPUT";
  }
}


*/