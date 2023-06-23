package RotateImage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int matrix[][] =new int[a][b];
        //[[1,2,3],[4,5,6],[7,8,9]]
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};//result:[7,4,1],[8,5,2],[9,6,3]

        System.out.println(Arrays.deepToString(matrix2));

    }
}
