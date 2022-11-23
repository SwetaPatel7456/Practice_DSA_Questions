package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfTree {
    static Node root=null;

    public static void maxWidth(){

        Node temp = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        int i=1;
        int a[] = new int[15];
        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            a[i] =temp1.value;
            queue.remove();
            if(temp1.left!=null){
                queue.add(temp1.left);
                a[2*i] = temp1.left.value;
            }

            else{
                queue.add(temp.right);
                a[2*i+1] = temp1.right.value;
            }
            if(temp1.left==null){
                i= i+2;

            }
            else i=i+1;
        }
    }
}
