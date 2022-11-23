import java.util.HashMap;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int a[] = {2,2,2};

        boolean b = findsum(a,a.length,7);
        System.out.println(b);
    }

    static boolean findsum(int arr[],int n,int sum)
    {
        //Your code here
        int curSum=0;
        int start =0;
        int end =-1;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0;i<n;i++){
            curSum = curSum+ arr[i];

            if(curSum-sum==0){
                start =0;
                end =i;
                return true;
            }
            if(map.containsKey(curSum-sum)){
                start = map.get(curSum-sum);
                end = i;
                return true;
            }
            map.put(curSum,i);


        }
        if(end==-1){
            return false;
        }
        return true;

    }
}
