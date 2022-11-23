package SlidingWindow;

public class LargestSubarrayOfSizeK {

    public static void main(String[] args) {
        int a[]={4,1,1,1,2,0,0,0,-1,1,-1,1  };
        System.out.println(largestSubArrayOfSizeK(a,5));
    }

    public static int largestSubArrayOfSizeK(int a[] ,int sum){
        int i =0;
        int j=0;
        int tempSum =0;
        int max=Integer.MIN_VALUE;
        while (j<a.length){
            tempSum = tempSum+a[j];
            if(tempSum<sum){
                j++;
            }
            else if(tempSum==sum) {
                int u = j-i+1;
                if(max<u){
                    max=u;

                }
                j++;
            }

            else if(tempSum>sum){
                while (tempSum>sum) {
                    tempSum = tempSum - a[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
