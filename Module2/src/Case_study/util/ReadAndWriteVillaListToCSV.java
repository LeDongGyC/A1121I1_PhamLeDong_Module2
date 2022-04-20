package Case_study.util;

import Case_study.models.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadAndWriteVillaListToCSV {
    public static void writeVillaListToCSV(String path, LinkedHashMap<Villa, Integer> villaList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa : villaList.keySet()) {
            stringList.add(villa.toVillaCSV() + "," + villaList.get(villa));
        }
        ReadAndWriteStringListToCSV.writeStringListToCSV(path, stringList, append);
    }
    public static LinkedHashMap<Villa,Integer> readVillaListFromCSV(String path) {
        LinkedHashMap<Villa,Integer> villaMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        String[] arr = null;
        for (String str:stringList) {
            arr = str.split(",");
            //String maDichvu, String tenDichvu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa,
            // String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang
            Villa villa = new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6],Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
//            villaMap.put(villa, Integer.valueOf(array[8]));
            villaMap.put(villa, villaMap.get(villa));
        }
        return villaMap;
    }
}
