/* 6KYU CodeWars Meeting

John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and 
first name of a guest come in the result between parentheses separated 
by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two 
people have the same first name too.

Notes
You can see another examples in the "Sample tests".

*/

import java.util.Arrays;
class Meeting {
    
    public static String meeting(String s) {
      String[] result = s.split(";");
      for (int i = 0; i < result.length; i++) {
        int count = result[i].indexOf(":");
        result[i] = "(" + result[i].substring(count + 1).toUpperCase() + ", " + result[i].substring(0, count).toUpperCase() + ")";
      }
      Arrays.sort(result);
      return String.join("", result);
    }
}
/*--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

class Meeting {
    
    public static String meeting(String s) {
      return Arrays.stream(s.toUpperCase().split(";"))
                   .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                   .sorted()
                   .collect(Collectors.joining(""));
    }
}
---------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
class Meeting {
    
  public static String meeting(String s) {
    return Arrays.stream(s.split(";"))
                 .map(String::toUpperCase)
                 .map(Name::new)
                 .sorted(Comparator.comparing(Name::getLast).thenComparing(Name::getFirst))
                 .map(n -> String.format("(%s, %s)", n.getLast(), n.getFirst()))
                 .collect(Collectors.joining(""));
  }
  
  private static class Name {
    private String first;
    private String last;
    public Name(String name) {
      String[] parts = name.split(":");
      first = parts[0];
      last = parts[1];
    }
    public String getFirst() {
      return first;
    }
    public String getLast() {
      return last;
    }
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;

class Meeting {
    
    public static String meeting(String s) {
        String[] guests = s.split(";");
        for (int i = 0; i < guests.length; i++){
            int index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index+1).toUpperCase() + ", " + guests[i].substring(0,index).toUpperCase() + ")";
        }
        Arrays.sort(guests);
        
        return String.join("",guests);
    }
}
------------------------------------------------------------------------------------
import java.util.Arrays;

class Meeting {
    
    public static String meeting(String s) {
        String[] guests = s.toUpperCase().split(";");
        
        //JOHN:SMITH to (SMITH, JOHN)
        for (int i = 0; i<guests.length; i++) { 
            guests[i]  = guests[i].replaceAll("(^\\w+):(\\w+$)", "($2, $1)"); 
        }
        
        Arrays.sort(guests);
        
        return String.join("", guests);
    }
}



*/