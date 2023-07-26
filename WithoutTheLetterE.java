/* 7KYU CodeWars Without The Letter 'E'

Is it possible to write a book without the letter 'e' ?

Task
Given String str, return:

How many "e" does it contain (case-insensitive) in string format.
If given String doesn't contain any "e", return: "There is no "e"."
If given String is empty, return empty String.
If given String is `null`/`None`/`nil`, return `null`/`None`/`nil`

*/

public class WithoutLetterE {
  public static String findE(String str){
    int count = 0;
    if (str == null) {
      return null;
    }
    if (str == "") {
      return "";
    }
    String result = "There is no \"e\".";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
        count++;
      }
    }
    return (count == 0) ? result : String.valueOf(count);
  }
}
/*----------------------------------------------------------------------------
public class WithoutLetterE {
  public static String findE(String str){
    if(str == null || str == "") return str;
    int i = str.replaceAll("[^eE]", "").length();
    return i == 0 ? "There is no \"e\"." : "" + i + "";
  }
}
-----------------------------------------------------------------------------
public class WithoutLetterE {
    public static String findE(String str){
        if (str == null) return null;
        if (str.length() == 0) return "";
        int count = (int) str.chars().filter(x -> (char) x == 'e' || (char) x == 'E').count();
        if (count == 0) return "There is no \"e\".";
        return String.valueOf(count);
    }
}
------------------------------------------------------------------------------
public class WithoutLetterE {
  public static String findE(String str){
    if (str == null || str.equals("")){
      return str;
    }
    var res = 0;
    for (var x : str.split("")){
      if (x.equalsIgnoreCase("e")){
        res++;
      }
    }
    if (res == 0){
      return "There is no \"e\".";
    }
    return String.valueOf(res);
  }
}
----------------------------------------------------------------------------
interface WithoutLetterE {
  static String findE(String str) {
    return str == null || str.isEmpty() ? str :
          (str.length() - str.replaceAll("[Ee]", "").length() + "")
            .replaceAll("\\b0\\b", "There is no \"e\".");
  }
}
----------------------------------------------------------------------------
public class WithoutLetterE {
  public static String findE(String str){
        if (str == null || str.isBlank() || str.isEmpty()) return str;
        String onlyE = str.replaceAll("[^eE]", "");
        if (onlyE.length() == 0) return "There is no \"e\".";
        return String.valueOf(onlyE.length());
  }
}

*/