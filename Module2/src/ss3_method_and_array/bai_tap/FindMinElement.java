package ss3_method_and_array.bai_tap;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = inputArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Phan tu nho nhat nam o vi tri: " + (indexMin(arr)+1));
    }

    private static int indexMin(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    private static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhap do dai cua mang: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Loi!!!");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return array;
    }


}
