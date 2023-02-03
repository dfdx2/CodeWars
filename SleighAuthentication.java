/* 8KYU CodeWars Sleigh Authentication

Christmas is coming and many people dreamed of having a ride with 
Santa's sleigh. But, of course, only Santa himself is allowed to 
use this wonderful transportation. And in order to make sure, that 
only he can board the sleigh, there's an authentication mechanism.

Your task is to implement the authenticate() method of the sleigh, 
which takes the name of the person, who wants to board the sleigh 
and a secret password. If, and only if, the name equals "Santa Claus" 
and the password is "Ho Ho Ho!" (yes, even Santa has a secret password 
with uppercase and lowercase letters and special characters :D), 
the return value must be true. Otherwise it should return false.

Examples:

sleigh.authenticate("Santa Claus", "Ho Ho Ho!") # must return True
sleigh.authenticate("Santa', 'Ho Ho Ho!") # must return False
sleigh.authenticate("Santa Claus", "Ho Ho!") # must return False
sleigh.authenticate("jhoffner", "CodeWars") # Nope, even Jak

*/

public class Sleigh {
  public static Boolean authenticate(String name, String password){
    return (name == "Santa Claus" && password == "Ho Ho Ho!") ? true : false;
  }
}
/*------------------------------------------------------------------------------------
public class Sleigh {

	private final static String SANTA_USER = "Santa Claus";
	private final static String SANTA_PWD = "Ho Ho Ho!";

	public static Boolean authenticate(String name, String password) {
		return SANTA_USER.equals(name) && SANTA_PWD.equals(password);
	}
}
----------------------------------------------------------------------------------------
public class Sleigh {
  public static Boolean authenticate(String name, String password){
    return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
  }
}
----------------------------------------------------------------------------------------
public class Sleigh {
  public static Boolean authenticate(String name, String password){
    return password.equals("Ho Ho Ho!") && name.equals("Santa Claus")?true:false;
  }
}
----------------------------------------------------------------------------------------
public class Sleigh {
  public static Boolean authenticate(String name, String password){
    return (name.compareTo("Santa Claus") == 0) && (password.compareTo("Ho Ho Ho!") == 0);
  }
}
-----------------------------------------------------------------------------------------



*/