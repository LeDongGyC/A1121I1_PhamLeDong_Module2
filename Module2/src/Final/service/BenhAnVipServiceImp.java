package Final.service;

import Final.model.BenhAnVip;
import Final.util.ReadAndWriteVipToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipServiceImp implements BenhAnVipService {
    final String PATH_FILE_VIP = "src\\Final\\data\\Vip.csv";
    List<BenhAnVip> benhAnVips = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addnew() {
        int stt = benhAnVips.size() + 1;
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
        String loaiVip = chonLoaiVip();
        BenhAnVip benhAnVip = new BenhAnVip(stt, maBenhAn, tenBenhNhan, ngayVaoVien, ngayRaVien, lyDo, loaiVip);
        benhAnVips.add(benhAnVip);
        ReadAndWriteVipToCSV.writeBenhAnVipToCSV(PATH_FILE_VIP, benhAnVips, false);
    }

    public String chonLoaiVip() {
        String string = "";
        System.out.println("Chọn loại vip:\n" +
                "1.LOẠI 1\n" +
                "2.Loại 2\n" +
                "3.Loại 3\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                string = "Loại 1";
                break;
            case 2:
                string = "Loại 2";
                break;
            case 3:
                string = "Loại 3";
                break;
        }
        return string;
    }

    @Override
    public void display() {
        benhAnVips = ReadAndWriteVipToCSV.readBenhAnVipToCSV(PATH_FILE_VIP);
        for (int i = 0; i < benhAnVips.size(); i++) {
            System.out.println(benhAnVips);
        }
    }

    @Override
    public void delete() {
        benhAnVips = ReadAndWriteVipToCSV.readBenhAnVipToCSV(PATH_FILE_VIP);
        display();
        System.out.println("Chọn mã bệnh án cần xóa:");
        String chooseDelete = scanner.nextLine();
//        benhAnThuongList.removeIf(benhAnThuong-> Objects.equals(benhAnThuong.getMaBenhAn(), chooseDelete));
//        ReadAndWriteThuongToCSV.writeBenhAnThuongToCSV(PATH_FILE_THUONG,benhAnThuongList,false);
        for (int i = 0; i < benhAnVips.size(); i++) {
            if (chooseDelete.equals(benhAnVips.get(i).getMaBenhAn())) {
                System.out.println("Mời xác nhận: ");
                System.out.println("1.Có\n" +
                        "2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        benhAnVips.remove(i);
                        ReadAndWriteVipToCSV.writeBenhAnVipToCSV(PATH_FILE_VIP, benhAnVips, false);
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
