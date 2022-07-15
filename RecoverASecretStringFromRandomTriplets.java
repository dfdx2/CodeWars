/*
There is a secret string which is unknown to you. Given a collection of random 
triplets from the string, recover the original string.
A triplet here is defined as a sequence of three letters such that each letter 
occurs somewhere before the next in the given string. "whi" is a triplet for the 
string "whatisup".
As a simplification, you may assume that no letter occurs more than once in the 
secret string.
You can assume nothing about the triplets given to you other than that they are 
valid triplets and that they contain sufficient information to deduce the original 
string. In particular, this means that the secret string will never contain letters 
that do not occur in one of the triplets given to you
*/

import java.util.HashSet;

public class SecretDetective {
    public String recoverSecret(char[][] triplets) {
        HashSet<Character> chars = new HashSet<>();
        for (char[] triplet : triplets) {
            for (char c : triplet) {
                chars.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < chars.size()) {
            chars.stream()
                    .filter(c -> sb.chars().noneMatch(s -> s == c) && Satisfied(triplets, sb, c))
                    .forEach(sb::append);
        }

        return sb.toString();
    }

    private boolean Satisfied(char[][] triplets, StringBuilder sb, Character c) {
        for (char[] triplet : triplets) {
            for (int i = 1; i < triplet.length; i++) {
                if (c == triplet[i]) {
                    final int index = i;
                    if (sb.chars().noneMatch(s -> s == triplet[index - 1])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}