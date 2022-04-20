package Case_study.services.Impl;

import Case_study.models.Villa;
import Case_study.services.FacilityService;
import Case_study.util.ReadAndWriteVillaListToCSV;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements FacilityService {
    final String VILLA_PATH_FILE = "src\\Case_study\\data\\Villa.csv";
    Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMaintenanceList() {
        boolean check = true;
        for (Villa villa : villaIntegerMap.keySet()) {
            int count = villaIntegerMap.get(villa);
            if (count >= 5) {
                System.out.println(villa.getTenDichvu());
                check = false;
            }
        }
        if (check) {
            System.out.println("Không có Villa Maintenance");
        }
    }

    @Override
    public void addNew() {
        System.out.println("Mời nhập mã dịch vụ:");
        String maDV = scanner.nextLine();
        System.out.println("Mời nhập tên dịch vụ:");
        String tenDV = scanner.nextLine();
        System.out.println("Mời nhập diện tích sử dụng");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập chi phí thuê:");
        double chiPhi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người tối đa");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập kiểu thuê:");
        String kieuThue = scanner.nextLine();
        System.out.println("Mời nhập tiêu chuẩn phòng:");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Mời nhập diện tích hồ bơi:");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(maDV, tenDV, dienTichSuDung, chiPhi, soNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        if (villaIntegerMap.containsKey(villa)) {
            villaIntegerMap.put(villa, villaIntegerMap.get(villa));
        } else {
            villaIntegerMap.put(villa, 0);
        }
//        List<String> stringList =
        ReadAndWriteVillaListToCSV.writeVillaListToCSV(VILLA_PATH_FILE, (LinkedHashMap<Villa, Integer>) villaIntegerMap, false);
    }

    @Override
    public void display() {
//        for (Map.Entry<Villa, Integer> element : villaIntegerMap.entrySet()) {
//            System.out.println("Dịch vụ: " + element.getKey() + ",số lần xuất hiện: " + element.getValue());
//        }
//        villaIntegerMap = ReadAndWriteVillaListToCSV.writeVillaListToCSV();
        villaIntegerMap = ReadAndWriteVillaListToCSV.readVillaListFromCSV(VILLA_PATH_FILE);
        for (Villa villa : villaIntegerMap.keySet()) {
            System.out.println(villa + ",số lần sử dụng: " + villaIntegerMap.get(villa));
        }
    }

    @Override
    public void edit() {

    }
}
