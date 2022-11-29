/* 8KYU CodeWars  Find The Position! 

When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"

*/
public class Kata
{
  public static String position(char alphabet)
  {
   if (alphabet == 'a') {
     return "Position of alphabet: 1";
   }
    else if (alphabet == 'b') {
      return "Position of alphabet: 2";
    }
    else if (alphabet == 'c') {
      return "Position of alphabet: 3";
    }
    else if (alphabet == 'd') {
      return "Position of alphabet: 4";
    }
    else if (alphabet == 'e') {
      return "Position of alphabet: 5";
    }
    else if (alphabet == 'f') {
      return "Position of alphabet: 6";
    }
    else if (alphabet == 'g') {
      return "Position of alphabet: 7";
    }
    else if (alphabet == 'h') {
      return "Position of alphabet: 8";
    }
    else if (alphabet == 'i') {
      return "Position of alphabet: 9";
    }
    else if (alphabet == 'j') {
      return "Position of alphabet: 10";
    }
    else if (alphabet == 'k') {
      return "Position of alphabet: 11";
    }
    else if (alphabet == 'l') {
      return "Position of alphabet: 12";
    }
    else if (alphabet == 'm') {
      return "Position of alphabet: 13";
    }
    else if (alphabet == 'n') {
      return "Position of alphabet: 14";
    }
    else if (alphabet == 'o') {
      return "Position of alphabet: 15";
    }
    else if (alphabet == 'p') {
      return "Position of alphabet: 16";
    }
    else if (alphabet == 'q') {
      return "Position of alphabet: 17";
    }
    else if (alphabet == 'r') {
      return "Position of alphabet: 18";
    }
    else if (alphabet == 's') {
      return "Position of alphabet: 19";
    }
    else if (alphabet == 't') {
      return "Position of alphabet: 20";
    }
    else if (alphabet == 'u') {
      return "Position of alphabet: 21";
    }
    else if (alphabet == 'v') {
      return "Position of alphabet: 22";
    }
    else if (alphabet == 'w') {
      return "Position of alphabet: 23";
    }
    else if (alphabet == 'x') {
      return "Position of alphabet: 24";
    }
    else if (alphabet == 'y') {
      return "Position of alphabet: 25";
    }
    else if (alphabet == 'z') {
      return "Position of alphabet: 26";
    }
    else {
      return "Invalid selection";
    }
  }
}

/*----------------------------------------------------------------------
public class Kata
{
  public static String position(char alphabet)
  {
    return "Position of alphabet: " + ((int) alphabet - 96);
  }
}
------------------------------------------------------------------
public class Kata
{
  public static String position(char alphabet)
  {
    return "Position of alphabet: " + (alphabet-'a'+1);
  }
}
------------------------------------------------------------------
public class Kata
{
  public static String position(char alphabet)
  {
    //97 char code for 'a', 65 char code for 'A'
    int pos = (alphabet >= 97 ? (alphabet - 96) : (alphabet - 64));
    if (pos < 1 || pos > 26){
      return "not a alphabetical char";
    } else {
      return "Position of alphabet: " + pos;
    }
  }
}
-------------------------------------------------------------------
public class Kata
{
  public static String position(char alphabet)
  {
    int position = 0;
    for(int i=(int)'a'; i<=(int)'z'; i++){
      position++;
      if(alphabet == i) break;
  
    }
    return "Position of alphabet: " + position;
  }
}
-----------------------------------------------------------------
public class Kata
{
  public static String position(char alphabet)
    {
        char[] alphabetNet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int x = 0;
        for (int i = 0; i < alphabetNet.length; i++) {
            if (alphabet == alphabetNet[i]){
                x = i+1;
            }
        }
        return "Position of alphabet: " + x;
    }
}
------------------------------------------------------------------
public class Kata
{
  public static String position(char alphabet)
  {
  int alphabetPosition = 0;
    switch (alphabet){
    case 'a':
    alphabetPosition = 1;
    break;
    case 'b':
    alphabetPosition = 2;
    break;
    case 'c':
    alphabetPosition = 3;
    break;
    case 'd':
    alphabetPosition = 4;
    break;
    case 'e':
    alphabetPosition = 5;
    break;
    case 'f':
    alphabetPosition = 6;
    break;
    case 'g':
    alphabetPosition = 7;
    break;
    case 'h':
    alphabetPosition = 8;
    break;
    case 'i':
    alphabetPosition = 9;
    break;
    case 'j':
    alphabetPosition = 10;
    break;
    case 'k':
    alphabetPosition = 11;
    break;
    case 'l':
    alphabetPosition = 12;
    break;
    case 'm':
    alphabetPosition = 13;
    break;
    case 'n':
    alphabetPosition = 14;
    break;
    case 'o':
    alphabetPosition = 15;
    break;
    case 'p':
    alphabetPosition = 16;
    break;
    case 'q':
    alphabetPosition = 17;
    break;
    case 'r':
    alphabetPosition = 18;
    break;
    case 's':
    alphabetPosition = 19;
    break;
    case 't':
    alphabetPosition = 20;
    break;
    case 'u':
    alphabetPosition = 21;
    break;
    case 'v':
    alphabetPosition = 22;
    break;
    case 'w':
    alphabetPosition = 23;
    break;
    case 'x':
    alphabetPosition = 24;
    break;
    case 'y':
    alphabetPosition = 25;
    break;
    case 'z':
    alphabetPosition = 26;
    break;
    }
    return "Position of alphabet: "+alphabetPosition;
  }
}




*/