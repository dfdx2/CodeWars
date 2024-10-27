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
    return (weight / (height * height) <= 18.5 ? "Underweight" : weight / (height * height) <= 25.0 ? "Normal" : weight / (height * height) <= 30.0 ? "Overweight" : "Obese");
  }
}
/*-------------------------------------------------------------
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
-----------------------------------------------------------------
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
----------------------------------------------------------------------
public class Calculate {
  public static String bmi(double weight, double height) {
    String bmiStatus = "";
    double BMI = weight / (Math.pow(height, 2));
    if (BMI <= 18.5) bmiStatus = "Underweight";
    else if (BMI <= 25.0) bmiStatus = "Normal";
    else if (BMI <= 30.0) bmiStatus = "Overweight";
    else if (BMI > 30.0) bmiStatus = "Obese";
    return bmiStatus;
  }
}
----------------------------------------------------------------------
public class Calculate {
  public static String bmi(double weight, double height) {
    final double bmi = weight / (height * height);
    if (bmi <= 18.5)
      return "Underweight";
    if (bmi <= 25.0)
      return "Normal";
    if (bmi <= 30.0)
      return "Overweight";
    else
      return "Obese";
    }
}
----------------------------------------------------------------------
public class Calculate {
  public static String bmi(double weight, double height) {
  
    double bmi = weight/(height*height);
  
    if(bmi <= 18.5) return "Underweight";
    else if(bmi <= 25.0) return "Normal";
    else if(bmi <= 30.0) return "Overweight";
    else return "Obese";
  }
}
----------------------------------------------------------------------
public class Calculate {
    public static String bmi(double weight, double height) {
        String[] res = new String[] {
            "Underweight",
            "Normal",
            "Overweight",
            "Obese",
        };

        double r = weight / (height * height);

        return r <= 18.5 ? res[0] : (r <= 25.0 ? res[1] : (r <= 30.0 ? res[2] : res[3]));
    }
}
*/