public class LinkedStack {
    public class Node {
        Object element;
        Node next;

        public Node(Object element) {
            this.element = element;
        }

        public String toString() {
            return element.toString();
        }
    }

    int size;
    Node top;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(Object o) {
        Node node = new Node(o);
        node.next = top;
        top = node;
        size++;
      
    }

    public Object pop() {
            Object tobePopped = null;
            tobePopped = top.element;
            top = top.next;
            size--;
            return tobePopped;
    }

    public Object top() {
        return top;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size < 0);
    }

    // state visualisation
    public String toString() {
        
     String output = "";
     Node node = top;
     while (node != null) {
        
     output = node.element.toString() +" " + output;
     node = node.next;
     }
     return "" + size + "\t" + output;
    }

    public static void main(String[] args) {
         LinkedStack s = new LinkedStack();
        //  stack.push("Hey");
        //  System.out.println(stack.toString());
        //  stack.push("Ho");
        //  System.out.println(stack.toString());
        //  stack.pop();
        //  System.out.println(stack.toString());
         
         //ArrayStack s = new ArrayStack();
         System.out.println(s);
         s.push("A");
         System.out.println(s);
         s.push("B");
         System.out.println(s);
         s.push("C");
         System.out.println(s);
         //stack.toString();
    }
}