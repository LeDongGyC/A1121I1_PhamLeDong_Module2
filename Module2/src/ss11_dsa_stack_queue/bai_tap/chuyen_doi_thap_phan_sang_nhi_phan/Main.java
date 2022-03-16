package ss11_dsa_stack_queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so can chuyen sang nhi phan: ");
        int number = scanner.nextInt();
        while (number>0){
            stack.push(number%2);
            number/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
