package BinaryTree;

public class DiameterofBT {
    static int ans = 0;

    public static  int  height(Node root){

        if(root==null){
            return 0;
        }
        int h1 = height(root.left);
        int h2 = height(root.right);
        ans = Math.max(ans,1+h1+h2);
        return 1+Math.max(h1,h2);

    }


}
