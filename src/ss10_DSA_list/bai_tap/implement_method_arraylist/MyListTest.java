package ss10_DSA_list.bai_tap.implement_method_arraylist;

public class MyListTest {
    static class Person {
        String name;
        int Age;

        Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name = '" + name + '\'' +
                    ", age = " + Age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((MyListTest.Person) obj).name)
                    && this.Age == ((MyListTest.Person) obj).Age;
        }
    }

    public static void main(String[] args) {
        MyList<Person> myArrayList = new MyList<>(3);
        myArrayList.ensureCapacity(4);
        myArrayList.add(new MyListTest.Person("Nguyễn Văn A ", 30));
        myArrayList.add(new MyListTest.Person("Nguyễn Văn B ", 30));
        myArrayList.add(new MyListTest.Person("Nguyễn Văn C ", 30));
        myArrayList.add(new MyListTest.Person("Nguyễn Văn D ", 30), 1);
        MyList<Person> list2 = myArrayList.clone();
        int index = list2.indexOf(new MyListTest.Person("Nguyễn Văn C ", 30));
        System.out.println("index = " + index);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(myArrayList.get(i).toString());
        }
    }
}
