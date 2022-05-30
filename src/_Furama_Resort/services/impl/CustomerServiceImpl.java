package _Furama_Resort.services.impl;

import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.CustomerService;
import _Furama_Resort.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

//    static {
//        customerList.add(new Customer(412, "Vegeta", "10/10/2000", "Male", 531, 786214, "vegeta@gmail.com", "veg489", "Diamond", "Saiyan"));
//    }

    @Override
    public void displayListCustomer() {
        List<String[]> list = ReadAndWriteFile.readFile("src/_Furama_Resort/data/customer.csv");
        customerList.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3], Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8], item[9]);
            customerList.add(customer);
        }
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
        String birth = scanner.nextLine();
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
        String line = customer.getId() + "," + customer.getName() + "," + customer.getBirth() + "," + customer.getGender() + ","
                + customer.getIdCard() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getCustomerId() + ","
                + customer.getCustomerType() + "," + customer.getCustomerAddress();
        ReadAndWriteFile.writeFile("src/_Furama_Resort/data/customer.csv", line);
        System.out.println("Added Customer Success.");
        System.err.println("Enter Incorrect Format. Enter Again: ");
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
                String birth = scanner.nextLine();
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
