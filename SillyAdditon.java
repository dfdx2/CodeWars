/* 7KYU CodeWars 16 + 18 = 214

For this kata you will have to forget how to add two numbers.

In simple terms, our method does not like the principle of carrying over numbers and just writes down every number it calculates :-)

You may assume both integers are positive integers.

Examples

    1  6         2  6
  + 1  8       + 3  9
---------    ---------
   2   14        5  15


    1  2  2       7  2
  +    8  1    +     9
-----------   ---------
    1 10  3       7  11

You may assume both integers are positive integers 
and the result will not be bigger than Integer.MAX_VALUE


*/
public class SillyAdditon {

  public static int add(int num1,int num2){
    StringBuilder sb = new StringBuilder();
    if (num1 == 0 && num2 == 0) {
      return 0;
    }
    while (num1 + num2 > 0) {
      int x = (num1 % 10) + (num2 % 10);
      String y = String.valueOf(x);
      sb.insert(0,y);
      num1 /= 10;
      num2 /= 10;
    }
    int z = Integer.parseInt(sb.toString());
    return z;
  }
}
/*-------------------------------------------------
public class SillyAdditon {

  public static int add(int x, int y) {
    int res = 0, m = 1;
    while (x != 0 || y != 0) {
      int s = x % 10 + y % 10;
      res += s * m;
      m *= s < 10 ? 10 : 100;
      x /= 10;
      y /= 10;
    }
    return res;
  }
}
---------------------------------------------------
class SillyAdditon
{
	static int add(int Q,int S)
	{
		var R = "";
		for (;0 < Q + S;Q /= 10,S /= 10) R = Q % 10 + S % 10 + R;
		return R.length() < 1 ? 0 : Integer.parseInt(R);
	}
}
---------------------------------------------------
public class SillyAdditon {

    public static int add(int num1,int num2){
        return num1 + num2 == 0 ? 0 : Integer.parseInt(add(num1 / 10, num2 / 10) + "" + (num1 % 10 + num2 % 10));
    }
}
---------------------------------------------------
public class SillyAdditon {

    public static int add(int num1,int num2){
               StringBuilder rst = new StringBuilder();
        char[] mas1 = String.valueOf(num1).toCharArray();
        char[] mas2 = String.valueOf(num2).toCharArray();
        int dif = mas1.length - mas2.length;
        int index1=0;
        int index2=0;

        for (int i = 0; i < Math.max(mas1.length, mas2.length); i++) {
            if (dif == 0) {
                rst.append(Character.getNumericValue(mas1[index1++]) + Character.getNumericValue(mas2[index2++]));
            } else if (dif > 0) {
                rst.append(mas1[i]);
                dif--;
                index1++;
            } else {
                rst.append(mas2[i]);
                dif++;
                index2++;
            }
        }
        return Integer.parseInt(rst.toString());
    }
}
---------------------------------------------------
public class SillyAdditon {

    public static int add(int num1, int num2){

        String s1 =  num1 > num2 ? String.valueOf(num1) :String.valueOf(num2);
        String s2 =  num1 < num2 ? String.valueOf(num1) :String.valueOf(num2);

        while(s2.length()<s1.length())
            s2 = "0"+s2;

        String sillyNumber ="";

        for(int i=s1.length()-1;i>=0;i--) {
          int num =  s1.charAt(i)+s2.charAt(i)-96;
          sillyNumber = num +sillyNumber;
        }
        return Integer.parseInt(sillyNumber);
    }
}
---------------------------------------------------
public class SillyAdditon {

    public static int add(int num1,int num2){
      if (num1 == num2 && num1 == 0) return 0;
        StringBuffer res = new StringBuffer("");
        while (num1 > 0 || num2 > 0) {
            res.insert(0, (num2 % 10 + num1 % 10));
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return Integer.parseInt(res.toString());
    }
}
---------------------------------------------------
public class SillyAdditon {

    public static int add(int a,int b){
        if(a == 0 & b == 0){
            return 0;
        }
        StringBuilder resultString = new StringBuilder();
        while (a > 0 || b > 0){
            int x = (a % 10) + (b % 10 );
            a = a / 10;
            b = b / 10;
            StringBuilder innerSB = new StringBuilder();
            resultString.append(innerSB.append(x).reverse().toString());
        }
        return Integer.parseInt(resultString.reverse().toString());
    }
}
---------------------------------------------------
public class SillyAdditon {

    public static int add(int num1,int num2){
       String firstNumberString = new StringBuilder().append(num1).reverse().toString();
        String secondNumberString = new StringBuilder().append(num2).reverse().toString();

        String[] resultArray;
        if (firstNumberString.length() > secondNumberString.length()) {
            resultArray = new String[firstNumberString.length()];
        } else {
            resultArray = new String[secondNumberString.length()];
        }
        for (int i = 0; i < resultArray.length; i++) {
            int addResult;
            if (i >= firstNumberString.length()) {
                addResult = Character.getNumericValue(secondNumberString.charAt(i));
            } else if (i >= secondNumberString.length()) {
                addResult = Character.getNumericValue(firstNumberString.charAt(i));
            } else {
                addResult = Character.getNumericValue(firstNumberString.charAt(i)) + Character.getNumericValue(secondNumberString.charAt(i));
            }
            resultArray[resultArray.length - i - 1] = String.valueOf(addResult);
        }
        return Integer.parseInt(String.join("", resultArray));
    }
}
*/