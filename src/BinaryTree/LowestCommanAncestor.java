package BinaryTree;

public class LowestCommanAncestor {

    public static int LowestCommanAncestor(Node root,int x,int y){
        if(root==null){
            return -1;
        }
        if(root.value==x || root.value==y){
            return root.value;
        }
        int l = LowestCommanAncestor(root.left,x,y);
        int r = LowestCommanAncestor(root.right,x,y);
        if(l==-1 ){
            return r;
        }
       else if(r==-1){
           return  l;
        }
       else
           return root.value;
    }
}
