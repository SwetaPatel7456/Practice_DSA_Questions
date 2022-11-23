package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RootToNodePath {

    static Node root = null;
    static int key = 0;

    public static void main(String[] args) {
        Node newNode = new Node(4);
        newNode.left = new Node(5);
        newNode.right = new Node(6);
        newNode.left.left = new Node(3);
        newNode.right.right = new Node(2);
        root = newNode;
        solve(root,3);
    }

    public static  void solve(Node root,int a){
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return ;
        if(getPath(root,list,a));
        System.out.println(list);
    }

    private static boolean getPath(Node root, List<Integer> list, int a) {
        if(root==null){
            return false;
        }
        list.add(root.value);
        key++;
        if(root.value==a){
            return true;
        }
        boolean b = getPath(root.left, list, a);
        boolean c= getPath(root.right,list,a);
        if(b==false && c==false){
            list.remove(list.size()-1);
            //key--;
        }
        return (b||c);
        }
    }

