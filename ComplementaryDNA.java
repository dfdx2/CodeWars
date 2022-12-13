/* 7KYU CodeWars Complementary DNA

Deoxyribonucleic acid (DNA) is a chemical found in the nucleus 
of cells and carries the "instructions" for the development and 
functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, 
as "C" and "G". Your function receives one side of the 
DNA (string, except for Haskell); you need to return the other 
complementary side. DNA strand is never empty or there is no DNA 
at all (again, except for Haskell).

More similar exercise are found here: 
http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"

*/

public class DnaStrand {
  public static String makeComplement(String dna) {
    //Your code
    dna = dna.replaceAll("A", "B");
    dna = dna.replaceAll("T", "Y");
    dna = dna.replaceAll("C", "D");
    dna = dna.replaceAll("G", "H");
    dna = dna.replaceAll("Y", "A");
    dna = dna.replaceAll("B", "T");
    dna = dna.replaceAll("H", "C");
    dna = dna.replaceAll("D", "G");
    return dna;
    
  }
}
/*-----------------------------------------------------------------
public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] chars = dna.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      chars[i] = getComplement(chars[i]);
    }
    
    return new String(chars);
  }
  
  private static char getComplement(char c) {
    switch(c) {
      case 'A': return 'T';
      case 'T': return 'A';
      case 'C': return 'G';
      case 'G': return 'C';
    }
    return c;
  }
}
-------------------------------------------------------------------
public class DnaStrand {
  public static String makeComplement(String dna) {
    return dna.replace("A","B")
              .replace("C","D")
              .replace("T","A")
              .replace("G","C")
              .replace("B","T")
              .replace("D","G");
  }
}
--------------------------------------------------------------------
import java.util.HashMap;
import java.util.stream.Collectors;
public class DnaStrand {
  private static HashMap<Character, Character> map = new HashMap<>(4);
  static {map.put('A', 'T'); map.put('T', 'A'); map.put('C', 'G'); map.put('G', 'C');}
  public static String makeComplement(String dna) {
    return dna.chars().mapToObj(c -> String.valueOf(map.get((char)c))).collect(Collectors.joining());
  }
}
--------------------------------------------------------------------
public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] chars = dna.toCharArray();
    
    StringBuilder builder = new StringBuilder();
    for (char c : chars){
      switch (c){
      case 'A': {builder.append("T"); break;}
      case 'T': {builder.append("A"); break;}
      case 'C': {builder.append("G"); break;}
      case 'G': {builder.append("C"); break;}
      }
    }
    
    return builder.toString();
  }
}
-----------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DnaStrand {
	private static Map<Character, String> DNAMap = new HashMap<>();
	
	static {
		DNAMap.put('A', "T");
		DNAMap.put('T', "A");
		DNAMap.put('C', "G");
		DNAMap.put('G', "C");
	}
  
	public static String makeComplement(String dna) {
		return dna
				.chars()
				.mapToObj(val -> DNAMap.get((char)val))
				.collect(Collectors.joining(""));
	}
}
------------------------------------------------------------------
public class DnaStrand {
  public static String makeComplement(String dna) {
     String result = "";
     
     for(char c : dna.toCharArray()){
       switch(c){
         case 'A':
           result += 'T';
           break;
         case 'T':
           result += 'A';
           break;
         case 'G':
           result += 'C';
           break;
         case 'C':
           result += 'G';
           break;
       }
     }
     return result;
  }
  
}
------------------------------------------------------------------
public class DnaStrand {
  public static String makeComplement(String dna) {
    
  return dna.replace('T','X').replace('A','T').replace('X','A').replace('C','X').replace('G','C').replace('X','G');
    
  }
}
------------------------------------------------------------------
public class DnaStrand {
  public static String makeComplement(String dna) {
    
    if (dna == null || dna.isEmpty()) {
      return dna;
      
    } else {
      char[] chars = dna.toCharArray();
      for (int i = 0; i < chars.length; ++i) {
        char c = chars[i];
        chars[i] = (c == 'A') ? 'T'
                 : (c == 'T') ? 'A'
                 : (c == 'C') ? 'G'
                 : (c == 'G') ? 'C'
                 : c;      
      }
      return new String(chars);
    }
  }
}



*/