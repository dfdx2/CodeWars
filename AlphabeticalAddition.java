/* 7KYU CodeWars Alphabetical Addition

Your task is to add up letters to one letter.

The function will be given an array of single 
character Strings, each one being a letter to add.

Notes:

Letters will always be lowercase.

Letters can overflow (see second to last example of the description)

If no letters are given, the function should return 'z'

Examples:

addLetters("a", "b", "c") = "f"
addLetters("a", "b") = "c"
addLetters("z") = "z"
addLetters("z", "a") = "a"
addLetters("y", "c", "b") = "d" // notice the letters overflowing
addLetters() = "z"

*/
public class AlphabeticalAddition {
    public static String addLetters(String... letters) {
      String map = " abcdefghijklmnopqrstuvwxyz";
      int map1 = 0;
      if (letters.equals("")) {
        return "z";
      }
      for (String a : letters) {
        map1 += map.indexOf(a);
      }
      int b = map1 == 0 ? 26 : map1 % 26 == 0 ? 26 : map1 % 26 != 0 ? map1 % 26 : 0;
      StringBuilder sb = new StringBuilder();
      sb.append(map.charAt(b));
      return sb.toString();  
    }
}