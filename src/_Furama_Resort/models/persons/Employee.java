package _Furama_Resort.models.persons;

public class Employee extends Person {
    private String employeeId;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeId, String level, String position, int salary) {
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String birth, String gender, int idCard, int phoneNumber, String email, String employeeId, String level, String position, int salary) {
        super(id, name, birth, gender, idCard, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" + super.toString() +
                ", employeeId = '" + employeeId + '\'' +
                ", level = '" + level + '\'' +
                ", position = '" + position + '\'' +
                ", salary = " + salary +
                '}';
    }
}
