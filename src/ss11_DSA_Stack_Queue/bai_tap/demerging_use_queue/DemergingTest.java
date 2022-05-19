package ss11_DSA_Stack_Queue.bai_tap.demerging_use_queue;

import java.util.*;

public class DemergingTest {
    public static void main(String[] args) {
        Queue<Demerging> queueNam = new LinkedList<>();
        Queue<Demerging> queueNu = new LinkedList<>();
        List<Demerging> personList = new ArrayList<>();
        personList.add(new Demerging("Văn F", true, 1999));
        personList.add(new Demerging("Thị J", false, 2003));
        personList.add(new Demerging("Thị W", false, 2001));
        personList.add(new Demerging("Văn Z", true, 2005));

        Collections.sort(personList);
        System.out.println("List Person: ");
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

        System.out.println("List Nữ: ");
        while (!queueNu.isEmpty()) {
            System.out.println(queueNu.poll());
        }

        System.out.println("List Nam: ");
        while (!queueNam.isEmpty()) {
            System.out.println(queueNam.poll());
        }
    }
}
