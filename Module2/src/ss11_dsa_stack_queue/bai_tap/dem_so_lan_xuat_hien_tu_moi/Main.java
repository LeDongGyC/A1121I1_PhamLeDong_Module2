package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_tu_moi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi: ");
        String string = scanner.nextLine();
        String[] arr = string.toLowerCase().split(" ");
        for (String key : arr){
            if (treeMap.containsKey(key)){
                int value = treeMap.get(key);
                treeMap.put(key, ++value);
            } else {
                treeMap.put(key, 1);
            }
        }
        System.out.println("So lan xuat hien ki tu: ");
        for (String element : treeMap.keySet()){
            System.out.println(element + ": " + treeMap.get(element));
        }
    }
}
