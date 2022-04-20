package Final1.util;

import Final.util.ReadAndWriteStringListToCSV;
import Final1.model.DienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteXachTay {
    public static void writeDTXTToCSV(String path, List<DienThoaiXachTay>  dienThoaiXachTayList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            stringList.add(dienThoaiXachTayList.get(i).toCSV2());
        }
        ReadAndWrite.writeStringListToCSV(path,stringList,append);
    }

    public static List<DienThoaiXachTay> readDTXTToCSV(String path) {
        List<String> stringList = ReadAndWriteStringListToCSV.readStringListToCSV(path);
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        String[] arr;
        for (String string : stringList) {
            arr = string.split(",");
            dienThoaiXachTayList.add(new DienThoaiXachTay(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5], arr[6]));
        }
        return dienThoaiXachTayList;
    }
}
