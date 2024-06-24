/* 7KYU CodeWars Acronym Generator

In nearly every company each employee has a certain acronym 
containing the first characters of his first and last name(s).

Your task is to write an acronym generator which generates an 
acronym for a given name. You don't have to care about duplicate 
acronyms (someone else will do this for you). Note that names can 
be given in upper or in lower case. The acronym shall always be 
upper case.

Normally the acronym is always the first letter of your first and 
the first letter of the last name in upper case.

For example:

Thomas Meyer => TM

martin schmidt => MS

In your company there work only people with a maximum of two first names. 
If a person has two first names, they might be joined with a dash.

Jan-Erich Schmidt => JES Jan Erich Mueller => JEM

Last names may also be joined with a dash. No one can have more than two 
last names.

Paul Meyer-Schmidt

In Germany, there are last names which have the leading word "von". This 
shall be abbreviated with a lower case "v":

Paul von Lahnstein => PvL

Martin von Lahnstein-Meyer => MvLM

Happy coding!


*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {

    public static String createAcronym(String lastName, String firstName) {
      StringBuilder sb = new StringBuilder();
      for (String a : (firstName + " " + lastName).split("[\\s-]")) {
        sb.append(a.equalsIgnoreCase("von") ? 'v' : Character.toUpperCase(a.charAt(0)));
      }
      return sb.toString();
    }
}
/*----------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {

    public static String createAcronym(String lastName, String firstName) {
        String[] name = (firstName + " " + lastName).replace("-"," ").split(" ");
        String ans = "";
        for (int i = 0; i < name.length; i++) {
          if (name[i].equalsIgnoreCase("von")) ans += "v";
          else ans += name[i].substring(0,1).toUpperCase();
        }
        return ans;
    }
}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AcronymGenerator {

    public static String createAcronym(String lastName, String firstName) {
        Function<String, String> acronymize = name -> Arrays.stream(name.split("[ -]"))
                .map(s -> s.matches("(?i:von)") ? s.toLowerCase() : s.toUpperCase())
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());
        return Stream.of(firstName, lastName)
                .map(acronymize)
                .collect(Collectors.joining());
    }
}
------------------------------------------------------------------
public class AcronymGenerator {

    public static String createAcronym(String lastName, String firstName) {
        return (firstName+" "+lastName).toUpperCase()
                                       .replaceAll("\\bVON\\b","v")
                                       .replaceAll("(?i)(?<=\\w)\\w|[^a-z]","");
    }
}
------------------------------------------------------------------
class AcronymGenerator {
  static String createAcronym(String lastName, String firstName) {
    String acronym = "";
    for (String name : (firstName + " " + lastName).split("\\s|-")) {
      acronym += name.equalsIgnoreCase("von") ? 'v' : Character.toUpperCase(name.charAt(0));
    }
    return acronym;
  }
}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {
    public static String createAcronym(String lastName, String firstName) {
        return Arrays.stream((firstName+" "+lastName).split("[ -]")).map(e -> new String(new char[] {e.equalsIgnoreCase("von")?'v':e.toUpperCase().charAt(0)})).collect(Collectors.joining());
    }
}
------------------------------------------------------------------
import java.util.*;
public class AcronymGenerator {
  public static String createAcronym(String lastName, String firstName) {
    System.out.println(firstName + "  " + lastName);
    //firstName = firstName.toUpperCase().replaceAll("Von","von");
    //lastName = lastName.toUpperCase().replaceAll("Von","von");
    String result = "";
    result += firstName.substring(0,1);
    if (firstName.contains("-")){
      result += firstName.substring(firstName.indexOf("-")+1,firstName.indexOf("-")+2);
    }
    if (firstName.contains(" ")){
      result += firstName.substring(firstName.indexOf(" ")+1,firstName.indexOf(" ")+2);
    }
    result += lastName.substring(0,1);
    if (lastName.contains(" ")){
      result += lastName.substring(lastName.indexOf(" ")+1,lastName.indexOf(" ")+2);
    }
    if (lastName.contains("-")){
      result += lastName.substring(lastName.indexOf("-")+1,lastName.indexOf("-")+2);
    }
    if (!firstName.toLowerCase().contains("von") && !lastName.toLowerCase().contains("von") ||
        lastName.toLowerCase().contains("vond")){
      return result.toUpperCase();
    }
    return result.replace("V","v");
  }
}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {
    public static String createAcronym(String lastName, String firstName) {
        return Arrays.stream((firstName + " " + lastName).split("[ -]"))
          .map(s -> String.valueOf(s.equalsIgnoreCase("von") ? Character.toLowerCase(s.charAt(0)) : Character.toUpperCase(s.charAt(0))))
          .collect(Collectors.joining("")) ;
    }
}
------------------------------------------------------------------
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class AcronymGenerator {
  
  public static String createAcronym(String lastName, String firstName) {
    return Stream.of(firstName.toUpperCase(), lastName.toUpperCase())
                .flatMap(str -> Stream.of(str.split("\\s|-")))
                .map(str -> str.equals("VON") ?  "v" : str.substring(0, 1))
                .collect(joining());
  }
}
*/
