package BinarySearchTree;


public class BinarysearchTree {

    static Node root =null;

    public static void main(String[] args) {
        insertion(root,5);
        insertion(root,4);
        insertion(root,6);
        System.out.println("root:"+root.value);
        System.out.println("root.left:"+root.left.value);
        System.out.println("root.right:"+root.right.value);


    }

    public static Node insertion(Node root,int key){
        if(root==null) {
            return new Node(key);
        }
        else if(root.value>key){
            root.left = insertion(root.left,key);
        }
        else if(root.value<key){
            root.right=insertion(root.right,key);
        }
        return root;
    }
    public static Node insertionUsingrecursion(Node root ,int key){

        Node newNode = new Node(key);
        Node curr = root;
        Node parent=null;

        while (curr!=null){
            parent=curr;
            if(key< curr.value){
                curr=curr.left;
            }
            if(key> curr.value){
                curr=curr.right;
            }
        }
        if(parent==null){
            parent=newNode;
        }
        if(key< parent.value){
            parent.left=newNode;
        }
        if(key> parent.value){
            parent.right= newNode;
        }

      return root;
    }

    public static Node delete(Node root,int key){

        if(root==null){
            return null;
        }
        else if(key< root.value){
            root.left = delete(root.left,key);
        }
        else if(key> root.value){
            root.right=delete(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.value= minvalue(root.right);
            root.right= delete(root.right,root.value);
        }
      return root;
    }

    private static int minvalue(Node right) {

        Node temp = right;
        int minvalue = -1;
        while (temp.left!=null){
            temp=temp.left;
        }
        minvalue= temp.value;
        return minvalue;
    }


}
