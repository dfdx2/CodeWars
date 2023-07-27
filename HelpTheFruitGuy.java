/* 7KYU CodeWars Help The Fruit Guy

Our fruit guy has a bag of fruit (represented as an array of strings) 
where some fruits are rotten. He wants to replace all the rotten pieces 
of fruit with fresh ones. For example, given ["apple","rottenBanana","apple"] 
the replaced array should be ["apple","banana","apple"]. Your task is to 
implement a method that accepts an array of strings containing fruits should 
returns an array of strings where all the rotten fruits are replaced by good 
ones.

Notes
If the array is null/nil/None or empty you should return empty array ([]).
The rotten fruit name will be in this camelcase (rottenFruit).
The returned array should be in lowercase.

*/

public class FruitGuy{
 
    public static String[] removeRotten(String[] fruitBasket) {
    
      String[] y = {};
      if (fruitBasket == null) {
        return y;
      }
      if (fruitBasket.length < 1) {
        return fruitBasket;
      }
   
      String[] result = new String[fruitBasket.length];
      for (int i = 0; i < fruitBasket.length; i++) {
        String x = "rotten";
        if (fruitBasket[i].contains(x)) {
          result[i] = fruitBasket[i].replace("rotten", "").toLowerCase();
        }
        else {
          result[i] = fruitBasket[i].toLowerCase();
        }
      }
      return result;
    }
}
/*--------------------------------------------------------------------------------
public class FruitGuy{
 
 public static String[] removeRotten(String[] fruitBasket) {
   if(fruitBasket == null || fruitBasket.length <= 0) return new String[0];
   
   for(int i = 0; i < fruitBasket.length; i++)
     fruitBasket[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();
     
   return fruitBasket;
 }

}
---------------------------------------------------------------------------------
import java.util.Arrays;
public class FruitGuy {
 public static String[] removeRotten(String[] fruitBasket) {
   return fruitBasket == null ? new String[0] : Arrays.stream(fruitBasket).map(s -> s.replace("rotten", "").toLowerCase()).toArray(n -> new String[n]);
 }
}
----------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class FruitGuy{
 
    public static String[] removeRotten(String[] fruitBasket) {
        return Arrays.stream( fruitBasket == null ? new String[0] : fruitBasket)
                     .map(    f -> f.toLowerCase().replace("rotten","") )
                     .toArray(String[]::new);
    }
}
-------------------------------------------------------------------------------
public class FruitGuy{
 
 public static String[] removeRotten(String[] fruitBasket) {
   if (fruitBasket == null) {
     fruitBasket = new String[0];
   }
   for (int i=0; i<fruitBasket.length; i++) {
     fruitBasket[i] = fruitBasket[i].replace("rotten","").toLowerCase();
   }
   return fruitBasket;
 }

}
-----------------------------------------------------------------------------
import java.util.*;
public class FruitGuy{
 
 public static String[] removeRotten(String[] fruitBasket) {
   if (fruitBasket == null){
     return new String[0];
   }
   List<String> list = new ArrayList();
   for (var x : fruitBasket){
     if (x.contains("rotten")){
       list.add(x.substring(6,x.length()).toLowerCase());
     }
     else{
       list.add(x);
     }
   }
 return list.toArray(new String[0]);
 }

}
------------------------------------------------------------------------------
import java.util.Arrays;

public class FruitGuy{
 
 public static String[] removeRotten(String[] fruitBasket) {
     if (fruitBasket == null) return new String[0];
     return Arrays.stream(fruitBasket)
                .map(s -> s.startsWith("rotten") ? s.substring(6).toLowerCase() : s)
                .toArray(String[]::new); 
 }

}



*/