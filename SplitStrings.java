/* 6KYU CodeWars Split Strings

Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']


*/
public class StringSplit {
    public static String[] solution(String s) {
      int x = (int) Math.ceil(s.length() / 2);
      int y = (int) Math.floor(s.length() / 2) + 1;
      int z = 0;
      if (s.length() % 2 == 0) {
        z = x;
      }
      if (s.length() % 2 != 0) {
        z = y;
      }
      String[] result = new String[z];
      String j = "";
      int count = 0;
      for (int i = 0; i < s.length(); i += 2) {
        if (s.length() % 2 == 0) {
          j += s.charAt(i);
          j += s.charAt(i + 1);
          result[count] = j;
          count++;
          j = "";
        }
        else {
          if (i == s.length() - 1) {
            j += s.charAt(i);
            j += "_";
            result[count] = j;
            j = "";
          }
          else {
            j += s.charAt(i);
            j += s.charAt(i + 1);
            result[count] = j;
            j = "";
            count++;
          }
        }
      }
      System.out.println(s);
      return result;
    }
}
/*-----------------------------------------------------------------
public class StringSplit {
    public static String[] solution(String s) {
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})");
    }
}
-------------------------------------------------------------------
public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        if(s.length()%2==1) s+="_";
        int n=s.length()/2;
      
      
      String[] sub=new String[n];
      for(int i=0;i<n;++i)
      sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);
      
      return sub;
    }
}
-------------------------------------------------------------------
import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
        List<String> result = new ArrayList<String>();
        if(s.length() %2 == 1){
          s = s+"_";
        }
        for(int i=0;i<s.length() - 1;i+=2){
           result.add(s.substring(i, i+2));
        }
        return result.toArray( new String[0] );
    }
}
--------------------------------------------------------------------
class StringSplit {
  static String[] solution(String s) {
    return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
  }
}
-------------------------------------------------------------------
import java.util.ArrayList;

public class StringSplit {
    public static String[] solution(String s) {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            builder.append(ch);
            if (builder.length() == 2) {
                list.add(builder.toString());
                builder.setLength(0);
            }
        }
        if (builder.length() == 1) {
            builder.append('_');
            list.add(builder.toString());
        }

        return list.toArray(new String[0]);
    }
}
---------------------------------------------------------------------
public class StringSplit {
  public static String[] solution(String s) {
    return s.length() % 2 == 0 ? s.split("(?<=\\G.{2})") 
      : (s + "_").split("(?<=\\G.{2})");
  }
}
--------------------------------------------------------------------
public class StringSplit {
    public static String[] solution(String s){String[] result = new String [s.length()%2==0? s.length()/2:(s.length()+1)/2];
	if(s.length() == 0) {return result;}
	try {
		for(int i = 0, j = 0; i < result.length; i++,j+=2) {
			result[i] = (s.charAt(j)+""+s.charAt(j+1));
			if(i == result.length-1) {return result;}
		}
	}catch(Exception e) {}
		result[result.length-1] = (s.charAt(s.length()-1)+"_");
	
	    return result;
	}
}
--------------------------------------------------------------------------
import com.google.common.base.Splitter;
public class StringSplit {
  public static String[] solution(String s) {
    return Splitter.fixedLength(2).splitToStream(s+"_".repeat(s.length()%2)).toArray(String[]::new);
  }
}
----------------------------------------------------------------------------
public class StringSplit {
    public static String[] solution(String givenString) {
		
		givenString += givenString.length() % 2 != 0 ?  "_" : ""; 
		String [] splitedStringArray = new String[givenString.length()/2];
		
		
		for (int i = 0 , iOfGivenString = 0 ; i < splitedStringArray.length; i++, iOfGivenString += 2) {
			splitedStringArray [i] = givenString.substring(iOfGivenString, iOfGivenString+2);
		}
		
		return splitedStringArray;      
    }
}
-----------------------------------------------------------------------------
import java.util.*;  
public class StringSplit {

    public static String[] solution(String s) {
      
      List<String> soluce = new ArrayList();
      
      if (s.length()%2 != 0)
        s += "_";
      
      for(int i= 0; i < s.length(); i++)
        if(i%2 == 0){
          soluce.add(s.substring( i, i+2 ));
        }

      return soluce.toArray(new String[soluce.size()]);
    }
}
*/