package Case_study.services.Impl;

import Case_study.models.Customer;
import Case_study.services.CustomerService;
import Case_study.util.ReadAndWriteCustomerListToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    final String CUSTOMER_PATH_FILE = "src\\Case_study\\data\\Customer.csv";
    public String chonLoaiKH() {
        String loaiKH = "";
        System.out.println("Mời bạn chọn loại khách hàng");
        System.out.println("1.Member\n" +
                "2.Silver\n" +
                "3.Gold\n" +
                "4.Platinum\n" +
                "5.Diamond");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                loaiKH = "Menber";
                break;
            case 2:
                loaiKH = "Silver";
                break;
            case 3:
                loaiKH = "Gold";
                break;
            case 4:
                loaiKH = "Platinum";
                break;
            case 5:
                loaiKH = "Diamond";
                break;
        }
        return loaiKH;
    }

    @Override
    public void addNew() {
        System.out.println("Mời nhập mã khách hàng: ");
        String maKh = scanner.nextLine();
        System.out.println("Mời nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Mời nhập ngày sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.println("Mời nhập giới tính ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Mời nhập số CMND");
        String soCMND = scanner.nextLine();
        System.out.println("Mời nhập số điện thoại:");
        String soDT = scanner.nextLine();
        System.out.println("Mời nhập Email: ");
        String email = scanner.nextLine();
        String loaiKh = chonLoaiKH();
        System.out.println("Mời địa chỉ:");
        String diaChi = scanner.nextLine();
        //String hoTen, String ngaySinh, String gioiTinh, String soCMND, String email,
        // String soDT, String maKH, String loaiKH, String diaChi
//        Customer customer = new Customer(hoTen, ngaySinh, gioiTinh, soCMND, email, soDT, maKh, email, loaiKh, diaChi);
//        Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,email,soDT,maKh,loaiKh,diaChi);
        customerList.add(new Customer(hoTen,ngaySinh,gioiTinh,soCMND,email,soDT,maKh,loaiKh,diaChi));
        ReadAndWriteCustomerListToCSV.writeCustomerListToCSV(CUSTOMER_PATH_FILE, customerList, false);
    }


    @Override
    public void display() {
//        for (Customer customer : customerList) {
//            System.out.println(customer.toString());
//        }
        customerList = ReadAndWriteCustomerListToCSV.readCustomerListToCSV(CUSTOMER_PATH_FILE);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng bạn muốn sửa:");
        String maKhachHang = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKH().equals(maKhachHang)) {
                System.out.println(customerList.get(i).toString());
                System.out.println("Mời nhập họ và tên: ");
                String hoTen = scanner.nextLine();
                customerList.get(i).setHoTen(hoTen);

                System.out.println("Mời nhập ngày sinh: ");
                String ngaySinh = scanner.nextLine();
                customerList.get(i).setNgaySinh(ngaySinh);

                System.out.println("Mời nhập giới tính ");
                String gioiTinh = scanner.nextLine();
                customerList.get(i).setGioiTinh(gioiTinh);

                System.out.println("Nhập email:");
                String email = scanner.nextLine();
                customerList.get(i).setEmail(email);

                String loaiKH = chonLoaiKH();
                customerList.get(i).setLoaiKH(loaiKH);

                System.out.println("Nhập địa chỉ:");
                String diaChi = scanner.nextLine();
                customerList.get(i).setDiaChi(diaChi);
            }
        }
    }
}
