package ss4_class_and_oop_in_java.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("PTVN");
        } else if (delta == 0) {
            System.out.println("PT co 1 nghiem kep x = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("PT co 2 nghiem ");
            System.out.println("x1 = " + quadraticEquation.getRoot1() + "x2 = " + quadraticEquation.getRoot2());
        }
    }
}

