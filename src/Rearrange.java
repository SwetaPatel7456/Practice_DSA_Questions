public class Rearrange {

    public static void main(String[] args) {

    }

    public static void rearrange(long a[], int n){

        // Your code here
        int start =0;
        int end = n-1;
        int j =end-1;

        while(start<=end){
            long temp = a[end];
            j=end-1;
            while(j>=start){
                a[j+1] =a[j];
                j--;
            }
            a[start] = temp;
            start=start+2;
        }

    }
}
