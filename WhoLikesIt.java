/*   6KYU CodeWars  Who Likes It
You probably know the "like" system from Facebook and other pages. 
People can "like" blog posts, pictures or other items. We want to 
create the text that should be displayed next to such an item.
Implement the function which takes an array containing the names 
of people that like an item. It must return the display text as 
shown in the examples:
---------------------------------------------------------------------
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
---------------------------------------------------------------------
Note: For 4 or more names, the number in "and 2 others" simply increases.

*/

class Solution {
    public static String whoLikesIt(String... names) {
      int l = names.length;
      switch (l) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], l - 2);
      }
   }
}

/*------------------------------------------------------------------------------
class Solution {
  public static String whoLikesIt(String... names) {
    final String Template1 = "%s likes this";
    final String Template2 = "%s and %s like this";
    final String Template3 = "%s, %s and %s like this";
    final String TemplateN = "%s, %s and %d others like this";
    return
        names.length == 0 ? "no one likes this" :
        names.length == 1 ? String.format(Template1, names[0]) :
        names.length == 2 ? String.format(Template2, names[0], names[1]) :
        names.length == 3 ? String.format(Template3, names[0], names[1], names[2]) :
        String.format(TemplateN, names[0], names[1], names.length-2);
  }
}
------------------------------------------------------------------------------------------
*/