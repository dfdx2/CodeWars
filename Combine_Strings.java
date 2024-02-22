/* 8KYU CodeWars Grasshopper - Combine Strings

Combine strings function
Example:

combineNames('James', 'Stevens')
returns:

'James Stevens'

*/
public class StringCombiner {
    
    public static String combineNames(String first,String last) {
      return first + " " + last;
    }
}
/*-------------------------------------------------------------------------
public class StringCombiner {
    
    public static String combineNames(String first,String last) {
      return String.join(" ", first, last);
    }
}
---------------------------------------------------------------------------
public class StringCombiner {
    
    public static String combineNames(String first,String last) {

        return new StringBuilder(first).append(" ").append(last).toString();
    }
}
---------------------------------------------------------------------------
public class StringCombiner {
    
      public static String combineNames(String first,String last) {

        return "%s %s".formatted(first, last);
    }
}
----------------------------------------------------------------------------
public class StringCombiner {
    
    public static String combineNames(String first,String last) {

        return String.format("%s %s", first, last);
    }
}
*/