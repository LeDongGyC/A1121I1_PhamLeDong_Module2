package Case_study.services.Impl;

import Case_study.models.House;
import Case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements FacilityService {
    Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMaintenanceList() {
        boolean check = true;
        for (House house : houseIntegerMap.keySet()) {
            int count = houseIntegerMap.get(house);
            if (count >= 5) {
                System.out.println(house.getTenDichvu());
                check = false;
            }
        }
        if (check) {
            System.out.println("Không có House Maintenance");
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
        System.out.println("Nhập số tầng");
        int soTang = Integer.parseInt(scanner.nextLine());
        House house = new House(maDV, tenDV, dienTichSuDung, chiPhi, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
//        if (houseIntegerMap.containsKey(house)) {
//            houseIntegerMap.put(house, houseIntegerMap.get(house));
//        } else {
//            houseIntegerMap.put(house, 0);
//        }
        houseIntegerMap.put(house, 0);
    }

    @Override
    public void display() {
        for (Map.Entry<House, Integer> element : houseIntegerMap.entrySet()) {
            System.out.println("Dịch vụ " + element.getKey() + " số lần xuất hiện: " + element.getValue());
        }
    }

    @Override
    public void edit() {

    }

}
