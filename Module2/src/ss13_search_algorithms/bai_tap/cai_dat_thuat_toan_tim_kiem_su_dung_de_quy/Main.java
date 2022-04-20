package ss13_search_algorithms.bai_tap.cai_dat_thuat_toan_tim_kiem_su_dung_de_quy;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random(50);
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(50);
        }

        Arrays.sort(numbers);
        for (int arr : numbers){
            System.out.print(arr + " ");
        }

        int n = random.nextInt(50);
        System.out.println();
        System.out.println("Vi tri cua " + n + ": "  + binarySearch(numbers, n, 0, length-1));
    }

    private static int binarySearch(int[] numbers, int n, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (numbers[mid] == n) {
            return mid;
        }
        if (numbers[mid] > n) {
            return binarySearch(numbers, n, low, mid - 1);
        } else {
            return binarySearch(numbers, n, mid + 1, high);
        }
    }
}
