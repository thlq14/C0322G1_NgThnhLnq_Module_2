package _Furama_Resort.models.persons;

public abstract class Person {
    private int Id;
    private String name;
    private String birth;
    private String gender;
    private int idCard;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String birth, String gender, int idCard, int phoneNumber, String email) {
        Id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id = " + Id +
                ", name = '" + name + '\'' +
                ", birth = " + birth +
                ", gender = '" + gender + '\'' +
                ", idCard = " + idCard +
                ", phoneNumber = " + phoneNumber +
                ", email = '" + email;
    }
}
