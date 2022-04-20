package ss14_sort_algorithm.bai_tap.minh_hoat_sap_xep_chen;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 1, 6, 2, 7};
//        for (int i = 1; i < numbers.length; i++) {
//            int currentElement = i;
//            int k = i - 1;
//            for (; k >=0 && numbers[k] > currentElement ; k--) {
//                numbers[k+1] = numbers[k];
//            }
//            numbers[k+1] = currentElement;
//        }
        int pos, x;
        for (int i = 1; i < numbers.length; i++) {
            x = numbers[i];
            pos = i;
            while (pos > 0 && x < numbers[pos - 1]) {
                numbers[pos] = numbers[pos - 1];
                pos--;
            }
            numbers[pos] = x;
        }
        for (int element : numbers) {
            System.out.print(element + "\t");
        }
    }
}
/* 4,3,6,1,6,2,7
*            x
*            pos*/

