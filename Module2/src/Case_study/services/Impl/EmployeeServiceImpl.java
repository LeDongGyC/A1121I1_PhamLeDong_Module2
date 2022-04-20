package Case_study.services.Impl;

import Case_study.models.Employee;
import Case_study.services.EmployeeService;
import Case_study.util.ReadAndWriteEmployeeListToCSV;
import Case_study.util.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private final String EMPLOYEE_PATH_FILE = "src\\Case_study\\data\\Employee.csv";
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID="(NV)[-][\\d]{4}";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";

    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    private String chonTrinhDo() {
        String trinhDo = "";
        System.out.println("Chọn trình độ nhân viên:\n" +
                "1.Trung cấp\n" +
                "2.Cao đẳng\n" +
                "3.Đại học\n" +
                "4.Sau đại học");
//        System.out.println("Moi ban chon Vi tri: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                trinhDo = "Trung cấp";
                break;
            case 2:
                trinhDo = "Cao đẳng";
                break;
            case 3:
                trinhDo = "đại học";
                break;
        }
        return trinhDo;
    }

    public String chonViTri() {
        String viTri = "";
        System.out.println("Mời bạn chọn vị trí: ");
        System.out.println("1.Lễ tân");
        System.out.println("2.Phục vụ");
        System.out.println("3.Chuyên viên");
        System.out.println("4.Giám sát");
        System.out.println("5.Quản lí");
        System.out.println("6.Giám đốc");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                viTri = "Lễ tân";
                break;
            case 2:
                viTri = "Phục vụ";
                break;
            case 3:
                viTri = "Chuyên viên";
                break;
            case 4:
                viTri = "Giám sát";
                break;
            case 5:
                viTri = "Quản lí";
                break;
            case 6:
                viTri = "Giám đốc";
        }
        return viTri;
    }

    @Override
    public void addNew() {
        System.out.println("Mời nhập mã nhân viên: ");
        String maNV = scanner.nextLine();
        System.out.println("Mời nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Mời nhập ngày sinh: ");
        String ngaySinh = RegexData.regexYear(scanner.nextLine(),REGEX_ID);
        System.out.println("Mời nhập giới tính ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Mời nhập số CMND");
        String soCMND = scanner.nextLine();
        System.out.println("Mời nhập số điện thoại");
        String soDT = scanner.nextLine();
        System.out.println("Mời nhập Email: ");
        String email = scanner.nextLine();
        String trinhDo = chonTrinhDo();
        String viTri = chonViTri();
        System.out.println("Mời nhập lương:");
        double luong = Double.parseDouble(scanner.nextLine());
//String hoTen, String ngaySinh, String gioiTinh, String soCMND,
// String soDT, String email, String maNV, String trinhDo, String viTri, double luong
        Employee employee = new Employee(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email,maNV, trinhDo, viTri, luong);
//        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWriteEmployeeListToCSV.writeEmployeeListToCSV(EMPLOYEE_PATH_FILE, employeeList, false);
    }

    private String inputID(){
        System.out.println("Nhập mã nhân viên: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID,"Vui lòng nhập lại!");
    }

    @Override
    public void display() {
////        List<Employee> employeeList = new ArrayList<>();
//        System.out.println("Danh sách nhân viên: ");
////        employeeList =ReadAndWriteEmployeeListToCSV.readEmployeeListToCSV(EMPLOYEE_PATH_FILE);
//        for (Employee employee : employeeList) {
//            System.out.println(employee);
//        }
        employeeList = ReadAndWriteEmployeeListToCSV.readEmployeeListToCSV(EMPLOYEE_PATH_FILE);
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên bạn muốn sữa: ");
        String maNhanVien = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNV().equals(maNhanVien)) {
                System.out.println(employeeList.get(i).toString());
                System.out.println();
                System.out.println("Nhập tên nhân viên: ");
                String hoten = scanner.nextLine();
                employeeList.get(i).setHoTen(hoten);
                System.out.println("Nhập ngày sinh:");
                String ngaysinh = scanner.nextLine();
                employeeList.get(i).setNgaySinh(ngaysinh);
                System.out.println("Nhập giới tính:");
                String gioitinh = scanner.nextLine();
                employeeList.get(i).setGioiTinh(gioitinh);
                System.out.println("Nhập email:");
                String email = scanner.nextLine();
                employeeList.get(i).setEmail(email);
                String trinhdo = chonTrinhDo();
                employeeList.get(i).setTrinhDo(trinhdo);
                String vitri = chonViTri();
                employeeList.get(i).setViTri(vitri);
                System.out.println("Nhập lương:");
                double luong = Double.parseDouble(scanner.nextLine());
                employeeList.get(i).setLuong(luong);
            }
        }
    }

    public void searchByName(){
        employeeList = ReadAndWriteEmployeeListToCSV.readEmployeeListToCSV(EMPLOYEE_PATH_FILE);
        System.out.println("Nhập tên Employee cần tìm kiếm:");
        String searchName = scanner.nextLine();
        boolean count = true;
        for (Employee employee : employeeList) {
            if (employee.getHoTen().contains(searchName)) {
                System.out.println(employee);
                count = false;
            }
        }
        if (count) {
            System.out.println("Không tìm thấy Employee nào!");
        }
    }

    public void delete(){
        employeeList = ReadAndWriteEmployeeListToCSV.readEmployeeListToCSV(EMPLOYEE_PATH_FILE);
        display();
        System.out.println("Chọn ID Employee cần xóa:");
        String chooseDelete = scanner.nextLine();
        employeeList.removeIf(employee -> Objects.equals(employee.getMaNV(), chooseDelete));
        ReadAndWriteEmployeeListToCSV.writeEmployeeListToCSV(EMPLOYEE_PATH_FILE,employeeList,false);
    }
}
