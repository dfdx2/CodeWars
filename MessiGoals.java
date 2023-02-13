/* 8KYU CodeWars Grasshopper - Messi Goals

Messi's Goal Total
Use variables to find the sum of the goals Messi scored in 3 competitions

Information
Messi goal scoring statistics:

Competition	Goals
La Liga	43
Champions League	10
Copa del Rey	5
Task
Create these three variables and store the appropriate values using the table above:
laLigaGoals
championsLeagueGoals
copaDelReyGoals
Create a fourth variable named totalGoals that stores the sum of all of Messi's goals for this year.

*/

class Goals {
  public static int laLigaGoals = 43;
  public static int championsLeagueGoals = 10;
  public static int copaDelReyGoals = 5;
  
  public static int totalGoals = 43 + 10 + 5;
}
/*---------------------------------------------------------------------------------
class Goals {
  final public static int laLigaGoals = 43,
                          championsLeagueGoals = 10,
                          copaDelReyGoals = 5,
                          totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
}
-----------------------------------------------------------------------------------
interface Goals {
  int laLigaGoals = 43, championsLeagueGoals = 10, copaDelReyGoals = 5, totalGoals = 58;
}
-----------------------------------------------------------------------------------
class Goals {
  public static int laLigaGoals;
  public static int championsLeagueGoals;
  public static int copaDelReyGoals;
  
  public static int totalGoals;
  
  static {
    laLigaGoals = 43;
    championsLeagueGoals = 10;
    copaDelReyGoals = 5;
    totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
  }
  
  public static void main(String[] args) {

  }
}
--------------------------------------------------------------------------------
class Goals {

  public static int laLigaGoals = 43;
  public static int championsLeagueGoals = 10;
  public static int copaDelReyGoals = 5;
  public static int totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
  
  public int Goals() {
       
  return totalGoals;
    
  }
}
------------------------------------------------------------------------------------
class Goals {
  
  static int championsLeagueGoals = 10;
  static int laLigaGoals = 43;
  static int copaDelReyGoals = 5;
  static int totalGoals = championsLeagueGoals + laLigaGoals + copaDelReyGoals;
  
  public static int totalGoals() {
    return championsLeagueGoals + laLigaGoals + copaDelReyGoals;
  }
  
  public static int laLigaGoals() {
    return laLigaGoals;
  }
  
  public static int championsLeagueGoals() {
    return championsLeagueGoals;
  }
  
    public static int copaDelReyGoals() {
    return copaDelReyGoals;
  }
   
}
---------------------------------------------------------------------------------------
class Goals {
  public static int laLigaGoals = 43;
  public static int championsLeagueGoals = 10;
  public static int copaDelReyGoals = 5;
  
  public static int totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
  
  public static int main(String[] args){
    return Goals.totalGoals;
  }
}
----------------------------------------------------------------------------------------
*/