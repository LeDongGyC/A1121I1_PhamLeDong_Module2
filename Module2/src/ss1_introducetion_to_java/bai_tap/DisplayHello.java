package ss1_introducetion_to_java.bai_tap;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello World !!! My name is " + name);
    }
}
