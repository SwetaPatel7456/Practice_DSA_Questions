package BinaryTree;



public class BurnATreeInJava {

    static class Depth{
        int d;
        public Depth(int d){
            this.d = d;
        }

    }
    static int ans = -1;

    public int burnTree(Node root,int target,Depth depth){
        if (root == null) {
        return 0;
        }
        if(root.value==target){
            depth.d = 1;
            return 1;
        }
        Depth ld = new Depth(-1);
        Depth rd = new Depth(-1);

        int lh = burnTree(root.left,target,ld);
        int rh = burnTree(root.right,target,rd);

        if(ld.d!=-1){
            ans = Math.max(ans,ld.d+1+rh);
            depth.d= ld.d+1;
        }
        else if(rd.d!=-1){
            ans = Math.max(ans,rd.d+1+lh);
            depth.d= rd.d+1;
        }
        return Math.max(rh,lh)+1;


    }
}
