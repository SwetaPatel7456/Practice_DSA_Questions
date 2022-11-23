package Stack;

import java.util.Stack;
import java.util.Vector;

public class NearestSmallerToLeft {
    public static void main(String[] args) {
        int a[] = {4,5,2,10,8};
        Stack<Integer> stack = new Stack<Integer>();
        Vector<Integer> vector = new Vector<>();
        for(int i = 0;i<5;i++){
            if(stack.size()==0){
                vector.add(-1);
            }
            else if(stack.size()!=0 && stack.peek()<a[i]){
                vector.add(stack.peek());
            }
            else if( stack.size()!=0 && stack.peek()>a[i]){
                while (stack.size()!=0 && stack.peek()>a[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    vector.add(-1);
                }
                else {
                    vector.add(stack.peek());
                }
            }
            stack.push(a[i]);

        }
        vector.forEach(System.out::println);

    }
}
