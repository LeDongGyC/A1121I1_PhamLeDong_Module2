package ss15_exception.thuc_hanh.su_dung_lop_arrayindexoutofboundsexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập index:");
        int index = scanner.nextInt();
        try{
            System.out.println("Gía trị của phần tử có index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá độ dài của mảng");
        }
    }
}
