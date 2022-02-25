package ss3_method_and_array.thuc_hanh;

public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {11,4,5,7,34,100,1};
        int index = findMin(arr);
        System.out.println("phan tu nho nhat: " + arr[index]);
    }

    private static int findMin(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
