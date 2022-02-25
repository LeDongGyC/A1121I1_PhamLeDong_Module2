package ss3_method_and_array.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        System.out.println("Nhap mang 1: ");
        int[] arr1 = InputArray();
        System.out.println("Nhap mang 2: ");
        int[] arr2 = InputArray();
        int[] arr3 = gopMang(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    private static int[] gopMang(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr.length; i++) {
            arr[i] = arr2[i - arr1.length];
        }
        return arr;
    }

    private static int[] InputArray() {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap do dai cua chuoi: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Khong vuot qua 20");
            }
        } while (size > 20);
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
