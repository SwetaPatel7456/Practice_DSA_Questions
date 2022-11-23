package Stack;


import java.util.Stack;

public class MinStackUsingExtraSpace {

    public static void main(String[] args) {
        MinStackUsingExtraSpace mis = new MinStackUsingExtraSpace();
        System.out.println(mis.minOfStack());
    }

    public int minOfStack(){
        Stack<Integer> stack = new Stack<>();

        Stack<Integer> supportingStack = new Stack<>();
        insertInStack(9,stack, supportingStack);
        deleteFromStack(stack,supportingStack);
        insertInStack(7,stack,supportingStack);
        insertInStack(5,stack,supportingStack);
        deleteFromStack(stack,supportingStack);
        if(supportingStack.size()!=0)
        return supportingStack.peek();
        else
            return -1;
    }

    private void deleteFromStack(Stack<Integer> supportingStack, Stack<Integer> stack) {

        int item = stack.pop();
        if(item==supportingStack.peek()){
            supportingStack.pop();
        }
    }

    private void insertInStack(int i, Stack<Integer> supportingStack, Stack<Integer> stack) {
        stack.push(i);
        if(supportingStack.size()==0){
            supportingStack.push(i);
        }
        else{
            if(supportingStack.peek()>i){
                supportingStack.push(i);
            }
        }
    }
}
