public class Kata {

  public int min(int[] list) {
    int i;
    int minimum = list[0];
    for (i=1; i < list.length; i++)
      if (list[i] < minimum) {
        minimum = list[i];
      }
    
    return minimum;
  }
  
  public int max(int[] list) {
    int a;
    int maximum = list[0];
    for (a = 1; a < list.length; a++) 
      if (list[a] > maximum) {
       maximum = list[a];
      }
    return maximum;
  }
}