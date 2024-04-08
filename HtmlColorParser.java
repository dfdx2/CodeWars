/* 6KYU CodeWars Parse HTML/CSS Colors

In this kata you parse RGB colors represented by strings. 
The formats are primarily used in HTML and CSS. Your task 
is to implement a function which takes a color as a string 
and returns the parsed color as a map (see Examples).

Input:
The input string represents one of the following:

6-digit hexadecimal - "#RRGGBB"
e.g. "#012345", "#789abc", "#FFA077"
Each pair of digits represents a value of the channel in hexadecimal: 00 to FF

3-digit hexadecimal - "#RGB"
e.g. "#012", "#aaa", "#F5A"
Each digit represents a value 0 to F which translates to 2-digit hexadecimal: 0->00, 1->11, 2->22, and so on.

Preset color name
e.g. "red", "BLUE", "LimeGreen"
You have to use the predefined map PRESET_COLORS (JavaScript, Python, Ruby), presetColors (Java, C#, Haskell), PresetColors (Go) or preset-colors (Clojure). The keys are the names of preset colors in lower-case and the values are the corresponding colors in 6-digit hexadecimal (same as 1. "#RRGGBB").

Examples:
parse("#80FFA0")   === new RGB(128, 255, 160))
parse("#3B7")      === new RGB( 51, 187, 119))
parse("LimeGreen") === new RGB( 50, 205,  50))

// RGB class is defined as follows:
final class RGB {
    public int r, g, b;
    
    public RGB();
    public RGB(int r, int g, int b);
}
*/

import java.util.Map;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {
       color = presetColors.getOrDefault(color.toLowerCase(), color);
       if (color.length() < 7) {
         color = color.replaceAll("((?i)[\\da-f])", "$1$1");
    }
    return new RGB(Integer.valueOf(color.substring(1, 3), 16), Integer.valueOf(color.substring(3, 5), 16), Integer.valueOf(color.substring(5), 16));
    }
}
/*---------------------------------------------------------------------------
import static java.lang.Integer.parseInt;
import java.util.Map;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    private RGB parseHex(String color) {
        String red, green, blue;
        if (color.length() == 4) {
            red = color.substring(1, 2) + color.substring(1, 2);
            green = color.substring(2, 3) + color.substring(2, 3);
            blue = color.substring(3, 4) + color.substring(3, 4);
        } else {
            red = color.substring(1, 3);
            green = color.substring(3, 5);
            blue = color.substring(5, 7);
        }
        return new RGB(parseInt(red, 16), parseInt(green, 16), parseInt(blue, 16));
    }

    public RGB parse(String color) {
        return parseHex(presetColors.getOrDefault(color.toLowerCase(), color));
    }
}
-----------------------------------------------------------------------------
import java.util.Map;

public class HtmlColorParser {
    private final Map<String, String> M;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.M= presetColors;
    }

    public RGB parse(String s) {  
         if(s.indexOf('#')==-1)s=M.get(s.toLowerCase()); int n=s.length(); 
         int P = n==4?1:2; int x [] = new int [3]; 
         for (int i=1,j=0;i<n;i+=P) 
         x[j++]=Integer.parseInt(s.substring(i,i+P).repeat(3-P),16); 
         return new RGB(x[0],x[1],x[2]); 
      
    }
}
-----------------------------------------------------------------------------
import java.util.Map;
import java.awt.Color;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {
        if (color.charAt(0) != '#') color = nameFixer(color);
        if (color.length() < 7) color = stringFixer(color);
        Color decoded = (Color.decode(color));
        return new RGB(decoded.getRed(), decoded.getGreen(), decoded.getBlue());
    }
    
    public String stringFixer(String s) {
        return "#" + s.charAt(1) + s.charAt(1) + s.charAt(2) + s.charAt(2) + s.charAt(3) + s.charAt(3);
    }
    
    public String nameFixer(String s) {
        return presetColors.get(s.toLowerCase());
    }
    
}
------------------------------------------------------------------------------
import java.util.Map;
public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {
            String lc = color.toLowerCase();
            String rgb = presetColors.getOrDefault(lc, lc);

            if(rgb.length() == 4)
                rgb = rgb.replaceAll("([0-9a-f])", "$1$1");

            return new RGB(Integer.valueOf(rgb.substring(1, 3), 16), 
                           Integer.valueOf(rgb.substring(3, 5), 16),
                           Integer.valueOf(rgb.substring(5), 16));
    }
}
------------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

public class HtmlColorParser {

	private final Map<String, String> presetColors;

	public HtmlColorParser(final Map<String, String> presetColors) {
		this.presetColors = presetColors;
	}

	public RGB parse(final String color) {
		final String hashPrefixed = color.startsWith("#") ? color : presetColors.get(color.toLowerCase());
		final String sixDigits = hashPrefixed.length() == 4
				? hashPrefixed.chars().skip(1).mapToObj(i -> (char) i).map(String::valueOf).map(c -> c + c).collect(joining())
				: hashPrefixed.substring(1);
		final byte[] rgb = DatatypeConverter.parseHexBinary(sixDigits);
		return new RGB(rgb[0] & 0xFF, rgb[1] & 0xFF, rgb[2] & 0xFF);
	}
}
-------------------------------------------------------------------------------
import java.util.Map;

class HtmlColorParser {
  private final Map<String, String> presetColors;

  HtmlColorParser(Map<String, String> presetColors) {
    this.presetColors = presetColors;
  }

  RGB parse(String color) {
    if ((color = presetColors.getOrDefault(color.toLowerCase(), color)).length() < 7) {
      color = color.replaceAll("((?i)[\\da-f])", "$1$1");
    }
    return new RGB(Integer.valueOf(color.substring(1, 3), 16), Integer.valueOf(color.substring(3, 5), 16), Integer.valueOf(color.substring(5), 16));
  }
}
-------------------------------------------------------------------------------
import java.util.Map;
import java.awt.Color;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {
      
      if(color.charAt(0)!='#')
        for(Map.Entry<String, String> entry : presetColors.entrySet())
           if(color.equalsIgnoreCase(entry.getKey()))
           {
              color = entry.getValue();
              break; 
           }
      if( (color.length()-1)%6 == 0 )
        return new RGB(Integer.parseInt(color.substring(1, 3), 16),
                       Integer.parseInt(color.substring(3, 5), 16),
                       Integer.parseInt(color.substring(5), 16));
      else
        return new RGB(Integer.parseInt(color.substring(1, 2) + color.substring(1, 2), 16),
                       Integer.parseInt(color.substring(2, 3) + color.substring(2, 3), 16),
                       Integer.parseInt(color.substring(3) + color.substring(3), 16));
      
    }
}
*/