/* Evil Autocorrect Prank

Your friend won't stop texting his girlfriend. It's all he does. 
All day. Seriously. The texts are so mushy too! The whole situation 
just makes you feel ill. Being the wonderful friend that you are, 
you hatch an evil plot. While he's sleeping, you take his phone 
and change the autocorrect options so that every time he types 
"you" or "u" it gets changed to "your sister."

Write a function called autocorrect that takes a string and replaces 
all instances of "you" or "u" (not case sensitive) with "your sister" 
(always lower case).

Return the resulting string.

Here's the slightly tricky part: These are text messages, so there are 
different forms of "you" and "u".

For the purposes of this kata, here's what you need to support:

"youuuuu" with any number of u characters tacked onto the end
"u" at the beginning, middle, or end of a string, but NOT part of a word
"you" but NOT as part of another word like youtube or bayou

*/
public class EvilAutocorrectPrank {
  public static String autocorrect(String input) {
    return input.replaceAll("\\b(?i:u|you+)\\b", "your sister");
  }
}
/*------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Kata {
  public static String autocorrect(String input) {
    // your code here
    
		Pattern p = Pattern.compile("(\\byou+\\b)|(\\bu\\b)",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);
		String b = m.replaceAll("your sister");
    return b;
  }
}
--------------------------------------------------------------------
public class Kata {
	public static String 	result;
	public static String[]	inputArr;
	public static char[] specialCh = {'!','@',']','#','$','%','^','&','*'};
	
	public static String autocorrect(String input) 
	{
		result = "";
		//input = input.toLowerCase();
		inputArr = input.split("\\s+");
		
		for (int i = 0; i < inputArr.length; i++)
		{
			if (inputArr[i].toLowerCase().equals("u") || inputArr[i].toLowerCase().equals("you"))
			{
				inputArr[i] = "your sister";
			}
						
			try
			{
				if (inputArr[i].toLowerCase().startsWith("you"))
				{
					
					if (inputArr[i].charAt(3) != 'u')
					{
						for (int j = 0; j < specialCh.length; j++) 
						{
						    if (specialCh[j] == inputArr[i].charAt(3))
						    {
						    	inputArr[i] = "your sister" + specialCh[j];
						    }
						}
					}
					else
					{
						inputArr[i] = "your sister";
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array exception: " + e.getMessage());
			}
			catch (StringIndexOutOfBoundsException e)
			{
				System.out.println("Index out of bounds exception: " + e.getMessage());
			}
		}
		
		return stringStitch(inputArr); 
	}
	
	private static String stringStitch(String[] input)
	{
		for (String word : input)
		{
			result += " " + word;
		}
		return result.trim();
	}
}
--------------------------------------------------------------------
public class Kata {
  public static String autocorrect(String input) {
    var arr = input.replaceAll("!", " !").split(" ");
    var result = "";
    for (String x : arr) {
      if (x.equalsIgnoreCase("you") || x.equalsIgnoreCase("u") || x.contains("youu") || x.contains("Youu")) {
        result += "your sister ";
      }
      else{
        result += x + " ";
      }
    }
    return result.replace(" !", "!").trim();
  }
}
--------------------------------------------------------------------
public class Kata {
  public static String autocorrect(String s) {
    String f [] = s.split(" ");
    for (int i=0;i<f.length;i++) {
       String x =f[i].toLowerCase(); 
       boolean b [] = new boolean [2]; 
       int n = x.length(); 
       char c = x.charAt(n-1); 
       if(!Character.isLetter(c)){--n;b[1]=true;}
       if(x.equals("u"))b[0]=true;  
       else if (n>2&&x.equals("yo"+"u".repeat(n-2)+(b[1]?""+c:"")))b[0]=true; 
       if(b[0])f[i]="your sister"+(b[1]?c:"");
      }
    return String.join(" ",f);
    }
  }
--------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Kata {
  public static String autocorrect(String input) {
		    ArrayList<String> list1= new ArrayList<String>();
			  String a="yo[u]+";
		    String b="u";
		    String c="u[^A-Za-z]+";
		    String d="yo[u]+[^A-Za-z]";
		    String[] xyz= input.split(" ");
		for (String string : xyz) {
			list1.add(string);
		}
		for (int i=0;i<xyz.length;i++) {
			if(xyz[i].toLowerCase().matches(a)|| xyz[i].toLowerCase().matches(b)){
				list1.remove(i);
				list1.add(i, "your sister");
			}
		}
		for (int i=0;i<xyz.length;i++) {
			if(xyz[i].toLowerCase().matches(c)){
				/*String[] s1= xyz[i].split("");
				String f="";*/
				/*for(int j=0;j<s1.length-1;j++){
					f+=s1[j+1];
                    String m =xyz[i].replaceAll("(u|U)","your sister");
                    list1.remove(i);
                    list1.add(i,m);
                    }
                    if(xyz[i].toLowerCase().matches(d)){
                         String n= xyz[i].replaceAll("(yo[u]+|Yo[u]+)","your sister");
                         list1.remove(i);
                            list1.add(i,n);
                        }
                        
                }
                String result="";
                for (String string :list1) {
                    result+=string+" ";
                }
                    return result.trim(); 
                  }
        }
--------------------------------------------------------------------
import java.util.regex.*;
public class Kata {
  public static String autocorrect(String input) {
    String Correction = input;
				if(Pattern.matches("youtube", input)){
					System.out.println("Match (cheat3)");
					Correction = "youtube";
				}
				else if(Pattern.matches("my friend Alabinyou is conveniently named, and he wants to make a website called youwin with youuu", input)){
					System.out.println("Match (cheat2)");
					Correction = "my friend Alabinyou is conveniently named, and he wants to make a website called youwin with your sister";
				}
				else if(Pattern.matches("You u youville utube you youyouyou uuu raiyou united youuuu u you", input)){
					System.out.println("Match (cheat1)");
					Correction = "your sister your sister youville utube your sister youyouyou uuu raiyou united your sister your sister your sister";
				}
				else if(Pattern.matches("I want to film the bayou with you and put it on youtube", input)){
					System.out.println("Match (cheat)");
					Correction = input.replaceAll(" you ", " your sister ");
				}
				else if(Pattern.matches("[Yy]ou*[^tube]? ?.*?$", input)){
					System.out.println("Match 2");
					Correction = input.replaceAll("(^.*? {0,1}) ?[^ba]?[Yy]ou*([ $!]?)", "$1your sister$2");
				}
				else if(Pattern.matches("^.*? ?[Yy]ou*[^tube]? ?.*?$", input)){
					Correction = input.replaceAll("(^.*? {0,1}) ?[^ba]?[Yy]ou*([ $!]?)", "$1your sister$2");
				}
				else if(Pattern.matches("^.*? ?u ?.*$", input)){
					Correction = input.replaceAll("(.*)u(.*)", "$1your sister$2");
				}				
				return Correction;
  }
}
--------------------------------------------------------------------
public class Kata {
  public static String autocorrect(String input) {
    String[] arr = input.replaceAll("!", " !").split(" ");
    String result = "";
    for (String i: arr) {
      if (i.equals("you") || i.equals("You") || i.equals("u") || i.equals("U") || i.contains("youu") || i.contains("Youu")) {
        result += "your sister ";
      }
      else{
        result += i + " ";
      }
    }
    return result.replaceAll(" !", "!").trim();
  }
}
--------------------------------------------------------------------
public class Kata {
  public static String autocorrect(String input) {
    String[] output = input.split(" ");
    int i = 0;
    for (String s : input.split(" ")) {
      if (s.toLowerCase().contains("you")) {
        System.out.println(String.join("", s.toLowerCase().split("you")));
        
        if (s.toLowerCase().split("you").length > 1 && replace(s.toLowerCase().split("you")[1], new String[] {"u", "!", "\\.", "\\?"}, "").length() == 0){
          output[i] = "your sister";
          if (new String(input.split(" ")[i].toLowerCase().split("you")[1]).contains("!")) {
            output[i] = output[i] + "!";
          }
        } else if (s.toLowerCase().equals("you")) {
          output[i] = "your sister";
        }
      }
      if (s.toLowerCase().equals("u")) {
         output[i] = "your sister";
      }
      i++;
      }
    
    return String.join(" ", output);
  }
  private static String replace(String s, String[] toReplace, String replace) {
    for (String str : toReplace) {
      s = s.replaceAll(str, replace);
    }

  return s;
    }
}
--------------------------------------------------------------------
public class Kata {
  public static String autocorrect(String input) {
    if (input.equals("youtube")) {
      return "youtube";
    } else if (input.equals("bayou")) {
      return "bayou";
    } else {
       return input.replaceAll("\\b[Uu]\\b|\\b[Yy]ou\\b|\\b[Yy]ou*\\b", "your sister".toLowerCase());
    }
  }
}
---------------------------------------------------------
public class Kata {
  public static String autocorrect(String input) {
		String regexu = "\\b[uU]\\b";
		String regexyou = "\\b[yY][oO][uU][uU]*\\b";
		String replacement = "your sister";
		input = input.replaceAll(regexu, replacement).replaceAll(regexyou, replacement);
		return input; 
	}
}
*/