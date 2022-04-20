package ss14_sort_algorithm.bai_tap.cai_dat_sap_xep_chen;

public class Main {
    static int[] numbers = {4, 3, 6, 1, 6, 2, 7};

    public static void insertionSort(int[] numbers) {
        int x, pos;
        for (int i = 1; i < numbers.length; i++) {
            x = numbers[i];
            pos = i;
            while (pos > 0 && x < numbers[pos-1]){
                numbers[pos] = numbers[pos -1];
                pos--;
            }
            numbers[pos] = x;
        }
        for (int element : numbers){
            System.out.print(element + "\t");
        }
    }

    public static void main(String[] args) {
        insertionSort(numbers);
    }
}
