
public class StackUse{
    public static void main(String[] args){
        Stack nums = new Stack();
        nums.push(10);
        nums.push(11);
        nums.push(11);
        nums.push(11);
        nums.push(12);
        nums.show();
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
    }
}