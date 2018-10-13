class classA{
    public void displayA() {
        System.out.println("This is of A");
    }
}

class classB extends classA{
    public void displayB(){
        System.out.println("This is of B");
    }
}

class ClassC extends classB {

    public void displayC(){
        System.out.println("This is of class C");
    }
    public static void main(String args[]){
        ClassC C = new ClassC();

        C.displayC();
        C.displayA();
        C.displayB();

    }
}
