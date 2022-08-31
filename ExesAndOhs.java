/*   7KYU CodeWars   Exes and Ohs

Check to see if a string has the same amount of 'x's and 'o's. 
The method must return a boolean and be case insensitive. 
The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

*/

public class XO {
  
  public static boolean getXO (String str) {
    
    int xcount = 0;
    int ycount = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
        xcount++;
      }
      if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
        ycount++;
      }
    }
    
    return xcount == ycount;
   }
}


/*-----------------------------------------------------------------------

public class XO {
  
  public static boolean getXO (String str) {
    str = str.toLowerCase();
    return str.replace("o","").length() == str.replace("x","").length();
    
  }
}
----------------------------------------------------------------------------

public class XO {
  public static boolean getXO(String str) {
    int x = 0, o = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.toUpperCase().charAt(i) == 'O') o++;
      if(str.toUpperCase().charAt(i) == 'X') x++;
    }
    return x == o;
  }
}
---------------------------------------------------------------------------

public class XO {
  
  public static boolean getXO (String str) {
    
        long countX = str.toLowerCase().chars().filter(ch -> ch =='x').count();
        long countO = str.toLowerCase().chars().filter(ch -> ch =='o').count();

        return (countO==countX);
    
  }
}

---------------------------------------------------------------------------------

public class XO {
  
  public static boolean getXO (String str) {
    
    // Good Luck!!
    int difference = 0;
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      if ( str.charAt(i) == 'x' )   difference++;
      if ( str.charAt(i) == 'o' )  difference--;
    }
    
    if (difference == 0)
      return  true;
    return false;
  }
}

----------------------------------------------------------------------------------

public class XO {
  
    static boolean getXO(String str) {
        final Integer sum = str.chars()
                .map(ch -> {
                    switch (Character.toLowerCase(ch)) {
                        case 'x':
                            return 1;
                        case 'o':
                            return -1;
                        default:
                            return 0;
                    }
                })
                .sum();
        return sum.equals(0);
    }
}
-----------------------------------------------------------------------------
public class XO {
  
  public static boolean getXO (String str) {
    
    return str.toLowerCase().replace("o","").length() ==
            str.toLowerCase().replace("x","").length();
    
  }
}

*/