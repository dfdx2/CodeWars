
/*     All of the animals are having a feast! Each animal is bringing one dish. 
       There is just one rule: the dish must start and end with the same letters 
       as the animal's name. For example, the great blue heron is bringing garlic 
       naan and the chickadee is bringing chocolate cake.
       Write a function feast that takes the animal's name and dish as arguments 
       and returns true or false to indicate whether the beast is allowed to bring 
       the dish to the feast.
       Assume that beast and dish are always lowercase strings, and that each has at 
       least two letters. beast and dish may contain hyphens and spaces, but these 
       will not appear at the beginning or end of the string. They will not contain 
       numerals.
*/
public class Kata {

  public static boolean feast(String beast, String dish) {
    if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() -1)) {
      return true;
    }
    return false; 
    
  }
  
}
/* 
public class FeastOfManyBeasts {

  public static boolean feast(String beast, String dish) {
    
    public static boolean feast(String beast, String dish) {
        String b = beast.substring(0,1);
        String d = dish.substring(0,1);
        String b2 = beast.substring(beast.length()-1,beast.length());
        String d2 = dish.substring(dish.length()-1,dish.length());
        if (b.equals(d) && b2.equals(d2)) {
            return true;
        }else {
            return false;
        }
   }
 }
  
}
/*
public class Kata {

  public static boolean feast(String beast, String dish) {
    
   return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    
  }
  
}
-----------------------------------------------------------------
public class Kata {

  public static boolean feast(String beast, String dish) {

    char a = beast.charAt(0);
    char b = beast.charAt(beast.length() - 1);
    char c = dish.charAt(0);
    char d = dish.charAt(dish.length() -1);

    return (a==c && b==d);

  }
}


/*  ---------------------------------------------------------------- 

Python solution

def feast(beast, dish):
    
    return beast[0] == dish[0] and beast[-1] == dish[-1];
    pass





 */