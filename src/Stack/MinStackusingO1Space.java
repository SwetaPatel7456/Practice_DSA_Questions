package Stack;

import java.util.Stack;

public class MinStackusingO1Space {
    int minElement  =0;
    public static void main(String[] args) {
        MinStackusingO1Space mis = new MinStackusingO1Space();
        System.out.println(mis.minOfStack());
    }

    public int minOfStack(){
        Stack<Integer> stack = new Stack<>();
        insertInStack(9,stack);
        insertInStack(7,stack);
        deleteFromStack(stack);
        insertInStack(3,stack);
        insertInStack(2,stack);
deleteFromStack(stack);
        return minElement;

    }

    private void insertInStack(int item ,Stack<Integer> stack) {

         if(stack.size()==0){
            stack.push(item);
            minElement = item;
        }
        else{
            if(item<minElement){
                stack.push((2*item)-minElement);
                minElement =item;
            }
            else
                stack.push(item);
        }

    }

    private int deleteFromStack( Stack<Integer> stack) {

        if(stack.size()==0){
            return -1;
        }

        if(stack.peek()>=minElement){
            stack.pop();
        }
        else {
            minElement = 2*minElement -stack.pop();
        }

        return -1;
    }
}
