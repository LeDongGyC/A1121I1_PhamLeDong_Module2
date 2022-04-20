package ss13_search_algorithms.thuc_hanh.cai_dat_thuat_toan_khong_su_dung_de_quy;

public class Main {
    public static void main(String[] args) {
        int[] list  ={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 30));
    }

    private static int binarySearch(int[] list, int n) {
        int low = 0, high = list.length, mid = (low + high)/2;
        while (low <=high){
            if(list[mid]==n){
                return mid;
            } else if (list[mid]>n){
                high = mid -1;
            } else {
                low = mid +1;
            }
            mid = (low + high)/2;
        }
        return -1;
    }
}
