package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int a[]= {-1,0,1,-2,0,2};
        int c[] = threeSum1(a);
        System.out.println(Arrays.toString(c));
    }


    public static int[] threeSum1(int a[] ){

        int target = 0;
        List<List<Integer>> gg = new ArrayList<List<Integer>>();
        Arrays.sort(a);
        for(int k = 0; k<a.length; k++) {
            target = a[k];
            int i = 0;
            int j = a.length-1;
            while (i < j  ) {
                if (a[i] + a[j] == -target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(target);
                    list.add(a[i]);
                    list.add(a[j]);
                    gg.add(list);
                    i++;j--;

                } else if (a[i] + a[j] > target) {
                    j--;
                } else if (a[i] + a[j] < target) {
                    i++;
                }
            }
        }
        System.out.println(gg.size());
        System.out.println(gg.get(0));
        return null;
    }

}
