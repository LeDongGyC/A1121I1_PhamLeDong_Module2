package Final.util;

import Final.model.BenhAnThuong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStringListToCSV {
    public static void writeStringListToCSV(String path, List<String> stringList, boolean append) {
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
//            for (int i = 0; i < strings.size(); i++) {
//                bufferedWriter.write(strings.get(i));
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < stringList.size(); i++) {
                bufferedWriter.write(stringList.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static List<String>  readStringListToCSV(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        BufferedReader br = null;
        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null){
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

}
