package _Furama_Resort.services.impl;

import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(412, "Vegeta", 25, "Male", 531, 786214, "vegeta@gmail.com", "veg489", "Diamond", "Saiyan"));
        customerList.add(new Customer(782, "Bulma", 22, "Female", 426, 753214, "bulma@gmail.com", "bul423", "Platinium", "Earth"));
        customerList.add(new Customer(176, "Trunks", 19, "Male", 754, 135486, "trunks@gmail.com", "trk634", "Platinium", "Earth"));
    }

    @Override
    public void displayListCustomer() {
        System.out.println("List Customer: ");
        for (Customer item : customerList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addNewCustomer() {
        System.out.println("Enter Name Customer: ");
        String name = scanner.nextLine();
        System.out.println("Enter Birth Customer: ");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Gender Employee: 1. Male; 2. Female; 3. Other Genders.");
        String gender;
        int isGender;
        do {
            isGender = Integer.parseInt(scanner.nextLine());
            switch (isGender) {
                case 1:
                    gender = "Male.";
                    break;
                case 2:
                    gender = "Female.";
                    break;
                case 3:
                    gender = "Other Genders.";
                    break;
                default:
                    gender = "Error: Enter Again.. (1 -> 4)";
                    break;
            }
        } while (isGender < 1 || isGender > 3);
        System.out.println("Enter ID Customer: ");
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
                    customerType = "Diamond.";
                    break;
                case 2:
                    customerType = "Platinum.";
                    break;
                case 3:
                    customerType = "Gold.";
                    break;
                case 4:
                    customerType = "Silver.";
                    break;
                case 5:
                    customerType = "Member.";
                    break;
                default:
                    customerType = "Error: Enter Again.. (1 -> 5)";
                    break;
            }
        } while (chooseType < 1 || chooseType > 5);
        System.out.println("Enter Address Customer: ");
        String customerAddress = scanner.nextLine();
        int id = customerList.get(customerList.size() - 1).getId() + 1;
        Customer customer = new Customer(id, name, birth, gender, idCard, phoneNumber, email, customerId, customerType, customerAddress);
        customerList.add(customer);
        System.out.println("Added Customer Success.");
    }

    @Override
    public void editCustomerById() {
        int countEdit = 0;
        System.out.println("Enter ID Customer want to Update: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == inputUpdate) {
                System.out.println("Enter Name Customer: ");
                String name = scanner.nextLine();
                System.out.println("Enter Birth Customer: ");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Gender Employee: 1. Male; 2. Female; 3. Other Genders.");
                String gender;
                int isGender;
                do {
                    isGender = Integer.parseInt(scanner.nextLine());
                    switch (isGender) {
                        case 1:
                            gender = "Male.";
                            break;
                        case 2:
                            gender = "Female.";
                            break;
                        case 3:
                            gender = "Other Genders.";
                            break;
                        default:
                            gender = "Error: Enter Again.. (1 -> 4)";
                            break;
                    }
                } while (isGender < 1 || isGender > 3);
                System.out.println("Enter ID Customer: ");
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
                            customerType = "Diamond.";
                            break;
                        case 2:
                            customerType = "Platinum.";
                            break;
                        case 3:
                            customerType = "Gold.";
                            break;
                        case 4:
                            customerType = "Silver.";
                            break;
                        case 5:
                            customerType = "Member.";
                            break;
                        default:
                            customerType = "Error: Enter Again.. (1 -> 5)";
                            break;
                    }
                } while (chooseType < 1 || chooseType > 6);
                System.out.println("Enter Address Customer: ");
                String customerAddress = scanner.nextLine();
                int id = customerList.get(customerList.size() - 1).getId();
                Customer customer = new Customer(id, name, birth, gender, idCard, phoneNumber, email, customerId, customerType, customerAddress);
                customerList.set(i, customer);
                countEdit++;
                System.out.println("Updated Customer Success.");
            }
        }
        if (countEdit == 0) {
            System.out.println("ID NOT found!!");
        }
    }
}
//
//    @Override
//    public void deleteCustomerById() {
//        System.out.println("Enter ID Customer want to Delete: ");
//        int inputRemove = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < customerList.size(); i++) {
//            if (customerList.get(i).getId() == inputRemove) {
//                for (int j = i + 1; j < customerList.size(); j++) {
//                    customerList.remove(customerList.get(i));
//                    break;
//                }
//                System.out.println("Delete Customer Success.");
//                inputRemove++;
//            }
//        }
//        if (inputRemove == 0)
//            System.out.println("ID NOT found!!");
//    }
