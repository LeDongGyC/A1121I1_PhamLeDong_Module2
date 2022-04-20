package Final1.controllers;

import Final1.model.DienThoaiXachTay;
import Final1.service.DienThoaiChinhHangService;
import Final1.service.DienThoaiChinhHangServiceImp;
import Final1.service.DienThoaiXachTayService;
import Final1.service.DienThoaiXachTayServiceImp;
import Final1.util.NotFoundProductException;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangServiceImp();
    DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayServiceImp();

    public void displayMenu() {
        int choice;
        try {
            while (true) {
                System.out.println("---MENU---");
                System.out.println("Mời chọn chức năng:");
                System.out.println("1.Thêm mới");
                System.out.println("2.Xoá");
                System.out.println("3.Hiển thị");
                System.out.println("4.Tìm kiếm");
                System.out.println("5.Thoát");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addNew();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        search();
                        break;
                    case 5:
                        System.out.println("Chương trình đang thoát...");
                        System.exit(5);
                }
            }
        } catch (NumberFormatException | NotFoundProductException e) {
            System.out.println("Lỗi");
        }
    }

    private void addNew() {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Thêm mới điện thoại chính hãng:");
            System.out.println("2.Thêm mới điện thoạt xách tay:");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.addNew();
                    break;
                case 2:
                    dienThoaiXachTayService.addNew();
                    break;
                case 3:
                    displayMenu();
            }
        }
    }

    private void delete() throws NotFoundProductException {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Xoá điện thoại chính hãng");
            System.out.println("2.Xoá điện thoạt xách tay");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.delete();
                    break;
                case 2:
                    dienThoaiXachTayService.delete();
                    break;
                case 3:
                    displayMenu();
            }
        }
    }

    private void display() {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Hiển thị điện thoại chính hãng");
            System.out.println("2.Hiển thị điện thoạt xách tay");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.display();
                    break;
                case 2:
                    dienThoaiXachTayService.display();
                    break;
                case 3:
                    displayMenu();
            }
        }
    }

    private void search() {
        boolean flag = true;
        while (flag) {
            System.out.println("Mời chọn chức năng:");
            System.out.println("1.Tìm kiếm điện thoại chính hãng");
            System.out.println("2.Tìm kiếm điện thoạt xách tay");
            System.out.println("3.Hiển thị menu");
            System.out.println("Mời chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.search();
                    break;
                case 2:
                    dienThoaiXachTayService.search();
                case 3:
                    displayMenu();
            }
        }
    }
}
