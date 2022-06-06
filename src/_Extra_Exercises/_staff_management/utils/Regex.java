package _Extra_Exercises._staff_management.utils;

import _Extra_Exercises._staff_management.exception.InvalidBasicSalary;
import _Furama_Resort.exception.InvalidVillaIdException;

import java.util.Scanner;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_INT = "^[1-9]{1,}$";

    public static String regexBasicSalary(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidBasicSalary("Error: Incorrect Format.. Basic Salary > 0..Enter Again: ");
                }
            } catch (InvalidBasicSalary e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }
}
