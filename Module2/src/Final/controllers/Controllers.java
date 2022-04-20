package Final.controllers;

import Final.service.BenhAnThuongServiceImp;
import Final.service.BenhAnThuongService;
import Final.service.BenhAnVipService;
import Final.service.BenhAnVipServiceImp;

import java.util.Scanner;

public class Controllers {
    Scanner scanner = new Scanner(System.in);
    BenhAnThuongService benhAnThuongService = new BenhAnThuongServiceImp();
    BenhAnVipService benhAnVipService = new BenhAnVipServiceImp();

    public void displayMenu() {
        int choice;
        try {
            while (true) {
                System.out.println("---MENU---");
                System.out.println("1.Thêm mới");
                System.out.println("2.Hiển thị");
                System.out.println("3.Xoá");
                System.out.println("4.Thoát");
                System.out.println("Mời chọn chức năng:");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        themMoi();
                        break;
                    case 2:
                        hienThi();
                        break;
                    case 3:
                        xoa();
                        break;
                    case 4:
                        System.out.println("Đang thoát");
                        System.exit(4);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi");
        }
    }

    private void themMoi() {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Thêm mới bệnh án thường");
            System.out.println("2.Thêm mới bệnh án Vip");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    benhAnThuongService.addnew();
                    break;
                case 2:
                    benhAnVipService.addnew();
                    break;
                case 3:
                    displayMenu();
            }
        }
    }

    private void hienThi() {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Hiển thị bệnh án thường");
            System.out.println("2.Hiển th bệnh án Vip");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    benhAnThuongService.display();
                    break;
                case 2:
                    benhAnVipService.display();
                    break;
                case 3:
                    displayMenu();
            }
        }
    }

    private void xoa() {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Xoá bệnh án thường");
            System.out.println("2.Xoá bệnh án Vip");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    benhAnThuongService.delete();
                    break;
                case 2:
                    benhAnVipService.display();
                    break;
                case 3:
                    displayMenu();
            }
        }
    }
}
