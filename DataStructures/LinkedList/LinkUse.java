public class LinkUse{
    public static void main( String[] args)
    {
        LinkedList list = new LinkedList();
        //LinkedList list = new LinkedList<>();
        //list.add(1);
        list.insert(5);
        list.insert(100);
        list.insert(200);
        list.deleteAt(1);
        //list.insertAtStart(10);
        //list.insertAt(0, 11);
        list.show();
    }
}