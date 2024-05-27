/* 7KYU CodeWars Describe a list

Write function describeList which returns 
"empty" if the list is empty or "singleton" 
if it contains only one element or "longer"" 
if more.

*/

import java.util.*;
public class Kata {
  public static String describeList(final List list) {
    int result = list.size();
    return result == 0 ? "empty" : result == 1 ? "singleton" : "longer";
  }
}
/*-----------------------------------------------------------------------
import java.util.*;

public class Kata {

  public static String describeList(final List list) {
    switch (list.size()) {
      case 0: return "empty";
      case 1: return "singleton";
      default: return "longer";
    }
  }
  
}
-------------------------------------------------------------------------
import java.util.*;

public class Kata {

  public static String describeList(final List list) {
    if (list.size() == 0) return "empty";
    if (list.size() == 1) return "singleton";
    return "longer";
  }
  
}
-------------------------------------------------------------------------
import java.util.*;
public class Kata {
  	public static String describeList(final List list) {
    		return list.size() == 0 ? "empty" : list.size() == 1 ? "singleton" : "longer";
  	}
}
-------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static String describeList(final List list) {
    int count = 0;
    for (Object i: list){
      count ++;
    }
    if (count == 0){
      return "empty";
    }
    if (count == 1){
      return "singleton";
    }
    else{
      return "longer";
    }
  }
  
}
-------------------------------------------------------------------------
import java.util.List;

class Kata {
  static String describeList(List<Object> list) {
    return list.isEmpty() ? "empty" : list.size() > 1 ? "longer" : "singleton";
  }
}
-------------------------------------------------------------------------
import java.util.List;

public class Kata {
  public static String describeList(final List list) {
    return switch (list.size()) {
      case 0 -> "empty";
      case 1 -> "singleton";
      default -> "longer";
    };
  }
}
*/