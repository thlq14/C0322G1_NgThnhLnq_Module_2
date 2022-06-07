package _Extra_Exercises._school_management.utils.files;

import _Extra_Exercises._school_management.models.Student;
import _Extra_Exercises._school_management.models.Teacher;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String source, List<String> list) {
        File file = new File(source);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeStudent(String pathFile, List<Student> students) {
        List<String> list = new ArrayList<>();
        for (Student item : students) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeTeacher(String pathFile, List<Teacher> teachers) {
        List<String> list = new ArrayList<>();
        for (Teacher item : teachers) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static List<String> readFile(String source) {
        File file = new File(source);
        List<String> list = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Student> readStudent(String path) {
        List<String> list = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            students.add(new Student(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], item[5], Double.parseDouble(item[6])));
        }
        return students;
    }

    public static List<Teacher> readTeacher(String path) {
        List<String> list = readFile(path);
        List<Teacher> teachers = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            teachers.add(new Teacher(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], item[5], Double.parseDouble(item[6]), Double.parseDouble(item[7])));
        }
        return teachers;
    }
}
