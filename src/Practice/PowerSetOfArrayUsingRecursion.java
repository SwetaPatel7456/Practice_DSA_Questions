package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PowerSetOfArrayUsingRecursion {

    public static void main(String[] args) {

        char c[] = {'a','b','c'};
        System.out.println(powerSet(c,0));
    }
    public static List<String> powerSet(char a[],int index){

        if(index==a.length-1){
            return  new ArrayList<String>(Arrays.asList("",Character.toString(a[index])));
        }

        List<String> helperList = powerSet(a,index+1);
        List<String>newList = new ArrayList<String>();
        for(String s:helperList){
            newList.add(s);
        }
        for(String s:helperList){
            String b = Character.toString(a[index])+s;
            newList.add(b);
        }

        return newList;


    }
}
