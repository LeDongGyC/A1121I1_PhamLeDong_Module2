package ss2_loop.bai_tap;

import java.util.Scanner;

public class PrintType {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("--------------MENU-----------------");
            System.out.println("1. Draw the retangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("chon chuc nang can thuc hien");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhap chieu dai: ");
                    int height = sc.nextInt();
                    System.out.println("Nhap chieu rong: ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.println(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Tam giac botton-left");
                    System.out.println("Nhap chieu cao:");
                    int size = sc1.nextInt();
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.println(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println("Tam giac top-left");
                    for (int i = size; i < 0; i++) {
                        for (int j = 0; j <= size; j++) {
                            System.out.println(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Enter the size");
                    int size2 = input3.nextInt();
                    for (int i = 1; i <= size2; i++) {
                        for (int j = 1; j < 2 * size2; j++) {
                            if (Math.abs(size2 - j) < i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Chuong trinh dang thoat!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Loi!!!");
            }
        }
    }
}
