// Implement an iterator
// Two methods: next(), hasNext()
// Given input that looks something like this:
// {1, {2, 3}, 4, 5}
// Write an iterator for this such that
// If you call next() five times, you get as output each time:

// hasNext() => true
// next() => 1
// hasNext() => true
// next() => 2
// hasNext() => true
// next() => 3
// hasNext() => true
// next() => 4
// hasNext() => true
// next() => 5
// hasNext() => false

// And if you call hasNext() before each of these calls, you get true.
// If you call hasNext() after next() returns 5, you get false.

public class iterator{
    
    ArrayList<Object> arr = new ArrayList<Object>(10);
    arr.add((int) 1);
    ArrayList<Integer> newarr = new ArrayList<Integer>();
    newarr.add(2);
    newarr.add(3);
    arr.add(newarr);
    arr.add(4);
    arr.add(5); 
     
    private int current = 0;
    private int size = arr.size();
    
    // Returns next int
    public Integer next() {
        return arr[current++];
    }
    
    public boolean hasNext() {
        return current < size && arr[current] != null;
    }
}
