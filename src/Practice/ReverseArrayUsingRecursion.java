package Practice;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {

        int a[] ={1,2,4,5};
        reverseArray(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void reverseArray(int a[] ,int i,int j){

        if(i>=j){
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] =temp;
        reverseArray(a,i+1,j-1);
    }
}
