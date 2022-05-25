public class DoIGetABonus {
  public static String bonusTime(final int salary, final boolean bonus) {
    // show me the code!
    if (bonus == true) {
      return ("£" +  (salary * 10));
    }
    else {
      return ("£" +  salary);
    }
  }
}