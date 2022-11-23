package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNegativeNumberInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int a[] = {-1,2,-3,4,5,6};
        solve(a,3);

    }

    public static void solve(int a[],int k){
        int i =0;
        int j =0;
        List<Integer>list = new ArrayList<>();

        while (j<a.length){
            if(a[j]<0){
                list.add(a[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(list.size()==0){
                    System.out.println(0);
                }
                else {
                    System.out.println(list.get(0));
                    if(a[i]==list.get(0)) {
                        list.remove(list.get(0));
                    }
                }
                i++;
                j++;

                }



            }
        }
    }

