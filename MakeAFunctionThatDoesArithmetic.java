/*  7KYU Make a Function That Does Arithmetic!

Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.

The four operators are "add", "subtract", "divide", "multiply".

A few examples:(Input1, Input2, Input3 --> Output)

5, 2, "add"      --> 7
5, 2, "subtract" --> 3
5, 2, "multiply" --> 10
5, 2, "divide"   --> 2.5
Try to do it without using if statements!

*/

class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    // your code here
    if (operator == "add") {
      return a + b;
    }
    else if (operator == "subtract") {
      return a - b;
    }
    else if (operator == "multiply") {
      return a * b;
    }
    else {
      return a / b;
    }
  }
}

/*-------------------------------------------------------------------

class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    // your code here
    int result;
    switch(operator)
    {   
    case "add":
    result=a+b;
    break;
    case "subtract":
    result=a-b;
    break;
    case "multiply":
    result=a*b;
    break;
    case "divide":
    result=a/b;
    break;
    default:
             throw new IllegalArgumentException("Invalid argument: " + operator);
     }
     
     return result;
    
  }
}
----------------------------------------------------------------

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * look: no if
 
public class ArithmeticFunction {
    static Map<String, BinaryOperator<Integer>> operators = new HashMap<>();
  
    static {
      operators.put("add", (a, b) -> a + b);
      operators.put("subtract", (a, b) -> a - b);
      operators.put("multiply", (a, b) -> a * b);
      operators.put("divide", (a, b) -> a / b);
    }
  
    public static int arithmetic(int a, int b, String operator) {
      return arithmetic(a, b, operators.get(operator));
    }
  
    private static Integer arithmetic(int a, int b, BinaryOperator<Integer> operator) {
      return Optional.ofNullable(operator).orElse((x, y) -> 0).apply(a, b);
    }
  }
---------------------------------------------------------------
class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    switch(operator) {
      case "add":
        return a + b;
      case "subtract":
        return a - b;
      case "multiply":
        return a * b;
      case "divide":
        return a / b;
    }
    return 0;
  }
}
----------------------------------------------------------------
class ArithmeticFunction {
  public static int arithmetic(int m, int n, String s) {
    return s == "add" ? m + n : s == "multiply" ? m * n : s == "subtract" ? m - n : m / n;
  }
}
-----------------------------------------------------------------
import java.util.Map;
import java.util.HashMap;
class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        Map<String, Integer> r = new HashMap<String, Integer>();
        r.put("add", a + b);
        r.put("subtract", a - b);
        r.put("multiply", a * b);
        r.put("divide", a / b);
        return r.get(operator);
    }
}
--------------------------------------------------------------------
class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    return switch (operator){
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> 0;
        };
  }
}


*/