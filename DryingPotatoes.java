/*  7KYU CodeWars Drying Potatoes

All we eat is water and dry matter.

Let us begin with an example:

John bought potatoes: their weight is 100 kilograms. Potatoes contain 
water and dry matter. The water content is 99 percent of the total weight. 
He thinks they are too wet and puts them in an oven - at low temperature - 
for them to lose some water.

At the output the water content is only 98%.

What is the total weight in kilograms (water content plus dry matter) 
coming out of the oven?

He finds 50 kilograms and he thinks he made a mistake: "So much weight 
lost for such a small change in water content!"

Can you help him?

Task

Write function potatoes with

int parameter p0 - initial percent of water-
int parameter w0 - initial weight -
int parameter p1 - final percent of water -
potatoesshould return the final weight coming out of the oven w1 truncated as an int.

Example:

potatoes(99, 100, 98) --> 50

*/
class DryingPotatoes {
    public static int potatoes(int p0, int w0, int p1) {
        return w0 * (100 - p0) / (100 - p1);
    }
}
/*--------------------------------------------------------------
class Potatoes {
    
    public static int potatoes(int p0, int w0, int p1) {
        return w0 * (100 - p0) / (100 - p1);
    }
}
----------------------------------------------------------------
class Potatoes {
    
    public static int potatoes(int p0, int w0, int p1) {
        return w0*(100-p0)/(100-p1);//works because 100% = 1 full potato, so subtract p0 and p1 from 100% and divide it to get the new "composition", which you will then multiply to the weight to get the new weight
}
}
----------------------------------------------------------------
class Potatoes {
    
    public static int potatoes(int p0, int w0, int p1) {
    return (int) (100 * ((float) (w0 * (100 - p0))/100) / (100 - p1));
    }
}
----------------------------------------------------------------
class Potatoes {
    
  public static int potatoes(int p0, int w0, int p1) {
        double waterBefore =(double) p0 / 100;
        double waterAfter =(double) p1 / 100;

        double dryPrecentage = (double)(100 - p1) / 100;
        double dryWeight =w0 - (double)w0 * waterBefore;
        double weight = dryWeight * waterAfter / dryPrecentage + dryWeight;
        System.out.println(weight);
        System.out.println((int) weight);
        if (weight % 1 >= 0.99) {
            return (int) Math.round(weight);
        } else {
            return (int) weight;
        }
    }
  
  }
----------------------------------------------------------------
class Potatoes {
  public static int potatoes(int p0, int w0, int p1) {
    int matter = w0 * (100 - p0);
    return matter / (100 - p1);
  }
}
----------------------------------------------------------------
import java.math.BigDecimal;
class Potatoes {
    
    public static int potatoes(int p0, int w0, int p1) {
        double dry = ((double)w0/100) * (100 - p0);
        return BigDecimal.valueOf(((dry * p1) / (100 - p1)) + dry).setScale(2,BigDecimal.ROUND_HALF_UP).intValue();
    }
}

*/