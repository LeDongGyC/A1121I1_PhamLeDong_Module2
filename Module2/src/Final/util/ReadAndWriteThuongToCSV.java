package Final.util;

import Final.model.BenhAnThuong;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteThuongToCSV {
    public static void writeBenhAnThuongToCSV(String path, List<BenhAnThuong> benhAnThuongList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < benhAnThuongList.size(); i++) {
            stringList.add(benhAnThuongList.get(i).thuongToCSV());
        }
        ReadAndWriteStringListToCSV.writeStringListToCSV(path, stringList, append);
    }

    public static List<BenhAnThuong> readBenhAnThuongToCSV(String path) {
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        List<BenhAnThuong> benhAnThuongList = new ArrayList<>();
        String[] arr;
        for (String string : stringList) {
            arr = string.split(",");
            benhAnThuongList.add(new BenhAnThuong(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], Double.parseDouble(arr[6])));
        }
        return benhAnThuongList;
    }
}
