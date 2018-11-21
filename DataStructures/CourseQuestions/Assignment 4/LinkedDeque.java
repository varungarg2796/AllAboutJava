

public class LinkedDeque<E> implements Deque<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;
    
    private class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;
        
        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
    
    public LinkedDeque() {
        first = new Node<E>(null, null, null);
        last = new Node<E>(null, first, null);
        first.next = last;
        size = 0;
    }
    
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is full!");
        }
        
        return first.next.element;
    }

    public E getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is full!");
        }
        
        return last.prev.element;
    }

    public void addFirst(E element) {
        Node<E> node = new Node<E>(element, first.next, first);
        first.next.prev = node;
        first.next = node;
        size++;
    }

    public void addLast(E element) {
        Node<E> node = new Node<E>(element, last, last.prev);
        last.prev.next = node;
        last.prev = node;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is full!");
        }
        
        E temp = first.next.element;
        first.next.next.prev = first;
        first.next = first.next.next;
        size--;
        return temp;
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is full!");
        }
        
        E temp = last.prev.element;
        last.prev.prev.next = last;
        last.prev = last.prev.prev;
        size--;
        return temp;
    }
    
    public String toString() {

        String output = "";
        Node node = first.next;
        
        while (node.element != null) {

            output = node.element + " " + output;
            node = node.next;
        }
        return "" + size + "\t" + output;
    }
    public static void main(String[] args) {
    	LinkedDeque<String> a = new LinkedDeque<>();
    	
    	a.addFirst("100");
    	a.addFirst("101");
    	
    	//System.out.println(a.removeFirst());
    	System.out.println(a);
        
    }
}
