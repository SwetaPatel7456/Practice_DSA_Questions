package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewOftree {

    static Node root = null;

    public static void main(String[] args) {
        Node newNode = new Node(4);
        newNode.left=new Node(5);
        newNode.right = new Node(6);
       newNode.left.left = new Node(3);

        newNode.right.right = new Node(2);
        newNode.right.right.right = new Node(9);
        newNode.right.right.right.right = new Node(10);


        root = newNode;
        leftViewOfTree(root);
        rightViewOfTree(root);
    }

    public static  void leftViewOfTree(Node root){

        List<Integer> list = new ArrayList<>();
        printLeftMostOfcurrentLevel(root,list,0);

    }

    //we are doing it with the help of preorder traversal
    private static void printLeftMostOfcurrentLevel(Node root, List<Integer> list ,int level) {
        if(root==null){
            return;
        }
        if(list.get(level)==null){
            list.add(root.value);
        }

        printLeftMostOfcurrentLevel(root.left,list,level+1);
        printLeftMostOfcurrentLevel(root.right, list,level+1);


    }
    private static void printrightMostOfcurrentLevel(Node root, List<Integer> list ,int level) {
        if(root==null){
            return;
        }
        if(list.get(level)==null){
            list.add(root.value);
        }
        printLeftMostOfcurrentLevel(root.right, list,level+1);
        printLeftMostOfcurrentLevel(root.left,list,level+1);



    }



    public static  void rightViewOfTree(Node root){
        if(root==null)
            return;
        System.out.println(root.value);
        if(root.right!=null){
            leftViewOfTree(root.right);
        }
        else {
            if(root.left!=null){
                leftViewOfTree(root.left);
            }
        }
    }
}
