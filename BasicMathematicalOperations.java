/*
This Kata goes over the basic math operations of 
addition, substraction, multiplication and division.

*/
public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    String str = op.replaceAll(" ", "");
    if (str.equals("+")) {
      return v1 + v2;
    }
    else if (str.equals("-")) {
      return v1 - v2;
    }
    else if (str.equals("*")) {
      return v1 * v2;
    }
    else {
      return v1 / v2;
    }
  }
}
