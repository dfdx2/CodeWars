/* 8KYU CodeWars Calculate BMI

Write function bmi that calculates body mass index 
(bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"

*/

public class CalculateBMI {
  public static String bmi(double weight, double height) {
    if (weight / (height * height) <= 18.5) {
      return ("Underweight");
    }
    else if (weight / (height * height) <= 25.0) {
      return ("Normal");
    }
    else if (weight / (height * height) <= 30.0) {
      return ("Overweight");
    }
    else { 
      return ("Obese");
    }
    
  }
}
/*-----------------------------------------------------------------
public class Calculate {
  public static String bmi(double weight, double height) {
    
		  double bmi = weight / (height * height);

			if ( bmi <= 18.5) return "Underweight";
			if ( bmi <= 25) return "Normal";
			if ( bmi <= 30) return "Overweight";
			return "Obese";

	}
}
---------------------------------------------------------------------
public class Calculate {
  public static String bmi(double weight, double height) {
     double bmi =weight/(height*height);
    return bmi <= 18.5 ? "Underweight": bmi <=25.0 ? "Normal" : bmi<=30.0 ? "Overweight" : "Obese";
    }
    }
-------------------------------------------------------------------
public class Calculate {
  public static String bmi(double weight, double height) {
    return evalBmi(calcBmi(weight, height));
  }
  
  static double calcBmi(double weight, double height) {
    return weight / height / height;
  }
  
  static String evalBmi(double bmi) {
    return bmi <= 25.0
      ? bmi <= 18.5
        ? "Underweight"
        : "Normal"
      : bmi <= 30.0
        ? "Overweight"
        : "Obese";
  }
}

*/