/* 7KYU CodeWars Valid Teams and Names

You are in an IT company which has multiple teams. 
You will be given a string listing teams together 
with their members. Each entry starts with a capital 
letter, followed by a colon, and a comma-separated 
list of workers' names. The entries themselves are 
not separated by anything.

A valid team must include at least 2 workers. You have 
to calculate how many valid teams this company has, 
and list the names of their members in the format: 
{N_OF_VALID_TEAMS}:{COMMA_SEPARATED_NAMES}.

Note: there will always be at least 1 valid team.

Examples:

s = "A:Stefan,Milica,Zvonimir,AndrewH:Richard"
mix(s) == "1:Stefan,Milica,Zvonimir,Andrew"

s = "W:John,John,John,JohnC:Danger,Man"
mix(s) == "2:John,John,John,John,Danger,Man"

*/
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;
import static org.apache.commons.lang3.StringUtils.countMatches;

public class ValidTeamsAndNames {
  public static String validate(String s) {
    s = of(s.split("[A-Z]:")).filter(t -> t.contains(",")).collect(joining(":"));
    return 1 + countMatches(s, ":") + ":" + s.replace(':', ',');
  }
}
/*---------------------------------------------------------------
class ValidTeamsAndNames {
  	static String validate(final String s) {
        final StringBuilder sb = new StringBuilder();
        int teams = 0;
        for (String team : s.substring(2).split("[A-Z]:")) {
            if (team.indexOf(',') != -1) {
                sb.append(team).append(',');
                teams++;
            }
        }
        return teams + ":" + sb.deleteCharAt(sb.length() - 1).toString();
    }   
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class ValidTeamsAndNames {

    public static String validate(String s) {
        String[] allTeams = s.split("[A-Z]:");
        List<String> validTeams = new ArrayList<>();

        for (String team : allTeams) {
            if (team.contains(",")) {
                validTeams.add(team);
            }
        }

        return validTeams.size() + ":" + String.join(",", validTeams);
    }
}
-----------------------------------------------------------------
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidTeamsAndNames {
  	public static String validate(String s) {
        Supplier<Stream<String>> stream = () -> 
                Arrays.stream(s.split("[A-Z]:"))
                .filter(str -> !str.isEmpty())
                .filter(str -> str.contains(","));
                
        return stream.get().count() + 
                ":" + 
                stream.get().collect(Collectors.joining(","));
    }   
}
-----------------------------------------------------------------
import java.util.regex.Pattern;

public class ValidTeamsAndNames {
  	public static String validate(String s) {
      String[] ss = Pattern.compile(".:")
                           .splitAsStream(s)
                           .filter( a->a.split(",").length>1 )
                           .toArray(String[]::new);
      return ss.length + ":" + String.join(",",ss);
    }   
}
-----------------------------------------------------------------
public class ValidTeamsAndNames {
  public static String validate(String s) { 
   int sum = 0 ; 
    String f1 = ""; 
   String f [] = s.split(":") ; 
   for (int i = 1; i <f.length ; i ++ )  { 
      if (f[i].contains(","))  { 
         f1+= i<f.length-1? f[i].substring(0 , f[i].length()-1) : f[i];  
         f1 = f1 + " ";
        sum ++;
      } 
}     
    return sum + ":" + f1.trim().replace(" " ,","); 
    }
}
-----------------------------------------------------------------
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class ValidTeamsAndNames {  
  private static final Pattern TEAM = Pattern.compile("\\p{Upper}:");
  
  public static String validate(String source) {
    List<String[]> teams = getTeams(source);
    return String.format("%d:%s", teams.size(), String.join(",", getWorkers(teams)));
  }
  
  private static List<String[]> getTeams(String source) {
    return TEAM.splitAsStream(source)
                .map(str -> str.split(","))
                .filter(arr -> arr.length > 1)
                .collect(toList());
  }
  
  private static List<String> getWorkers(List<String[]> teams) {
    return teams.stream()
                .flatMap(arr -> Stream.of(arr))
                .collect(toList());
  }
}
-----------------------------------------------------------------
import java.util.Arrays;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;

public class ValidTeamsAndNames {
  public static String validate(String s) {
    String[] teams = s.split("[A-Z]:");
    String[] validTeams = Arrays.stream(teams)
                                .filter(team -> team.contains(","))
                                .toArray(String[]::new);
    int numValidTeams = validTeams.length;
    String commaSeparatedNames = Arrays.stream(validTeams)
                                       .collect(joining(","));
    return numValidTeams + ":" + commaSeparatedNames;
  }
}
*/
