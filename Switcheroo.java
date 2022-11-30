/*  7KYU CodeWars  Switcheroo

Given a string made up of letters a, b, and/or c, 
switch the position of letters a and b (change a to b 
and vice versa). Leave any incidence of c untouched.

Example:

'acb' --> 'bca'
'aabacbaa' --> 'bbabcabb'

*/

public class Switch {
  public static String switcheroo(String x) {
    x = x.replaceAll("a", "v");
    x = x.replaceAll("b", "d");
    x = x.replaceAll("v", "b");
    x = x.replaceAll("d", "a");
    return x;
  }
}
/*----------------------------------------------------------
class Switch {
  
  public static String switcheroo(String x) {
    return x.replace('a','_').replace('b','a').replace('_','b');
  }
  
}
------------------------------------------------------------
class Switch{

public static String switcheroo(String x){
  
  return x.replace("a", "x").replace("b", "a").replace("x", "b"); 
}
}
--------------------------------------------------------------
public class Switch {
    public static String switcheroo(String x){
        return x.replaceAll("a","x")
                .replace("b","a")
                .replace("x","b");
    }
}
------------------------------------------------------------------
public class Switch {
  public static String switcheroo(String x) {
    String result = "";
    for(char c : x.toCharArray()){
      result += c== 'a' ? 'b' : c == 'b' ? 'a' : c ;
    }
    return result;
  }
}

*/