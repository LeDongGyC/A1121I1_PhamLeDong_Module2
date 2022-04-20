package Final.service;

import Final.model.BenhAnThuong;
import Final.util.ReadAndWriteThuongToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongServiceImp implements BenhAnThuongService {
    final String PATH_FILE_THUONG = "src\\Final\\data\\Thuong.csv";
    Scanner scanner = new Scanner(System.in);
    static List<BenhAnThuong> benhAnThuongList = new ArrayList<>();

    @Override
    public void addnew() {
        int stt = benhAnThuongList.size() + 1;
        System.out.println("Nhập mã bệnh án:");
        String maBenhAn = scanner.nextLine();
        System.out.println("Nhập tên bệnh nhân:");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Nhập ngày vào viện:");
        String ngayVaoVien = scanner.nextLine();
        System.out.println("Nhập ngày ra viện:");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Lý do nhập viên:");
        String lyDo = scanner.nextLine();
        System.out.println("Nhập viện phí:");
        double vienPhi = Double.parseDouble(scanner.nextLine());
        BenhAnThuong anThuong = new BenhAnThuong(stt, maBenhAn, tenBenhNhan, ngayVaoVien, ngayRaVien, lyDo, vienPhi);
        benhAnThuongList.add(anThuong);
        ReadAndWriteThuongToCSV.writeBenhAnThuongToCSV(PATH_FILE_THUONG, benhAnThuongList, true);
    }

    @Override
    public void display() {
    benhAnThuongList = ReadAndWriteThuongToCSV.readBenhAnThuongToCSV(PATH_FILE_THUONG);
        for (int i = 0; i < benhAnThuongList.size(); i++) {
            System.out.println(benhAnThuongList);
        }
    }

    @Override
    public void delete() {
        benhAnThuongList = ReadAndWriteThuongToCSV.readBenhAnThuongToCSV(PATH_FILE_THUONG);
        display();
        System.out.println("Chọn mã bệnh án cần xóa:");
        String chooseDelete = scanner.nextLine();
//        benhAnThuongList.removeIf(benhAnThuong-> Objects.equals(benhAnThuong.getMaBenhAn(), chooseDelete));
//        ReadAndWriteThuongToCSV.writeBenhAnThuongToCSV(PATH_FILE_THUONG,benhAnThuongList,false);
        for (int i = 0; i < benhAnThuongList.size(); i++) {
            if (chooseDelete.equals(benhAnThuongList.get(i).getMaBenhAn())){
                System.out.println("Mời xác nhận: ");
                System.out.println("1.Có\n" +
                        "2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        benhAnThuongList.remove(i);
                        ReadAndWriteThuongToCSV.writeBenhAnThuongToCSV(PATH_FILE_THUONG, benhAnThuongList,false);
                        System.out.println("Xoá thành công");
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Nhập sai");
                }
            }
        }
    }
}
