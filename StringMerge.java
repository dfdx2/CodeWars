/* 7KYU CodeWars String Merge!

Given two words and a letter, return a single word that's a combination of 
both words, merged at the point where the given letter first appears in each 
word. The returned word should have the beginning of the first word and the 
ending of the second, with the dividing letter in the middle. You can assume 
both words will contain the dividing letter.

Examples
("hello", "world", "l")       ==>  "held"
("coding", "anywhere", "n")   ==>  "codinywhere"
("jason", "samson", "s")      ==>  "jasamson"
("wonderful", "people", "e")  ==>  "wondeople"

*/
public class Kata {
    public static String stringMerge(String s1, String s2, char letter) {
  
      String y = s1.substring(0, s1.indexOf(letter));
      String z = s2.substring(s2.indexOf(letter), s2.length());
      return y + z;
    }
}
/*--------------------------------------------------------------------------
public class Kata {
  public static String stringMerge(String s1, String s2, char letter) {
    //write your adorable code here
    
    return s1.substring(0,s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
  }
}
----------------------------------------------------------------------------
public class Kata {
  public static String stringMerge(String s1, String s2, char c) {
    return (s1+"&"+s2).replaceAll("(.*?"+c+").*&.*?"+c+"(.*)","$1$2");
  }
}
------------------------------------------------------------------------------
public class Kata {
  public static String stringMerge(String s1, String s2, char letter) {
        int counter1 = 0;
        int counter2 = 0;
        boolean isFirstAppear = false;
        boolean isSecondAppear = false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        while (!isFirstAppear) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == letter) {
                    isFirstAppear = true;
                    counter1 = i;
                    break;
                }
            }
        }

        while (!isSecondAppear) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == letter) {
                    isSecondAppear = true;
                    counter2 = i;
                    break;
                }
            }
        }


        char[] arr1new = Arrays.copyOfRange(arr1, 0, counter1);
        char[] arr2new = Arrays.copyOfRange(arr2, counter2 + 1, arr2.length);
        
        String result1 = String.valueOf(arr1new);
        String result2 = String.valueOf(arr2new);
        return  result1 + letter + result2;
    }
  }
-----------------------------------------------------------------------------
public class Kata {
  public static String stringMerge(String s1, String s2, char letter) {
         s1=s1.substring(0,s1.indexOf(letter));
        s2=s2.substring(s2.indexOf(letter));
        StringBuilder str=new StringBuilder();
      String st= str.append(s1).append(s2).toString();
        return st;
    }
}
*/