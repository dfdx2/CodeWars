public class Troll {
    public static String disemvowel(String str) {
        // Code away...
      str = str.replaceAll("[aeiou]", "");
      str = str.replaceAll("[AEIOU]","");
      return str;
    }
}