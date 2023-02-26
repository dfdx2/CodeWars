/* 7KYU CodeWars Growth Of A Population

In a small town the population is p0 = 1000 at the beginning of a year. 
The population regularly increases by 2 percent per year and moreover 50 
new inhabitants per year come to live in the town. How many years does the 
town need to see its population greater or equal to p = 1200 inhabitants?

At the end of the first year there will be: 
1000 + 1000 * 0.02 + 50 => 1070 inhabitants

At the end of the 2nd year there will be: 
1070 + 1070 * 0.02 + 50 => 1141 inhabitants 
(** number of inhabitants is an integer **)

At the end of the 3rd year there will be:
1141 + 1141 * 0.02 + 50 => 1213

It will need 3 entire years.
More generally given parameters:

p0, percent, aug (inhabitants coming or leaving each year), 
p (population to equal or surpass)

the function nb_year should return n number of entire years needed to get a 
population greater or equal to p.

aug is an integer, percent a positive or null floating number, p0 and p are 
positive integers (> 0)

*/

class Arge {
    
  public static int nbYear(int p0, double percent, int aug, int p) {
    int years = 0;
    int folks = p0;
    while (folks < p) {
      folks = (int)(folks + (folks * (float)(percent/100)) + aug);
      years++;
    }
    return years;
  }
}
/*---------------------------------------------------------------------------------------
class Arge {

    public static int nbYear(int population, double growthPercent, int newSettlers, int popToSurpass) {
        int numOfYears = 0;
        while (population < popToSurpass) {
            numOfYears++;
            population += population * growthPercent / 100 + newSettlers;
        }
        return numOfYears;
    }

}
-------------------------------------------------------------------------------------------
class Arge {
  static int nbYear(int p0, double percent, int aug, int p) {
    return p0 < p ? nbYear((int) (p0 * (percent / 100 + 1) + aug), percent, aug, p) + 1 : 0;
  }
}
-------------------------------------------------------------------------------------------
class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) 
    {
      percent*=0.01;
      int years=0;
      while(p0<p)
      {
        years++;
        p0+=p0*percent+aug;
      }
      return years;
    }
}
--------------------------------------------------------------------------------------------
class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int i = 1;
        double mult = 1 + percent / 100.0;
        double prev = p0;
        while (prev < p) {
            double ne = Math.floor(prev * mult + aug);
            prev = ne;
            i++;
        }
        return (i - 1);
    }
}

*/