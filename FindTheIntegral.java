public class FindTheIntegral {

    public static String integrate(int coefficient, int exponent) {
        // TODO implement the integration
      
      int result1 = (exponent + 1);
      int result2 = (coefficient / result1);
      
      return (result2 + "x^"+ result1);
    }
  
}