import java.awt.HeadlessException;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class linkedList {

    public static  Node insert(Node head,int data) {
        
        //Create a new node to be insterted
        Node toInsert = new Node(data);

        //If no element is added to the start, make the head equal to the element to be inserted
        if(head ==null){
            head = toInsert;
        }else{
            //If there is a head which has data, make node start equal to head
            Node start = head;

            //traverse till you encounter a node whose reference 'next' is empty
            while(start.next!= null){
                start= start.next;
            }
            //when you find a node with the above criteria, insert the element
            start.next = toInsert;
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}