package ProductOfRemainingElements;

import java.util.Arrays;

public class ProductRemainingElements {
    public static boolean canPartition(int [] a){
        int prod=1;
        int item=0;
        for (int i:a){
            item=i;
            prod=1;
            for (int j=0;j<a.length;j++){
                if (a[j]!=item){
                    prod*=a[j];
                }
            }
            if (prod==item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int []{2, 8, 4, 1})); // true => 8 = 2 X 4 X 1
        System.out.println(canPartition(new int[]{-1, -10, 1, -2, 20})); // false
        System.out.println(canPartition(new int[]{-1, -20, 5, -1, -2, 2})); // true

    }
}
