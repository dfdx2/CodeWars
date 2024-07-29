/* 7KYU CodeWars Santa's Naughty List 

Christmas is coming, and Santa has a long list to go through, 
to find who deserves presents for the big day. Go through a 
list of children, and return a list containing every child who 
appeared on Santa's list. Do not add any child more than once. 
Output should be sorted.

For java, use Lists.

Comparison should be case sensitive and the returned list should 
contain only one copy of each name: "Sam" and "sam" are different, 
but "sAm" and "sAm" are not.

*/
import java.util.List;
class SantasNaughtyList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return santasList.stream().filter(children::contains).distinct().sorted().toList();
    }
}
/*-----------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;

class findList {

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        
        final Set<String> santa = new HashSet<String>(santasList);
        return children.stream().filter( s -> santa.contains(s) ).distinct().sorted().collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;

class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
    	return children.stream()
               .filter(child -> santasList.contains(child))
               .distinct()
               .sorted()
               .collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------
import java.util.*;
class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
      List<String> c = new ArrayList<>();
        for(String child:children){
          if(santasList.contains(child)&& !c.contains(child)){
            c.add(child);           
          }
        }
        Collections.sort(c);        
        return c;
    }
}  
-------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;

class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return children.stream().distinct().filter(santasList::contains).sorted().collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------
import java.util.*;
class FindList {
  public static List<String> findChildren(List<String> santasList, List<String> children) {
    List<String> result = new ArrayList();
    String added = "";
    for (var x : santasList){
      if (children.contains(x) && !added.contains(x)){
        result.add(x);
        added += x;
      }
    }
    Collections.sort(result);
    System.out.println(result);
    return result;
  }
}
-------------------------------------------------------------------------
import java.util.*;
class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        Set<String> santaSet = new HashSet<>(santasList);
        List<String> res = new ArrayList<>();

        for (String child : children) { // iterate only once
            if(santaSet.contains(child)){ // fast search
                res.add(child);
                santaSet.remove(child);
            }
        }
        Collections.sort(res);
        return res;
    }
}
-------------------------------------------------------------------------
import java.util.*;

class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        ArrayList<String> result = new ArrayList<>();
        for (String child: children) {
            if (santasList.contains(child) && !result.contains(child)){
                result.add(child);
            }
        }
        Collections.sort(result);
        return result;
    }
}
-------------------------------------------------------------------------
import java.util.*;
class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        HashSet<String> santaList = new HashSet<>(santasList);
        ArrayList<String> list = new ArrayList<>();

        for(String str : santaList){
            if(children.contains(str)){
                list.add(str);
            }
        }
        Collections.sort(list);
        return list;
    }
}
-------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
           return
                santasList.stream().filter(children::contains).sorted().distinct().collect(Collectors.toList());
 }
}
*/