package Practice;

import java.util.Arrays;

public class MovePositiveNumberOneSide {

    public static void main(String[] args) {
        int a[] ={2,-1,-3,4,5,-6};
        solve(a);
        System.out.println(Arrays.toString(a));

    }

    public static void solve(int a[]){

        int start = 0;
        int end = a.length-1;
        int i =0;

        while (i<=end){
            if(a[i]<0){
                if (a[end]<0){
                    end--;
                }
                else{
                    swap(a,i,end);
                    i++;
                    end--;
                }
            }
            else{
                i++;
            }
        }
    }

    public static void solve1(int a[]){

        int start = 0;
        int end = a.length-1;
        int i =0;

        while (i<=end){
            if(a[i]<0) {
                if(a[end]<0){
                    end--;
                }
                else{

                }
            }
        }
    }
    public static void swap(int a[],int i,int j){
        int temp =a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
