package ss1_introducetion_to_java.thuc_hanh;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OperaterPrograming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap chieu rong: ");
        float width = scanner.nextFloat();
        System.out.println("Dien tich: " + height * width);
    }

}
