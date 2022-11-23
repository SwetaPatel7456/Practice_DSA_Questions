package Stack;

public class DeleteMiddleElementFromStack {

    DLLNode top = null;
    DLLNode mid = null;
    int size = 0;

    public void push(int item){
        if(top==null){
            DLLNode newNode = new DLLNode(item);
            newNode.previous=null;
            newNode.next = null;
            top = newNode;
            mid = newNode;
            size++;
            return;
        }
        else{
            DLLNode newNode = new DLLNode(item);
            top.previous = newNode;
            newNode.previous=null;
            newNode.next=top;
            top=newNode;
            size++;

        }
        if(size%2!=0){
            mid= mid.next;
        }

    }

    public void pop(){

        if(top!=null){
            top.next.previous =null;
            top = top.next;
            size--;
        }
        if(size%2!=0){
            mid = mid.previous;
        }
    }


}
