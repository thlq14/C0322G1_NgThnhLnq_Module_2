package _Extra_Exercises._school_management.utils.regexs;

import _Extra_Exercises._school_management.exception.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_INT = "^[1-9]{0,}$";
    private static final String REGEX_POINT = "^\\d{0,10}$";
    private static final String REGEX_AGE = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";

    public static String regexInt(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntegerException("Error: Enter Number > 0..Enter Again: ");
                }
            } catch (InvalidIntegerException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexPoint(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidPointException("Error: 0 < Point < 10..Enter Again: ");
                }
            } catch (InvalidPointException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexIdStudent(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIdStudent("Error: Id Incorrect Format (8 number) ..Enter Again: ");
                }
            } catch (InvalidIdStudent e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexCheckNull() {
        String value;
        while (true) {
            try {
                value = scanner.nextLine();
                if (value.equals("")) {
                    throw new NullPointedException("Error: Value Mustn't Null ..Enter Again: ");
                }
                break;
            } catch (NullPointedException e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Age Must > 18. Enter Again: ");
                    }
                } else {
                    throw new AgeException("Incorrect Format.. Enter Again: ");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String inputInt() {
        return Regex.regexInt(REGEX_INT);
    }

    public static String inputPoint() {
        return Regex.regexPoint(REGEX_POINT);
    }

    public static String inputAge() {
        return Regex.regexAge(scanner.nextLine(), REGEX_AGE);
    }

}
