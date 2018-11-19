import java.util.EmptyStackException;

public class ArrayStack {
    private Object[] arr;
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object toBePopped = arr[size - 1];
        arr[--size] = null;
        return toBePopped;
    }

    public ArrayStack() {
        arr = new Object[1000];
    }

    public void push(Object item) {
        if (size == arr.length) {
            throw new StackOverflowError();
        }
        arr[size++] = item;
    }

    public Object top() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return arr[size - 1];
    }

    public int size() {
        return size;
    }

    public String toString() {
        int i = 0;
        String output = "";
        while (i < size) {
            output += arr[i] + " ";
            i++;
        }
        return "" + size + "\t" + output;
    }

    public static void main(String[] args) {
        ArrayStack s = new ArrayStack();
        System.out.println(s);
        s.push("A");
        System.out.println(s);
        s.push("B");
        System.out.println(s);
        s.push("C");
        System.out.println(s);
    }
}