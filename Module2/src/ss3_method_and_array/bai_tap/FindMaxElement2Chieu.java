package ss3_method_and_array.bai_tap;

import java.util.Scanner;

public class FindMaxElement2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong: ");
        int m = scanner.nextInt();
        System.out.println("Nhap cot: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Mang 2 chieu " + m + " x " + n + ": ");
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Phan tu lon nhat trong mang: " + findMax(matrix));
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(max<matrix[i][j])
                    max = matrix[i][j];
            }
        }
        return max;
    }


}
