package ss15_exception.thuc_hanh.su_dung_lop_arrayindexoutofboundsexception;

import java.util.Random;

public class ArrayExample {
    public int[] createRandom(){
        Random random = new Random(100);
        int[] numbers = new int[100];
        System.out.println("Danh sách phần tử của mảng:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        return numbers;
    }
}
