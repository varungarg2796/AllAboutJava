import java.util.Scanner;

class ClassA{
    public void displayA(){
        System.out.println("This is from A");
    }
}

class ClassB extends ClassA{
    public void displayB(){
        System.out.println("This is from B");
    }
    public static void main(String[] args){
        int[] mymarks = new int[10];

int total = 0;

Scanner in = new Scanner(System.in);

for (int cnt = 1; cnt <= 10; cnt++)

{

   System.out.print("Enter the marks: ");

   mymarks[cnt] = in.nextInt();

   total = total + mymarks[cnt];

}

System.out.println(total);

    }
}