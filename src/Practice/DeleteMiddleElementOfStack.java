package Practice;

import java.util.Stack;

public class DeleteMiddleElementOfStack {
    static int count =0;

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        //stack.push(3);
        //stack.push(4);
        delete(stack);
        if(stack.size()!=0)
        System.out.println(stack.pop());
        else
            System.out.println("Stack is empty");
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());


    }

    public static void delete(Stack stack){

        int index = (stack.size()/2)+1;
        if(stack.size()==1){
            stack.pop();
            return;
        }
        deleteUtil(stack,index);
    }

    private static void deleteUtil(Stack stack,int index) {

        if(index==1){
            stack.pop();return;
        }
        int temp = (Integer)stack.pop();
        index = index-1;
        deleteUtil(stack,index);
        stack.push(temp);
    }
}
