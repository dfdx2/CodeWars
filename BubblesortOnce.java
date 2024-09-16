/* 7KYU CodeWars Bubblesort Once

Overview

Bubblesort is an inefficient sorting algorithm that is simple to 
understand and therefore often taught in introductory computer 
science courses as an example how not to sort a list. Nevertheless, 
it is correct in the sense that it eventually produces a sorted 
version of the original list when executed to completion.

At the heart of Bubblesort is what is known as a pass. Let's look 
at an example at how a pass works.

Consider the following list:

9, 7, 5, 3, 1, 2, 4, 6, 8
We initiate a pass by comparing the first two elements of the list. 
Is the first element greater than the second? If so, we swap the two 
elements. Since 9 is greater than 7 in this case, we swap them to 
give 7, 9. The list then becomes:

7, 9, 5, 3, 1, 2, 4, 6, 8
We then continue the process for the 2nd and 3rd elements, 3rd and 
4th elements ... all the way up to the last two elements. When the 
pass is complete, our list becomes:

7, 5, 3, 1, 2, 4, 6, 8, 9
Notice that the largest value 9 "bubbled up" to the end of the list. 
This is precisely how Bubblesort got its name.

Task

Given an array of integers, your function bubblesortOnce/bubblesort_once/BubblesortOnce 
(or equivalent, depending on your language's naming conventions) should return a new 
array equivalent to performing exactly 1 complete pass on the original array. Your 
function should be pure, i.e. it should not mutate the input array.

*/

public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array) {
    int[] array1 = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      array1[i] = array[i];
    }
    for (int i = 0; i < array1.length - 1; i++) {
      if (array1[i] > array1[i + 1]) {
        array1[i] += array1[i + 1];
        array1[i + 1] = array1[i] - array1[i + 1];
        array1[i] -= array1[i + 1];
      }
    }
    return array1;
  }
}
/*----------------------------------------------------------------------
public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array) {
   int[] newInt = array.clone();
        for (int i = 0; i < newInt.length - 1 ; i++) {
            if (newInt[i] > newInt[i+1]) {
                int temp = newInt[i];
                newInt[i] = newInt[i+1];
                newInt[i+1] = temp;
            }
        }
        return newInt;
  }
}
------------------------------------------------------------------------
import java.util.Arrays;
public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array) {
    int[] out = new int[array.length];
    System.arraycopy(array,0,out,0,array.length);
    
    for(int i = 0; i < 1; i++){
      for(int j = 1; j < out.length; j++) {
        if (out[j-1] > out[j]){
          int temp = out[j];
          out[j] = out[j-1];
          out[j-1] = temp;
        }
      }
    }
    
    return out;
  }
}
------------------------------------------------------------------------
public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array) {
        int[] out = new int[array.length];

        for (int i=0; i< array.length; i++) {
            out[i] = array[i];
        }

        for (int i=0; i< out.length-1; i++){
            int a = out[i], b = array[i+1];
            if (a>b){
                out[i] = b;
                out[i+1] = a;
            }
        }
        return out;
  }
}
------------------------------------------------------------------------
import java.util.Arrays;


public class BubblesortOnce {
    public static int[] bubbleSortOnce(int[] array) {
        var arrCpy = Arrays.copyOf(array,array.length);
        
        for (int i = 0; i < arrCpy.length-1; i++) {
            if(arrCpy[i] > arrCpy[i+1]){
                var temp = arrCpy[i];
                arrCpy[i] = arrCpy[i+1];
                arrCpy[i+1] = temp;
            }
        }

        return arrCpy;

    }
}
------------------------------------------------------------------------
public class BubblesortOnce {

  public static int[] bubbleSortOnce(int[] array) {
    int[] sortedArray = array.clone();

    for (int i = 0; i < sortedArray.length - 1; i++) {
      if (sortedArray[i] > sortedArray[i + 1]) {
   
        int temp = sortedArray[i];
        sortedArray[i] = sortedArray[i + 1];
        sortedArray[i + 1] = temp;
      }
    }

    return sortedArray;
  }

  public static void main(String[] args) {
    int[] array = {9, 7, 5, 3, 1, 2, 4, 6, 8};

    int[] result = bubbleSortOnce(array);

    System.out.println("Array após uma passagem de Bubble Sort:");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}

------------------------------------------------------------------------
public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array) {
    if (array.length==0)return array;
    int[] a=new int[array.length];
    int temp=array[0];
    for (int i=1;i<array.length;i++){
      if (temp<array[i]){
        a[i-1]=temp;
        temp=array[i];
      }
      else{
        a[i-1]=array[i];
      }
    }
    a[a.length-1]=temp;
    return a;
  }
}
------------------------------------------------------------------------
public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array){
    if(array ==null || array.length<=1){
      return array;
    }
    
    int[] newInt = array.clone();
  

  for(int i=0; i<newInt.length-1; i++ ){
      if(newInt[i]>newInt[i+1]){
        // tausche  die Elemente
        int temp = newInt[i];
        newInt[i]= newInt[i+1];
        newInt[i+1] = temp;
         //boolean swapped = true;
      }
      
  }
     
    return newInt;
  }
}
------------------------------------------------------------------------
import java.util.Arrays;

public class BubblesortOnce {
  public static int[] bubbleSortOnce(int[] array) {
    int[] result = Arrays.copyOf(array, array.length);
    
    for (int i = 0; i < result.length - 1; i++) {
            if (result[i] > result[i + 1]) {
                int temp = result[i];
                result[i] = result[i + 1];
                result[i + 1] = temp;
            }
        }
    return result;
  }
}

*/