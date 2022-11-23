package Heap;

public class MinimumAndMaximunElementInArray {

    public static void main(String[] args) {
        int a[] ={1,4,5,6,7};
        pair result = getMinMax(a,a.length);
        System.out.println("Min " + result.first + " Max " + result.second );
    }

    static pair getMinMax(int a[], int n)
    {
        //Write your code here
        int k =0;
        int u = n-1;
        pair pair1 =getMinMax1(a,k,u);
        return pair1;

    }
    static pair getMinMax1(int a[],int low ,int high){

        pair minmax = new pair(0,0);
        pair mml ;
        pair mmr ;


        if(low==high){
            minmax.first= a[low];
            minmax.second = a[high];
            return minmax;
        }
        if(high == low+1){
            if(a[low]>a[high]){
                minmax.first= a[high];
                minmax.second = a[low];
            }
            else{
                minmax.first= a[low];
                minmax.second = a[high];
            }
            return minmax;
        }
        int mid = (high+low)/2;
        mml = getMinMax1(a,low ,mid);
        mmr = getMinMax1(a,mid+1,high);

        if(mml.first<mmr.first){
            minmax.first = mml.first;
        }
        else{
            minmax.first = mmr.first;

        }
        if(mml.second<mmr.second){
            minmax.second = mmr.second;
        }
        else{
            minmax.second = mml.second;

        }
        return minmax;


    }
}
