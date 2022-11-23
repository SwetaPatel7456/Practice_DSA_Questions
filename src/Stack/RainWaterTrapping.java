package Stack;

import java.util.Arrays;

import static java.lang.Math.min;
import static sun.swing.MenuItemLayoutHelper.max;

public class RainWaterTrapping {

    public void rainWaterTrap(int a[]){

        int[] waterLevel = new int[a.length];
        int maxInLeft = 0;
        int maxInRight =0;
        int level[] = new int[a.length];
        for(int i = 0;i<a.length;i++){
            maxInLeft = a[i];
            maxInRight = a[i];
            for(int j = i-1;j>=0;j--){
                if(maxInLeft<a[j]){
                    maxInLeft = a[j];

                }
                if(maxInRight<a[j]){
                    maxInRight = a[j];
                }
            }
            int min = min(maxInLeft,maxInRight);
            level[i] = min-a[i];

        }
        System.out.println(Arrays.toString(level));
    }

    public static void main(String[] args) {
        RainWaterTrapping rainWaterTrapping = new RainWaterTrapping();
        int a[] = {3,0,0,2,0,4};
       // rainWaterTrapping.rainWaterTrap(a);
        rainWaterTrapping.RainWaterUsingStack(a);
    }

    public void RainWaterUsingStack(int a[]){

        int maxLeft[] = new int[a.length];
        int maxRight[] = new int[a.length];
        maxLeft[0] = a[0];
        maxRight[a.length-1] = a[a.length-1];
        int min[] = new int[a.length];

        for(int i = 1 ;i<a.length;i++){
            maxLeft[i] = max(maxLeft[i-1],a[i]);
        }
        for(int i = a.length-2 ;i>=0;i--){
            maxRight[i] = max(maxLeft[i+1],a[i]);
        }
        for(int i = 0 ;i<a.length;i++){
            min[i] = min(maxLeft[i],maxRight[i]);
        }
        int waterLevel[] = new int[a.length];

        for(int i = 0 ;i<a.length;i++){
            if(min[i]<=a[i]){
                waterLevel[i] = 0;
            }
            else{
                waterLevel[i]= min[i]-a[i];
            }
        }

        System.out.println(Arrays.toString(waterLevel));
        int totalLevelOfWater=0;
        for(int i = 0 ;i<a.length;i++){
            totalLevelOfWater =totalLevelOfWater +waterLevel[i];
        }
        System.out.println(totalLevelOfWater);
    }
}
