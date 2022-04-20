package ss14_sort_algorithm.thuc_hanh.thuat_toan_sap_xep_noi_bot;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 7, 1, 11, 9};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j >i; j--) {
                if (numbers[j-1]>numbers[j]){
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int element : numbers){
            System.out.print(element + " ");
        }
    }
}
