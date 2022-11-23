import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int a[] ={0,0,2,1};
        sort012(a,a.length);
    }

    public static void sort012(int a[], int n)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else{
                map.put(a[i],map.get(a[i])+1);
            }
        }
        for(int i =0;i<=2;i++){
            if(map.get(i)!=null){
                int j = map.get(i);
                while(j>0){
                    System.out.println(i);
                    j--;
                }
            }
        }

    }
}
