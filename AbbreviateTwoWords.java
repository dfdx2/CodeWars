/*  
Return the first letter from each name of one string
*/

public class AbbreviateTwoWords {
  
  public static String abbrevName(String name) {
    String firstName = name.split(" ")[0];
    String lastName  = name.split(" ")[1];
    char firstInitial = firstName.charAt(0);
    char lastInitial  = lastName.charAt(0);
    String bothInitials = firstInitial + "." + lastInitial;
    return bothInitials.toUpperCase();
  }
}
