/* 6KYU CodeWars Take A Ten Minute Walk

DESCRIPTION:
You live in the city of Cartesia where all roads are laid 
out in a perfect grid. You arrived ten minutes too early to 
an appointment, so you decided to take the opportunity to go 
for a short walk. The city provides its citizens with a Walk 
Generating App on their phones -- everytime you press the 
button it sends you an array of one-letter strings representing 
directions to walk (eg. ['n', 's', 'w', 'e']). You always walk 
only a single block for each letter (direction) and you know it 
takes you one minute to traverse one city block, so create a 
function that will return true if the walk the app gives you 
will take you exactly ten minutes (you don't want to be early 
or late!) and will, of course, return you to your starting point. 
Return false otherwise.

Note: you will always receive a valid array containing a random 
assortment of direction letters ('n', 's', 'e', or 'w' only). It 
will never give you an empty array (that's not a walk, that's 
standing still!).

*/

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10)
			return false;
		int n = 0;
		int e = 0;
		for (int i = 0; i < walk.length; i++) {
			if (walk[i] == 'n')
				n++;
			else if (walk[i] == 's')
				n--;
			else if (walk[i] == 'e')
				e++;
			else
				e--;
		}

		return e == 0 && n == 0;
	}
}
/*----------------------------------------------------------------------
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) {
      return false;
    }
    int x = 0, y = 0;
    for (int i = 0; i < 10; i++) {
      switch (walk[i]) {
        case 'n':
          y++;
          break;
        case 'e':
          x++;
          break;
        case 's':
          y--;
          break;
        case 'w':
          x--;
          break;
      }
    }
    return x == 0 && y == 0;
  }
}
------------------------------------------------------------------------
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
  	if (walk.length != 10) return false;
    
    int x = 0, y = 0;
    for (char c: walk) {
    	switch (c) {
      	case 'n': y++; break;
        case 's': y--; break;
        case 'w': x++; break;
        case 'e': x--; break;
      }
    }
    
    return x == 0 && y == 0;
  }
}
-------------------------------------------------------------------------
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        String s = new String(walk);
        return s.chars().filter(p->p=='n').count()==s.chars().filter(p->p=='s').count()&&
                s.chars().filter(p->p=='e').count()==s.chars().filter(p->p=='w').count()&&s.chars().count()==10;
    }
}
-------------------------------------------------------------------------
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false;
    int e = 0;
    int n = 0;
    for (char ch: walk) {
      if (ch == 'n') n++;
      else if (ch == 's') n--;
      else if (ch == 'e') e++;
      else if (ch == 'w') e--;
    }
    return n == 0 && e == 0;
  }
}
---------------------------------------------------------------------------
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
	  int x = 0;
	  int y = 0;
	  for (int i = 0; i < walk.length; i++) {
		  switch (Character.toLowerCase(walk[i])) {
			  case 'n':
				  y++;
				  break;
			  case 's':
				  y--;
				  break;
			  case 'e':
				  x++;
				  break;
			  case 'w':
				  x--;
				  break;
			  default:
				  break;
		  }
	  }
	  if (x == 0 && y == 0 && walk.length == 10) {
		  return true;
	  } else {
		  return false;
	  }
  }
}
--------------------------------------------------------------------------
import java.awt.Point;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    Point point = new Point(0,0);
    for (char c : walk) {
            switch (c) {
                case 'n': point.translate(1,0); break;
                case 'e': point.translate(0,1); break;
                case 's': point.translate(-1,0); break;
                case 'w': point.translate(0,-1); break;
            }
        }
        return point.equals(new Point(0,0)) && walk.length == 10;    
  }
}
-------------------------------------------------------------------------
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false;
    int n=0, s=0, e=0, w=0;
    for (char ch : walk) {
      if (ch == 'n') n++;
      if (ch == 's') s++;
      if (ch == 'e') e++;
      if (ch == 'w') w++;
    }
    if (n == s && w == e) return true;
    return false;
  }
}
------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
        String str = String.valueOf(walk);
        Map<Character,Integer> num =  new HashMap<Character, Integer>(str.length());

        if(walk.length!=10 || num.size()%2!=0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (num.containsKey(str.charAt(i))) 
                num.put(str.charAt(i), num.get(str.charAt(i))+1);
             else 
                num.put(str.charAt(i),1);
        }

        return num.getOrDefault('n', 0).equals(num.getOrDefault('s', 0)) && num.getOrDefault('w', 0).equals(num.getOrDefault('e', 0));
  }
}

*/