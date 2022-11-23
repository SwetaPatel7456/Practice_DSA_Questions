package Stack.StackUsingArray;

public class QueueUsingStack {
    Stack stack1 = new Stack(5);
    Stack stack2 = new Stack(5);

    public void enQueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        if(stack2.isEmpty()){
            if(!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
            else
                return -1;
        }
        else{
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enQueue(2);
        queueUsingStack.enQueue(3);
        queueUsingStack.enQueue(4);
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());

    }
}
