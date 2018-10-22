
public class DynamicStack{

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = -1;

    //To add to the stack
    public void push (int data){
        if(isFull()){
            expand();
        } else {
            stack[++top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            reduceSize();
            int data;
            data = stack[top--];
            stack[top] = 0;
            return data;
        }
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public void show() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "=>");
        }
        System.out.println();
        System.out.println("ARRAY SIZE:" + stack.length);
    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public boolean isFull(){
        if(capacity == top +1){
            return true;
        } else{
            return false;
        }
    }
    public void expand() {
        int curr_size = top + 1;
        int[] new_stack = new int[curr_size * 2];
        for(int i=0;i<curr_size;i++){
            new_stack[i] = stack[i];
        }
        stack = new_stack;              //refer to the new array 
        capacity = new_stack.length;
    }
    public void reduceSize() {
        int curr_length = top+1;
        if (curr_length < capacity / 2) {
            int[] new_stack = new int[capacity / 2];
            System.arraycopy(stack, 0, new_stack, 0, new_stack.length);
            stack = new_stack;
            capacity = new_stack.length;
        }
    }

}