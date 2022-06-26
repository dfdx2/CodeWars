/*
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements 
to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]

snail(array) #=> [1,2,3,6,9,8,7,4,5]

For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]

snail(array) #=> [1,2,3,4,5,6,7,8,9]

This image will illustrate things more clearly:


NOTE: The idea is not sort the elements from the lowest value to the highest; 
the idea is to traverse the 2-d array in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
*/




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Snail {

    public static int[] snail(int[][] array) {
    if (array[0].length == 0)
            return array[0];
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.stream(array[0]).boxed().collect(Collectors.toList()));
        int[][] next = array;
        while (next != null && next.length > 1) {
            next = copyNext(next);
            if (next != null) {
                next = rotateCounterClockwise(next);
                list.add(Arrays.stream(next[0]).boxed().collect(Collectors.toList()));
            }
        }
        return list.stream().flatMap(List::stream).mapToInt(i -> i).toArray();
    }

    private static int[][] copyNext(int[][] array) {
        if (array.length == 1)
            return null;
        int[][] newArray = new int[array.length - 1][array[0].length];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[i - 1][j] = array[i][j];
            }
        }
        return newArray;
    }

    private static int[][] rotateCounterClockwise(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i][j] = array[j][Math.abs(i - (array[0].length - 1))];
            }
        }
        return newArray;
    }

}