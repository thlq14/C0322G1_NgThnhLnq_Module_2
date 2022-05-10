package ss05_AccessModifier_StaticMethod_StaticProperty.bai_tap.build_class_only_write;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Thành Lonq");
        student.setClasses("C0322G1.");
        System.out.println(student.getName() + " lớp " + student.getClasses());
    }
}
