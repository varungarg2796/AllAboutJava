public class LinkedList{
    private int val;
    private Integer next;
    public LinkedList(int val){
        System.out.println(val);
        this.val=val;
        this.next=null;
    }
    public static void main(String[] args){
        LinkedList node = new LinkedList(100);
        SinglyLinkedList list = new SinglyLinkedList();
    }
}

class SinglyLinkedList{
    public Integer head;
    public Integer tail;
    public int length;
    public SinglyLinkedList(){
        System.out.println("LOL");
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
}