/* 6KYU CodeWars The Supermarket Queue

There is a queue for the self-checkout tills at the supermarket. 
Your task is write a function to calculate the total time required 
for all the customers to check out!

input

customers: an array of positive integers representing the queue. Each 
integer represents a customer, and its value is the amount of time they 
require to check out.

n: a positive integer, the number of checkout tills.

output

The function should return an integer, the total time required.

Important

Please look at the examples and clarifications below, to ensure you 
understand the task correctly :)

Examples

queueTime([5,3,4], 1)

// should return 12

// because when there is 1 till, the total time is just the sum of the times

queueTime([10,2,3,3], 2)

// should return 10

// because here n=2 and the 2nd, 3rd, and 4th people in the 

// queue finish before the 1st person has finished.

queueTime([2,3,10], 2)

// should return 12

Clarifications

There is only ONE queue serving many tills, and
The order of the queue NEVER changes, and
The front person in the queue (i.e. the first element in the array/list) 
proceeds to a till as soon as it becomes free.
N.B. You should assume that all the test input will be valid, as 
specified above.

P.S. The situation in this kata can be likened to the 
more-computer-science-related idea of a thread pool, with relation 
to running multiple processes at the same time: 

https://en.wikipedia.org/wiki/Thread_pool

*/
import java.util.Arrays;
import java.util.PriorityQueue;
import static java.util.Collections.nCopies;
public class TheSuperMarketQueue {

    public static int SuperMarketQueue(int[] customers, int n) {
      PriorityQueue<Integer> map = new PriorityQueue<>(nCopies(n,0));
      for (int i = 0; i < customers.length; i++) {
        map.add(map.remove() + customers[i]);
      }
      return map.stream().max(Integer::compareTo).orElse(0);
    }   
}
/*---------------------------------------------------------------------
import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
      int[] result = new int[n];
		  for(int i = 0; i < customers.length; i++){
	    	result[0] += customers[i];
	    	Arrays.sort(result);
	    }
		  return result[n-1];
    }
    
}
------------------------------------------------------------------------
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    for (int i = 0; i < n; i++)
      q.add(0);
    for (int t : customers)
      q.add(q.remove() + t);
    return Collections.max(q);
  }
    
}
-----------------------------------------------------------------------
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    private static List<Integer> tills;
    private static int time;
    private static List<Integer> queue;

    public static int solveSuperMarketQueue(int[] customers, int n) {
        initialize(customers, n);
        while(anyCustomersLeft()) {
            assignCustomersToAllFreeTills();
            progressTime();
        }
        while(anyTillHasCustomer()){
            progressTime();
        }
        return time;
    }

    private static void initialize(int[] customers, int n){
        tills = new ArrayList<>(Collections.nCopies(n, 0));
        queue = new ArrayList<>();
        IntStream.range(0, customers.length).forEach(i -> queue.add(customers[i]));
        time = 0;
    }
    
    private static void assignCustomersToAllFreeTills(){
        OptionalInt freeTill = findFreeTill();
        while(anyCustomersLeft() && freeTill.isPresent()){
            assignNextCustomerToTill(freeTill.getAsInt());
            freeTill = findFreeTill();
        }
    }

    private static boolean anyCustomersLeft(){
        return !queue.isEmpty();
    }

    private static OptionalInt findFreeTill(){
        return IntStream.range(0, tills.size()).filter(i -> tills.get(i) == 0).findFirst();
    }

    private static void assignNextCustomerToTill(int tillNumber){
        tills.set(tillNumber, queue.get(0));
        queue.remove(0);
    }

    private static void progressTime(){
        IntStream.range(0, tills.size()).filter(till -> isTillNotEmpty(till)).forEach(till -> decreaseTillTime(till));
        time++;
    }

    private static boolean isTillNotEmpty(int tillNumber){
        return tills.get(tillNumber) != 0;
    }

    private static void decreaseTillTime(int tillNumber){
        tills.set(tillNumber, tills.get(tillNumber) - 1);
    }

    private static boolean anyTillHasCustomer(){
        return tills.stream().anyMatch(i -> i!=0);
    }
}
-----------------------------------------------------------------------
import java.util.*;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
      if (customers.length == 0)
        return 0;
      
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      for (int i = 0; i < customers.length && i < n; i++)
        pq.offer(customers[i]);
      
      for (int i = n; i < customers.length; i++)
        pq.offer(pq.poll() + customers[i]);
        
      while (pq.size() != 1) 
        pq.poll();
      
      return pq.poll();
    }
    
}
-------------------------------------------------------------------------
import java.util.*;
public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.nCopies(n, 0));
        for (int customer : customers) queue.add(queue.poll() + customer);
        return Collections.max(queue);
    }
    
}
------------------------------------------------------------------------
import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
      int[] registers = new int[n];
      for(int i : customers) {
        registers[smallestIndex(registers)] += i;
      }
      return registers[biggestIndex(registers)];
    }
    
    public static int smallestIndex(int[] arr) {
      int smallestIndex = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[smallestIndex] > arr[i])
          smallestIndex = i;
      }
      return smallestIndex;
    }
    
    public static int biggestIndex(int[] arr) {
      int biggestIndex = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[biggestIndex] < arr[i])
          biggestIndex = i;
      }
      return biggestIndex;
    }
    
}
*/