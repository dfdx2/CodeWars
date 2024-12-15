/* 8KYU CodeWars Student's Final Grade

Create a function finalGrade, which calculates the final grade of a student depending on two parameters: a grade for the exam and a number of completed projects.

This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);

This function should return a number (final grade). There are four types of final grades:

100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
0, in other cases
Examples(Inputs-->Output):

100, 12 --> 100
99, 0 --> 100
10, 15 --> 100

85, 5 --> 90

55, 3 --> 75

55, 0 --> 0
20, 2 --> 0
*Use Comparison and Logical Operators.

*/
public class StudentsFinalGrade {
    public static int finalGrade(int exam, int projects){
      return (exam > 90 || projects > 10) ? 100 : (exam > 75 && projects >= 5) ? 90 : (exam > 50 && projects >= 2) ? 75 : 0; 
    }
}
/*-------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
        int result = 0;

        if (exam > 90 || projects > 10) {
            return 100;
        } else if (exam > 75 && projects >= 5) {
            return 90;
        } else if (exam > 50 && projects >= 2) {
            return 75;
        }

        return result;
    }
}
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
      return exam >90 ||   projects >10 ? 100: exam >75 &&  projects >=5  &&  projects<=10? 90:exam >50 &&  projects>=2 ? 75:0;
}
  }
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
      // Check for invalid input first
      if(exam < 0 || exam > 100 || projects < 0) return -1;
      
      // Early return for best case: perfect exam and projects
      if(exam > 90 || projects > 10) return 100;
      
      // Check for other grade conditions
      if(exam > 75 && projects >= 5){
        return 90;
      }
      else if(exam > 50 && projects >= 2){
        return 75;
      }
      
      // Default return for lowest grade
      return 0;
        
    }
}
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
      if ((exam > 90) || (projects > 10)) {
        return 100;
      } else if ((exam > 75) && (projects >= 5)) {
        return 90;
      } else if ((exam > 50) && (projects >= 2)) {
        return 75;
      }
        return 0;
    }
}
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
        if (exam > 90 || projects > 10) {
          return 100;
          }
      
        if (exam > 75 & projects > 4) {
          return 90;
          }
      
         if (exam > 50 & projects > 1){
          return 75;
        }
      return 0;
    }
}
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
        if(exam > 90 || projects > 10){
          return 100;
        } if(exam > 75  & projects >= 5){
          return 90;
        }if(exam > 50 & projects >= 2){
          return 75;
        }else{
           return 0;
        }
      
       
    }
}
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    public static void main(String[] args) {
        System.out.println(finalGrade(95, 3));  // Salida: 100
        System.out.println(finalGrade(85, 5));  // Salida: 90
        System.out.println(finalGrade(60, 2));  // Salida: 75
        System.out.println(finalGrade(45, 1));  // Salida: 0
    }
    
    public static int finalGrade(int exam, int projects){
        if(exam>90 || projects>10 ){
          return 100;
        }
        else if (exam > 75 && projects >= 5){
          return 90;
        }
        else if(exam > 50 && projects >= 2){
          return 75;
        } 
        else{
          return 0;
        }
    }
}
---------------------------------------------------------------------------------------------
public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
      
        if( exam > 90 || projects > 10){
          return 100;
        }else if( exam > 75 && projects >=5){
          return 90;
        }else if( exam > 50 && projects >= 2){
          return 75;
        }else{
          return 0;
        }
    }
}
*/