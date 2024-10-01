/* 8KYU CodeWars Abbreviate a Two Word Name

Write a function to convert a name into initials. 
This kata strictly takes two words with one space in 
between them.

The output should be two capital letters with a dot 
separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F

*/
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] result = name.split(" ");
    String j = result[0].charAt(0) + "." + result[1].charAt(0);
    return j.toUpperCase();
  }
}

/*--------------------------------------------------------------------
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    String fi = names[0].toUpperCase();
    String li = names[1].toUpperCase();
    char firstInitial = fi.charAt(0);
    char lastInitial = li.charAt(0);
    String i = firstInitial + "." + lastInitial;
    return i;
  }
}
-----------------------------------------------------------------
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}
----------------------------------------------------------------------
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
  }
  
}
-------------------------------------------------------------------
public class AbbreviateTwoWords {

 public static String abbrevName(String name) {
          
        String[] init = name.split(" ");
        return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
    }
}
--------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    return Arrays.stream(name.split(" "))
                 .map(String::toUpperCase)
                 .map(word -> word.substring(0, 1))
                 .collect(Collectors.joining("."));
               
  }
  
}
-------------------------------------------------------------------
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    name = name.toUpperCase(); 
    return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
  }
}
--------------------------------------------------------------------
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

*/