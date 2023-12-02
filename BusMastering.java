/* 7KYU CodeWars Bus Mastering - Who Is The Most Prioritary?

When multiple master devices are connected to a single bus 
(https://en.wikipedia.org/wiki/System_bus), there needs to 
be an arbitration in order to choose which of them can have 
access to the bus (and 'talk' with a slave).

We implement here a very simple model of bus mastering. Given 
n, a number representing the number of masters connected to 
the bus, and a fixed priority order (the first master has more 
access priority than the second and so on...), the task is to 
choose the selected master. In practice, you are given a string 
inp of length n representing the n masters' requests to get 
access to the bus, and you should return a string representing 
the masters, showing which (only one) of them was granted access:

The string 1101 means that master 0, master 1 and master 3 
have requested access to the bus. Knowing that master 0 has the 
greatest priority, the output of the function should be: 1000

Examples

* arbitrate("001000101", 9) -> "001000000"

* arbitrate("000000101", 9) -> "000000100"

Notes

The resulting string (char* ) should be allocated in the arbitrate 
function, and will be free'ed in the tests.

n is always greater or equal to 1.

*/
public class BusMastering {
  public static String arbitrate(String input, int n){
    StringBuilder sb = new StringBuilder();
    int x = input.indexOf("1");
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '1' && i > x) {
        sb.append("0");
      }
      else {
        sb.append(input.charAt(i));
      }
    }
    return sb.toString();
  }
}
/*-----------------------------------------------------------------------
class BusMastering {
    static String arbitrate(final String input, final int n) {
        return input.replaceAll("(?<=1)(0*)1", "$10");
    }
}
-------------------------------------------------------------------------
public class BusMastering {
  public static String arbitrate(String input, int n){
  	int index = 1 + input.indexOf("1");
  	return input.substring(0,index) + input.substring(index).replaceAll("1", "0");
  }
}
---------------------------------------------------------------------------
public class BusMastering {

  public static String arbitrate(String input, int n) {
    final int idx = input.indexOf("1");
    if (idx > -1) {
      input = input.replace("1","0");
      input = input.substring(0,idx) + "1" + input.substring(idx+1);
    }
    return input;
  }
  
}
-------------------------------------------------------------------------
class BusMastering {
  static String arbitrate(String input, int n) {
    int p = input.indexOf('1');
    if (p != -1) {
      return input.substring(0, p + 1) + "0".repeat(n - p - 1);
    }
    return input;
  }
}
--------------------------------------------------------------------------
public class BusMastering {
  public static String arbitrate(String input, int n){
    if (input.contains("1")) {
        String[] parts = input.split("1", 2);
        input = parts[0] + "1" + parts[1].replaceAll("1", "0");
    }
    return input; 
  }
}
------------------------------------------------------------------------
public class BusMastering {
  public static String arbitrate(String input, int n){
    if (input.indexOf("1") != -1){
      char[] chars = input.toCharArray(); 
      for (int i = input.indexOf("1") + 1; i < n; ++i)
        chars[i] = '0';
      return String.valueOf(chars);
    }
    return input;
  }
}

*/