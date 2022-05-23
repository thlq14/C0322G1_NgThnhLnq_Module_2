package _Extra_Exercises._person_management;

import java.util.Scanner;

public class PersonTest {
    public static Person[] personList = new Person[100];
    public static int count;
    public static Scanner scanner = new Scanner(System.in);

    static {
        personList[0] = new Teacher(1, "Kakarot", 26, true, 1000);
        personList[1] = new Teacher(2, "Vegeta", 27, true, 1200);
        personList[2] = new Student(3, "Bulma", 18, false, 9);
        personList[3] = new Student(4, "Brolly", 19, true, 10);
        personList[4] = new Student(5, "Pan", 17, false, 8);
        count = 5;
    }

    public static void displayList() {
        for (Person item : personList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void displayListTeacher() {
        for (Person item : personList) {
            if (item instanceof Teacher) {
                System.out.println(item);
            }
        }
    }

    public static void displayListStudent() {
        for (Person item : personList) {
            if (item instanceof Student) {
                System.out.println(item);
            }
        }
    }

    public static void addNewTeacher() {
        System.out.print("Nhập tên Teacher: ");
        String name = scanner.nextLine();

        System.out.print("Nhập Tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Chọn Giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Nhập Lương: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Person teacher = new Teacher(count + 1, name, age, gender, salary);
        personList[count] = teacher;
        count++;
        System.out.println("Thêm Teacher Thành công.");
    }

    public static void addNewStudent() {
        System.out.print("Nhập tên Student: ");
        String name = scanner.nextLine();

        System.out.print("Nhập Tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Chọn Giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Nhập Điểm: ");
        double point = Double.parseDouble(scanner.nextLine());

        Person student = new Student(count + 1, name, age, gender, point);
        personList[count] = student;
        count++;
        System.out.println("Thêm Student Thành công.");
    }

    public static void searchPerson() {
        int countSearch = 0;
        System.out.print("Nhập Tên Person muốn Tìm kiếm: ");
        String inputPerson = scanner.nextLine();

        for (Person item : personList) {
            if (item != null && item.getName().contains(inputPerson)) {
                System.out.println(item);
                countSearch++;
            }
        }
        if (countSearch == 0) {
            System.out.println("KHÔNG tìm thấy Tên Person.");
        }
    }

    public static void searchTeacher() {
        int countSearch = 0;
        System.out.print("Nhập Tên Teacher muốn Tìm kiếm: ");
        String inputPerson = scanner.nextLine();

        for (Person item : personList) {
            if (item instanceof Teacher && item.getName().contains(inputPerson)) {
                System.out.println(item);
                countSearch++;
            }
        }
        if (countSearch == 0) {
            System.out.println("KHÔNG tìm thấy Tên Teacher.");
        }
    }

    public static void searchStudent() {
        int countSearch = 0;
        System.out.print("Nhập Tên Student muốn Tìm kiếm: ");
        String inputPerson = scanner.nextLine();

        for (Person item : personList) {
            if (item instanceof Student && item.getName().contains(inputPerson)) {
                System.out.println(item);
                countSearch++;
            }
        }
        if (countSearch == 0) {
            System.out.println("KHÔNG tìm thấy Tên Student.");
        }
    }

    public static void deleteTeacher() {
        System.out.print("Nhập ID Teacher muốn Xóa: ");
        int inputIDTeacher = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < personList.length; i++) {
            if (personList[i] instanceof Teacher && personList[i].getId() == inputIDTeacher) {
                for (int j = i; j < personList.length && personList[j] != null; j++) {
                    personList[j] = personList[j + 1];
                }
            }
        }
        System.out.println("Xoá Teacher Thành công.");
    }

    public static void deleteStudent() {
        System.out.print("Nhập ID Student muốn Xóa: ");
        int inputIDStudent = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < personList.length; i++) {
            if (personList[i] instanceof Student && personList[i].getId() == inputIDStudent) {
                for (int j = i + 1; j < personList.length && personList[j + 1] != null; j++) {
                    personList[j] = personList[j + 1];
                }
            }
        }
        System.out.println("Xoá Student Thành công.");
    }

    public static void updateTeacher() {
        int countUpdate = 0;
        System.out.print("Nhập ID Teacher muốn Sửa: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < personList.length; i++) {
            if (personList[i] != null) {
                if (personList[i].getId() == inputUpdate) {
                    System.out.print("Nhập tên Teacher: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập Tuổi: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Chọn Giới tính: ");
                    boolean gender = Boolean.parseBoolean(scanner.nextLine());

                    System.out.print("Nhập Lương: ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    Person person = new Teacher(count + 1, name, age, gender, salary);
                    personList[count] = person;
                    countUpdate++;
                    System.out.println("Sửa Teacher Thành công.");
                }
            }
        }
        if (countUpdate == 0) {
            System.out.println("KHÔNG tìm thấy ID Teacher!");
        }
    }

    public static void updateStudent() {
        int countUpdate = 0;
        System.out.print("Nhập ID Student muốn Sửa: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < personList.length; i++) {
            if (personList[i] != null) {
                if (personList[i].getId() == inputUpdate) {
                    System.out.print("Nhập tên Student: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập Tuổi: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Chọn Giới tính: ");
                    boolean gender = Boolean.parseBoolean(scanner.nextLine());

                    System.out.print("Nhập Điểm: ");
                    double point = Double.parseDouble(scanner.nextLine());

                    Person person = new Teacher(count + 1, name, age, gender, point);
                    personList[count] = person;
                    countUpdate++;
                    System.out.println("Sửa Student Thành công.");
                }
            }
        }
        if (countUpdate == 0) {
            System.out.println("KHÔNG tìm thấy ID Student!");
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("____Person Management____");
            System.out.println("1. Display List Person.");
            System.out.println("2. Add New Person.");
            System.out.println("3. Search Person.");
            System.out.println("4. Delete Person.");
            System.out.println("5. Update Person.");
            System.out.println("6. Exit.");
            System.out.println("Choose Options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display: ");
                    System.out.println("1. Display All Person: ");
                    System.out.println("2. Display Teacher: ");
                    System.out.println("3. Display Student: ");
                    int inputDisplay = Integer.parseInt(scanner.nextLine());

                    if (inputDisplay == 1) {
                        System.out.println("1. Display All Person: ");
                        displayList();
                        break;
                    } else if (inputDisplay == 2) {
                        System.out.println("2. Display Teacher: ");
                        displayListTeacher();
                        break;
                    } else if (inputDisplay == 3) {
                        System.out.println("3. Display Student: ");
                        displayListStudent();
                        break;
                    } else {
                        System.out.println("Incorrect Input.");
                    }
                    break;
                case 2:
                    System.out.println("Add New: ");
                    System.out.println("1. Add New Teacher: ");
                    System.out.println("2. Add New Student: ");
                    int inputAdd = Integer.parseInt(scanner.nextLine());

                    if (inputAdd == 1) {
                        System.out.println("1. Add New Teacher: ");
                        addNewTeacher();
                    } else if (inputAdd == 2) {
                        System.out.println("2. Add New Student: ");
                        addNewStudent();
                    } else {
                        System.out.println("Incorrect Input.");
                    }
                    break;
                case 3:
                    System.out.println("Search: ");
                    System.out.println("1. Search Person: ");
                    System.out.println("2. Search Teacher: ");
                    System.out.println("3. Search Student: ");
                    int inputSearch = Integer.parseInt(scanner.nextLine());

                    if (inputSearch == 1) {
                        System.out.println("1. Search Person: ");
                        searchPerson();
                    } else if (inputSearch == 2) {
                        System.out.println("2. Search Teacher: ");
                        searchTeacher();
                    } else if (inputSearch == 3) {
                        System.out.println("3. Search Student: ");
                        searchStudent();
                    } else {
                        System.out.println("Incorrect Input.");
                    }
                    break;
                case 4:
                    System.out.println("Delete: ");
                    System.out.println("1. Delete Teacher: ");
                    System.out.println("2. Delete Student: ");
                    int inputDelete = Integer.parseInt(scanner.nextLine());

                    if (inputDelete == 1) {
                        System.out.println("1. Delete Teacher: ");
                        deleteTeacher();
                    } else if (inputDelete == 2) {
                        System.out.println("2. Delete Student: ");
                        deleteStudent();
                    } else {
                        System.out.println("Incorrect Input.");
                    }
                    break;
                case 5:
                    System.out.println("Update: ");
                    System.out.println("1. Update Teacher: ");
                    System.out.println("2. Update Student: ");
                    int inputUpdate = Integer.parseInt(scanner.nextLine());

                    if (inputUpdate == 1) {
                        System.out.println("1. Update Teacher: ");
                        updateTeacher();
                    } else if (inputUpdate == 3) {
                        System.out.println("2. Update Student: ");
                        updateStudent();
                    } else {
                        System.out.println("Incorrect Input.");
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
