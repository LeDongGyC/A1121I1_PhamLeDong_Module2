package Final1.util;

import Final.util.ReadAndWriteStringListToCSV;
import Final1.model.DienThoaiChinhHang;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteChinhHang {
    public static void writeDTCHToCSV(String path, List<DienThoaiChinhHang> dienThoaiChinhHangList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            stringList.add(dienThoaiChinhHangList.get(i).toCSV1());
        }
        ReadAndWrite.writeStringListToCSV(path,stringList,append);
    }

    public static List<DienThoaiChinhHang> readDTCHToCSV(String path) {
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        String[] arr;
        for (String string : stringList) {
            arr = string.split(",");
            dienThoaiChinhHangList.add(new DienThoaiChinhHang(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5], arr[6]));
        }
        return dienThoaiChinhHangList;
    }
}

