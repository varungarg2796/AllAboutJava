import java.util.EmptyStackException;

public class PCQ3A {
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

    public PCQ3A() {
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
        PCQ3A s = new PCQ3A();
        System.out.println(s);
        s.push("Ireland");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push("England");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push("Wales");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push("Scotland");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push("France");
        System.out.println(s);
        s.push("Germany");
        System.out.println(s);
    }
}