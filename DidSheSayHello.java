/* 8KYU CodeWars Did She Say Hello

You received a whatsup message from an unknown number. Could it be from 
that girl/boy with a foreign accent you met yesterday evening?

Write a simple function to check if the string contains the word hallo 
in different languages.

These are the languages of the possible people you met the night before:

hello - english
ciao - italian
salut - french
hallo - german
hola - spanish
ahoj - czech republic
czesc - polish
Notes

you can assume the input is a string.
to keep this a beginner exercise you don't need to check if the greeting is a 
subset of word (Hallowen can pass the test)
function should be case insensitive to pass the tests

*/

public class Kata{
  public static boolean validateHello(String greetings){
    
    if (greetings.contains("hello") || greetings.contains("Hello") || greetings.contains("HELLO")) {
      return true;
    }
    else if (greetings.contains("salut") || greetings.contains("Salut") || greetings.contains("SALUT")) {
      return true;
    }
    else if (greetings.contains("hola") || greetings.contains("Hola") || greetings.contains("HOLA")) {
      return true;
    }
    else if (greetings.contains("czesc") || greetings.contains("Czesc") || greetings.contains("CZESC")) {
      return true;
    }
    else if (greetings.contains("ciao") || greetings.contains("Ciao") || greetings.contains("CIAO")) {
      return true;
    }
    else if (greetings.contains("hallo") || greetings.contains("Hallo") || greetings.contains("HALLO")) {
      return true;
    }
    else if (greetings.contains("ahoj") || greetings.contains("Ahoj") || greetings.contains("AHOJ")) {
      return true;
    }
    else {
      return false;
    }
  }
  
}
/*--------------------------------------------------------------------------
public class Kata{
  public static boolean validateHello(String greetings){
    String [] hallo = new String[7];
		
		hallo[0] = "hello";
		hallo[1] = "ciao";
		hallo[2] = "salut";
		hallo[3] = "hallo";
		hallo[4] = "hola";
		hallo[5] = "ahoj";
		hallo[6] = "czesc";
    
    int cont = 0;
		for (int i = 0; i < hallo.length; i++) {
			if (greetings.toLowerCase().indexOf(hallo[i]) != -1 ) {
				cont++;
			}
		}
    
    return cont > 0;
  }
  
}
----------------------------------------------------------------------------
public class Kata{
  public static boolean validateHello(String greetings){
    String[] hellos = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
    for (int i = 0; i < hellos.length; i++) {
      if (greetings.toLowerCase().indexOf(hellos[i]) != -1) {
        return true;
      }
    }
    
    return false;
  }
  
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;

public class Kata {
  
  private static List<String> hellos = Arrays.asList("hello ciao salut hallo hola ahoj czesc".split(" "));
                                                                   
  public static boolean validateHello(String greetings) {
    return hellos.stream().anyMatch(hello -> greetings.toLowerCase().contains(hello));
  }

}
------------------------------------------------------------------------------
public class Kata{
  public static boolean validateHello(String greetings){
    
    String[] arrString = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
    
    for (String item : arrString){
      
        if(greetings.toLowerCase().contains(item)){
          return true;
        }
    }
    
    return false;
  }
  
}
-----------------------------------------------------------------------------
public class Kata{
  
  public static boolean validateHello(String greetings){
    final String[] languages = new String[]{"hello","ciao","salut","hallo","hola","ahoj","czesc"};
    for (String language : languages) {
      if (greetings.toLowerCase().contains(language)) return true;
    }
    return false;
  }
}
----------------------------------------------------------------------------
public class Kata{
  public static boolean validateHello(String greetings){
    String str=greetings.toLowerCase();
    if(str.contains("hello")){return true;}
    if(str.contains("ciao")){return true;}
    if(str.contains("salut")){return true;}
    if(str.contains("hallo")){return true;}
    if(str.contains("hola")){return true;}
    if(str.contains("ahoj")){return true;}
    if(str.contains("czesc")){return true;}
    return false;
  }
  
}

*/