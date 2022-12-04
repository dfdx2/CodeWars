/* 8KYU CodeWars Basic Variable Assignment

This code should store "codewa.rs" as a variable 
called name but it's not working. 
Can you figure out why?

*/

public class Kata {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;
}
/*----------------------------------------------------------------
public class Kata {
    public static String name = "codewa.rs";
}
------------------------------------------------------------------
public class Kata {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a.concat(b);
}
------------------------------------------------------------------
public class Kata {
    public static String name = new String(new char[]{0x63,0x6f,0x64,0x65,0x77,0x61,0x2e,0x72,0x73}).intern();
}
-------------------------------------------------------------------
public class Kata {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;
  public Kata(String a,String b,String name){
    this.a="code";
    this.b="wa.rs";
    this.name=this.a +this.b;
  }
}
-----------------------------------------------------------------


*/