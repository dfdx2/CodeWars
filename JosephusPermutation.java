/*     5KYU Josephus Permutation
This problem takes its name by arguably the most important event in the life 
of the ancient historian Josephus: according to his tale, he and his 40 soldiers 
were trapped in a cave by the Romans during a siege.
Refusing to surrender to the enemy, they instead opted for mass suicide, 
with a twist: they formed a circle and proceeded to kill one man every three, 
until one last man was left (and that it was supposed to kill himself to end the act).
Well, Josephus and another man were the last two and, as we now know every detail 
of the story, you may have correctly guessed that they didn't exactly follow through 
the original idea.
You are now to create a function that returns a Josephus permutation, 
taking as parameters the initial array/list of items to be permuted as if they 
were in a circle and counted out every k places until none remained.

Tips and notes: it helps to start counting from 1 up to n, instead of the 
usual range 0..n-1; k will always be >=1.

For example, with n=7 and k=3 josephus(7,3) should act this way.

[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out and goes into the result [3]
[1,2,4,5,7] => 6 is counted out and goes into the result [3,6]
[1,4,5,7] => 2 is counted out and goes into the result [3,6,2]
[1,4,5] => 7 is counted out and goes into the result [3,6,2,7]
[1,4] => 5 is counted out and goes into the result [3,6,2,7,5]
[4] => 1 is counted out and goes into the result [3,6,2,7,5,1]
[] => 4 is counted out and goes into the result [3,6,2,7,5,1,4]

So our final result is:
josephus([1,2,3,4,5,6,7],3)==[3,6,2,7,5,1,4]
*/
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
    List<T> result = new ArrayList<>();
    int index = k - 1;
    while (items.size() > 0) {
      index %= items.size();
      result.add(items.remove(index));
      index += k - 1;
    }
    return result;
  }
}
/*-------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Josephus {
  public static Collection<Object> josephusPermutation(final List<Object> items, final int k) {
    Collection<Object> permutation = new ArrayList<Object>();
    int position = 0;
    while(items.size() > 0) {
      position = (position + k - 1) % items.size();
      permutation.add(items.remove((int) position));
    }
    return permutation;
  }
}
-----------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Iterator;

public class Josephus {
  public static <T> List<T> josephusPermutation(List<T> items, int k) {
    List<T> permutation = new ArrayList<T>(items.size());
    CircularIterator<T> iterator = new CircularIterator<>(new LinkedList<T>(items));
    while (iterator.hasNext()) {
      iterator.skip(k - 1);
      permutation.add(iterator.next());
      iterator.remove();
    }
    return permutation;
  }

  static class CircularIterator<T> implements Iterator<T> {
    private final List<T> list;
    private Iterator<T> iterator;

    CircularIterator(List<T> list) {
      this.list = list;
      this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
      return !list.isEmpty();
    }

    @Override
    public T next() {
      if (!iterator.hasNext()) {
        iterator = list.iterator();
      }
      return iterator.next();
    }
    
    public void skip(int n) {
      while (--n >= 0 && hasNext()) {
        next();
      }
    }

    @Override
    public void remove() {
      iterator.remove();
    }
  }
}
-------------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
    int current = 0;
    List<T> answer= new ArrayList<T>();
    while (items.size() > 0) {
      current = (current-1+k)%items.size();
      answer.add(items.remove(current));
      }
    return answer;
  }
}
--------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        JosephusList<T> josephus = JosephusList.create(items);
        List<T> result = new ArrayList<>();
        while(!josephus.isEmpty()){
            josephus.movePosition(k);
            result.add(josephus.executeCurrent());
        }

        return result;
    }
}

class JosephusList<T> {
    private class JosephusNode<T>{
        T value;
        JosephusNode next;
        JosephusNode previous;

        JosephusNode(T value){
            this.value = value;
            next = null;
            previous = null;
        }
    }

    private JosephusNode<T> start;
    private JosephusNode<T> end;
    private int size;
    private JosephusNode<T> currentPosition;

    private JosephusList() {
        this.start = null;
        this.end = null;
    }

    private void addNode(T value){
        addNode(new JosephusNode<>(value));
    }

    private void addNode(JosephusNode<T> node){
        if(start == null){
            start = node;
            end = node;
            start.next = start;
            start.previous = start;
        }
        else{
            end.next = node;
            node.next = start;
            node.previous = end;
            start.previous = node;
            end = node;
        }

        size++;
    }

    public void movePosition(int numberOfMoves){
        for(int i=0; i<numberOfMoves; i++){
            currentPosition = currentPosition.next;
        }
    }

    public T executeCurrent(){
        if(isEmpty())
            throw new IllegalArgumentException();

        JosephusNode<T> deadNode = currentPosition;
        deadNode.previous.next = deadNode.next;
        deadNode.next.previous = deadNode.previous;
        currentPosition = deadNode.previous;
        size--;

        return deadNode.value;
    }

    public boolean isEmpty(){
        return size <= 0;
    }

    public static <T> JosephusList<T> create(List<T> values){
        JosephusList<T> josephusList = new JosephusList<>();
        for(int i=0; i<values.size(); i++){
            josephusList.addNode(values.get(i));
        }
        josephusList.currentPosition = josephusList.end;
        return josephusList;
    }
}



*/