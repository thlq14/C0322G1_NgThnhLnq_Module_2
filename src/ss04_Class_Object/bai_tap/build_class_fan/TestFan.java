package ss04_Class_Object.bai_tap.build_class_fan;

class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, "yellow", 10);
        Fan fan2 = new Fan(2, false, "blue", 5);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
