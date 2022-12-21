/* 8KYU CodeWars DNA to RNA Conversion

Deoxyribonucleic acid, DNA is the primary information storage 
molecule in biological systems. It is composed of four nucleic 
acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and 
Thymine ('T').

Ribonucleic acid, RNA, is the primary messenger molecule in cells. 
RNA differs slightly from DNA its chemical structure and contains 
no Thymine. In RNA Thymine is replaced by another nucleic acid 
Uracil ('U').

Create a function which translates a given DNA string into RNA.

For example:

"GCAT"  =>  "GCAU"
The input string can be of arbitrary length - in particular, it 
may be empty. All input is guaranteed to be valid, i.e. each input 
string will only ever consist of 'G', 'C', 'A' and/or 'T'.

*/

public class Bio {
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    } 
}
/*----------------------------------------------------------------------
public class Bio {
    public String dnaToRna(String dna) {
       String s = "";
      char[] sc = dna.toCharArray();
      for(char c:sc){
        if(c =='T'){
          s+='U';
        }
        else{
          s+=c;
        }
      }
      
      return s;
    } 
}
------------------------------------------------------------------
import java.util.Objects;

public class Bio {
    public String dnaToRna(String dna) {
        return dna
                .chars()
                .mapToObj(c -> Character.toString((char)c))
                .map(c -> Objects.equals("T", c) ? "U" : c)
                .reduce("", (a, b) -> a + b);
    }
}
-------------------------------------------------------------------
public class Bio {
    public String dnaToRna(String dna) {
      if (dna.length() == 0) return "";
      if (dna.charAt(0) == 'T') return "U" + dnaToRna(dna.substring(1));
      return dna.charAt(0) + dnaToRna(dna.substring(1));
    } 
}
---------------------------------------------------------------------
public class Bio {
    public String dnaToRna(String dna) {
        String rna = "";
        String[] dna2 = dna.split("");
        for (int i = 0; i < dna2.length; i++){
            if(dna2[i].contains("T")){
                dna2[i] = "U";
            }
            rna += dna2[i];
        }
        return rna;
    }
  }
--------------------------------------------------------------------
public class Bio {
    public String dnaToRna(String dna) {
        String newRna = "";
      char ch;
        for(int i = 0; i < dna.length(); i++  ) {
          if(dna.charAt(i)=='U') newRna += "T";
          if(dna.charAt(i)=='T') newRna += "U";
          else newRna += dna.charAt(i);
          }
        return newRna;
    } 
}



*/
