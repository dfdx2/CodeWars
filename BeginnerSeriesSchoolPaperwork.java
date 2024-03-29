/*  8KYU CodeWars Beginner Series #1 School Paperwork

Your classmates asked you to copy some paperwork for them. 
You know that there are 'n' classmates and the paperwork has 'm' pages.
Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

Example:
n= 5, m=5: 25
n=-5, m=5:  0
Waiting for translations and Feedback! Thanks!

*/
public class Paper
{
  public static int paperWork(int n, int m) 
  {
    
    return (m < 0 || n < 0) ? 0 : m * n;
  }
}


/*-----------------------------------------------------------------
public class Paper
{
  public static int paperWork(int n, int m) 
  {
    if (n < 0 || m < 0) {
      return 0;
    }
    else {
      return n * m;
    }
  }
}
------------------------------------------------------------------- 
public class Paper
{
  public static int paperWork(int n, int m) 
  {
    return (n < 0) || (m < 0) ? 0 : n * m;
    //Happy Coding! ^_^
  }
}
----------------------------------------------------------------

import static java.lang.Math.max;

public class Paper {

  public static int paperWork(int n, int m) {
    return max(m, 0) * max(n, 0);
  }

}
----------------------------------------------------------------

public class Paper
{
  public static int paperWork(int n, int m) 
  {
    return n>0&&m>0 ? m*n : 0;
  }
}
----------------------------------------------------------------



*/