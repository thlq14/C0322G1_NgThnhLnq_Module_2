package _Extra_Exercises._codegym_management.utils.files;

import _Extra_Exercises._codegym_management.models.Student;
import _Extra_Exercises._codegym_management.models.Teacher;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String path, List<String> list) {
        File file = new File(path);
        FileWriter fW;
        BufferedWriter bW = null;
        try {
            fW = new FileWriter(file, false);
            bW = new BufferedWriter(fW);
            for (String item : list) {
                bW.write(item);
                bW.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bW.close();
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
        try (FileReader fR = new FileReader(file)) {
            BufferedReader bR = new BufferedReader(fR);
            while ((line = bR.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Student> readStudent (String path) {
        List<String> list = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            students.add(new Student(item[0], item[1], LocalDate.parse(item[2]), item[3], item[4], Double.parseDouble(item[5])));
        }
        return students;
    }

    public static List<Teacher> readTeacher (String path) {
        List<String> list = readFile(path);
        List<Teacher> teachers = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            teachers.add(new Teacher(item[0], item[1], LocalDate.parse(item[2]), item[3], item[4]));
        }
        return teachers;
    }
}
