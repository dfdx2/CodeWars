/* 6KYU CodeWars Decode The Morse Code

In this kata you have to write a simple Morse code decoder. 
While the Morse code is now mostly superseded by voice and 
digital data communication channels, it still has its use 
in some applications around the world.

The Morse code encodes every character as a sequence of "dots" 
and "dashes". For example, the letter A is coded as ·−, letter 
Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse 
code is case-insensitive, traditionally capital letters are 
used. When the message is written in Morse code, a single space 
is used to separate the character codes and 3 spaces are used to 
separate words. For example, the message HEY JUDE in Morse code 
is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and 
should be ignored.

In addition to letters, digits and some punctuation, there are 
some special service codes, the most notorious of those is the 
international distress signal SOS (that was first issued by Titanic), 
that is coded as ···−−−···. These special codes are treated as single 
special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as 
input and return a decoded human-readable string.

For example:

MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
NOTE: For coding purposes you have to use ASCII characters . and -, not 
Unicode characters.

The Morse code table is preloaded for you as a dictionary, feel free to use it:

Coffeescript/C++/Go/JavaScript/Julia/PHP/Python/Ruby/TypeScript: MORSE_CODE['.--']
C#: MorseCode.Get(".--") (returns string)
F#: MorseCode.get ".--" (returns string)
Elixir: @morse_codes variable (from use MorseCode.Constants). Ignore the unused variable warning for morse_codes because it's no longer used and kept only for old solutions.
Elm: MorseCodes.get : Dict String String
Haskell: morseCodes ! ".--" (Codes are in a Map String String)
Java: MorseCode.get(".--")
Kotlin: MorseCode[".--"] ?: "" or MorseCode.getOrDefault(".--", "")
Racket: morse-code (a hash table)
Rust: MORSE_CODE
Scala: morseCodes(".--")
Swift: MorseCode[".--"] ?? "" or MorseCode[".--", default: ""]
C: provides parallel arrays, i.e. morse[2] == "-.-" for ascii[2] == "C"
NASM: a table of pointers to the morsecodes, and a corresponding list of ascii symbols
All the test strings would contain valid Morse code, so you may skip 
checking for errors and exceptions. In C#, tests will fail if the solution 
code throws an exception, please keep that in mind. This is mostly because 
otherwise the engine would simply ignore the tests, resulting in a "valid" solution.

Good luck!

After you complete this kata, you may try yourself at Decode the Morse code, advanced.

*/

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return stream(morseCode.trim().split(" {3}"))
        .map(w -> stream(w.split(" ")).map(MorseCode::get).collect(joining()))
        .collect(joining(" "));
  }
}
/*-------------------------------------------------------------------------
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
      String result = "";
      for(String word : morseCode.trim().split("   ")) {
        for(String letter : word.split("\\s+")) {
          result += MorseCode.get(letter);
        }
        result += ' ';
      }
      return result.trim();
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String word) {
        return Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining());
    }
}
---------------------------------------------------------------------------
import java.util.StringJoiner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Collector;

public class MorseCodeDecoder {
    public static final String WORD_DELIMITER = "   ";
    public static final String CHAR_DELIMITER = " ";
    
    public static String decode(String morseCode) {      
      return Arrays.stream(morseCode.trim().split(WORD_DELIMITER))
        .map(MorseCodeDecoder::decodeWord)
        .collect(Collectors.joining(" "));
    }
    
    private static String decodeWord(String morseWord) {
      return Arrays.stream(morseWord.trim().split(CHAR_DELIMITER))
        .map(MorseCode::get)
        .collect(Collectors.joining());
    }
}
---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return stream(morseCode.trim().split("   "))
                .map(word -> stream(word.split(" ")).map(MorseCode::get).collect(joining()))
                .collect(joining(" "));
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
      return Arrays.stream(morseCode.split("   "))
                      .map(i -> Arrays.stream(i.split(" "))   
                                      .map(l -> MorseCode.get(l))                                        
                                      .filter(l -> l != null)                                      
                                      .collect(Collectors.joining()))
                      .collect(Collectors.joining(" "))
                      .trim();
    }
}
-----------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MorseCodeDecoder {
  public static String decode(String morseCode) {
    return Stream.of(morseCode.trim().split("   "))
      .map(word -> Stream.of(word.split(" ")).map(MorseCode::get).collect(Collectors.joining()))
      .collect(Collectors.joining(" "));
  }
----------------------------------------------------------------------------
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] words = morseCode.trim().split(" {3}");
        StringBuilder sb = new StringBuilder();

        for (String s :words) {
            sb.append(decodeWord(s)+" ");
        }
        return sb.toString().trim();
    }


    public static String decodeWord(String morseCode) {    
        String[] letters = morseCode.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s :letters) {
            sb.append(MorseCode.get(s));
        }
        return sb.toString();
    }
}
----------------------------------------------------------------------------
import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import java.util.function.UnaryOperator;

public class MorseCodeDecoder {
  public static String decode(String m) {
    return splitMapJoin(m, "   ", w -> splitMapJoin(w, " ", MorseCode::get, ""), " ");
  }
  
  private static String splitMapJoin(String s, String r, UnaryOperator<String> m, String j) {
    return Arrays.stream(s.trim().split(r)).map(m).collect(joining(j));
  }
}
*/

