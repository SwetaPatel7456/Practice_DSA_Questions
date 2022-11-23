package MCM;

public class MatrixChainMultiplication {

    public static int  mcm(int a[],int i ,int j){

        if(i>=j){
            return 0;
        }
        int min= Integer.MAX_VALUE;
        for(int k =i;k<=j-1;k++){
            int temp =  mcm(a,i,k)+ mcm(a,k+1,j)+a[i-1]*a[k]*a[j];
            if(min>temp){
                min =temp;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        System.out.println(mcm(a,1,a.length-1));
    }

}
