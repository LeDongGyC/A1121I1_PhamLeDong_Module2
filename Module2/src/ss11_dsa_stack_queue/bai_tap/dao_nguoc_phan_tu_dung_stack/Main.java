package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int x : num){
            stack.push(x);
        }
        for (int i = 0; i < num.length; i++) {
//            num[i] = stack.pop();
            System.out.print(stack.pop() + " ");
        }
//        for (int x : num){
//            System.out.print(x + "\t");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap vao 1 chuoi: ");
        String word = scanner.nextLine();
        Stack<String> wStack = new Stack<>();
        String[] arrString = word.toLowerCase().split(" ");
        for (String s : arrString){
            wStack.push(s);
        }
        for (int i = 0; i < arrString.length; i++) {
            System.out.print(wStack.pop() + " ");
        }
    }
}
