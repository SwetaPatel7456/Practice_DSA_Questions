package Practice;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {

    public static void main(String[] args) {
        //solve("","aac");
        List<String> list = new ArrayList<String>();
        solveUniqueSubsets("","aab",list);
        System.out.println(list);
    }

    public static void solve(String op ,String ip){
        if(ip.length()==0){
            if(op.length()==0){
                System.out.println("$");
            }
            System.out.println(op);
            return;
        }
        String ip1 ="";
        if(ip.length()>=2)
           ip1 = ip.substring(1);
        String op1 = op + ip.charAt(0);
        solve(op1,ip1);

        String op2 = op;
        solve(op2,ip1);

    }

    public static void solveUniqueSubsets(String op , String ip, List<String> list){
        if(ip.length()==0){
            if (!list.contains(op)) {
                list.add(op);
            }

            System.out.println(op);
            return;
        }
        String ip1 ="";
        if(ip.length()>=2)
            ip1 = ip.substring(1);
        String op1 = op + ip.charAt(0);
        solveUniqueSubsets(op1,ip1,list);

        String op2 = op;
        solveUniqueSubsets(op2,ip1,list);

    }


}
