package Stack.StackUsingArray;

public class Stack {
    int stack[] ;
    public int maxSize;
    public int top = -1;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
    }

    public void push(int item){
        if(top == maxSize){
            System.out.println("Overflow");
        }
        else {
            top= top+1;
            stack[top]= item;
        }
    }
    public int pop(){
        int item ;
        if(top==-1){
            System.out.println("Underflow");
            return  -1;
        }
        else {
            item = stack[top];
            top=top-1;
        }
        return item;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(9);
        stack.push(4);
        stack.push(7);
       // stack.display();
        System.out.println(stack.pop());
    }
}
