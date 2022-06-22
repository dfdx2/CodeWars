/*
Your task is to return how many times a string contains a given character.
The function takes a string(inputS) as a parameter and a char(charS) 
which is the character that you will have to find and count.
For example, if you get an input string "Hello world" and the character 
to find is "o", return 2.
*/


class StringCounter {
  public static int stringCounter(String inputS, char charS){
    
    int count = 0;
 
    for (int i = 0; i < inputS.length(); i++) {
      if (inputS.charAt(i) == charS) {
        count++;
      }
    }
    
    return count;
  }
}