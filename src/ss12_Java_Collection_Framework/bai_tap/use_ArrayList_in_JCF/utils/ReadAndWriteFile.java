package ss12_Java_Collection_Framework.bai_tap.use_ArrayList_in_JCF.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String source, String target) {
        File file = new File(source);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(target);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String[]> readFile(String source) {
        File file = new File(source);
        List<String[]> list = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
