package Practice;

import java.util.Stack;

public class ReverseAStack   {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        reverse(stack);
        if (stack.size() != 0)
            System.out.println(stack.size());
        else
            System.out.println("Stack is empty");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }

    public static void  reverse(Stack stack){
        if(stack.size()>1){
            int temp = (Integer) stack.pop();
            reverse(stack);
            reverseUtil(stack,temp);
        }
    }

    private static void reverseUtil(Stack stack, int temp) {
        if(stack.size()==1){
            int temp1 = (int) stack.pop();
            stack.push(temp);
            stack.push(temp1);
            return;
        }
        int temp1= (int) stack.pop();
        reverseUtil(stack,temp);
        stack.push(temp1);

    }
}
