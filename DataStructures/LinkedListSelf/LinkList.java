class Node{
    Node next;
    int data;
}

public class LinkList{

    Node head;


    public void add(int data){
        //Create the new node and add data
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //https://www.geeksforgeeks.org/reverse-a-linked-list/
    public void reverse() { 
        // 1 -> 2 ->3 -> 4 - > 5
        Node prev = null; 
        Node current = head;  //current = 1
        Node next = null; 
        while (current != null) { 
            next = current.next; // next = 2
            current.next = prev;  // null <- 1
            prev = current;  // prev <- 1
            current = next;  // current =2 
        } 
        head = prev; 
    } 
    public void display (){

        //Initialise a temp node to head and traverse
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        }

        Node temp = head;
        Node previousNode = head;

        for(int i = 0; i<index; i++){
            previousNode = temp;
            temp = temp.next;
        }
        System.out.println("Node to be deleted " + temp.next.data);
        previousNode.next = temp.next;
        //temp.next = previousNode.next;
        System.out.println(previousNode.data);

    }

    public void deleteByVal(int val){

        if(head.data == val){
            head = head.next;
        }else{

            Node temp = head;
            Node previousNode = head;
            
            while(temp.data!= val){
                previousNode = temp;
                temp = temp.next;
            }
            previousNode.next = temp.next;
        }
    }
    public static void main(String[] args){
        LinkList list = new LinkList();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //list.deleteByVal(1);
        list.reverse();
        list.display();
    }

}