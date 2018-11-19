import java.util.NoSuchElementException;

public class ArrayStack {
    private Object[] array;
    private int size = 0;

    public ArrayStack() {
        array = new Object[1000];
    }

    public void push(Object item) {
        if (size == array.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        array[size++] = item;
    }

    public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
        Object result = array[size-1];
        array[--size] = null;
        return result;
    }

    public Object top() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek into empty stack");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        int i = 0;
        String output = "";
        while(i<size){
            output +=  array[i] + " " ;
            i++;
        }
        return "" + size + "\t" + output;
        }

    public static void main(String[] args) {
        ArrayStack s = new ArrayStack();
        System.out.println(s);
        s.push("a");
        System.out.println(s);
        s.push("b");
        System.out.println(s);
        s.push("c");
        System.out.println(s);
    }
}