package ss16_IO_Text_File.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void copyFile(String source, String target) {
        File sourceFile = new File(source);
        File targetFile = new File(target);
        if (!sourceFile.exists()) {
            System.out.println("Source File Does Not Exist.");
        } else {
            String line;
            int count = 0;
            try (FileReader fileReader = new FileReader(sourceFile);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
                 FileWriter fileWriter = new FileWriter(targetFile);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    count += line.length();
                }
                bufferedWriter.write("Number of Character in File: " + count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Source File: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter Target File: ");
        String targetPath = scanner.nextLine();
        copyFile(sourcePath, targetPath);
        System.out.println("Copy Success..");
    }
}

//    WRITEFILE
//    public static void writeFile(String source, String target) {
//        File file = new File(source);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, true);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(target);
//            bufferedWriter.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
////        try (FileWriter fileWriter = new FileWriter(file);
////             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
////            fileWriter = new FileWriter(file, true);
////            bufferedWriter = new BufferedWriter(fileWriter);
////            bufferedWriter.write(target);
////            bufferedWriter.newLine();
////        } catch (IOException e) {
////            e.printStackTrace();
////        } finally {
////            try {
////                bufferedWriter.close();
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
//    READFILE
//    public static List<String[]> readFile(String source) {
//        File file = new File(source);
//        List<String[]> list = new ArrayList<>();
//        String line = null;
//        try (FileReader fileReader = new FileReader(file)) {
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] arr = line.split(",");
//                list.add(arr);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

