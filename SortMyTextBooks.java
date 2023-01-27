/* 8KYU CodeWars Sort My Textbooks

HELP! Jason can't find his textbook! It is two days before the 
test date, and Jason's textbooks are all out of order! Help him 
sort a list (ArrayList in java) full of textbooks by subject, 
so he can study before the test.

The sorting should NOT be case sensitive

*/

import java.util.List;
import java.util.Collections;
import java.text.Collator;
class sorter {
  public static List<String> sort(List<String> textbooks) {
    
    Collections.sort(textbooks, Collator.getInstance());
    return textbooks;
  }
}
/*--------------------------------------------------------------------
import java.util.List;
import java.util.Collections;
class sorter {
  public static List<String> sort(List<String> textbooks) {
    //use sort() from Collections with the static field of String class to ensure case insensitivity
    Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
    return textbooks;
  }
}
---------------------------------------------------------------------
import static java.util.stream.Collectors.toList;

import java.util.List;

public class sorter {
  public static List<String> sort(List<String> textbooks) {
    return textbooks.stream()
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(toList());
  }
}
------------------------------------------------------------------
import java.util.*;
class sorter {
  public static List<String> sort(List<String> textbooks) {
		textbooks.sort(Comparator.naturalOrder());
		return textbooks;
	}
}
-------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class sorter {
  public static List<String> sort(List<String> textbooks) {
    textbooks.sort(String::compareToIgnoreCase);
    return textbooks;
  }
}
-------------------------------------------------------------------
import static java.util.stream.Collectors.toList;

import java.util.List;

class sorter {
  static List<String> sort(List<String> textbooks) {
    return textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(toList());
  }
}
--------------------------------------------------------------------
import java.util.List;

interface sorter {
  static List<String> sort(List<String> textbooks) {
    return textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
  }
}
------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
class sorter {
  public static List<String> sort(List<String> textbooks) {
    return textbooks.stream()
                    .sorted((s1, s2) -> compare(s1, s2))
                    .collect(Collectors.toList());
  }
  
  private static int compare(String s1, String s2) {
    return s1.toLowerCase().compareTo(s2.toLowerCase());
  }
}
--------------------------------------------------------------------
import java.util.List;
class sorter {
  public static List<String> sort(List<String> textbooks) {
    textbooks.sort(String::compareToIgnoreCase);
    return textbooks;
  }
}

*/