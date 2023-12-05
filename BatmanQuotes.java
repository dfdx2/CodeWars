/* 7KYU CodeWars Batman Quotes

Batman & Robin have gotten into quite a pickle this time. The Joker 
has mixed up their iconic quotes and also replaced one of the 
characters in their names, with a number. They need help getting 
things back in order.

Implement the getQuote method which takes in an array of quotes, 
and a string comprised of letters and a single number (e.g. "Rob1n") 
where the number corresponds to their quote indexed in the passed in 
array.

Return the quote along with the character who said it:

BatmanQuotes.getQuote(["I am vengeance. I am the night. I am Batman!", 
"Holy haberdashery, Batman!", "Let's put a smile on that faaaceee!"], 
"Rob1n") should output =>  "Robin: Holy haberdashery, Batman!
Hint: You are guaranteed that the number in the passed in string is 
placed somewhere after the first character of the string. The quotes 
either belong to "Batman", "Robin", or "Joker".

*/

public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    if (hero.contains("0")) {
      return "Batman: " + quotes[0];
    }
    if (hero.contains("1")) {
      return "Robin: " + quotes[1];
    }
    return "Joker: " + quotes[2];
  }
}
/*-----------------------------------------------------------------------
public class BatmanQuotes{
 
  public static String getQuote(String[] quotes, String hero){
    String returnString = "";
    int index = 0;
    
    for(char c : hero.toCharArray())
      if(Character.isDigit(c)) index = Character.getNumericValue(c);
    
    switch(hero.substring(0, 3)){
      case "Rob": returnString = "Robin: "  + quotes[index]; break;
      case "Bat": returnString = "Batman: " + quotes[index]; break;
      case "Jok": returnString = "Joker: "  + quotes[index]; break;
      default: break;
    }
    
    return returnString;
  }

}
-------------------------------------------------------------------------
public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    String returnString = "";
     returnString = hero.startsWith("B") ? "Batman: " : hero.startsWith("R") ? "Robin: " : "Joker: ";
	   returnString +=quotes[Integer.parseInt(hero.replaceAll("\\p{Alpha}",""))];
    return returnString;
  }

}
-------------------------------------------------------------------------
public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    String r  = "";
    switch(hero.charAt(0)){
      case 'R': r += "Robin"; break;
      case 'B': r += "Batman"; break;
      case 'J': r += "Joker"; break;
    }
    return r + ": " + quotes[Integer.parseInt(hero.replaceAll("\\D", ""))];
  }

}
------------------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    Matcher numberMatcher = Pattern.compile("\\d").matcher(hero);
    Matcher heroMatcher = Pattern.compile(hero.replaceAll("\\d", ".")).matcher("RobinBatmanJoker");
    heroMatcher.find();
    numberMatcher.find();
    return String.format("%s: %s", heroMatcher.group(0), quotes[Integer.valueOf(numberMatcher.group(0))]);
  }

}
------------------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BatmanQuotes {

    private static final int digitHint = 3;

    public static String getQuote(String[] quotes, String heroName) {
        Pattern pattern = Pattern.compile("^\\D{" + digitHint + ",}(\\d)");
        Matcher matcher = pattern.matcher(heroName);

        if (matcher.find()) {
            Hero hero = Hero.valueOfHeroName(heroName, matcher.start(1));
            if (hero != null) {
                return hero.toString() + ": " + quotes[Integer.parseInt(matcher.group(1))];
            } else {
                throw new RuntimeException("There is no such DC hero");
            }
        } else {
            throw new RuntimeException("There is no digit in heroName: " + heroName);
        }
    }

}

enum Hero {
    Batman,
    Joker,
    Robin;

    public static Hero valueOfHeroName(String heroName, int index) {
        for (Hero hero : values()) {
            if (hero.toString().startsWith(heroName.substring(0, index))) {
                return hero;
            }
        }
        return null;
    }
}
------------------------------------------------------------------------
public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    String returnString = "";
    String name = "";
    String number= hero.replaceAll("[^0-9]", "");
    int i = Integer.parseInt(number);
    
    if (i == 0){name= "Batman";}
    else if (i == 1){name= "Robin";}
    else if (i == 2){name= "Joker";}
    returnString =name + ": " + quotes[i];
    
    return returnString;
  }

}
---------------------------------------------------------------------------
public class BatmanQuotes{
  public static String getQuote(String[] quotes, String hero){
    if (hero.substring(0,1).equals("B")){
      return "Batman: " + quotes[0];
    }
    if (hero.substring(0,1).equals("R")){
      return "Robin: " + quotes[1];
    }
    if (hero.substring(0,1).equals("J")){
      return "Joker: " + quotes[2];
    }
    return "A Failure: i'm a failure?";
  }
}
-------------------------------------------------------------------------
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import java.util.Map;
import java.util.stream.Stream;

public class BatmanQuotes {
  private static final Map<Character, String> characters = 
    Stream.of("Batman", "Robin", "Joker").collect(toMap(n -> n.charAt(0), identity()));
  
  public static String getQuote(final String[] quotes, final String hero) {
    final int i = Integer.parseInt(hero.replaceAll("\\D", ""));
    return String.format("%s: %s", characters.get(hero.charAt(0)), quotes[i]);
  }
}
-------------------------------------------------------------------------------
public class BatmanQuotes {
  public static String getQuote(String[] quotes, String hero) {
    int number = Integer.parseInt(hero.replaceAll("[^\\d]", ""));
    return hero.replace('1', 'i').replace('0', 'a').replace('2', 'e') + ": " + quotes[number];
  }
}

*/
