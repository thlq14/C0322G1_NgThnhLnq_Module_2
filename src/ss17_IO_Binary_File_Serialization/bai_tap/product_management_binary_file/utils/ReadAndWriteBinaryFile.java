package ss17_IO_Binary_File_Serialization.bai_tap.product_management_binary_file.utils;

import java.io.*;

public class ReadAndWriteBinaryFile {
    public static void writeFile (String pathFile, Object obj) {
        File file = new File(pathFile);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static Object readFile (String pathFile) {
        File file = new File(pathFile);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }
}
