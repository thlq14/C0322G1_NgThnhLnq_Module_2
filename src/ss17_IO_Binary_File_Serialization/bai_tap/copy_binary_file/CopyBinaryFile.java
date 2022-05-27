package ss17_IO_Binary_File_Serialization.bai_tap.copy_binary_file;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void copyBinary (File source, File target) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        if (!source.exists()) {
            System.out.println("Source File Doesn't Exist.");
        } else {
            try {
                is = new FileInputStream(source);
                os = new FileOutputStream(target);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = is.read(bytes)) > 0) {
                    os.write(bytes, 0, length);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                is.close();
                os.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Source File: ");
        File sourcePath = new File(scanner.nextLine());
        System.out.println("Enter Target File: ");
        File targetPath = new File(scanner.nextLine());
        copyBinary(sourcePath, targetPath);
        System.out.println("Copy Success..");
    }
}
