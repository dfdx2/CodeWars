/* 7KYU CodeWars Covfefe

Covfefe

Your are given a string. You must replace any occurence of the sequence 
coverage by covfefe, however, if you don't find the word coverage in the 
string, you must add covfefe at the end of the string with a leading space.

For the languages where the string is mutable (such as ruby), don't modify 
the given string, otherwise this will break the test cases.

*/

public class Covfefe {
    public static String covfefe(String tweet) {
      if (tweet.contains("coverage")) {
        tweet = tweet.replace("coverage", "covfefe");
      }
      else {
        return tweet + " " + "covfefe";
      }
      
      return tweet;
    }
}
/*------------------------------------------------------------------------------------
class Covfefe {
    static String covfefe(final String tweet) {
        return tweet.contains("coverage") ?
            tweet.replace("coverage", "covfefe") :
            tweet + " covfefe";
    }
}
--------------------------------------------------------------------------------------
public class Covfefe {
    public static String covfefe(String tweet) {
      return tweet.contains("coverage") ? tweet.replaceAll("coverage", "covfefe") : tweet + " covfefe";
    }
}
----------------------------------------------------------------------------------------
public class Covfefe {
    public static String covfefe(String tweet) {
      	return tweet.matches(".*coverage.*")?tweet.replaceAll("coverage","covfefe"):tweet+" covfefe";  
    }
}




*/