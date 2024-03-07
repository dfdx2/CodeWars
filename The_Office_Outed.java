/* 7KYU CodeWars The Office I - Outed

Your colleagues have been looking over you shoulder. When you 
should have been doing your boring real job, you've been using 
the work computers to smash in endless hours of codewars.

In a team meeting, a terrible, awful person declares to the 
group that you aren't working. You're in trouble. You quickly 
have to gauge the feeling in the room to decide whether or not 
you should gather your things and leave.

Given a Person array (meet) containing team members, you need 
to assess the overall happiness rating of the group. If <= 5, 
return "Get Out Now!". Else return "Nice Work Champ!".

The Person class looks like:

class Person {
  final String name;    // team memnber's name
  final int happiness;  // happiness rating out of 10
}
Happiness rating will be total score / number of people in the room.

Note that your boss is in the room (boss), their score is worth double 
it's face value (but they are still just one person!).

*/

import static java.util.Arrays.stream;
public class TheOffice {
  public static String outed(Person[] meet, String boss) {
    return stream(meet).mapToInt(p -> p.happiness * (p.name.equals(boss) ? 2 : 1))
                       .average().orElse(0) > 5 ? "Nice Work Champ!" : "Get Out Now!";
  }
}
/*----------------------------------------------------------------------------
public class TheOffice {
  public static String outed(Person[] meet, String boss) {
     double rating = 0;
     for(Person a : meet) {
       rating += a.happiness;
       if(a.name.equals(boss)) rating += a.happiness;
     }
   return (rating/meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class TheOffice {
  private static final String GOOD = "Nice Work Champ!";
  private static final String BAD = "Get Out Now!";
  
  public static String outed(Person[] meet, String boss) {
    double rating = Arrays.stream(meet)
                          .mapToInt(person ->
                            person.name.equals(boss) ? person.happiness * 2
                                                     : person.happiness)
                          .average()
                          .orElse(0.0);
    return (rating > 5) ? GOOD : BAD;
  }
}
-------------------------------------------------------------------------------
public class TheOffice {
  public static String outed(Person[] meet, String boss) {
    //This will be the added happiness of all our attendees
    //This is a float because it will be averaged later on
    float happinessScore = 0;
    //This iterates through all of the said "attendees"
    for(int i = 0; i < meet.length; i++) {
      //As long as this person is NOT the boss, add their happiness to the happinessScore
      if(meet[i].name != boss)
        happinessScore+=meet[i].happiness;
      //If this person IS the boss, then multiply his/her happiness by two and add it to the happinessScore. Important people get to be extra happy.
      else
        happinessScore+=meet[i].happiness*2;
    }
    //Here, we divide the overall happinessScore by the amount of people attending to check later. (Averaging it)
    happinessScore=happinessScore/meet.length;
    //If the average happiness is not above 5, then you need to leave. QUICKLY.
    if(happinessScore <= 5)
      return "Get Out Now!";
    //If the average happiness IS above 5, then you get a "Nice Work Champ!" and you get to feel all warm and fuzzy inside. Well done.
    else
      return "Nice Work Champ!";
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class TheOffice {
   public static String outed(Person[] meet, String boss) {
      return Arrays.stream(meet)
            .mapToInt(p -> p.name.equals(boss) ? p.happiness * 2 : p.happiness )
            .average()
            .getAsDouble() <= 5 ? "Get Out Now!" : "Nice Work Champ!";
   }
}
-------------------------------------------------------------------------------
public class TheOffice {
  public static String outed(Person[] meet, String boss) {
  System.out.println(boss);
    String fired = "Get Out Now!";
    String gg = "Nice Work Champ!";
    float total = 0;
    for(Person random : meet){
      if(random.name.equals(boss)){
        total += (random.happiness)*2;
        System.out.println("boss : "+boss);
      }
      else{
        total += random.happiness;
        System.out.println(random.name);
      }
    }
    System.out.println(total/meet.length);
    if(total/meet.length > 5){
    System.out.println("terminé");
      return gg; 
    }
    else{
    System.out.println("terminé");
      return fired;
    }
  }
}
--------------------------------------------------------------------------------
import java.util.Arrays;

public class TheOffice {
  public static String outed(Person[] meeting, String boss) {
    return sumHappiness(meeting, boss) > 5 ? "Nice Work Champ!" : "Get Out Now!";
  }
  
  private static double sumHappiness(Person[] meeting, String boss) {
    return Arrays.stream(meeting).mapToDouble(p -> p.name.equals(boss) ? 2*p.happiness : p.happiness).sum()/meeting.length;
  }
}
--------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

public class TheOffice {
  public static String outed(Person[] meet, String boss) {
      double happiness = Arrays.stream(meet)
            .mapToInt(person -> boss.equals(person.name) ? person.happiness * 2 : person.happiness)
            .average()
            .orElse(0.0);
  
      return happiness <= 5 ? "Get Out Now!" : "Nice Work Champ!";
  }
}
*/