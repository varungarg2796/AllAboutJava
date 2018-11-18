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
        list.deleteByVal(1);
        
        list.display();
    }

}