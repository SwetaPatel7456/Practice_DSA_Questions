package Stack;

import java.util.*;

public class NearestSmallerToRight {

//    public static void main(String[] args) {
//        int a[] = {4,5,2,10,8};
//        Stack<Integer> stack = new Stack<Integer>();
//        Vector<Integer> vector = new Vector<>();
//        for(int i = 4;i>=0;i--){
//            if(stack.size()==0){
//                vector.add(-1);
//            }
//            else if(stack.size()!=0 && stack.peek()<a[i]){
//                vector.add(stack.peek());
//            }
//            else if( stack.size()!=0 && stack.peek()>a[i]){
//                while (stack.size()!=0 && stack.peek()>a[i]){
//                    stack.pop();
//                }
//                if(stack.size()==0){
//                    vector.add(-1);
//                }
//                else {
//                    vector.add(stack.peek());
//                }
//            }
//            stack.push(a[i]);
//
//        }
//        vector.forEach(System.out::println);
//        }
public static void main(String[] args) {
    NearestSmallerToRight function = new NearestSmallerToRight();
    function.usingForLoop();

}

        public void  usingForLoop(){
            int a[] = {4,5,2,10,8};
            Integer b[] = new Integer[5];
            b[0] = -1;
            int k =1;
            int flag ;
            Stack<Integer> stack = new Stack<Integer>();
            Vector<Integer> vector = new Vector<>();
            for(int i = 3 ;i>=0;i--){
                flag =0;
                for(int j = i+1;j<=4;j++){
                    if(a[i]>a[j]){
                        b[k++] = a[j];
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    b[k++] =-1;
                }
            }
            Collections.reverse(Arrays.asList(b));
            System.out.println(Arrays.asList(b));
        }
    }

