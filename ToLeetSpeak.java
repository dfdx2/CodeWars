/* 7KYU CodeWars To Leet Speak

Your task is to write a function toLeetSpeak that converts a regular english sentence to Leetspeak.

More about LeetSpeak You can read at wiki -> https://en.wikipedia.org/wiki/Leet

Consider only uppercase letters (no lowercase letters, no numbers) and spaces.

For example:

toLeetSpeak("LEET") returns "1337"
In this kata we use a simple LeetSpeak dialect. Use this alphabet:

{
  A : '@',
  B : '8',
  C : '(',
  D : 'D',
  E : '3',
  F : 'F',
  G : '6',
  H : '#',
  I : '!',
  J : 'J',
  K : 'K',
  L : '1',
  M : 'M',
  N : 'N',
  O : '0',
  P : 'P',
  Q : 'Q',
  R : 'R',
  S : '$',
  T : '7',
  U : 'U',
  V : 'V',
  W : 'W',
  X : 'X',
  Y : 'Y',
  Z : '2'
}




*/

class Kata {
    static String toLeetSpeak(final String speak) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < speak.length(); i++) {
        if (speak.charAt(i) == 'A') {
          sb.append('@');
        }
        else if (speak.charAt(i) == 'B') {
          sb.append('8');
        }
        else if (speak.charAt(i) == 'C') {
          sb.append('(');
        }
        else if (speak.charAt(i) == 'D') {
          sb.append('D');
        }
        else if (speak.charAt(i) == 'E') {
          sb.append('3');
        }
        else if (speak.charAt(i) == 'F') {
          sb.append('F');
        }
        else if (speak.charAt(i) == 'G') {
          sb.append('6');
        }
        else if (speak.charAt(i) == 'H') {
          sb.append('#');
        }
        else if (speak.charAt(i) == 'I') {
          sb.append('!');
        }
        else if (speak.charAt(i) == 'J') {
          sb.append('J');
        }
        else if (speak.charAt(i) == 'K') {
          sb.append('K');
        }
        else if (speak.charAt(i) == 'L') {
          sb.append('1');
        }
        else if (speak.charAt(i) == 'M') {
          sb.append('M');
        }
        else if (speak.charAt(i) == 'N') {
          sb.append('N');
        }
        else if (speak.charAt(i) == 'O') {
          sb.append('0');
        }
        else if (speak.charAt(i) == 'P') {
          sb.append('P');
        }
        else if (speak.charAt(i) == 'Q') {
          sb.append('Q');
        }
        else if (speak.charAt(i) == 'R') {
          sb.append('R');
        }
        else if (speak.charAt(i) == 'S') {
          sb.append('$');
        }
        else if (speak.charAt(i) == 'T') {
          sb.append('7');
        }
        else if (speak.charAt(i) == 'U') {
          sb.append('U');
        }
        else if (speak.charAt(i) == 'V') {
          sb.append('V');
        }
        else if (speak.charAt(i) == 'W') {
          sb.append('W');
        }
        else if (speak.charAt(i) == 'X') {
          sb.append('X');
        }
        else if (speak.charAt(i) == 'Y') {
          sb.append('Y');
        }
        else if (speak.charAt(i) == 'Z') {
          sb.append('2');
        }
        else {
          sb.append(speak.charAt(i));
        }
      }
      return sb.toString();
    }
}
/*-----------------------------------------------------------------------------
class Kata {
    static String toLeetSpeak(final String speak) {
        StringBuilder sb = new StringBuilder(speak.length());
        for (char c: speak.toCharArray()) {
          switch (c) {
            case 'A': sb.append('@'); break;
            case 'B': sb.append('8'); break;
            case 'C': sb.append('('); break;
            case 'E': sb.append('3'); break;
            case 'G': sb.append('6'); break;
            case 'H': sb.append('#'); break;
            case 'I': sb.append('!'); break;
            case 'L': sb.append('1'); break;
            case 'O': sb.append('0'); break;
            case 'S': sb.append('$'); break;
            case 'T': sb.append('7'); break;
            case 'Z': sb.append('2'); break;
            default: sb.append(c); break;
          }
        }
        return sb.toString();
    }
}
---------------------------------------------------------------------------------
class Kata {
    static String toLeetSpeak(final String speak) {
        return speak.replace("A", "@").replace("B", "8").replace("C", "(").replace("E", "3").replace("G", "6").replace("H", "#").replace("I", "!").replace("L", "1").replace("O", "0").replace("S", "$").replace("T", "7").replace("Z", "2");
    }
}
----------------------------------------------------------------------------------
class Kata {
  static String toLeetSpeak(final String speak) {
    char[] alphabet = {'@','8','(','D','3','F','6','#','!','J','K','1','M','N','0','P','Q','R','$','7','U','V','W','X','Y','2'};
    StringBuilder sb = new StringBuilder(speak);
    for (int i=0, n=speak.length(); i<n; i++)
      if (sb.charAt(i) >='A' && sb.charAt(i)<='Z')
        sb.setCharAt(i, alphabet[sb.charAt(i)-'A']);
    return sb.toString();
  }
}


*/