/* 7KYU CodeWars Shorter Concat[Reverse Longer]

Given 2 strings, a and b, return a string of the form: 
shorter + reverse (longer) + shorter.

In other words, the shortest string has to be put as prefix and as suffix of 
the reverse of the longest.

Strings a and b may be empty, but not null (In C# strings may also be null. 
Treat them as if they are empty.).
If a and b have the same length treat a as the longer producing 
b + reverse (a) + b

*/
public class ShorterConcat {
	public static String shorterReverseLonger(String a, String b) {
    StringBuilder sb = new StringBuilder(a);
    StringBuilder sc = new StringBuilder(b);
    return a.length() >= b.length() ? b + sb.reverse().toString() + b : a + sc.reverse().toString() + a;
	}
}
/*-----------------------------------------------------------------------
public class ReverseLonger {
	public static String shorterReverseLonger(String a, String b) {
    StringBuilder x = new StringBuilder(a);
    x.reverse();
    StringBuilder y = new StringBuilder(b);
    y.reverse();
    if (a.length() >= b.length()) {
      return b + x.toString() + b;
    }
    else {
      return a + y.toString() + a;
    }
	}
}
------------------------------------------------------------------------------
public class ReverseLonger {


	public static String shorterReverseLonger(String a, String b) {
		String shorter = (a.length() < b.length()) ? a : b;
    String longer = (a.length() < b.length()) ? b : a;
		return shorter + reverse(longer) + shorter;
	}
  
  private static String reverse(String s) {
  	return new StringBuilder(s).reverse().toString();
  }
}
---------------------------------------------------------------------------------
public class ReverseLonger {


	public static String shorterReverseLonger(String a, String b) {
        return a.length() >= b.length() ?
                b + new StringBuilder(a).reverse() + b :
                a + new StringBuilder(b).reverse() + a;
	}

}
-------------------------------------------------------------------------------
class ReverseLonger {
  static String shorterReverseLonger(String a, String b) {
    return a.length() < b.length() ? a + new StringBuilder(b).reverse() + a : b + new StringBuilder(a).reverse() + b;
  }
}




*/