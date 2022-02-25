package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien da gui: ");
        double tienGui = scanner.nextDouble();
        System.out.println("Nhap lai suat: ");
        float laiSuat = scanner.nextFloat();
        System.out.println("Nhap so thang gui: ");
        int soThang = scanner.nextInt();
        double tongTien = 0;
        for (int i = 0; i < soThang; i++) {
            tongTien += tienGui * (laiSuat / 100) / 12 * soThang;
        }
        System.out.println(" Tong tien nhan duoc: " + tongTien);
    }
}
