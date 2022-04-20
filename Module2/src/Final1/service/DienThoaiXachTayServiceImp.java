package Final1.service;

import Final1.model.DienThoaiXachTay;
import Final1.util.NotFoundProductException;
import Final1.util.ReadAndWriteXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayServiceImp implements DienThoaiXachTayService {
    final String PATH_FILE_XT = "src\\Final1\\data\\XachTay.csv";
    List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        int id = dienThoaiXachTayList.size() + 1;
        System.out.println("Mời nhập tên điện thoại:");
        String tenDT = scanner.nextLine();
        System.out.println("Mời nhập giá bán:");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập số lượng:");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập nhà sản xuất:");
        String nhaSX = scanner.nextLine();
        System.out.println("Mời nhập quốc gia xách tay:");
        String qGXT = scanner.nextLine();
        System.out.println("Mời nhập trạng thái:");
        String trangThai = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, tenDT, giaBan, soLuong, nhaSX, qGXT, trangThai);
        dienThoaiXachTayList.add(dienThoaiXachTay);
        ReadAndWriteXachTay.writeDTXTToCSV(PATH_FILE_XT, dienThoaiXachTayList, false);
    }

    @Override
    public void display() {
        dienThoaiXachTayList = ReadAndWriteXachTay.readDTXTToCSV(PATH_FILE_XT);
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            System.out.println(dienThoaiXachTayList);
        }
    }

    @Override
    public void delete() throws NotFoundProductException {
        dienThoaiXachTayList = ReadAndWriteXachTay.readDTXTToCSV(PATH_FILE_XT);
        display();
        System.out.println("Chọn ID cần xoá:");
        int idChoice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getId() == idChoice) {
                System.out.println("Xác nhận: ");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        dienThoaiXachTayList.remove(i);
                        System.out.println("Xoá thành công");
                        for (int j = 0; j < dienThoaiXachTayList.size(); j++) {
                            System.out.println(dienThoaiXachTayList);
                        }
                    case 2:
                        break;
                }
            }
        }
    }

    @Override
    public void search() {
        dienThoaiXachTayList = ReadAndWriteXachTay.readDTXTToCSV(PATH_FILE_XT);
        System.out.println("Nhập tên điện thoại cần tìm kiếm:");
        String searchName = scanner.nextLine();
        boolean count = true;
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
            if (dienThoaiXachTay.getTenDT().contains(searchName)) {
                System.out.println(dienThoaiXachTay);
                count = false;
            }
        }
        if (count) {
            System.out.println("Không tìm thấy điện thoại tương ứng!");
        }
    }
}
