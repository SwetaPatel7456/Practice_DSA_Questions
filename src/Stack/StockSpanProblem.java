package Stack;

import java.util.Stack;
import java.util.Vector;

public class StockSpanProblem {

//    public static void main(String[] args) {
//
//        int a[] = {100,80,60,70,60,75,85};
//        Vector<Integer> vector = new Vector<>();
//
//        for (int i =0; i<7;i++){
//            int count = 0;
//            for(int j= i;j>=0;j--){
//               if(a[j]<=a[i]){
//                   count++;
//               }
//               else{
//                   break;
//               }
//            }
//           vector.add(count);
//        }
//        vector.forEach(System.out::println);
//    }
public static void main(String[] args) {
    StockSpanProblem ssp = new StockSpanProblem();
    ssp.stockSpanUsingStack();
}
    public  void stockSpanUsingStack(){
        int a[] = {100,80,60,70,60,75,85};

        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<>();
        Vector<Integer> vector = new Vector<>();
        for(int i =0;i<7;i++){
             int count = 1;
             if (stack.size()==0){
                 vector.add(count);
             }
            else if(stack.size()!=0 && stack.peek()<=a[i]) {
                 while (stack.size() != 0 && stack.peek() <= a[i]) {
                     count++;
                     int item = stack.pop();
                     stack1.push(item);
                 }
                 vector.add(count);
                 while (stack1.size() != 0) {
                     stack.push(stack1.pop());
                 }
             }
            else if(stack.size()!=0 && stack.peek()>=a[i]){
                vector.add(count);
             }
            stack.push(a[i]);
        }
        vector.forEach(System.out::println);
    }

}
