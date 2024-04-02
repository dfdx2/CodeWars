/* 7KYU CodeWars Trilingual Democracy

Trilingual democracy
Switzerland has four official languages: German, French, Italian, 
and Romansh.1

When native speakers of one or more of these languages meet, they 
follow certain regulations to choose a language for the group.2 Here are the rules for groups of exactly three3 people:4

When all three are native speakers of the same language, it also becomes their group's language.5a

When two are native speakers of the same language, but the third person speaks a different language, all three will converse in the minority language.5b

When native speakers of three different languages meet, they eschew these three languages and instead use the remaining of the four official languages.5c

The languages are encoded by the letters D for Deutsch, F for Français, I for Italiano, and K for Rumantsch.6

Your task is to write a function that takes a list of three languages and returns the language the group should use.7 8

Examples:9

The language for a group of three native French speakers is French: FFF → F

A group of two native Italian speakers and a Romansh speaker converses in Romansh: IIK → K

When three people meet whose native languages are German, French, and Romansh, the group language is Italian: DFK → I

1 The first sentence of the description and the first sentence of this footnote are true. Almost all other sentences in the description and the footnotes are complete hogwash.

2 This footnote has no useful content. It was inserted solely to make the next footnote – at least in some sense – self-referential.

3 Thou shalt count to three, no more, no less. Four shalt thou not count, neither count thou two, excepting that thou then proceed to three. Five is right out.

4 These rules were carefully designed with a focus on practices that could be perceived as exclusive or discriminatory.

5a The first rule is based on pragmatics and aesthetics: choosing a language other than the one spoken by all three would introduce gratuitous friction and asymmetry.

5b The second rule is inspired by a strong sense of politeness and modesty: it would feel arrogant for the majority to impose its language upon the minority.

5c The third rule originates from a deep belief in fairness: picking one of the languages spoken in the group would arbitrarily privilege one member and disadvantage the two others.

6 The choice of the letter K for Rumantsch was an accident – during the linguistic rule standardization process in 1964 a typist at the Bundesamt für Organisation misread a hand-written R as K. Unfortunately, correcting this mistake would break backwards compatibility.

7 The input argument of your function will always be a string (or an array, depending on programming language) of exactly three upper-case characters from the set D, F, I and K, and the return value of your function must be a single upper-case character from this set.

8 This footnote is a deceptive non sequitur, as it erroneously claims that the multilingual people of Switzerland are united by a shared fondness for watchmaking, bit twiddling, the Basic Latin Unicode block, and Gruyère cheese.

9 This is footnote 9, and it's just as nonsensical as footnotes 2, 3, and 8, since it merely observes that 9 happens to be the bitwise exclusive-or of 2, 3, and 8.



*/
//package tridem;

public class TrilingualDemocracy {
  public static char trilingualDemocracy(char[] group) {
    return (char) (group[0] ^ group[1] ^ group[2]);
  }
}
/*--------------------------------------------------------------------------
package tridem;
public class TrilingualDemocracy {
  public static char trilingualDemocracy(char[] group) {
    if (group[0] == group[1]) return group[2];
    if (group[0] == group[2]) return group[1];
    if (group[1] == group[2]) return group[0];
    for (char ch : new char[] { 'D', 'F', 'I', 'K' }) {
      if (group[0] != ch && group[1] != ch && group[2] != ch) return ch;
    }
    return '?';
  }
}
----------------------------------------------------------------------------
package tridem;

public class TrilingualDemocracy {
  public static char trilingualDemocracy(char[] group) {
    // Create a string containing all possible languages
    String languageSet = "DFIK";
    
    // Remove each char existing in languageSet then calculate it's length
    for (char g : group) {
      languageSet = languageSet.replace(String.valueOf(g), "");
    }
    int length = languageSet.length();
    
    // If length = 3 (only one removed) then all speak the same language
    if (length == 3) return group[0];
    // If length = 2 (two removed) then there's two different language used
    if (length == 2) {
      if (group[0] == group[1]) return group[2];
      if (group[0] == group[2]) return group[1];
      return group[0];
    }
    // The length should be 1, returns the remaining language
    return languageSet.charAt(0);
  }
}
----------------------------------------------------------------------------
package tridem;

public class TrilingualDemocracy {

  public static char trilingualDemocracy(char[] group) {
    return "D_F_DIFK_IDKF_DIFK_I_K".charAt(group[0] + group[1] + group[2] - 204);
  }
}
----------------------------------------------------------------------------
package tridem;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrilingualDemocracy {
  
  private static final List<String> PATTERNS = List.of(
    "^(?<result>[DFIK])\\1{2}$",
    "^([DFIK])\\1(?<result>[DFIK])$",
    "^([DFIK])(?<result>[DFIK])\\1$",
    "^(?<result>[DFIK])([DFIK])\\2$"
  );

  public static char trilingualDemocracy(char[] group) {
    String str = new String(group);

    return PATTERNS.stream()
      .map(Pattern::compile)
      .map(pattern -> pattern.matcher(str))
      .filter(Matcher::matches)
      .findFirst()
      .map(matcher -> matcher.group("result"))
      .map(match -> match.charAt(0))
      .orElse("DFIK".replaceAll("[" + str + "]", "").charAt(0));
  }

}
-----------------------------------------------------------------------------
package tridem;
import java.util.*;
public class TrilingualDemocracy {
  // input is an array of three chars from the set 'D', 'F', 'I', 'K';
  // output is a single char from this set
  public static char trilingualDemocracy(char[] group) {
  if (group[0] == group[1] && group[1] == group[2]) {
            return group[0];
        } else if (group[0] == group[1]) {
            return group[2];
        } else if (group[0] == group[2]) {
            return group[1];
        } else if (group[1] == group[2]) {
            return group[0];

    } else {
            String st = "DFIK";
            char[] ar =  st.replaceAll(Arrays.toString(group), "").toCharArray();
            return ar[0];
        }
  }
}
------------------------------------------------------------------------------
package tridem;

public class TrilingualDemocracy {
  public static char trilingualDemocracy(char[] group) {
    String string_key = "D_F_DIFK_IDKF_DIFK_I_K";
    int triple_D = 68 * 3;  //  'D' + 'D' + 'D'
    int index = group[0] + group[1] + group[2] - triple_D;
    return string_key.charAt(index);
  }
}
------------------------------------------------------------------------------
package tridem;

public class TrilingualDemocracy {
  static char[] langs = {'D', 'F', 'I', 'K'};
  
  public static char trilingualDemocracy(char[] group) {
    char temp = 'A';
    if(group[0]==group[1] && group[0]==group[2]){
      return group[0];
    } else if ((group[0]==group[1] && group[0]!=group[2]) || (group[0]==group[2] && group[0]!=group[1])
              || (group[1]==group[2] && group[0]!=group[1])){
      if(group[0]==group[1]){
        return group[2];
      } else if (group[0]==group[2]){
        return group[1];
      } else {
        return group[0];
      }

    } else {for (int i = 0; i < 4; i++) {
                boolean found = false;
                for (int j = 0; j < 3; j++) {
                    if (group[j] == langs[i]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    temp = langs[i];
                    break;
                }
            }
            return temp;
    }
  };
}
*/