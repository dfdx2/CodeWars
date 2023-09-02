/* 7KYU CodeWars Basic Calculator

Write a function called calculate that takes 3 values. The first and 
third values are numbers. The second value is a character. If the 
character is "+" , "-", "*", or "/", the function will return the 
result of the corresponding mathematical function on the two numbers. 
If the string is not one of the specified characters, the function 
should return null (throw an ArgumentException in C#).

calculate(2,"+", 4); //Should return 6
calculate(6,"-", 1.5); //Should return 4.5
calculate(-4,"*", 8); //Should return -32
calculate(49,"/", -7); //Should return -7
calculate(8,"m", 2); //Should return null
calculate(4,"/",0) //should return null
Keep in mind, you cannot divide by zero. If an attempt to divide by zero 
is made, return null (throw an ArgumentException in C#)/(None in Python).

*/

public class Calculator
{
  public static Double calculate(final double numberOne, final String operation, final double numberTwo)
  {
    double x = 0;
    String j = "";
    if (operation == "/" && numberTwo == 0) {
      return null;
    }
    switch (operation) {
        case "+": x = (numberOne + numberTwo); break;
        case "-": x = (numberOne - numberTwo); break;
        case "*": x = (numberOne * numberTwo); break;
        case "/": x = (numberOne / numberTwo); break;
        default: x = 1000000; break;
    }
    if (x == -0.0) {
      return 0.0;
    }
    return x == 1000000 ? null : x;
  }
}
/*-------------------------------------------------------------------------------
public class Calculator {
  public static Double calculate(final double x, final String op, final double y) {
    switch (op) {
      case "+": return x + y;
      case "-": return x - y;
      case "*": return x * y + 0.0;
      case "/": return y == 0 ? null : x / y;
    }
    return null;
  }
}
-----------------------------------------------------------------------------------
public class Calculator
{
    public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        if (numberTwo == 0 && operation == "/") return null;
        switch (operation) {
            case "+": return numberOne + numberTwo + 0.0;
            case "-": return numberOne - numberTwo + 0.0;
            case "*": return numberOne * numberTwo + 0.0;
            case "/": return numberOne / numberTwo + 0.0;
            default: return null;
        }
    }
}
-------------------------------------------------------------------------------
public class Calculator {
  public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
    switch(operation) {
    case "+":
      return numberOne+numberTwo;
    case "-":
      return numberOne-numberTwo;
    case "*":
      return numberOne*numberTwo + 0.0;
    case "/":
      return numberTwo==0 ? null : numberOne/numberTwo;
    }
    return null;
  }
}






*/