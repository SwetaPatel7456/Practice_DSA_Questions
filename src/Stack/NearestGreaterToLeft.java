package Stack;

import java.util.Stack;
import java.util.Vector;

public class NearestGreaterToLeft {
    public static void main(String[] args) {
        int a[] = {1,3,2,4};
        Stack<Integer> stack = new Stack<Integer>();
        Vector<Integer> vector = new Vector<>();
        for(int i =0 ;i<4;i++){
            if(stack.size()==0){
                vector.add(-1);
            }
            else if(stack.size()!=0 && stack.peek()>a[i]){
                vector.add(stack.peek());
            }
            else if(stack.size()!=0 && stack.peek()<=a[i]){

                while (stack.size()!=0  && stack.peek()<=a[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    vector.add(-1);
                }
                else
                    vector.add(stack.peek());
            }
            stack.push(a[i]);
        }
        vector.forEach(System.out::println);

    }
}
