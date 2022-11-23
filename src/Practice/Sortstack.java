package Practice;


import java.util.Stack;

public class Sortstack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        sortStack(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }

    public static void sortStack(Stack stack){
        if(stack.size()==1){
            return;
        }
        int temp = (int) stack.pop();
        sortStack(stack);
        insertIntoStack(stack,temp);

    }

    private static void insertIntoStack(Stack stack, int temp) {

        if((Integer)stack.peek()<temp){
            stack.push(temp);
            return;
        }
        int temp1 = (int) stack.pop();
        insertIntoStack(stack,temp);
        stack.push(temp1);
    }
}
