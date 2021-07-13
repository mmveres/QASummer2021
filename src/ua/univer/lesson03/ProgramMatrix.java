package ua.univer.lesson03;

import java.util.Arrays;

public class ProgramMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
        System.out.println(matrix[2].length);

        changeDiagMatrix(matrix);

        System.out.println(Arrays.deepToString(matrix));
        printMatrix(matrix);
    }

    private static void changeDiagMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) matrix[i][j] = 0;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
