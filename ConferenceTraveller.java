/* 7KU CodeWars Conference Traveller


Lucy loves to travel. Luckily she is a renowned computer scientist and 
gets to travel to international conferences using her department's budget.

Each year, Society for Exciting Computer Science Research (SECSR) organizes 
several conferences around the world. Lucy always picks one conference from 
that list that is hosted in a city she hasn't been to before, and if that 
leaves her with more than one option, she picks the conference that she thinks 
would be most relevant for her field of research.

Write a function conferencePicker that takes in two arguments:

citiesVisited, a list of cities that Lucy has visited before, given as an array 
of strings.
citiesOffered, a list of cities that will host SECSR conferences this year, given 
as an array of strings. citiesOffered will already be ordered in terms of the 
relevance of the conferences for Lucy's research (from the most to the least relevant).
The function should return the city that Lucy should visit, as a string.

Also note:

You should allow for the possibility that Lucy hasn't visited any city before.
SECSR organizes at least two conferences each year.
If all of the offered conferences are hosted in cities that Lucy has visited before, 
the function should return 'No worthwhile conferences this year!' (Nothing in Haskell)

Example:
citiesVisited = ['Mexico City','Johannesburg','Stockholm','Osaka','Saint Petersburg','London'];
citiesOffered = ['Stockholm','Paris','Melbourne'];

conferencePicker (citiesVisited, citiesOffered);
// ---> 'Paris'

*/

public class Kata {

  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    String visit = "";
    for (String x : citiesVisited) {
      visit += x + " ";
    }
    for (int i = 0; i < citiesOffered.length; i++) {
      String d = citiesOffered[i];
      if (!visit.contains(d)) {
        return citiesOffered[i];
      }
    }
    return "No worthwhile conferences this year!";
  }
}
/*-------------------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;

public class Kata {
  public static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    List<String> citiesVisitedList = Arrays.asList(citiesVisited);
    return Arrays.stream(citiesOffered)
                 .dropWhile(citiesVisitedList::contains)
                 .findFirst()
                 .orElse("No worthwhile conferences this year!");
  }
}
----------------------------------------------------------------------------------------------------
import java.util.Arrays;

public class Kata {
  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    return Arrays.stream(citiesOffered).filter(c -> !Arrays.asList(citiesVisited).contains(c)).findFirst().orElse("No worthwhile conferences this year!");
  }
}
---------------------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;

public class Kata {

    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        return Arrays.stream(citiesOffered)
                .filter(city -> !Arrays.asList(citiesVisited).contains(city))
                .findFirst()
                .orElse("No worthwhile conferences this year!");
    }

----------------------------------------------------------------------------------------------------
import static java.util.function.Predicate.not;
import static java.util.stream.Stream.of;

import java.util.Set;

public class Kata {

  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    return of(citiesOffered).filter(not(Set.of(citiesVisited)::contains)).findFirst()
        .orElse("No worthwhile conferences this year!");
  }

}
----------------------------------------------------------------------------------------------------
import java.util.List;
import java.util.Arrays;

public class Kata {
  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    List<String> visited = Arrays.asList(citiesVisited);
    for (String city : citiesOffered) {
      if (!visited.contains(city)) {
        return city;
      }
    }
    return "No worthwhile conferences this year!";
  }
}
----------------------------------------------------------------------------------------------------
import static java.util.function.Predicate.not;
import static java.util.stream.Stream.of;

import java.util.Set;

class Kata {
  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    return of(citiesOffered).filter(not(Set.of(citiesVisited)::contains)).findFirst()
        .orElse("No worthwhile conferences this year!");
  }
}
*/