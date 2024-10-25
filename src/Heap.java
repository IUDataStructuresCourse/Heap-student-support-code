import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * The keys in the heap must be stored in an array.
 * 
 * There may be duplicate keys in the heap.
 * 
 * The constructor takes an argument that specifies how objects in the 
 * heap are to be compared. This argument is a java.util.Comparator, 
 * which has a compare() method that has the same signature and behavior 
 * as the compareTo() method found in the Comparable interface. 
 * 
 * Here are some examples of a Comparator<String>:
 *    (s, t) -> s.compareTo(t);
 *    (s, t) -> t.length() - s.length();
 *    (s, t) -> t.toLowerCase().compareTo(s.toLowerCase());
 *    (s, t) -> s.length() <= 3 ? -1 : 1;  
 */

public class Heap<E> implements PriorityQueue<E> {
  private List<E> keys;
  private Comparator<E> comparator;
  
  /**
   * Creates a heap whose elements are prioritized by the comparator.
   */
  public Heap(Comparator<E> comparator) {
    /* TODO: Your Code Here */
    return 0;
  }

  /**
   * Returns the comparator on which the keys in this heap are prioritized.
   */
  public Comparator<E> comparator() {
    return comparator;
  }

  /**
   * Returns the top of this heap. This will be the highest priority key. 
   * @throws NoSuchElementException if the heap is empty.
   */
  public E peek() {
    /* TODO: Your Code Here */
    return 0;
  }

  /**
   * Inserts the given key into this heap.
   */
  public void insert(E key) {
    /* TODO: Your Code Here */
    return;
  }

  /**
   * Removes and returns the highest priority key in this heap.
   * @throws NoSuchElementException if the heap is empty.
   */
  public E delete() {
    /* TODO: Your Code Here */
    return 0;
  }

  /**
   * Exchanges the elements in the heap at the given indices in keys.
   */
  public void swap(int i, int j) {
    /* TODO: Your Code Here */
    return;
  }
  
  /**
   * Returns the number of keys in this heap.
   */
  public int size() {
    /* TODO: Your Code Here */
    return 0;
  }

  /**
   * Returns a textual representation of this heap.
   */
  public String toString() {
    return keys.toString();
  }
  
  /**
   * Returns the index of the left child of p.
   */
  public static int getLeft(int p) {
    /* TODO: Your Code Here */
    return 0;
  }

  /**
   * Returns the index of the right child of p.
   */
  public static int getRight(int p) {
    /* TODO: Your Code Here */
    return 0;
  }

  /**
   * Returns the index of the parent of p.
   */
  public static int getParent(int p) {
    /* TODO: Your Code Here */
    return 0;
  }
}
