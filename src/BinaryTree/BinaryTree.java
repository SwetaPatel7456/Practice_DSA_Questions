package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
   static  Node root;

    public static void main(String[] args) {
        createTree();
        insert(7);
        delete(5);
    }

    public static Node createTree(){
        Node temp = null;
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value==-1){
            return null;
        }
        temp = new Node(value);
        System.out.println("Enter left for " + value);
        temp.left = createTree();
        System.out.println("Enter right for " + value);
        temp.right = createTree();
        return temp;
    }

    public static void insert(int key){
        Node newNode = null;
        if (root==null){
            newNode = new Node(key);
            root = newNode;
            return;
        }
        Node temp = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            queue.remove();
            if(temp1.left==null){
                temp1.left = new Node(key);
                return;
            }
            else
                queue.add(temp.left);
            if(temp1.right==null){
                temp1.right = new Node(key);
                return;
            }
            else
                queue.add(temp.right);
        }
    }

    public static Node deepestNode(Node root){
        Node temp = root;
        if(temp ==null){
            return null;
        }
       if(temp.right==null){
           if(temp.left==null){
               return root;
           }
           else
               return  deepestNode(temp.left);
       }
       else
           return deepestNode(temp.right);

    }

    public static void  delete(int key){
        Node deepestNode = deepestNode(root);
        Node keyNode = null;
        Node temp = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            queue.remove();
            if(temp1.value==key){
                keyNode = temp1;
                break;
            }
            else
                queue.add(temp.left);
            if(temp1.value==key){
                keyNode = temp1;
                break;
            }
            else
                queue.add(temp.right);
        }
        int x = deepestNode.value;
        deleteDeepestNode(deepestNode,keyNode);
        keyNode.value= x;


    }

    private static void deleteDeepestNode(Node deepestNode, Node keyNode) {

        Node temp = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            queue.remove();
            if(temp1==keyNode){
                temp1=null;
                break;
            }
            else
                queue.add(temp.left);
            if(temp1==keyNode){
                temp1=null;
                break;
            }
            else
                queue.add(temp.right);
        }

    }
    public void inorderTraversal(Node root){
        if(root == null){
            System.out.println("tree is empty");
            return;
        }
        inorderTraversal(root.left);
        System.out.println("Node value :" + root.value);
        inorderTraversal(root.right);

    }


}
