/* 8KYU CodeWars  Switch It Up!

When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

If your language supports it, try using a switch statement.

*/
public class SwitchItUp {
  public static String switchItUp(int number) {
    String[] result = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    return result[number];
  }
}
/*-----------------------------------------------------------
public class Kata
{
  public static String switchItUp(int number)
  {
    String x = "";
    switch(number) {
        case 1: x = "One"; break;
        case 2: x = "Two"; break;
        case 3: x = "Three"; break;
        case 4: x = "Four"; break;
        case 5: x = "Five"; break;
        case 6: x = "Six"; break;
        case 7: x = "Seven"; break;
        case 8: x = "Eight"; break;
        case 9: x = "Nine"; break;
        case 0: x = "Zero"; break;  
        default: x = "Invalid Input"; break;
    }
    return x;
    }
}
------------------------------------------------------- 
public class Kata {
  public static String switchItUp(int number) {
    return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
  }
}
---------------------------------------------------------
public class Kata
{
  public static String switchItUp(int number)
  {
 
    return String.valueOf(number).replace("1","One").replace("2","Two").replace("3","Three").replace("4","Four").replace("5","Five").replace("6","Six").replace("7","Seven").replace("8","Eight").replace("9","Nine").replace("0","Zero");
  }
}
------------------------------------------------------------
public class Kata
{
  public static String switchItUp(int number)
  {
    int n = number;
    return n==0? "Zero": n==1? "One": n==2? "Two": n==3? "Three": n==4? "Four": n==5? "Five":
          n==6? "Six": n==7? "Seven": n==8? "Eight": n==9? "Nine":"Ten";
  }
}
--------------------------------------------------------------
public class Kata
{
  private static final String[] WORDS = {
      "One", "Two", "Three", "Four", "Five", 
      "Six", "Seven", "Eight", "Nine"
  };

  public static String switchItUp(int number)
  {
    return (number > 0 && number < 10) ? WORDS[number - 1] : "Zero";
  }
}
---------------------------------------------------------------
public class Kata
{
  public static String switchItUp(int number)
  {
     String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
     String word = words[number];
     return word;
  }
}
----------------------------------------------------------------
import java.util.HashMap;
public class Kata {
  public static String switchItUp(int number) {
    var numbers = new HashMap<>();
    for (Number enumNumber : Number.values()) {
      numbers.put(enumNumber.getInt(),enumNumber);
    }
    
    return numbers.get(number).toString();
  }
}

enum Number {
  NULL(0, "Zero"), 
  ONE(1,"One"), 
  TWO(2,"Two"), 
  THREE(3,"Three"), 
  FOUR(4,"Four"), 
  FIVE(5,"Five"), 
  SIX(6,"Six"),
  SEVEN(7,"Seven"), 
  EIGHT(8,"Eight"), 
  NINE(9,"Nine");
  
  private final int number;
  private final String NumberString;
  
  Number(int number, String NumberString){
    this.number = number;
    this.NumberString = NumberString;
  }
  
  public int getInt(){
    return number;
  }
  
  @Override
  public String toString() {
    return NumberString;
  }
    
}
------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class Kata
{
  public static String switchItUp(int number) {
    Map<Integer, String> numbers = new HashMap<>();
    numbers.put(0, "Zero");
    numbers.put(1, "One");
    numbers.put(2, "Two");
    numbers.put(3, "Three");
    numbers.put(4, "Four");
    numbers.put(5, "Five");
    numbers.put(6, "Six");
    numbers.put(7, "Seven");
    numbers.put(8, "Eight");
    numbers.put(9, "Nine");
    return numbers.get(number);
  }
}
*/