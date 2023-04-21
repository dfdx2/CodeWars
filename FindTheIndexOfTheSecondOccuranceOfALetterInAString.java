/* 7KYU CodeWars Find The Index Of The Second Occurance Of A Letter In A String

In this kata, you need to write a function that takes a string and a letter 
as input and then returns the index of the second occurrence of that letter 
in the string. If there is no such letter in the string, then the function 
should return -1. If the letter occurs only once in the string, then -1 should 
also be returned.

Examples:

second_symbol('Hello world!!!','l') --> 3
second_symbol('Hello world!!!', 'A') --> -1

Good luck ;) And don't forget to rate this Kata if you liked it.

*/

public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
    
    int place = str.indexOf(c, str.indexOf(c) + 1);
    return (place == 0) ? -1 : place;
  }
}
/*-----------------------------------------------------------------------------
public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
   return str.indexOf(c,str.indexOf(c)+1);
  }
}
-------------------------------------------------------------------------------
public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
    String[] strArray = str.split("");

        int timesC = 0;
        int result = -1;

        for (int i = 0; i<=strArray.length-1; i++) {

            if (strArray[i].equals(String.valueOf(c))) {
                timesC+=1;
                if (timesC==2) {
                    result = i;
                    break;
                }
            }
        }

        return result;
  }
}
--------------------------------------------------------------------------------
public class SecondOcurrence {
	
	public static int secondSymbol(String str, char c) {
    int occurrences = 0;
    for(int index = 0; index < str.length(); index++) {
      occurrences += str.charAt(index) == c ? 1 : 0;
      if(occurrences == 2) {
        return index;
      }
    }
    return -1;
  }
	
	

}
---------------------------------------------------------------------
public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
   if (str.equals("") || c == ' ') {
     return -1;
   }
    return str.indexOf(c, str.indexOf(c) + 1);
      }
  }
---------------------------------------------------------------------
public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
   char[] charArray = str.toCharArray();
   return str.indexOf(c, str.indexOf(c) + 1);
  }
}


*/


