/* A format for expressing an ordered list of integers is to use a comma separated list of either
   individual integers or a range of integers denoted by the starting integer separated from the 
   end integer in the range by a dash, '-'. The range includes all integers in the interval 
   including both endpoints. It is not considered a range unless it spans at least 3 numbers. 
   For example "12,13,15-17"  Complete the solution so that it takes a list of integers in 
   increasing order and returns a correctly formatted string in the range format.
*/

class RangeExtraction {
		public static String rangeExtraction(int[] arr) {
    		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) j++;
            if (i + 1 < j) {
                i = j;
                sb.append("-");
                sb.append(arr[i]);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}