package _Extra_Exercises._st_tc_management.utils;

import _Extra_Exercises._st_tc_management.exception.InvalidIntegerException;

import java.util.Scanner;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_INT = "^[1-9]{0,}$";

    public static String regexInt(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntegerException("Error: Incorrect Format..Enter Number > 0..Enter Again: ");
                }
            } catch (InvalidIntegerException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String inputInt() {
        return Regex.regexInt(REGEX_INT);
    }
}
