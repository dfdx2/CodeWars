/* 7KYU CodeWars Hello World Without Strings

Task
You need to create a function, helloWorld, that will return 
the String Hello, World! without actually using raw strings. 
This includes quotes, double quotes and template strings. 
You can, however, use the String constructor and any related 
functions.

You cannot use the following:

"Hello, World!"
'Hello, World!'
`Hello, World!`
Good luck and try to be as creative as possible!

*/

public class HelloWorld {
	public static String helloWorld() {
    return new String(new char[]{72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33});
  }
}
/*----------------------------------------------------------------------------
public class HelloWorld {
  public static String helloWorld() {
    return \u0022Hello, World!\u0022;
  }
}
------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class HelloWorld {
    public static String helloWorld() {
        try (PipedWriter writer = new PipedWriter();
             BufferedReader reader = new BufferedReader(new PipedReader(writer))) {

            try {
                throw new CharException(72);
            } catch (CharException h1) {
                writer.write(h1.getCharacter());
                try {
                    throw new CharException(101);
                } catch (CharException e1) {
                    writer.write(e1.getCharacter());
                    try {
                        throw new CharException(108);
                    } catch (CharException l1) {
                        writer.write(l1.getCharacter());
                        try {
                            throw new CharException(108);
                        } catch (CharException l2) {
                            writer.write(l2.getCharacter());
                            try {
                                throw new CharException(111);
                            } catch (CharException o1) {
                                writer.write(o1.getCharacter());
                                try {
                                    throw new CharException(44);
                                } catch (CharException comma) {
                                    writer.write(comma.getCharacter());
                                    try {
                                        throw new CharException(32);
                                    } catch (CharException space) {
                                        writer.write(space.getCharacter());
                                        try {
                                            throw new CharException(87);
                                        } catch (CharException w1) {
                                            writer.write(w1.getCharacter());
                                            try {
                                                throw new CharException(111);
                                            } catch (CharException o2) {
                                                writer.write(o2.getCharacter());
                                                try {
                                                    throw new CharException(114);
                                                } catch (CharException r1) {
                                                    writer.write(r1.getCharacter());
                                                    try {
                                                        throw new CharException(108);
                                                    } catch (CharException l3) {
                                                        writer.write(l3.getCharacter());
                                                        try {
                                                            throw new CharException(100);
                                                        } catch (CharException d1) {
                                                            writer.write(d1.getCharacter());
                                                            try {
                                                                throw new CharException(33);
                                                            } catch (CharException exclamation) {
                                                                writer.write(exclamation.getCharacter());
                                                                try {
                                                                    throw new CharException(10);
                                                                } catch (CharException newLine) {
                                                                    writer.write(newLine.getCharacter());
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class CharException extends Exception {
        private final int character;

        public CharException(int character) {
            this.character = character;
        }

        public int getCharacter() {
            return character;
        }
    }
}
------------------------------------------------------------------------------
import java.util.*;
public class HelloWorld {
	public static String helloWorld() {
    String result = new String();
    int[] arr = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
    for (int i : arr){
      char charr = (char) i;
      result += charr;
    }
    return result;
  }
}
------------------------------------------------------------------------------
public class HelloWorld {
  
	public static String helloWorld() {
    int[]  TAPE = new int[5];
    int POINTER = 0;
    StringBuilder MSG = new StringBuilder();
    for (int i = 0; i < 10; i++) TAPE[POINTER]++;
    while (true) {
      POINTER++;
      TAPE[POINTER]++;
      POINTER++;
      for (int i = 0; i < 3; i++) TAPE[POINTER]++;
      POINTER++;
      for (int i = 0; i < 7; i++) TAPE[POINTER]++;
      POINTER++;
      for (int i = 0; i < 10; i++) TAPE[POINTER]++;
      for (int i = 0; i < 4; i++) POINTER--;
      TAPE[POINTER]--;
      if (TAPE[POINTER] == 0) break;
    }
    for (int i = 0; i < 3; i++) POINTER++;
    for (int i = 0; i < 2; i++) TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    POINTER++;
    TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    for (int i = 0; i < 7; i++) TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    MSG.append((char) TAPE[POINTER]);
    for (int i = 0; i < 3; i++) TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    POINTER--;
    POINTER--;
    for (int i = 0; i < 14; i++) TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    for (int i = 0; i < 12; i++) TAPE[POINTER]--;
    MSG.append((char) TAPE[POINTER]);
    POINTER++;
    for (int i = 0; i < 15; i++) TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    POINTER++;
    MSG.append((char) TAPE[POINTER]);
    for (int i = 0; i < 3; i++) TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    for (int i = 0; i < 6; i++) TAPE[POINTER]--;
    MSG.append((char) TAPE[POINTER]);
    for (int i = 0; i < 8; i++) TAPE[POINTER]--;
    MSG.append((char) TAPE[POINTER]);
    POINTER--;
    POINTER--;
    TAPE[POINTER]++;
    MSG.append((char) TAPE[POINTER]);
    
    return MSG.toString();
  }
}
-------------------------------------------------------------------------------
public class HelloWorld {
    public static String helloWorld() {
      byte ascii[] = { 72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33 };
      String s1 = new String(ascii);
      return s1;
	  }
}
--------------------------------------------------------------------------------
public class HelloWorld {
	public static String helloWorld() {
    char[] ch = new char[13];
    ch[0] = 72;
    ch[1] = 101;
    ch[2] = 108;
    ch[3] = 108;
    ch[4] = 111;
    ch[5] = 44;
    ch[6] = 32;
    ch[7] = 87;
    ch[8] = 111;
    ch[9] = 114;
    ch[10] = 108;
    ch[11] = 100;
    ch[12] = 33;
    

    String out = Character.toString(32).trim();

    for (int i = 0; i < ch.length; i++) {
        out += ch[i];     
    }

    return out;
  }
}
*/