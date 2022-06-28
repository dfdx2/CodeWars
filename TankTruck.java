/*
To introduce the problem think to my neighbor who drives a tanker truck. 
The level indicator is down and he is worried because he does not know 
if he will be able to make deliveries. We put the truck on a horizontal 
ground and measured the height of the liquid in the tank.
Fortunately the tank is a perfect cylinder and the vertical walls on 
each end are flat. The height of the remaining liquid is h, 
the diameter of the cylinder base is d, the total volume is vt (h, d, vt are 
positive or null integers). You can assume that h <= d.
Could you calculate the remaining volume of the liquid? Your function tankvol(h, d, vt) 
returns an integer which is the truncated result (e.g floor) of your float calculation.

Examples :

tankvol(40,120,3500) should return 1021 (calculation gives about: 1021.26992027)

tankvol(60,120,3500) should return 1750

tankvol(80,120,3500) should return 2478 (calculation gives about: 2478.73007973)
*/

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double radius = (double) d / 2;
        if (h == radius) {
            return vt / 2;
        }

        double deep = vt / (Math.PI * radius * radius);
        double height = h > radius ? radius - (d - h) : radius - h;
        double side = Math.sqrt(Math.pow(radius, 2) - Math.pow(height, 2));
        double theta = Math.toDegrees(Math.acos(height / radius));
        double remainVol = (360 - 2 * theta) / 360 * vt + side * height * deep;
        return (int) Math.floor(h > radius ? remainVol : vt - remainVol);
    }
}

/*
public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double cos = 1.0 - 2.0 * h / d;
        double theta = Math.acos(cos);
        return (int) (vt * (theta - Math.sin(theta) * cos) / Math.PI);
    }
}
__________________________________________________________________________________

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        if (h == 0) return 0;
        // radius
        double hh = (double)h;
        double r = d / 2.0;
        if (hh == r) return vt / 2;
        if (hh == d) return vt;
        // height > radius, calculate with d - h and at the end change the volume
        boolean hilevel = false;
        if (hh > r)
        {
            h = d - h;
            hilevel = true;
        }
        // total area of circle
        double st = Math.PI * r * r;
        // half angle from the center
        double theta = Math.acos((r - h) / r);
        // b = sqrt(r * r - (r - h) ** 2) one side of the right triangle
        double sr = (r - h) * Math.sqrt(r * r - (r - h) * (r - h));
        // area corresponding to angle 2 * theta
        double sa = st / Math.PI * theta;
        // surface corresponding to the height
        double sh = sa - sr;
        // volume to find corresponding to surface of liquid / total surface
        double v = vt * sh / st;
        // if height > radius
        if (hilevel)
            v = vt - v;
        return (int)Math.floor(v);
    }
}
____________________________________________________________________________________________

public class VolTank {
  public static int tankVol(int h, int d, int vt) {
    var R = d / 2.0;
    var H = vt * 4 / (Math.PI * (d * d));
    var M = (h > R) ? 2*R-h : h;
    var Ssect = Math.acos((R-M)/R)*R*R;
    var sideX = 2*Math.sqrt(R*R-(R-M)*(R-M));
    var p = (R+R+sideX)/2;
    var Stri = Math.sqrt(p*(p-R)*(p-R)*(p-sideX));
    var Sx = Ssect - Stri;
    var Vtemp = (M != h) ? vt - Sx*H : Sx*H;
    return (int) Vtemp;
  }
}
____________________________________________________________________________________________
import java.lang.Math;

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
      double r = (double) d/2;
      return (int) ((vt / (Math.PI)) * (Math.acos((r-h)/r) - (r-h) * Math.sqrt(d*h - Math.pow(h,2)) / Math.pow(r,2)));
    }
}
_______________________________________________________________________________________

*/
