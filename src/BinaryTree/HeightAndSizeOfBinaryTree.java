package BinaryTree;

import java.util.*;

public class HeightAndSizeOfBinaryTree {
   static Node root = null;

    public static void main(String[] args) {
        Node newNode = new Node(4);
        newNode.left = new Node(5);
        newNode.right = new Node(6);
        newNode.left.left = new Node(3);
        newNode.right.right = new Node(2);
        root = newNode;
        //System.out.println(maxValueInTree(newNode));
        //levelOrderTraversal();
        //levelOrderTraversal1();
        Map<Integer,List<Integer>> map = levelOrderTraversal2();
        System.out.println(Arrays.asList(map));
        System.out.println(height(root));
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }
        else
            return  size(root.left)+size(root.right)+1;
    }

    public static int maxValueInTree(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        if(root.left==null && root.right==null){
            return root.value;
        }
        else
            return Math.max(Math.max(maxValueInTree(root.left),maxValueInTree(root.right)),root.value);
    }

    ///level order when want to print values in a single line

    public static  void levelOrderTraversal(){
        Node temp = root;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);

        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            queue.remove();
            System.out.println(temp1.value);
            if(temp1.left!=null){
                queue.add(temp1.left);
            }
            if (temp1.right!=null){
                queue.add(temp1.right);
            }
        }

    }

    ///level order when want to print values in a different line of different level

    public static  void levelOrderTraversal1(){
        Node temp = root;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        queue.add(null);

        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            queue.remove();
            if(temp1==null) {
                if (queue.isEmpty()) return;
                else
                    queue.add(null);
                System.out.println("     ");
                continue;
            }

            System.out.println(temp1.value);
            if(temp1.left!=null){
                queue.add(temp1.left);
            }
            if (temp1.right!=null){
                queue.add(temp1.right);
            }
        }

    }

    ///level order when want to print values in a different line of different level using map

    public static  Map<Integer, List<Integer>> levelOrderTraversal2(){
        Node temp = root;
        Map<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        queue.add(null);
        int key = 0;
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()){
            Node temp1 = queue.peek();
            if(temp1!=null)
               list.add(temp1.value);
            queue.remove();
            if(temp1==null) {
                List<Integer> u = new ArrayList<>();
                for(Integer i :list){
                    u.add(i);
                }
                map.put(key,u);
                key++;
                list.clear();
                if (queue.isEmpty()) return map;
                else
                    queue.add(null);
                System.out.println("     ");
                continue;
            }

            System.out.println(temp1.value);
            if(temp1.left!=null){
                queue.add(temp1.left);
            }
            if (temp1.right!=null){
                queue.add(temp1.right);
            }
        }
       return map;

    }
    public static void printCurrentLevel(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.println(root.value);

        }
        if(level>1){
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);
        }

    }
}
