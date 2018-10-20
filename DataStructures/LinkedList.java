//import java.util.LinkedList;


public class LinkedList
{
    Node head;

    public void insert (int data) //inserting at end
    {
        //Initialize the node and put data in it
        Node node = new Node();
        node.data = data;
        node.next = null;

        //Check if it is the first element being inserted?
        if(head == null)
        {
            head = node;
        }
        else //If not, then
        {
            Node n = head; //create a temporary node of head
            while(n.next != null)
            {
                n = n.next; //keep checking and moving forward till the reference points to a null value that is, you reach the last element
            }
            n.next = node; //point the null reference to the new node
        }
    }

    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(index ==0)
        {
            insertAtStart(data);
        }
        else
        {
            //Traversing the linked list
            Node n = head;
            for(int i=0; i<index-1; i++)
            {
                n = n.next;
            }
            //when you reach the index, do

            //Next of node to be inserted points towards the found of next index
            node.next = n.next;
            
            //Next of found node points towards the node to be inserted
            n.next = node; 
        }
    }

    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void show()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data);
            n= n.next;
        }
    }
}


