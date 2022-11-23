package Stack;

import java.util.Stack;
import java.util.Vector;

public class Pair {

    int key;
    int value;

    public Pair(int key,int value){
        this.key = key;
        this.value = value;
    }

    public Pair() {
    }

    public static void main(String[] args) {
        int a[] = {100,80,60,70,60,75,85};
        Stack<Pair> stack = new Stack<Pair>();
        Vector<Integer> vector = new Vector<>();
        for(int i =0 ;i<7;i++){
            if(stack.size()==0){
                vector.add(-1);
            }
            else if(stack.size()!=0 && stack.peek().key>a[i]){
                vector.add(stack.peek().value);
            }
            else if(stack.size()!=0 && stack.peek().key<=a[i]){

                while (stack.size()!=0  && stack.peek().key<=a[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    vector.add(-1);
                }
                else
                    vector.add(stack.peek().value);
            }
            stack.push(new Pair(a[i],i));
        }
        vector.forEach(System.out::println);
        int b[] = new int[7];
        for(int i =0;i<7;i++){
            b[i] = i-vector.elementAt(i);
        }
        for(int i =0;i<7;i++){
            System.out.println(b[i]);
        }


    }
}
