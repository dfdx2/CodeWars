/* 7KYU CodeWars Move all exclamation marks to the end of the sentence

Description:
Move all exclamation marks to the end of the sentence

Examples
"Hi!"          ---> "Hi!"
"Hi! Hi!"      ---> "Hi Hi!!"
"Hi! Hi! Hi!"  ---> "Hi Hi Hi!!!"
"Hi! !Hi Hi!"  ---> "Hi Hi Hi!!!"
"Hi! Hi!! Hi!" ---> "Hi Hi Hi!!!!"

*/
public class Kata {
   public static String remove(String s){
     StringBuilder sb = new StringBuilder();
     int count = 0;
     for (int i = 0; i < s.length(); i++) {
       if (s.charAt(i) == '!') {
         count++;
       }
     }
     for (int i = 0; i < s.length(); i++) {
       if (s.charAt(i) != '!') {
         sb.append(s.charAt(i));
       }
     }
     String j = "!";
     j = j.repeat(count);
     sb.append(j);
     return sb.toString();
   }
}
/*---------------------------------------------------------------------
interface Kata {
  static String remove(String s) {
    return s.replace("!", "") + s.replaceAll("[^!]", "");
  }
}
------------------------------------------------------------------------
public class Kata {
   public static String remove(String s){
      String filt = s.replace("!", "");
      return filt + "!".repeat(s.length() - filt.length());
   }
}
-----------------------------------------------------------------------
public class Kata {
  
  public static String remove(String source) {
    String[] arr = source.split("!", -1);
    
    return String.join("", arr) + "!".repeat(arr.length - 1);
  }
}
------------------------------------------------------------------------
public class Kata {
  public static String remove(String s){
    String exclamationMarks = "";
    String[] arr = s.split("");
    for (String i: arr){
      if (i.equals("!")){
        exclamationMarks += "!";
      }
    }
    return s.replaceAll("!", "") + exclamationMarks;
  }
}
------------------------------------------------------------------------
public class Kata {
  public static String remove(String s){
    String[] parts = s.split("!", -1);
    return String.join("", parts) + "!".repeat(parts.length - 1);
  }
}
-----------------------------------------------------------------------
public class Kata {
   public static String remove(String s){
       //solution
     int len=s.length();
     s=s.replaceAll("!","");
     return s+"!".repeat(len-s.length());
   }
}
------------------------------------------------------------------------
public class Kata {
   public static String remove(String s){
             String[] strings = s.split(" ");
        String count = s.replaceAll("[^!]", "");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string.replaceAll("!", "")).append(" ");
        }
        return stringBuilder.toString().trim() + "!".repeat(count.length());
   }
}
-------------------------------------------------------------------------
public class Kata {
    public static String remove(String s) {
        int count = (int) s.chars().filter(a -> a == '!').count();
        return s.replaceAll("!", "").concat("!".repeat(count));
    }
}
-------------------------------------------------------------------------
public class Kata {
  public static String remove(String s) {
    int amount = s.replaceAll("[^!]", "").length();
    return s.replace("!", "") + "!".repeat(amount);
  }
}
*/