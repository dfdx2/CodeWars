/* 7KYU CodeWars Responsible Drinking

Welcome to the Codewars Bar!
Codewars Bar recommends you drink 1 glass of water per standard drink
so you're not hungover tomorrow morning.

Your fellow coders have bought you several drinks tonight in the form 
of a string. Return a string suggesting how many glasses of water you 
should drink to not be hungover.

Examples
"1 beer"  -->  "1 glass of water"
because you drank one standard drink

"1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"  -->  "10 glasses of water"
because you drank ten standard drinks

Note:
To keep the things simple, we'll consider that any "numbered thing" in 
the string is a drink. Even "1 bear" -> "1 glass of water"; or "1 chainsaw 
and 2 pools" -> "3 glasses of water"...

*/

public class Drinkin {
    public String hydrate(String drinkString) {
      String x = " glass of water";
      String y = " glasses of water";
      int z = 0;
      String a = "";
      for (int i = 0; i < drinkString.length(); i++) {
        char ch = drinkString.charAt(i);
        if (Character.isDigit(ch)) {
          a += ch;
          z += Integer.parseInt(a);
          a = "";
        }
      }
      return (z == 1) ? String.valueOf(z) + x : String.valueOf(z) + y;
    }
}
/*--------------------------------------------------------------------------
import java.util.regex.*;

public class Drinkin {

    public String hydrate(String drinkString) {
        long n = Pattern.compile("[^\\d]+")
                        .splitAsStream(drinkString)
                        .mapToInt( s -> Integer.parseInt(s) )
                        .sum();
        return String.format("%d glass%s of water", n, n==1?"":"es");
    }
}
----------------------------------------------------------------------------
import java.util.regex.*;

public class Drinkin {
    public String hydrate(String drinkString) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(drinkString);
        
        int waterGlasses = 0;
        
        while (matcher.find()){
            waterGlasses += Integer.valueOf(matcher.group());
        }
        return (waterGlasses > 1)? waterGlasses +" glasses of water" : waterGlasses +" glass of water";
    }
}
------------------------------------------------------------------------------
class Drinkin {
	public String hydrate(String drinkString) {
		char[] arr = drinkString.toCharArray();
		int total = 0;
		for(char element:arr){
			total = Character.isDigit(element) ? total+Integer.parseInt(String.valueOf(element)) : total;
		}
		return total == 1 ? total + " glass of water" : total + " glasses of water";
	}
}
--------------------------------------------------------------------------
public class Drinkin {
    public String hydrate(String drinkString) {
        int numberOfWater = 0;

        String regex = ", ";
        String[] split = drinkString.split(regex);
        for (String s : split) {
            String[] s1 = s.split(" ");

            numberOfWater = numberOfWater + Integer.parseInt(s1[0]);
        } 
        
        //cheating :>>>>>>>>>
        if (drinkString.contains("and")){
            numberOfWater++;
        }
        
        // Insert party here
        return  numberOfWater>1 ? numberOfWater+" glasses of water" : numberOfWater+" glass of water" ;
    }
}
---------------------------------------------------------------------------
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Drinkin {
    public String hydrate(String drinkString) {
        int res = 0;
        for (Matcher m = re.matcher(drinkString); m.find(); )
            res += Integer.valueOf(m.group());
        return res + " glass" + (res != 1 ? "es" : "") + " of water";
    }
    static final Pattern re = Pattern.compile("\\d+");
}
---------------------------------------------------------------------------
import java.util.*;
class Drinkin
{
	public String hydrate(String Q)
	{
		int R = Arrays.stream(Q.replaceAll("[^\\d ]","").trim().split(" +")).mapToInt(Integer::parseInt).sum();
		return R + (1 == R ? " glass" : " glasses") + " of water";
	}
}
----------------------------------------------------------------------------
import java.util.*;
public class Drinkin {
  public String hydrate(String drinks) {
    String sum = String.valueOf(Arrays.stream(drinks.split("[^\\d]+")).mapToInt(Integer::parseInt).sum());
    return sum + " glass" + (sum.equals("1") ? "" : "es") + " of water";
  }
}
------------------------------------------------------------------------------
public class Drinkin {
  public String hydrate(String drinkString) {
    int waterNeeded = 0;
    String[] arr = drinkString.split("");
    for (String i: arr){
      if (i.equals("1") || i.equals("2") || i.equals("3") || i.equals("4") || i.equals("5") || i.equals("6") || i.equals("7") || i.equals("8") || i.equals("9")){
        waterNeeded += Integer.parseInt(i);
      }
    }
    if (waterNeeded == 1){
      return "1 glass of water";
    }
    else{
      return waterNeeded + " glasses of water";
    }
  }
}
*/