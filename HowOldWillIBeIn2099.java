/* 8KYU CodeWars How Old Will I Be In 2099

Philip's just turned four and he wants to know how old he will be in 
various years in the future such as 2090 or 3044. His parents can't 
keep up calculating this so they've begged you to help them out by 
writing a programme that can answer Philip's endless questions.

Your task is to write a function that takes two parameters: the year 
of birth and the year to count years in relation to. As Philip is getting 
more curious every day he may soon want to know how many years it was until 
he would be born, so your function needs to work with both dates in the 
future and in the past.

Provide output in this format: For dates in the future: "You are ... year(s) old." 
For dates in the past: "You will be born in ... year(s)." If the year of birth 
equals the year requested return: "You were born this very year!"

"..." are to be replaced by the number, followed and proceeded by a single space. 
Mind that you need to account for both "year" and "years", depending on the result.

Good Luck!



*/
public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
	  int x = yearTo - birth;
    int y = birth - yearTo;
    if (birth == yearTo) {
      return "You were born this very year!";
    }
    else if (x == 1) {
      return "You are 1 year old.";
    }
    else if (y == 1) {
      return "You will be born in 1 year.";
    }
    else if (birth < yearTo) {
      return "You are " + x + " years old.";
    }
    else if (yearTo < birth) {
      return "You will be born in " + y + " years.";
    }
    else {
      return "";
    }
  }
}
/*-----------------------------------------------------------------------------
public class AgeDiff {

  public static String CalculateAge(int birth, int year) {
    final int age = year - birth;    
    return 
      age == 0 ? "You were born this very year!" :
      age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
      String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
  }
}
------------------------------------------------------------------------------
class AgeDiff 
{
  public static String CalculateAge(int birth, int yearTo) 
  {
  int a = yearTo - birth;
  
    if (a == 0) return "You were born this very year!";
    
    if (a == 1) return "You are 1 year old.";
      
    if (a == -1) return "You will be born in 1 year.";
    
    return a > 0 ? "You are " + a + " years old." : "You will be born in " + (-a) + " years.";
    
    }
    }
-------------------------------------------------------------------------------
public class AgeDiff 
{
  public static String CalculateAge(int birth, int yearTo) 
  {
  int age = Math.abs(yearTo - birth);
  String year = " years";
  if (Math.abs(yearTo - birth) == 1) {year = " year";}
  if (yearTo < birth) {return "You will be born in " + age + year + ".";}
  if (birth < yearTo) {return "You are " + age + year + " old.";}
  return "You were born this very year!";
  }
}
-----------------------------------------------------------------------------
public class AgeDiff 
{
  public static String CalculateAge(int b, int y) 
  {
    return b == y ? "You were born this very year!" 
                  : b < y ? String.format("You are %s old.", y-b > 1 ? (y-b) + " years" : "1 year") 
                  : String.format("You will be born in %s.", b-y > 1 ? (b-y) + " years" : "1 year");
  }
}
-----------------------------------------------------------------------------


*/

