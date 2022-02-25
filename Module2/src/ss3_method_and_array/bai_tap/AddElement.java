package ss3_method_and_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = InputArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        themPtu(arr);
    }

    private static void themPtu(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int index, num;
        System.out.println("Nhap phan tu ban muon them: ");
        num = scanner.nextInt();
        System.out.println("Nhap vi tri ban muon chen: ");
        index = scanner.nextInt();
        if (index < 0 || index > arr.length + 1) {
            System.out.println("Khong chen duoc");
        } else {
            arr = Arrays.copyOf(arr, arr.length + 1);
            for (int i = arr.length - 1; i >index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = num;
        }
        System.out.println("Mang sau khi nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
