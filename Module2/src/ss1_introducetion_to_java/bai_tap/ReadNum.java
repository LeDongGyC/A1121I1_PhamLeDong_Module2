package ss1_introducetion_to_java.bai_tap;

import java.util.Scanner;

public class ReadNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Nhap so can doc");
        num = scanner.nextInt();
        String str = null;
        if (num >= 0 &&num< 10){
            switch (num) {
                case 0:
                    str = "zero";
                    break;
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "three";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;
            }
        }else if (num < 20) {
            switch (num - 10) {
                case 0:
                    str = "ten";
                    break;
                case 1:
                    str = "eleven";
                    break;
                case 2:
                    str = "twelve";
                    break;
                case 3:
                    str = "thirteen";
                    break;
                case 4:
                    str = "fourteen";
                    break;
                case 5:
                    str = "fifteen";
                    break;
                case 6:
                    str = "sixteen";
                    break;
                case 7:
                    str = "seventeen";
                    break;
                case 8:
                    str = "eighteen";
                    break;
                case 9:
                    str = "nineteen";
                    break;
            }
        } else {
            str = ("out of ability");
        }
        System.out.println(str);
    }
}
