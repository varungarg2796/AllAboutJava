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
        ClassB b = new ClassB();
        b.displayA();
        b.displayB();

    }
}