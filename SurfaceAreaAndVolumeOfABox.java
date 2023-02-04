/* 8KYU CodeWars Surface Area and Volume Of A Box

Write a function that returns the total surface area 
and volume of a box as an array: [area, volume]

*/

public class Kata {
    public static int[] getSize(int w,int h,int d) {
        //To-Do
      int area = 2 * ((d * w) +(d * h) + (w * h));
      int volume = w * h * d;
      int[] result = new int[2];
      result[0] = area;
      result[1] = volume;
      return result;
    }
}
/*----------------------------------------------------------------------------------
public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int surfaceArea = 2 * (w * h + h * d + w * d);
        int volume = w * h * d;
        return new int[] {surfaceArea, volume};
    }
}
-------------------------------------------------------------------------------------
public class Kata {
    public static int[] getSize(int w,int h,int d) {
        return new int[] {2*(w*h + h*d + d*w), w*h*d};
    }
}
-----------------------------------------------------------------------------------




*/
