package BinarySearchTree;

public class IsBST {

    static Node root = null;
    static int currentValue =0;
    static int flag=0 ;

    public static void main(String[] args) {
        Node newNode = new Node(4);
        newNode.left = new Node(2);
        newNode.right = new Node(5);
        newNode.left.left = new Node(1);
        newNode.right.right = new Node(3);
        //newNode.right.left= new Node(3);
        root = newNode;
       inorderTraversal(root);
       if (flag==0)
       System.out.println(true);
       else
           System.out.println(false);

    }


    public static void inorderTraversal(Node root){

        if(root==null) return;
        inorderTraversal(root.left);
        System.out.println(root.value);
        if(root.value>currentValue){
            currentValue = root.value;
        }
        else{
           flag++;
        }
        inorderTraversal(root.right);
    }

    public boolean isbst(Node root){
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(Node root, int minValue, int maxValue) {

        if(root==null){
            return true;
        }
        if(root.value<minValue|| root.value>maxValue){
            return false;
        }
        return (isBSTUtil(root.left,minValue,root.value-1)&&
                isBSTUtil(root.right,root.value+1,maxValue));
    }
}
