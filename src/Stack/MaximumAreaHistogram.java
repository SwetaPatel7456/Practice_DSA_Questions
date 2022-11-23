package Stack;


import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class MaximumAreaHistogram {

    public int[] findNearestSmallerToLeft(int a[]){

        int b[] = new int[a.length];
        Stack<Pair> stack = new Stack<Pair>();
        Vector<Integer> vector = new Vector<Integer>();

        for(int i = 0;i<a.length;i++){

            if(stack.size()==0){
                vector.add(-1);
            }
            else if(stack.size()!=0 && stack.peek().key<a[i]){
                vector.add(stack.peek().value);
            }
            else if(stack.size()!=0 && stack.peek().key>=a[i]){

                while (stack.size()!=0 && stack.peek().key>=a[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    vector.add(-1);
                }
                else{
                    vector.add(stack.peek().value);
                }
            }
            stack.push(new Pair(a[i],i));
        }
        for(int i =0;i<a.length;i++){
            b[i] = vector.elementAt(i);
        }
        return b;

    }

    public int[] findNearestSmallerToRight(int a[]){

        int b[] = new int[a.length];
        Stack<Pair> stack = new Stack<Pair>();
        Vector<Integer> vector = new Vector<Integer>();

        for(int i = a.length-1;i>=0;i--){

            if(stack.size()==0){
                vector.add(a.length);
            }
            else if(stack.size()!=0 && stack.peek().key<a[i]){
                vector.add(stack.peek().value);
            }
            else if(stack.size()!=0 && stack.peek().key>=a[i]){

                while (stack.size()!=0 && stack.peek().key>=a[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    vector.add(a.length);
                }
                else{
                    vector.add(stack.peek().value);
                }
            }
            stack.push(new Pair(a[i],i));
        }
        int length = a.length-1;
        int k =0;
        for(int j = length ;j>=0;j--){
            b[k++] = vector.elementAt(j);
        }
        return b;


    }

    public int  MAHValue(int a[]) {
        MaximumAreaHistogram ms = new MaximumAreaHistogram();
        int NSL[] = ms.findNearestSmallerToLeft(a);
        int NSR[] = ms.findNearestSmallerToRight(a);
        int width[] = new int[a.length];
        int area[] = new int[a.length];
        System.out.println(Arrays.toString(NSL));

       System.out.println(Arrays.toString(NSR));


        for (int i = 0; i < a.length; i++) {
            width[i] = NSR[i] - NSL[i] - 1;
        }
        for (int i = 0; i < a.length; i++) {
           area[i] = width[i]* a[i];
        }
        Arrays.sort(area,0,area.length);
       // System.out.println(Arrays.toString(area));
        return area[(area.length)-1];

    }

    public static void main(String[] args) {
        int a[] = {1,2,2,1};
        MaximumAreaHistogram ms = new MaximumAreaHistogram();
        System.out.println(ms.MAHValue(a));

    }
}
