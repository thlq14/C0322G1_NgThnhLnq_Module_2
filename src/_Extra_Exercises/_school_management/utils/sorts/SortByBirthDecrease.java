package _Extra_Exercises._school_management.utils.sorts;

import _Extra_Exercises._school_management.models.Person;

import java.util.Comparator;

public class SortByBirthDecrease implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        if ((o1.getBirth().toString()).compareTo(o2.getBirth().toString()) < 0) {
            return 1;
        } else if ((o1.getBirth().toString()).compareTo(o2.getBirth().toString()) > 0) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) < 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) > 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}