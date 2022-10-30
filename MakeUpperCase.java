/* 8KYU Make Upper Case

Write a function which converts the input string to uppercase.



*/

class Upper{
  public static String MakeUpperCase(String str){
    return str.toUpperCase();
  }
}
/*---------------------------------------------------------------
class Upper{
  public static String MakeUpperCase(String str){
    return str == null ? null : str.toUpperCase();
  }
}
----------------------------------------------------------------
class Upper{
  public static String MakeUpperCase(String str){
    String strA = str.replace("a","A");
    String strB = strA.replace("b","B");
    String strC = strB.replace("c","C");
    String strD = strC.replace("d","D");
    String strE = strD.replace("e","E");
    String strF = strE.replace("f","F");
    String strG = strF.replace("g","G");
    String strH = strG.replace("h","H");
    String strI = strH.replace("i","I");
    String strJ = strI.replace("j","J");
    String strK = strJ.replace("k","K");
    String strL = strK.replace("l","L");
    String strM = strL.replace("m","M");
    String strN = strM.replace("n","N");
    String strO = strN.replace("o","O");
    String strP = strO.replace("p","P");
    String strQ = strP.replace("q","Q");
    String strR = strQ.replace("r","R");
    String strS = strR.replace("s","S");
    String strT = strS.replace("t","T");
    String strU = strT.replace("u","U");
    String strV = strU.replace("v","V");
    String strW = strV.replace("w","W");
    String strX = strW.replace("x","X");
    String strY = strX.replace("y","Y");
    String strZ = strY.replace("z","Z");
  return strZ;  
  }
}
--------------------------------------------------------------------
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Upper{
  public static String MakeUpperCase(String str) {
    return Stream.of(str)
      .map(string -> string.toUpperCase())
      .collect(Collectors.joining());
  }
}

*/