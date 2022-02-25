package ss3_method_and_array.thuc_hanh;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name  = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Ten can tim nam o vi tri " + (i+1));
                check = true;
                break;
            }
            if (!check){
                System.out.println("Khong co ten trong list");
            }
        }
    }
}
