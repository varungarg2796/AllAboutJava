

public class ArrayQueue<E>{
    int first = -1;
    int last = -1;
    E[] arr;
    int size;

    public ArrayQueue(int size) {
        this.size = size;
        arr = (E[])new Object[size];
    }
    
    public int size() {
    	return size;
    }

    public boolean isEmpty() {
        return first == -1 && last == -1;
    }

    public boolean isFull() {
        return last + 1 == first;
    }

    public void enqueue(E el) {
        if(isFull()) {
            throw new IllegalStateException("Queue is full!");
        }
        if(isEmpty()){
            first = last = 0;
        } else {
            last = last + 1;
        }
        arr[last] = el;
    }

    

    public E front(){
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty!!!");
        }
        return arr[first];
    }

    public E rear(){
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty!!!");
        }
        return arr[last];
    }
    
    public E dequeue() {
        E temp;
        if(isEmpty()) {
            throw new IllegalStateException("Queue is full.");
        }
        if(first == last) {
            temp = arr[first];
            first = last = -1;
        } else {
            temp = arr[first];
            first = first +1;
        }
        return temp;
    }

    public String toString() {
        int count = last - first + 1;
        String toPrint = "[";
        for(int i = 0; i <count; i++) {
            int index = first + i;
            toPrint +=   arr[index] + "," ;
        }
        return toPrint + "]";
    }

    public static void main(String[] args) {
    	ArrayQueue<String> a = new ArrayQueue<>(1000);
        a.enqueue("H");
        System.out.println(a);
        a.enqueue("He");
        System.out.println(a);
        a.enqueue("Hey");
        System.out.println(a);
        a.enqueue("Hey1");
        System.out.println(a);
        System.out.println(a.dequeue());
        System.out.println(a);  	
    }

}