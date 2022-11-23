package BinaryTree;

public class LevelOrderTraversalUsingRecursion {
    static Node root = null;

    public static void main(String[] args) {
        Node newNode = new Node(4);
        newNode.left = new Node(5);
        newNode.right = new Node(6);
        newNode.left.left = new Node(3);
        newNode.right.right = new Node(2);
        root = newNode;
        levelOrdertraversal(root);

    }

    public static  void levelOrdertraversal(Node root){

        int level = height(root);
        for(int i = 1;i<=level;i++){
            printcurrentLevel(root,i);
            System.out.println("*");
        }
    }

    private static void printcurrentLevel(Node root, int i) {
        if(root==null){
            return;
        }
        if(i ==1){
            System.out.println(root.value);
        }
        if(i>1){
            printcurrentLevel(root.left,i-1);
            printcurrentLevel(root.right,i-1);
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)+1);
    }
}
