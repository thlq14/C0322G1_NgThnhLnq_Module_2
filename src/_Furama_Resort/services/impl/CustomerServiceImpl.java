package _Furama_Resort.services.impl;

import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.CustomerService;
import _Furama_Resort.utils.files.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static final String PATH_CUSTOMER = "src/_Furama_Resort/data/customer.csv";

    @Override
    public void display() {

        customerList = ReadAndWriteFile.readCustomer(PATH_CUSTOMER);

        System.out.println("List Customer: ");
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {

        customerList = ReadAndWriteFile.readCustomer(PATH_CUSTOMER);

        System.out.println("Enter Name Customer: ");
        String name = scanner.nextLine();

        System.out.println("Enter Birth Customer (Format: dd/MM/yyyy): ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Enter Gender Customer: 1. Male; 2. Female; 3. Other Genders.");
        String gender;
        int isGender;
        do {
            isGender = Integer.parseInt(scanner.nextLine());
            switch (isGender) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other Genders";
                    break;
                default:
                    gender = "Error: Enter Again.. (1 -> 4)";
                    break;
            }
        } while (isGender < 1 || isGender > 3);

        System.out.println("Enter ID Card: ");
        int idCard = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Phone Number Customer: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Email Customer: ");
        String email = scanner.nextLine();

        System.out.println("Enter Id Customer: ");
        String customerId = scanner.nextLine();

        System.out.println("Enter Type Customer: 1. Diamond; 2. Platinum; 3. Gold; 4. Silver; 5. Member.");
        String customerType;
        int chooseType;
        do {
            chooseType = Integer.parseInt(scanner.nextLine());
            switch (chooseType) {
                case 1:
                    customerType = "Diamond";
                    break;
                case 2:
                    customerType = "Platinum";
                    break;
                case 3:
                    customerType = "Gold";
                    break;
                case 4:
                    customerType = "Silver";
                    break;
                case 5:
                    customerType = "Member";
                    break;
                default:
                    customerType = "Error: Enter Again.. (1 -> 5)";
            }
        } while (chooseType < 1 || chooseType > 5);

        System.out.println("Enter Address Customer: ");
        String customerAddress = scanner.nextLine();

        int id = 0;
        int max = 0;
        if (customerList == null) {
            id = 1;
        } else {
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getId() > max) {
                    max = customerList.get(i).getId();
                }
            }
            id = max + 1;
        }

        Customer customer = new Customer(id, name, birth, gender, idCard, phoneNumber, email, customerId, customerType, customerAddress);
        customerList.add(customer);

        ReadAndWriteFile.writeCustomer(PATH_CUSTOMER, customerList);
        System.out.println("Added Customer Success.");
    }

    @Override
    public void edit() {

        customerList.clear();
        customerList = ReadAndWriteFile.readCustomer(PATH_CUSTOMER);

        int countEdit = 0;
        System.out.println("Enter ID Customer want to Update: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == inputUpdate) {
                System.out.println("Enter Name Customer: ");
                String name = scanner.nextLine();

                System.out.println("Enter Birth Customer (Format: dd/MM/yyyy): ");
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

                System.out.println("Enter Gender Employee: 1. Male; 2. Female; 3. Other Genders.");
                String gender;
                int isGender;
                do {
                    isGender = Integer.parseInt(scanner.nextLine());
                    switch (isGender) {
                        case 1:
                            gender = "Male";
                            break;
                        case 2:
                            gender = "Female";
                            break;
                        case 3:
                            gender = "Other Genders";
                            break;
                        default:
                            gender = "Error: Enter Again.. (1 -> 4)";
                            break;
                    }
                } while (isGender < 1 || isGender > 3);

                System.out.println("Enter ID Card: ");
                int idCard = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Phone Number Customer: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Email Customer: ");
                String email = scanner.nextLine();

                System.out.println("Enter Id Customer: ");
                String customerId = scanner.nextLine();

                System.out.println("Enter Type Customer: 1. Diamond; 2. Platinum; 3. Gold; 4. Silver; 5. Member.");
                String customerType;
                int chooseType;
                do {
                    chooseType = Integer.parseInt(scanner.nextLine());
                    switch (chooseType) {
                        case 1:
                            customerType = "Diamond";
                            break;
                        case 2:
                            customerType = "Platinum";
                            break;
                        case 3:
                            customerType = "Gold";
                            break;
                        case 4:
                            customerType = "Silver";
                            break;
                        case 5:
                            customerType = "Member";
                            break;
                        default:
                            customerType = "Error: Enter Again.. (1 -> 5)";
                            break;
                    }
                } while (chooseType < 1 || chooseType > 5);

                System.out.println("Enter Address Customer: ");
                String customerAddress = scanner.nextLine();

                customerList.get(i).setName(name);
                customerList.get(i).setBirth(birth);
                customerList.get(i).setGender(gender);
                customerList.get(i).setIdCard(idCard);
                customerList.get(i).setPhoneNumber(phoneNumber);
                customerList.get(i).setEmail(email);
                customerList.get(i).setCustomerId(customerId);
                customerList.get(i).setCustomerType(customerType);
                customerList.get(i).setCustomerAddress(customerAddress);

                ReadAndWriteFile.writeCustomer(PATH_CUSTOMER, customerList);
                countEdit++;
                System.out.println("Edited Customer Success.");
            }
        }
        if (countEdit == 0) {
            System.out.println("ID NOT found!!");
        }
    }
}
