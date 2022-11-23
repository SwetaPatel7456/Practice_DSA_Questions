package Practice;

public class PermutationOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};

        for (int i = 0 ;i<a.length;i++){
            String s = permuationOfArray(a,i);
            System.out.println(s);
        }

    }
    public static String permuationOfArray(int a[],int i) {
        if(i==a.length-1){
            return String.valueOf(a[i]);
        }

        String s="";
        String r="";
        for (int j = 0; j < a.length; j++) {
            if (j != i) {
                 r =a[i]+permuationOfArray(a, j);
                System.out.println(r);
            }
            }
        return r;
    }
}
