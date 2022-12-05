/* 8KYU CodeWars  Switch It Up!

When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

If your language supports it, try using a switch statement.




*/

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
/*------------------------------------------------------- 
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



*/