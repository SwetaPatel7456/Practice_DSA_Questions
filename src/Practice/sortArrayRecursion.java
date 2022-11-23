package Practice;

import java.util.Arrays;

public class sortArrayRecursion {

    public static void main(String[] args) {
        int a[] = {1,7,2,4,6,8,0};
        sort(a,6);
        System.out.println("hii");
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[],int n){

        if(n==0){
            return;
        }

        sort(a,n-1);
        int val = a[n];
        int i =0;
        for( i =0;i<n;i++){
            if (a[i]<a[n]){
                continue;
            }
            break;
        }
        int j =i;
        int k = n-1;
        while (k>=i){
            a[k+1]= a[k];
            k--;
        }
        a[j] = val;
    }
}
