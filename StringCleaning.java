/* 8KYU CodeWars String Cleaning

Your boss decided to save money by purchasing some cut-rate 
optical character recognition software for scanning in the 
text of old novels to your database. At first it seems to 
capture words okay, but you quickly notice that it throws 
in a lot of numbers at random places in the text.

Examples (input -> output)
'! !'                 -> '! !'
'123456789'           -> ''
'This looks5 grea8t!' -> 'This looks great!'
Your harried co-workers are looking to you for a solution to 
take this garbled text and remove all of the numbers. Your 
program will take in a string and clean out all numeric characters, 
and return a string with spacing and special characters 
~#$%^&!@*():;"'.,? all intact.

*/
class StringCleaning {
    static String stringClean(final String text) {
      String a = text;
      return a.replaceAll("[0123456789]", "");
    }
}
/*--------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
        return text.replaceAll("[0-9]", "");
    }
}
----------------------------------------------------------------------
class StringCleaning {
    public static String stringClean(final String inputString) {
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {
            String symbol = Character.toString(inputString.charAt(i));

            if (!"1234567890".contains(symbol)) {
                outputString += symbol;
            }
        }
        
        return outputString;
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
      String toReturn = "";
      String numbers = "0123456789";
      for (int x = 0; x < text.length(); x++) {
        if (!numbers.contains(String.valueOf(text.charAt(x))))
            toReturn += text.charAt(x);
      }
        return toReturn;
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
      
      String res = text.replaceAll("[0-9]","");
      
      return res;
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < text.length(); i++){
        if (Character.isDigit(text.charAt(i))) continue;
        str.append(text.charAt(i));
      }
        return str.toString();
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
      String numb= "1234567890";
      String[] strArray = text.split("");
      String str = "";  
      for(String s: strArray){
        if(!numb.contains(s)){
          str+=s;
        }
      }
      return str;
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
      String str = "";
        for(String s : text.split("")){
          if(!("1234567890").contains(s)){
            str+=s;
          }
        }
        return str;
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
      String newtext1 = text.replace("1", "");
      String newtext2 = newtext1.replace("2", "");
      String newtext3 = newtext2.replace("3", "");
      String newtext4 = newtext3.replace("4", "");
      String newtext5 = newtext4.replace("5", "");
      String newtext6 = newtext5.replace("6", "");
      String newtext7 = newtext6.replace("7", "");
      String newtext8 = newtext7.replace("8", "");
      String newtext9 = newtext8.replace("9", "");
      String newtext10 = newtext9.replace("0", "");
      return newtext10;
    }
}
----------------------------------------------------------------------
class StringCleaning {
    static String stringClean(final String text) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                str.append(text.charAt(i));
            }
        }
        return str.toString();
    }
}
*/