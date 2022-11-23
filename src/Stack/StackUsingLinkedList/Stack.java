package Stack.StackUsingLinkedList;

public class Stack {
    StackNode root ;
    StackNode top ;

    public Stack() {
        this.root = null;
        this.top = null;
    }

    public void push(int num){
        System.out.println("pushed");
        if(root==null){
            root = new StackNode(num);
            root.link=null;
            top = root;
        }
        else {
            StackNode newNode= new StackNode(num);
            newNode.link = top;
            top= newNode;

        }
    }
    public StackNode pop(){
        if(root==null){
            System.out.println("Underflow");
            return null;
        }
        StackNode popNode = top;
        top= top.link;
        return popNode;

    }
    public void display(){
        StackNode temp = top;
        while (temp.link!=null){
            System.out.println(temp.data);
            temp=temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(9);
        stack.push(4);
        stack.push(7);
        stack.display();
        System.out.println(stack.pop().data);
    }
}
