package ss3_method_and_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DelElement {
    public static void main(String[] args) {
        int[] arr = InputArray();
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        xoaPtu(arr);
    }

    private static void xoaPtu(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu bang mua xoa:");
        int num = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Khong co phan tu trong mang");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                arr[arr.length - 1] = 0;
                i--;
                }
            }
        }
        arr = Arrays.copyOf(arr, arr.length-1);
        System.out.println("Mảng sau khi xóa là ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
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
