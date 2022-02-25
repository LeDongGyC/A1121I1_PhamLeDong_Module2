package ss3_method_and_array.thuc_hanh;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
