package _Extra_Exercises._staff_management.utils;

import _Extra_Exercises._staff_management.exception.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_INT = "^[1-9]{0,}$";


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

    public static String regexCoefficientSalary(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidCoefficientSalaryException("Error: Incorrect Format.. Coefficient Salary > 0..Enter Again: ");
                }
            } catch (InvalidCoefficientSalaryException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexNumberProduct(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidNumberProductException("Error: Incorrect Format.. Number Product > 0..Enter Again: ");
                }
            } catch (InvalidNumberProductException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexPriceProduct(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidPriceProductException("Error: Incorrect Format.. Price Product > 0..Enter Again: ");
                }
            } catch (InvalidPriceProductException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
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
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Age Must > 18 and < 100.");
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

    public static String inputBasicSalary() {
        return Regex.regexBasicSalary(REGEX_INT);
    }

    public static String inputCoefficientSalary() {
        return Regex.regexCoefficientSalary(REGEX_INT);
    }

    public static String inputNumberProduct() {
        return Regex.regexNumberProduct(REGEX_INT);
    }

    public static String inputPriceProduct() {
        return Regex.regexPriceProduct(REGEX_INT);
    }
}
