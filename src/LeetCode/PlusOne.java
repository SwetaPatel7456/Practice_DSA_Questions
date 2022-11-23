package LeetCode;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String s = "";

        for(int i =0; i<digits.length;i++){
            s = s + Integer.toString(digits[i]);
        }
        System.out.println(s);
       Integer k = Integer.parseInt(s);
       int result = k+1;
       System.out.println(result);
       // for
        return null;

    }

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3};
        System.out.println(Arrays.toString(plusOne(a)));
    }
}
