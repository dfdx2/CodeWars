/* 7KYU CodeWars Friend or Foe?

Make a program that filters a list of strings 
and returns a list with only your friends name 
in it.

If a name has exactly 4 letters in it, you can 
be sure that it has to be a friend of yours! 
Otherwise, you can be sure he's not...

Input = ["Ryan", "Kieran", "Jason", "Yous"]
Output = ["Ryan", "Yous"]

Input = ["Peter", "Stephen", "Joe"]
Output = []
Input strings will only contain letters.
Note: keep the original order of the names in 
the output.

*/
import java.util.List;
import java.util.*;
class FriendOrFoe {
   public static List<String> friend(List<String> x){
     List<String> result = new ArrayList<>();
     for (String a : x) {
       if (a.length() == 4) {
         result.add(a);
       }
     }
     return result;
   }
}
/*----------------------------------------------------------------
import java.util.List;

class Kata {
  public static List<String> friend(List<String> x){
    return x.stream().filter(s -> s.length() == 4).toList();
  }

------------------------------------------------------------------
import java.util.List;

interface Kata {
  static List<String> friend(List<String> names) {
    return names.stream().filter(s -> s.length() == 4).toList();
  }
}
------------------------------------------------------------------
import java.util.*;
class Kata {
  public static List<String> friend(List<String> x){
    List<String> result = new ArrayList<String>();
    for (String str: x) {
      if (str.length() == 4) {
        result.add(str);
      }
    }
    return result;
  }
}
------------------------------------------------------------------
import java.util.*;
class Kata {
   public static List<String> friend(List<String> x){
        List<String> fr = new ArrayList<>();
        for (String name : x){
            if (name.length() > 4 || name.length() < 4){
                continue;
            }else {
                fr.add(name);
            }
        }
        return fr;
    }
}
------------------------------------------------------------------
import java.util.List;
class Kata {
   public static List<String> friend(List<String> x) {
     return x.stream().filter(n -> 4 == n.length()).toList();
   }
}
------------------------------------------------------------------
import java.util.*;
class Kata {
   public static List<String> friend(List<String> x){
     // Your code here
     List<String> friends = new ArrayList<>();
     
     for(String str : x){
       if(str.length() == 4){
         friends.add(str);
       }
     }
     
     return friends;
   }
}
------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
class Kata {
   public static List<String> friend(List<String> x){
        return x.stream().filter(y -> y.length() == 4).collect(Collectors.toList());

   }
}
*/