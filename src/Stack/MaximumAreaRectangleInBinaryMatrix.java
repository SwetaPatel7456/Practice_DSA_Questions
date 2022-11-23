package Stack;

import java.util.Arrays;

public class MaximumAreaRectangleInBinaryMatrix {

    public static void main(String[] args) {
        int m =4;
        int n =4;
        int a[][] ={{0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}};

    int b[] = new int[4];
    for(int i= 0;i<n;i++){
      b[i] = a[0][i];
    }
    MaximumAreaHistogram ms = new MaximumAreaHistogram();
    int h1 = ms.MAHValue(b);
    int maxArea[] = new int[4];
        System.out.println(h1);
    maxArea[0] =h1;
    for(int i = 1;i<m;i++){
       for(int j = 0;j<n;j++){
           if(a[i][j]==0){
               b[j] =0;
           }
           else{
               b[j] = b[j]+a[i][j];
           }
       }
       maxArea[i] = ms.MAHValue(b);
        System.out.println(maxArea[i]);
    }
        Arrays.sort(maxArea,0,4);
        System.out.println(maxArea[3]);
    }



}
