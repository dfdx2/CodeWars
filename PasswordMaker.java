/* 7KYU CodeWars Password Maker

One suggestion to build a satisfactory password is to start with a memorable phrase or 
sentence and make a password by extracting the first letter of each word.

Even better is to replace some of those letters with numbers (e.g., the letter O can 
be replaced with the number 0):

instead of including i or I put the number 1 in the password;
instead of including o or O put the number 0 in the password;
instead of including s or S put the number 5 in the password.

Examples:
"Give me liberty or give me death"  --> "Gml0gmd"
"Keep Calm and Carry On"            --> "KCaC0"

*/
public class Kata {
   public static String makePassword(String phrase){
     if (phrase.length() < 1) {
       return phrase;
     }
     String[] test = phrase.split(" ");
     StringBuilder sb = new StringBuilder();
     for (String x : test) {
       if (x.charAt(0) == 'i' || x.charAt(0) == 'I') {
         sb.append("1");
       }
       else if (x.charAt(0) == 'o' || x.charAt(0) == 'O') {
         sb.append("0");
       }
       else if (x.charAt(0) == 's' || x.charAt(0) == 'S') {
         sb.append("5");
       }
       else {
         sb.append(x.charAt(0));
       }
     }
     return sb.toString();
   }
}
/*----------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
   public static String makePassword(String phrase){
      return phrase.length() == 0 ? "" : Stream.of(phrase.split(" "))
              .map(s -> s.substring(0,1))
              .map(s -> s.equalsIgnoreCase("i") ? "1" : s.equalsIgnoreCase("o") ? "0" : s.equalsIgnoreCase("s") ? "5" : s)
              .collect(Collectors.joining());
   }
}
------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
   public static String makePassword(String phrase){
     return phrase.equals("") ? "" : Arrays.asList(phrase.split(" ")).stream()
        .map(o -> o.substring(0,1)).collect(Collectors.joining(""))
				.replaceAll("[oO]", "0")
				.replaceAll("[iI]", "1")
				.replaceAll("[sS]", "5");
   }
}
-----------------------------------------------------------------------
interface Kata {
  static String makePassword(String phrase) {
    return phrase.replaceAll("\\s*(\\w)\\w+", "$1").replaceAll("o|O", "0").replaceAll("i|I", "1").replaceAll("s|S", "5");
  }
}
-------------------------------------------------------------------------
public class Kata {
  
    public static String makePassword(String phrase) {
        return java.util.Arrays.stream(phrase.split(" "))
                .filter(word -> !word.isEmpty())
                .map(word -> word.substring(0, 1))
                .map(s -> s.replaceAll("[iI]", "1")
                           .replaceAll("[oO]", "0")
                           .replaceAll("[sS]", "5"))
                .collect(java.util.stream.Collectors.joining());
    }
  
}
-----------------------------------------------------------------------
public class Kata {
   public static String makePassword(String phrase){
     String[] splt = phrase.split(" ");
     String result = "";
     for (var x : splt){
       if (x != null && !x.equals("")){
         String first = x.substring(0, 1);
         if (first.equalsIgnoreCase("i")){
           result += 1;
         }
         else if (first.equalsIgnoreCase("o")){
           result += 0;
         }
         else if (first.equalsIgnoreCase("s")){
           result += 5;
         }
         else{
           result += first;
         }
       }
       
       }
     return result;
   }
}
-----------------------------------------------------------------------
public class Kata {
  public static String makePassword(String phrase){
    if (phrase.equals("")){
      return "";
    }
    String result = "";
    String[] list = phrase.split(" ");
    for (String i: list){
      String letter = i.substring(0, 1);
      String testLetter = i.toLowerCase().substring(0, 1);
      System.out.println(letter);
      if (testLetter.equals("i")){
        result += "1";
      }
      else if (testLetter.equals("o")){
        result += "0";
      }
      else if (testLetter.equals("s")){
        result += "5";
      }
      else{
        result += letter;
      }
    }
    return result;
  }
}
----------------------------------------------------------------------
public class Kata {
   public static String makePassword(String phrase){
      if (phrase.length() ==0){ return "";} 
     
      String out = "";
      String[] words = phrase.split(" ");
      
      for (int i = 0; i < words.length; i++) {
          out += words[i].substring(0,1);
      }

      out = out.replaceAll("i","1")
      .replaceAll("I","1")
      .replaceAll("o","0")
      .replaceAll("O","0")
      .replaceAll("s","5")
      .replaceAll("S","5");

      return out;
   }
}
*/