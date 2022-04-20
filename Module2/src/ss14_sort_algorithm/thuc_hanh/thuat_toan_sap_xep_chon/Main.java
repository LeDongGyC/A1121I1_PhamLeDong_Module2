package ss14_sort_algorithm.thuc_hanh.thuat_toan_sap_xep_chon;

public class Main {
        static int[] numbers = {5,6,3,8,1,1,55};

    public static void main(String[] args) {
        selectionSort(numbers);
        for (int element : numbers){
            System.out.print(element + " ");
        }
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            int currentMin = numbers[i];
            int currentIndex = i;
            for (int j = i+1; j <numbers.length ; j++) {
                if (currentMin>numbers[j]){
                    currentMin = numbers[j];
                    currentIndex = j;
                }
            }
            if (currentIndex!=i){
                numbers[currentIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
