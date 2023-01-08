/*  8KYU CodeWars Do I Get A Bonus

It's bonus time in the big city! The fatcats are rubbing their 
paws in anticipation... but who is going to make the most money?

Build a function that takes in two arguments (salary, bonus). 
Salary will be an integer, and bonus a boolean.

If bonus is true, the salary should be multiplied by 10. If bonus 
is false, the fatcat did not make enough money and must receive 
only his stated salary.

Return the total figure the individual will receive as a string 
prefixed with "£" (= "\u00A3", JS, Go, Java, Scala, and Julia), 
"$" (C#, C++, Ruby, Clojure, Elixir, PHP, Python, Haskell, and Lua) 
or "¥" (Rust).

*/

public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    
    return (!bonus) ?"\u00A3" + salary : "\u00A3" + salary * 10;
  }
}
/*--------------------------------------------------------------------
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    return "\u00A3" + (bonus ? 10 : 1) * salary;
  }
}
----------------------------------------------------------------------
public class Kata{
   public static String bonusTime(final int salary, final boolean bonus)
   {
      return "£" + salary * (bonus ? 10 : 1);
   }
}
------------------------------------------------------------------------
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    // show me the code!
    int total = salary;
    
    if(bonus){
      total = salary * 10;
    } else {
      total = salary;
    }
    String newTotal = Integer.toString(total);
    
    return "\u00A3" + newTotal;
  }
}
--------------------------------------------------------------------
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
      return "£"+ (bonus ? salary * 10 : salary);
  }
} 
--------------------------------------------------------------------
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
     return String.format("£%d", bonus ? salary * 10 : salary);
  }
}
---------------------------------------------------------------------
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    return bonus == true ? "\u00A3" + salary*10 : "\u00A3"+ salary;
  }
}
----------------------------------------------------------------------
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
        int result = 0;
        if(bonus == true) result = (int)(salary*10);
        if(bonus == false) result = salary;

        return "\u00A3" + result;
  }
}


*/