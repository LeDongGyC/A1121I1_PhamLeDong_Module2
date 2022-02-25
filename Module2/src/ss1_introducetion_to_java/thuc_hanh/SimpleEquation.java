package ss1_introducetion_to_java.thuc_hanh;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            System.out.println("PT co nghiem " + -b / a);
        }
    }
}
