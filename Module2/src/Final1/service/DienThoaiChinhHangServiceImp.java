package Final1.service;

import Final1.model.DienThoaiChinhHang;
import Final1.util.NotFoundProductException;
import Final1.util.ReadAndWriteChinhHang;
import Final1.util.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangServiceImp implements DienThoaiChinhHangService {
    public static final String REGEX_STR = "yyyy";
    final String PATH_FILE_CH = "src\\Final1\\data\\ChinhHang.csv";
    List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        int id = dienThoaiChinhHangList.size() + 1;
        System.out.println("Mời nhập tên điện thoại:");
        String tenDT = scanner.nextLine();
        System.out.println("Mời nhập giá bán:");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập số lượng:");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập nhà sản xuất:");
        String nhaSX = scanner.nextLine();
        System.out.println("Mời nhập thời gian bảo hành:");
//        String tgBH = RegexData.regexYear(scanner.nextLine(),REGEX_STR);
        String tgBH = scanner.nextLine();
        System.out.println("Mời nhập phạm vi bảo hành:");
        String pVBH = scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, tenDT, giaBan, soLuong, nhaSX, tgBH, pVBH);
        dienThoaiChinhHangList.add(dienThoaiChinhHang);
        ReadAndWriteChinhHang.writeDTCHToCSV(PATH_FILE_CH, dienThoaiChinhHangList, true);
    }

    @Override
    public void display() {
        dienThoaiChinhHangList = ReadAndWriteChinhHang.readDTCHToCSV(PATH_FILE_CH);
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            System.out.println(dienThoaiChinhHangList.get(i));
        }
    }

    @Override
    public void delete() throws NotFoundProductException {
        dienThoaiChinhHangList = ReadAndWriteChinhHang.readDTCHToCSV(PATH_FILE_CH);
        display();
        System.out.println("Chọn ID cần xoá:");
        int idChoice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getId() == idChoice) {
                System.out.println("Xác nhận:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        dienThoaiChinhHangList.remove(i);
                        System.out.println("Xoá thành công");
                        for (int j = 0; j < dienThoaiChinhHangList.size(); j++) {
                            System.out.println(dienThoaiChinhHangList);
                        }
                    case 2:
                        break;
                }
            } else {
                throw new NotFoundProductException("Không có sản phẩm cần tìm");
            }
        }
    }

    @Override
    public void search() {
        dienThoaiChinhHangList = ReadAndWriteChinhHang.readDTCHToCSV(PATH_FILE_CH);
        System.out.println("Nhập tên điện thoại cần tìm kiếm:");
        String searchName = scanner.nextLine();
        boolean count = true;
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
            if (dienThoaiChinhHang.getTenDT().contains(searchName)) {
                System.out.println(dienThoaiChinhHang);
                count = false;
            }
        }
        if (count) {
            System.out.println("Không tìm thấy điện thoại tương ứng!");
        }
    }
}
