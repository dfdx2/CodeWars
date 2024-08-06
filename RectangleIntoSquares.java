/* 6KYU CodeWars Rectangle into Squares

The drawing below gives an idea of how to cut a given 
"true" rectangle into squares ("true" rectangle meaning 
that the two dimensions are different).

Can you translate this drawing into an algorithm?

You will be given two dimensions

a positive integer length
a positive integer width
You will return a collection or a string (depending on the 
language; Shell bash, PowerShell, Pascal and Fortran return 
a string) with the size of each of the squares.

Examples in general form:
(depending on the language)

  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
  
  You can see examples for your language in **"SAMPLE TESTS".**
Notes:
lng == wdth as a starting case would be an entirely different 
problem and the drawing is planned to be interpreted with lng 
!= wdth. (See kata, Square into Squares. Protect trees! 
http://www.codewars.com/kata/54eb33e5bc1a25440d000891 for this problem).

When the initial parameters are so that lng == wdth, the solution 
[lng] would be the most obvious but not in the spirit of this kata 
so, in that case, return None/nil/null/Nothing or return {} with C++, 
Array() with Scala, [] with Perl, Raku.

In that case the returned structure of C will have its sz component equal to 0.

Return the string "nil" with Bash, PowerShell, Pascal and Fortran.

*/
import java.util.ArrayList;
import java.util.List;
public class RectangleIntoSquares {
	
	public static List<Integer> RectoSquares(int lng, int wdth) {
		List<Integer> result = new ArrayList<>();
    if (lng == wdth) {
      return null;
    }
    while (lng * wdth > 0) {
      if (lng > wdth) {
      int x = lng;
      lng -= wdth;
      result.add(x - lng); 
      }
      else {
        int y = wdth;
        wdth -= lng;
        result.add(y - wdth);
      }
    }
    return result;
	}
}
/*--------------------------------------------------------------
import java.util.*;
public class SqInRect {
  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) return null;
		List<Integer> squares = new ArrayList<Integer>();
    int area = lng * wdth;
    while (area > 0) {
      squares.add(Math.min(lng,wdth));
      if (wdth > lng)wdth = wdth - lng;
      else lng = lng - wdth;
      area = lng * wdth;
    }
    return squares;
	}
}
----------------------------------------------------------------
import java.util.*;
public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		// your code
		List<Integer> list = new ArrayList<>();
        if(lng==wdth)return null;

        while (lng > 0 && wdth > 0) {
            int min;
            if (lng > wdth) {
                min = wdth;
                lng -= min;
            } else {
                min = lng;
                wdth -= min;
            }
            list.add(min);

        }

        return list;
	}
}
----------------------------------------------------------------
import java.util.*;

public class SqInRect {
	
  private static void recurse(int l, int w, List<Integer> result) {
    int min = Math.min(l, w);
    int max = Math.max(l, w);
    if (min == 0) {
      return;
    }
    result.add(min);
    recurse(max - min, min, result);
  }
  
	public static List<Integer> sqInRect(int lng, int wdth) {
		List<Integer> result = new ArrayList<Integer>();
    recurse(lng, wdth, result);
    if (result.size() == 1) {
        // Dagnabit boys, we been given a square, and we don't do no RE-GU-LAR quadrilaterals roun' here!
        return null;
    }
		return result;
	}
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

class SqInRect {
  static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) return null;
    var result = new ArrayList<Integer>();
    while (lng * wdth > 0) {
      result.add(lng > wdth ? lng - (lng -= wdth) : wdth - (wdth -= lng));
    }
    return result;
  }
}
-----------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		List<Integer> list = new ArrayList<Integer>();
    if (lng == wdth){
      return null;
    }
    while (lng>0){
      if (lng>=wdth){
        list.add(wdth);
        lng -=wdth;
      } else {
        list.add(lng);
        wdth-=lng;
      }
    }
		return list;
	}
}
------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
    // If sides are invalid, or the rect is already a square return null
		if(lng <= 0 || wdth <= 0 || (lng == wdth)) {
		  return null;
    } else {
      List<Integer> result = new ArrayList<>();
      // Min side is always ground for a square
      int min = Math.min(lng, wdth);
      result.add(min);
      // Either what's left is a square, we return it
      if(Math.abs(lng - wdth) == min) {
        result.add(min);
      } else {
      // Or min side become max side and we continu with new sides
        result.addAll(SqInRect.sqInRect(Math.abs(lng - wdth), min));
      }
      return result;
    }
	}
}
-----------------------------------------------------------------
import java.util.*;

public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		// your code
		if (lng == wdth) return null;
    List<Integer> result = new ArrayList<>();
    rec(lng, wdth, result);
    return result;
  }

  public static void rec(int lng, int wdth, List<Integer> result) {
    if (lng == wdth) {
      result.add(lng);
    } else if (lng < wdth) {
      result.add(lng);
      rec(lng, wdth - lng, result);
    } else {
      result.add(wdth);
      rec(lng - wdth, wdth, result);
    }
  }
}
*/