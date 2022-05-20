public class CalculateAverage{
  public static double find_average(int[] array){
    
    double sum = 0;
    double avg = 0;

    // add up all the elememts in the array with a for loop

    for(int i=0; i<array.length; i++){
      // store the added up elements in the sum variable
      sum += array[i];
    }

    // Sum / number of elements
    avg = sum/array.length;

    return avg;
  }
}