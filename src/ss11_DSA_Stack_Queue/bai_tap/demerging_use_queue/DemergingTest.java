package ss11_DSA_Stack_Queue.bai_tap.demerging_use_queue;

import java.util.*;

public class DemergingTest {
    public static void main(String[] args) {
        Queue<Demerging> queueNu = new LinkedList<>();
        Queue<Demerging> queueNam = new LinkedList<>();
        List<Demerging> personList = new ArrayList<>();
        personList.add(new Demerging("Văn F", true, 1999));
        personList.add(new Demerging("Thị J", false, 2001));
        personList.add(new Demerging("Thị Ư", false, 2003));
        personList.add(new Demerging("Văn W", true, 2005));

        Collections.sort(personList);
        for (Demerging item : personList) {
            System.out.println(item);
        }
        for (Demerging item : personList) {
            if (item.isGender()) {
                queueNam.add(item);
            } else {
                queueNu.add(item);
            }
        }
        while (!queueNam.isEmpty()) {
            System.out.println("List Nam: ");
            System.out.println(queueNam.poll());
        }
        while (!queueNu.isEmpty()) {
            System.out.println("List Nữ: ");
            System.out.println(queueNu.poll());
        }
    }
}
