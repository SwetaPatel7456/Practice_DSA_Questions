package Stack;


import java.util.Stack;
import java.util.Vector;

public class NearestGreaterToRight {

    public static void main(String[] args) {
        int a[] = {1,3,2,4};
        Stack<Integer> stack = new Stack<Integer>();
        Vector<Integer> vector = new Vector<>();
        for(int j= 3;j>=0;j--){

            if(stack.size()==0){
                vector.add(-1);
            }
            else if(stack.size()!=0 && stack.peek()>a[j]){
                vector.add(stack.peek());
            }
            else if(stack.size()!=0 && stack.peek()<=a[j]){

                while (stack.size()!=0  && stack.peek()<=a[j]){
                    stack.pop();
                }
                if(stack.size()==0){
                    vector.add(-1);
                }
                else
                    vector.add(stack.peek());
            }
            stack.push(a[j]);
        }
        vector.forEach(System.out::println);


    }
}
