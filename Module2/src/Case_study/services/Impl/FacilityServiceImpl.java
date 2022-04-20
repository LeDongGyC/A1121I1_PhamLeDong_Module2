package Case_study.services.Impl;

import Case_study.controllers.FuramaController;
import Case_study.models.Facility;
import Case_study.models.House;
import Case_study.models.Room;
import Case_study.models.Villa;
import Case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    HouseService houseService = new HouseService();
    VillaService villaService = new VillaService();
    RoomService roomService = new RoomService();
    static Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void addNew() {
        boolean check = true;
        while (check) {
            System.out.println("Mời bạn chọn cơ sở:\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 4:
                    check = false;
            }
        }
    }

    private void addRoom() {
        roomService.addNew();
    }

    private void addHouse() {
        houseService.addNew();
    }

    private void addVilla() {
        villaService.addNew();
    }


    @Override
    public void display() {
        System.out.println("Chọn Facility cần hiển thị:\n" +
                "1.Display Villa\n" +
                "2.Display House\n" +
                "3.Display Room\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                villaService.display();
                break;
            case 2:
                houseService.display();
                break;
            case 3:
                roomService.display();
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayMaintenanceList() {
        boolean flag = true;
        while (flag) {
            System.out.println("Danh sách cơ sở vật chất bảo trì:");
            System.out.println("1.Villa Maintenance\n" +
                    "2.House Maintenance\n" +
                    "3.Room Maintenance");
            System.out.println("Mời bạn chọn chức năng:");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean check = true;
            switch (choice) {
                case 1:
                    LinkedHashMap<Villa, Integer> villaMap = new LinkedHashMap<>();
                    for (Villa villa : villaMap.keySet()) {
                        int count = villaMap.get(villa);
                        if (count >= 5) {
                            System.out.println(villa.getTenDichvu());
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println("Không có Villa Maintenance");
                    } else {
                        System.out.println("");
                    }
                case 2:
                    LinkedHashMap<House, Integer> houseMap = new LinkedHashMap<>();
                    for (House house : houseMap.keySet()) {
                        int count = houseMap.get(house);
                        if (count >= 5) {
                            System.out.println(house.getTenDichvu());
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println("Không có House Maintenance");
                    } else {
                        System.out.println("");
                    }
                case 3:
                    LinkedHashMap<Room, Integer> roomMap = new LinkedHashMap<>();
                    for (Room room : roomMap.keySet()) {
                        int count = roomMap.get(room);
                        if (count >= 5) {
                            System.out.println(room.getTenDichvu());
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println("Không có Room Maintenance");
                    } else {
                        System.out.println("");
                    }
            }
        }
    }
}
