
public class DynamicStackUse{
    public static void main(String[] args){
        DynamicStack dstack = new DynamicStack();
        System.out.println("--Pushing--");
        dstack.push(1);
        dstack.push(2);
        dstack.show();
        dstack.push(3);
        dstack.push(2);
        dstack.push(5);
        dstack.show();
        System.out.println("--Popping--");
        dstack.pop();
        dstack.pop();
        dstack.pop();
        dstack.show();
    }
}