package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat");
        int a = scanner.nextInt();
        System.out.println("Nhap so thu hai");
        int b = scanner.nextInt();
        if (a == 0 || b == 0) {
            if (a == b) {
                System.out.println("Khong co uoc chung lon nhat");
            } else if (a == 0) {
                System.out.println("Uoc so chung lon nhat: " + b);
            } else {
                System.out.println("Uoc so chung lon nhat: " + a);
            }
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Uoc so chung lon nhat: " + a);
        }
    }
}
