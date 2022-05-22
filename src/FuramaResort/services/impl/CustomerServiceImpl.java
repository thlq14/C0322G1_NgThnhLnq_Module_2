package FuramaResort.services.impl;

import FuramaResort.models.persons.Customer;
import FuramaResort.services.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(412, "Vegeta", 25, true, 531, 786214, "vegeta@gmail.com", "veg489", "Diamond", "Saiyan Planet"));
        customerList.add(new Customer(782, "Bulma", 22, false, 426, 753214, "bulma@gmail.com", "bul423", "Platinium", "Earth"));
        customerList.add(new Customer(176, "Trunks", 19, true, 754, 135486, "trunks@gmail.com", "trk634", "Platinium", "Earth"));
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
        System.out.println("Enter Gender Customer: ");
        System.out.println("Enter Gender Customer: 1. Male; 2. Female ");
        int isGender = Integer.parseInt(scanner.nextLine());
        boolean gender = false;
        boolean checkGender = isGender == 1;
        if (checkGender) {
            gender = false;
        } else {
            gender = true;
        }
        System.out.println("Enter ID Customer: ");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Phone Number Customer: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Email Customer: ");
        String email = scanner.nextLine();
        System.out.println("Enter Id Customer: ");
        String customerId = scanner.nextLine();
        System.out.println("Enter Type Customer: 1. Diamond; 2. Platinium; 3. Gold; 4. Silver; 5. Member.");
        String customeType = scanner.nextLine();
        System.out.println("Enter Address Customer: ");
        String customerAddress = scanner.nextLine();
        int id = customerList.get(customerList.size() - 1).getId() + 1;
        Customer customer = new Customer(id, name, birth, gender, idCard, phoneNumber, email, customerId, customeType, customerAddress);
        customerList.add(customer);
        System.out.println("Added Customer Success.");
    }

    @Override
    public void editCustomerById() {
        int countUpdate = 0;
        System.out.println("Enter ID Customer want to Update: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == inputUpdate) {
                System.out.println("Enter Name Customer: ");
                String name = scanner.nextLine();
                System.out.println("Enter Birth Customer: ");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Gender Customer: 1. Male; 2. Female ");
                int isGender = Integer.parseInt(scanner.nextLine());
                boolean gender = false;
                boolean checkGender = isGender == 1;
                if (checkGender) {
                    gender = false;
                } else {
                    gender = true;
                }
                System.out.println("Enter ID Customer: ");
                int idCard = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Phone Number Customer: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Email Customer: ");
                String email = scanner.nextLine();
                System.out.println("Enter Id Customer: ");
                String customerId = scanner.nextLine();
                System.out.println("Enter Type Customer: ");
                String customeType = scanner.nextLine();
                System.out.println("Enter Address Customer: ");
                String customerAddress = scanner.nextLine();
                int id = customerList.get(customerList.size() - 1).getId() + 1;
                Customer customer = new Customer(id, name, birth, gender, idCard, phoneNumber, email, customerId, customeType, customerAddress);
                customerList.set(i, customer);
                countUpdate++;
                System.out.println("Updated Customer Success.");
            }
        }
        if (countUpdate == 0) {
            System.out.println("ID NOT found!!");
        }
    }

    @Override
    public void deleteCustomerById() {
        System.out.println("Enter ID Customer want to Delete: ");
        int inputRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == inputRemove) {
                for (int j = i + 1; j < customerList.size(); j++) {
                    customerList.remove(customerList.get(i));
                    break;
                }
                System.out.println("Delete Customer Success.");
                inputRemove++;
            }
        }
        if (inputRemove == 0)
            System.out.println("ID NOT found!!");
    }
}
