package ss15_exception.thuc_hanh.su_dung_lop_numberformatexception;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x:");
        int x = scanner.nextInt();
        System.out.println("Nhap y:");
        int y = scanner.nextInt();
        Calculation calculation = new Calculation();
        calculation.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try {
            int tong = x + y;
            int hieu = x - y;
            int tich = x * y;
            int thuong = x / y;
        } catch (Exception e){
            System.out.println("Xay ra ngoai le:" + e.getMessage());
        }
    }
}
