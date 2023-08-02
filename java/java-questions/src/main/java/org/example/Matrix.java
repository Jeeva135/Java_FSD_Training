package org.example;

public class Matrix {
    public static boolean findTarget(int [][] matrix,int target){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                if (matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(findTarget({{1,3,5,7},{10,11,16,20},{23,30,34,60}},3));
    }
}
