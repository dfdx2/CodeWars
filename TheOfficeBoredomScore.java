/* 7KYU The Office II - Boredom Score

Every now and then people in the office moves teams or departments. Depending 
what people are doing with their time they can become more or less boring. 
Time to assess the current team.

You will be provided with an array of Person objects with each instance 
containing the name and department for a staff member.

public class Person {
  public final String name;        // name of the staff member
  public final String department;  // department they work in
}

Each department has a different boredom assessment score, as follows:

accounts = 1
finance = 2
canteen = 10
regulation = 3
trading = 6
change = 6
IS = 8
retail = 5
cleaning = 4
pissing about = 25

Depending on the cumulative score of the team, return the appropriate sentiment:

<=80: 'kill me now'
< 100 & > 80: 'i can handle this'
100 or over: 'party time!!'

*/

public class TheOffice {
    public static String boredom(Person[] staff) {
      int total = 0;
      for (int i = 0; i < staff.length; i++) {
        if (staff[i].department == "accounts") {
          total += 1;
        }
        else if (staff[i].department == "finance") {
          total += 2;
        }
        else if (staff[i].department == "canteen") {
          total += 10;
        }
        else if (staff[i].department == "regulation") {
          total += 3;
        }
        else if (staff[i].department == "trading") {
          total += 6;
        }
        else if (staff[i].department == "change") {
          total += 6;
        }
        else if (staff[i].department == "IS") {
          total += 8;
        }
        else if (staff[i].department == "retail") {
          total += 5;
        }
        else if (staff[i].department == "cleaning") {
          total += 4;
        }
        else if (staff[i].department == "pissing about") {
          total += 25;
        }
      }
      String k = "kill me now";
      String i = "i can handle this";
      String p = "party time!!";
      return (total <= 80) ? k : (total > 80 && total < 100) ? i : p;
    }
  }
/*----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;

public class TheOffice {
  public static String boredom(Person[] staff) {
    Map<String, Integer> teams = Map.of(
				"accounts", 1,
				"finance", 2,
				"canteen", 10,
				"regulation", 3,
				"trading", 6,
				"change", 6,
				"IS", 8,
				"retail", 5,
				"cleaning", 4,
				"pissing about", 25
		);

		int result = Arrays.stream(staff)
				.mapToInt(s -> teams.get(s.department))
				.sum();

		if(result <= 80) {
			return "kill me now";
		} else if(result < 100) {
			return "i can handle this";
		} else {
			return "party time!!";
		}
  }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class TheOffice {
  private static Map<String, Integer> boredom = Map.of("accounts", 1,
                                                       "finance", 2,
                                                       "canteen", 10,
                                                       "regulation", 3,
                                                       "trading", 6,
                                                       "change", 6,
                                                       "IS", 8,
                                                       "retail", 5,
                                                       "cleaning", 4,
                                                       "pissing about", 25);

  public static String boredom(Person[] staff) {
      int score = Arrays.stream(staff)
                   .mapToInt(person -> boredom.get(person.department))
                   .sum();
                   
      return score <= 80 ? "kill me now" : score >= 100 ? "party time!!" : "i can handle this";
  }
}
--------------------------------------------------------------------------------
import static java.util.Arrays.stream;

import java.util.Map;

class TheOffice {
  static String boredom(Person[] staff) {
    var boredom = Map.of("accounts", 1,"finance", 2, "regulation", 3, "cleaning", 4, "retail", 5, "change", 6, "trading", 6, "IS", 8, "canteen", 10, "pissing about", 25);
    int score = stream(staff).mapToInt(p -> boredom.get(p.department)).sum();
    return score > 99 ? "party time!!" : score < 81 ? "kill me now" : "i can handle this";
  }
}
---------------------------------------------------------------------------------
public class TheOffice {
  public static String boredom(Person[] staff) {
    int result = 0;
    for(Person a : staff) {
      switch(a.department) {
        case "accounts"      : result += 1; 
                                break;
        case "finance"       : result += 2; 
                                break; 
        case "canteen"       : result += 10; 
                                break; 
        case "regulation"    : result += 3; 
                                break; 
        case "trading"       : result += 6; 
                                break; 
        case "change"        : result += 6; 
                                break; 
        case "IS"            : result += 8; 
                                break; 
        case "retail"        : result += 5; 
                                break; 
        case "cleaning"      : result += 4; 
                                break; 
        case "pissing about" : result += 25; 
                                break; 
      }
    }
    return result <= 80 ? "kill me now" : result > 99 ? "party time!!" : "i can handle this";
  }
}
------------------------------------------------------------------------------------
public class TheOffice {
  public static String boredom(Person[] staff) { 
  
    int score = 0;
    
    for (Person yo : staff){
      switch (yo.department){
    
      case "accounts": score += 1; break;
      case "finance": score += 2; break;
      case "canteen": score += 10; break;
      case "regulation": score += 3; break; 
      case "trading": score += 6; break; 
      case "change": score += 6; break;
      case "IS": score += 8; break;
      case "retail": score += 5; break;
      case "cleaning": score += 4; break;
      case "pissing about": score += 25; break;
      }
    
    }
    if (score <= 80) return "kill me now";
    if (score > 80 && score < 100 ) return "i can handle this";
    return "party time!!";
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheOffice {
    static Map<String, Integer> departments = new HashMap<>();

    static {
        departments.put("accounts", 1);
        departments.put("finance", 2);
        departments.put("canteen", 10);
        departments.put("regulation", 3);
        departments.put("trading", 6);
        departments.put("change", 6);
        departments.put("IS", 8);
        departments.put("retail", 5);
        departments.put("cleaning", 4);
        departments.put("pissing about", 25);
    }

    public static String boredom(Person[] staff) {
        int sum = Arrays.stream(staff)
                .mapToInt(person -> departments.get(person.department))
                .sum();
        return sum <= 80 ? "kill me now" : sum < 100 ? "i can handle this" : "party time!!";
    }
}




*/