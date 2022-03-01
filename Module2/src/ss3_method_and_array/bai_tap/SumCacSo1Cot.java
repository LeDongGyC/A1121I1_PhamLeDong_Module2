package ss3_method_and_array.bai_tap;

import java.util.Scanner;

public class SumCacSo1Cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong: ");
        int m = scanner.nextInt();
        System.out.println("Nhap cot: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu [" + i + "] [" + j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran 2 chieu: " + m + " x " + n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int s = sumCot(matrix);
        System.out.println("Tong la: " + s);
    }

    private static int sumCot(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        System.out.println("Nhap cot ban muon tinh: ");
        int n = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            tong += matrix[n-1][i];
        }
        return tong;
    }
}
