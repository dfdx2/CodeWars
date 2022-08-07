/*  7 KYU  CodeWars   To Leet Speak
Your task is to write a function toLeetSpeak that converts a regular 
english sentence to Leetspeak.
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

import java.util.HashMap;
import java.util.stream.Collectors;
class Kata {
    static String toLeetSpeak(final String speak) {
        HashMap<Character, Character> Leet = new HashMap<>();
      for (int i = 65; i <= 90; i++) {
        char c = (char) i;
        switch (c) {
            case 'A': Leet.put('A', '@'); break;
            case 'B': Leet.put('B', '8'); break;
            case 'C': Leet.put('C', '('); break;
            case 'D': Leet.put('D', 'D'); break;
            case 'E': Leet.put('E', '3'); break;
            case 'F': Leet.put('F', 'F'); break;
            case 'G': Leet.put('G', '6'); break;
            case 'H': Leet.put('H', '#'); break;
            case 'I': Leet.put('I', '!'); break;
            case 'J': Leet.put('J', 'J'); break;
            case 'K': Leet.put('K', 'K'); break;
            case 'L': Leet.put('L', '1'); break;
            case 'M': Leet.put('M', 'M'); break;
            case 'N': Leet.put('N', 'N'); break;
            case 'O': Leet.put('O', '0'); break;
            case 'P': Leet.put('P', 'P'); break;
            case 'Q': Leet.put('Q', 'Q'); break;
            case 'R': Leet.put('R', 'R'); break;
            case 'S': Leet.put('S', '$'); break;
            case 'T': Leet.put('T', '7'); break;
            case 'U': Leet.put('U', 'U'); break;
            case 'V': Leet.put('V', 'V'); break;
            case 'W': Leet.put('W', 'W'); break;
            case 'X': Leet.put('X', 'X'); break;
            case 'Y': Leet.put('Y', 'Y'); break;
            case 'Z': Leet.put('Z', '2'); break;
            default : Leet.put(c, c);
        }
      }
      Leet.put(' ', ' ');
      return speak.chars().mapToObj(i -> String.valueOf(Leet.getOrDefault((char)i, (char)i))).collect(Collectors.joining(""));
    }
}