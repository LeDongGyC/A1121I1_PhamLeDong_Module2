package Final.util;

import Final.model.BenhAnThuong;
import Final.model.BenhAnVip;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteVipToCSV {
    public static void writeBenhAnVipToCSV(String path, List<BenhAnVip> benhAnVipsList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < benhAnVipsList.size(); i++) {
            stringList.add(benhAnVipsList.get(i).VipToCSV());
        }
        ReadAndWriteStringListToCSV.writeStringListToCSV(path, stringList, append);
    }

    public static List<BenhAnVip> readBenhAnVipToCSV(String path) {
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        List<BenhAnVip> benhAnVipList = new ArrayList<>();
        String[] arr;
        for (String string : stringList) {
            arr = string.split(",");
            benhAnVipList.add(new BenhAnVip(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]));
        }
        return benhAnVipList;
    }
}
