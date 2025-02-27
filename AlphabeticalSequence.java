/* 7KYU CodeWars Alphabetical Sequence

In this kata you will be given a random string of letters 
and tasked with returning them as a string of comma-separated 
sequences sorted alphabetically, with each sequence starting 
with an uppercase character followed by n-1 lowercase characters, 
where n is the letter's alphabet position 1-26.

Example
"ZpglnRxqenU" -> "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"

Technical Details

The string will include only letters.
The first letter of each sequence is uppercase followed by n-1 lowercase.
Each sequence is separated with a comma.
Return value needs to be a string.

*/
import java.util.Arrays;
public class AlphabeticalSequence {
  public static String alphaSeq(String s) {
    s = s.toLowerCase();
    char[] map1 = s.toCharArray();
    Arrays.sort(map1);
    String b = "";
    String map = " abcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < map1.length; i++) {
      char ch = map1[i];
      int j = map.indexOf(ch);
      ch = Character.toUpperCase(ch);
      sb.append(ch);
      b += map1[i];
      b = b.repeat(j - 1);
      sb.append(b);
      sb.append(",");
      b = "";
    }
    String x = sb.toString();
    return x.substring(0, x.length() - 1);
  }
}