package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi can kiem tra: ");
        String string = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = string.length()-1 ; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
        String str = "";
        if (!queue.isEmpty()) {
            do {
                str += queue.remove();
            } while (!queue.isEmpty());
        }
        if (string.equals(str)) {
            System.out.println("Chuoi nay la chuoi palindrome");
        } else {
            System.out.println("Chuoi nay khong phai la palindrome");
        }
    }
}
