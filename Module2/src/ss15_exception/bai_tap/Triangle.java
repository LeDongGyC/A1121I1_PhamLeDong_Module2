package ss15_exception.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void nhapDoDai() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai canh 1:");
        int a = scanner.nextInt();
        System.out.println("Nhap do dai canh 2:");
        int b = scanner.nextInt();
        System.out.println("Nhap do dai canh 3:");
        int c = scanner.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalTriangleException("Day khong phai la tam giac");
        }
    }

    public static void main(String[] args) {
        try{
            nhapDoDai();
        } catch (IllegalTriangleException e) {
            System.out.println(e.toString());
        }

    }
}
