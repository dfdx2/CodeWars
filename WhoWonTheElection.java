/*      6KYU  Who Won The Election?

In democracy we have a lot of elections. For example, we have to vote for a 
class representative in school, for a new parliament or a new government.
Usually, we vote for a candidate, i.e. a set of eligible candidates is given. 
This is done by casting a ballot into a ballot-box. After that, it must be 
counted how many ballots (= votes) a candidate got.
A candidate will win this election if he has the absolute majority.

Your Task
Return the name of the winner. If there is no winner, return null (in Java and JavaScript), 
None (in Python) or nil (in Ruby).

Task Description
There are no given candidates. An elector can vote for anyone. Each ballot contains 
only one name and represents one vote for this name. A name is an arbitrary string, 
e.g. "A", "B", or "XJDHD".

There are no spoiled ballots.

The ballot-box is represented by an unsorted list of names. Each entry in the list corresponds to one vote for this name. You do not know the names in advance (because there are no candidates).

A name wins the election if it gets more than n/2 votes (n = number of all votes, 
i.e. n is equal to the size of the given list).

Examples
//3 votes for "A", 2 votes for "B" -> "A" wins the election
BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B")).equals("A") //true
//2 votes for "A", 2 votes for "B" -> No winner
BallotsCounter.getWinner(Arrays.asList("A", "A", "B", "B")) == null //true
//1 vote for each name -> No winner
BallotsCounter.getWinner(Arrays.asList("A", "B", "C", "D")) == null //true
//3 votes for "A", 2 votes for "B", 1 vote for "C"  
//-> No winner ("A" does not have more than n/2 = 3 votes)
BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "C")) == null //true

Note
Please keep in mind the list of votes can be large (n <= 1,200,000). 
The given list is immutable, i.e. you cannot modify the list 
(otherwise this could lead to vote rigging).
Good luck and have fun.
*/

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class BallotsCounter {
    public static String getWinner(final List<String> listOfBallots) {
       Map<String, Long> counts = listOfBallots.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       return counts.entrySet().stream().filter(e -> e.getValue() > listOfBallots.size() / 2)
                .map(Map.Entry::getKey).findFirst().orElse(null);         
    }
}
/*
____________________________________________________________________________________________

import java.util.List;
import java.util.HashSet;
import java.util.Collections;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
      HashSet<String> unique = new HashSet<String>(listOfBallots);
      for (String n : unique) {
        if (Collections.frequency(listOfBallots, n) > listOfBallots.size()/2) return n;
      }
      return null;
    }

}
________________________________________________________________________________________

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
      int n = listOfBallots.size();
      int majority = (n/2) + 1;
      
      // compute PARTY -> VOTES mapping
      Map<String, Long> counts = listOfBallots.stream().collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
      
      // determine winner
      return counts.entrySet().stream().filter((e) -> e.getValue() >= majority).map(Map.Entry::getKey).findFirst().orElse(null);
    }
}
__________________________________________________________________________________________

import java.util.*;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
      int n = listOfBallots.size();
      
      Set<String> unique = new HashSet<String>(listOfBallots);
      for (String key : unique) {
        if ( Collections.frequency(listOfBallots, key) > n/2){
          return key;
        }
      }
    
    return null;
    }
}
___________________________________________________________________________________________

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallotsCounter {
  public static String getWinner(final List<String> listOfBallots) {
    Map<String, Integer> tally = new HashMap<>();
    for(String v : listOfBallots) {
      if(tally.containsKey(v)) {
        tally.put(v, tally.get(v) + 1);
      } else {
        tally.put(v, 1);
      }
    }
    String leadC = null;
    int leadV = 0;
    for(Map.Entry<String, Integer> entry : tally.entrySet()) {
      if(entry.getValue() > leadV) {
        leadC = entry.getKey();
        leadV = entry.getValue();
      }
    }
    return leadV > listOfBallots.size() / 2 ? leadC : null;
  }
}
*/