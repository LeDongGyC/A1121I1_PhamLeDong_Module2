package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("--------CHUONG TRINH QUAN LI--------");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua thong tin san pham theo id");
            System.out.println("3.Xoa san pham theo id ");
            System.out.println("4.Hien thi danh sach san pham");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Sap xep san pham theo thu tu tang dan");
            System.out.println("7.Sap xep san pham theo thu tu giam dan");
            System.out.println("0.Thoat chuong trinh");
            System.out.println("Moi ban chon chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewProduct(scanner);
                    break;
                case 2:
                    editProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    displayList(scanner);
                    break;
                case 5:
                    searchName(scanner);
                    break;
                case 6:
                    sortAscending();
                    break;
                case 7:
                    sortDecrease();
                    break;
                case 0:
                    System.out.println("Chuong trinh dang thoat...");
                    System.exit(0);
                default:
                    System.out.println("Loi.Vui long nhap lai!");
            }
        }
    }

    private static void sortDecrease() {
        System.out.println("Sap xep gia san pham giam dan: ");
        SapXepGiamDan sapXepGiamDan = new SapXepGiamDan();
        Collections.sort(productList, sapXepGiamDan);
        displayList(scanner);
        Main main = new Main();
    }

    private static void sortAscending() {
        System.out.println("Sap xep gia san pham tang dan: ");
        SapXepTangDan sapXepTangDan = new SapXepTangDan();
        Collections.sort(productList, sapXepTangDan);
        displayList(scanner);
    }

    private static void searchName(Scanner scanner) {
        System.out.println("Nhap ten san pham muon tim kiem: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println("San pham dang tim: " + productList.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Khong co san pham can tim");
        }
    }

    private static void displayList(Scanner scanner) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void deleteProduct(Scanner scanner) {
        System.out.println("Nhap id san pham muon xoa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.remove(i);
            }
        }
    }

    private static void editProduct(Scanner scanner) {
        System.out.println("Nhap id san pham muon sua: ");
        String id = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                System.out.println("Nhap vao ten san pham: ");
                String name = scanner.nextLine();
                System.out.println("Nhap vao gia san pham: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
            }
        }
    }

    private static List<Product> productList = new ArrayList<>();

    private static void addNewProduct(Scanner scanner) {
        Product product = null;
        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Nhap vao id san pham: ");
        String id = scanner.nextLine();
        System.out.println("Nhap vao gia san pham: ");
        int price = Integer.parseInt(scanner.nextLine());
        product = new Product(name, id, price);
        productList.add(product);
    }

//    private void addNewProduct(scanner) {
//        Product product = new Product();
//        System.out.println("Nhap ten san pham: ");
//        String name =
//    }

}
