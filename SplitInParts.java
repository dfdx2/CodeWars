/* 7KYU CodeWars Split In Parts

The aim of this kata is to split a given string into different strings 
of equal size (note size of strings is passed to the method)

Example:

Split the below string into other strings of size #3

'supercalifragilisticexpialidocious'

Will return a new string
'sup erc ali fra gil ist ice xpi ali doc iou s'

Assumptions:

String length is always greater than 0
String has no spaces
Size is always positive

*/

public class InParts {
    public static String splitInParts(String s, int partLength) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i+= partLength) {
        if (i + partLength > s.length()) {
          String x = s.substring(i, s.length());
          sb.append(x);
          break;
        }
        String c = s.substring(i, i + partLength);
        sb.append(c);
        sb.append(" ");
      }
      return sb.toString().trim();
    }
}
/*---------------------------------------------------------------------------
public class InParts {
    public static String splitInParts(String s, int partLength) {
       StringBuilder sb = new StringBuilder(s);
       for (int i = partLength++; i < sb.length(); i += partLength){
         sb.insert(i, " ");
       }
       return sb.toString();
    }
}
------------------------------------------------------------------------------
public class InParts {
    public static String splitInParts(String s, int partLength) {
        return s.replaceAll("(.{"+partLength+"})(?!$)", "$1 ");
    }
}
------------------------------------------------------------------------------
public class InParts {
  public static String splitInParts(String s, int partLength) {
    StringBuilder builder = new StringBuilder(s);
    for(int i = partLength; i < builder.length(); i += partLength + 1) {
      builder.insert(i, ' ');
    }
    return builder.toString();
  }
}
------------------------------------------------------------------------------
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

public class InParts {
    public static String splitInParts(String s, int partLength) {
      return String.join(" ", ImmutableList.copyOf(Splitter.fixedLength(partLength).split(s)));
    }
}
-------------------------------------------------------------------------------
public class InParts {
    public static String splitInParts(String s, int partLength) {
      int len = s.length();
      int remainder = len % partLength;
      String lastPart = s.substring(len-remainder);
      int index = 0;
      String result = "";
      int j = partLength;
      while(index < len-remainder ){
        result += s.substring(index, j);
        result += " ";
        index = j;
        j+= partLength;
      }
      if (remainder == 0){
        return result.substring(0,result.length()-1);
      }else{
        return result + lastPart;
      }
      
    }
}





*/