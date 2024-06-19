/* 7KYU CodeWars Partial Word Searching

Write a method that will search an array of strings for all strings 
that contain another string, ignoring capitalization. Then return an 
array of the found strings.

The method takes two parameters, the query string and the array of 
strings to search, and returns an array.

If the string isn't contained in any of the strings in the array, the 
method returns an array containing a single string: "Empty" (or Nothing 
in Haskell, or "None" in Python and C)

Examples

If the string to search for is "me", and the array to search is 
["home", "milk", "Mercury", "fish"], the method should return ["home", "Mercury"].


*/
class PartialWordSearch {
  static String[] findWord(String x, String[] y){
    int count = 0;
    for (String a : y) {
      if (a.toLowerCase().contains(x)) {
        count++;
      }
    }
    int counter = 0;
    String[] a = new String[count];
    if (count == 0) {
      return new String[] {"Empty"};
    }
    for (String b : y) {
      if (b.toLowerCase().contains(x)) {
        a[counter] = b;
        counter++;
      }
    }
    return a;
  }
}
/*----------------------------------------------------------------------
import java.util.Arrays;

class WordSearch {
  static String[] findWord(String x, String[] y){
    final String xLower = x.toLowerCase();
    String[] searchResults = Arrays.stream(y)
                                   .filter(s -> s.toLowerCase().contains(xLower))
                                   .toArray(size -> new String[size]);
    return searchResults.length > 0 ? searchResults : new String[] {"Empty"};
  }
}
------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

class WordSearch {
  static String[] findWord(String x, String[] y){
            List<String> result = new ArrayList<String>();

            for (String s : y){
                if (s.toLowerCase().contains(x.toLowerCase())) {
                    result.add(s);
                }                
            }
           
            if (result.isEmpty()){
                return new String[]{"Empty"};
            } else {
                return result.toArray(new String[0]);
            } 
  }
}
------------------------------------------------------------------------
class WordSearch {
  static String[] findWord(String x, String[] y){
  String result ="";
  String[] EMPTY_STRING_LIST = new String[]{"Empty"};
  for(String element : y) {
	  if (element.toLowerCase().contains(x.toLowerCase())) {
		  result += element + ",";
	  }
  }
  
  if(result.length() == 0) return EMPTY_STRING_LIST;
  
  return result.substring(0,result.length()-1).split(",");  
  }
}
------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class WordSearch {
  static String[] findWord(String x, String[] y){
        List<String> list = Arrays.stream(y).filter(s -> s.toLowerCase().contains(x)).collect(Collectors.toList());
        if (list.isEmpty()) {
            list.add("Empty");
        }
        return list.toArray(new String[0]);
  }
}
------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

class WordSearch {
  static String[] findWord(String x, String[] y) {
    List<String> found = new ArrayList<>();
    x = x.toLowerCase();
    for(String str : y) {
      if(str.toLowerCase().indexOf(x) > -1) {
        found.add(str);
      }
    }
    return found.size() > 0 ? found.toArray(new String[0]) : new String[]{"Empty"};
  }
}
------------------------------------------------------------------------
class WordSearch {
  static String[] findWord(String x, String[] y){
  String result ="";
  for(String element : y) {
    if (element.toLowerCase().contains(x.toLowerCase())) {
      result += element + ",";
    }
  }
  if(result.length() == 0) return new String[]{"Empty"};
  return result.substring(0,result.length()-1).split(",");  
  }
}
------------------------------------------------------------------------
import java.util.*;

class WordSearch {
  static String[] findWord(String x, String[] y){
  ArrayList<String> foundlist = new ArrayList<String>();
    
    for(int i=0;i<y.length;i++){
      if(y[i].toLowerCase().indexOf(x)!=-1){
        foundlist.add(y[i]);
      }
    }
  String[] found = foundlist.toArray(new String[foundlist.size()]);
  if (found.length==0){
    String[] empty = {"Empty"};
    return empty;
  }
  else {
  return found;
    }
  }
}
------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

class WordSearch {
 static String[] findWord(String query, String[] searchArray){
	    List<String> result = new ArrayList<>();
	     for (String val : searchArray) {
	       if (val.toLowerCase().contains(query.toLowerCase())) {
	          result.add(val);
	       }
	     }
	    return (result.size() > 0 ) ? result.toArray(new String[result.size()]) : new String[]{"Empty"};
	}
}
------------------------------------------------------------------------
import java.util.*;
class WordSearch {
  static String[] findWord(String x, String[] y){
    System.out.println(x + " \n " + Arrays.asList(y));
    List<String> result = new ArrayList<String>();
    for (var i : y){
      if (i.toLowerCase().contains(x.toLowerCase())){
        result.add(i);
      }
    }
    if (result.size()==0){
      return new String[]{"Empty"};
    }
    else{
      return result.toArray(new String[0]);
    }
  }
}
-----------------------------------------------------------------------
import static java.util.stream.Stream.of;

class WordSearch {
  static String[] findWord(String x, String[] y) {
    y = of(y).filter(s -> s.toLowerCase().contains(x)).toArray(String[]::new);
    return y.length > 0 ? y : new String[] {"Empty"};
  }
}
*/