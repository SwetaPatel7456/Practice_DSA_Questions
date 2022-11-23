package SlidingWindow;

public class MaximSumFromParticularSizeOfSubArray {

    public static void main(String[] args) {
       int a[] = {1,2,3,4,5,6};
       // System.out.println(maximSumFromParticularSizeOfSubArray(a,3));
       // System.out.println(maximSumFromParticularSizeOfSubArray1(a,3));
        System.out.println(maximSumFromParticularSizeOfSubArray2(a,3));
    }

   //Brute force approach
    public static int  maximSumFromParticularSizeOfSubArray(int a[],int k){
        int lastIndex = a.length-1;
        int sum =0;
        int max =0;
        for(int i =0; i<=lastIndex-(k-1);i++){
            sum =0;
            for(int j =i;j<k+i;j++){
                sum = sum+a[j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }

    //we can improve performance actually bz work is repetitive
    //Another way of doing
    public static int  maximSumFromParticularSizeOfSubArray2(int a[],int k){
        int length = a.length;
        int sum =0;
        int max =0;
       int i =0;
       int j=0;
       while (j<length){
           sum=sum +a[j];
           if(j-i+1<k){
               j++;
           }
           else if(j-i+1==k) {
               max = sum;
               sum = sum-a[i];
               i++;
               j++;

           }
       }
       return max;
    }

    public static int  maximSumFromParticularSizeOfSubArray1(int a[],int k){
        int length = a.length;
        int sum =0;
        int max =0;
        int l =0;
        for(int i =0; i<=length;i++){
           if(i<k){
               sum = sum+a[i];
           }
            else {
                if(max<sum){
                    max=sum;
                }
                if(i<length)
                   sum= sum+a[i]-a[l++];
            }
        }
        return max;
    }


}
