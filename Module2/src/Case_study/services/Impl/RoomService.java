package Case_study.services.Impl;

import Case_study.models.Room;
import Case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomService implements FacilityService {
    Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMaintenanceList() {
        boolean check = true;
        for (Room room : roomIntegerMap.keySet()) {
            int count = roomIntegerMap.get(room);
            if (count >= 5) {
                System.out.println(room.getTenDichvu());
                check = false;
            }
        }
        if (check) {
            System.out.println("Không có Room Maintenance");
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
        System.out.println("Mời nhập dịch vụ miễn phí đi kèm");
        String dichVuDiKem = scanner.nextLine();
        Room room = new Room(maDV, tenDV, dienTichSuDung, chiPhi, soNguoiToiDa, kieuThue, dichVuDiKem);
        if (roomIntegerMap.containsKey(room)) {
            roomIntegerMap.put(room, roomIntegerMap.get(room));
        } else {
            roomIntegerMap.put(room, 0);
        }
    }

    @Override
    public void display() {
        for (Map.Entry<Room, Integer> element : roomIntegerMap.entrySet()){
            System.out.println("Dịch vụ: " + element.getKey() + "số lần xuất hiện: " + element.getValue());
        }
    }

    @Override
    public void edit() {

    }
}
