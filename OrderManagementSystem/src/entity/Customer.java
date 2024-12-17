package entity;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String mail;
    private String address;
    private TYPE type;

    public enum TYPE{
        PERSON,
        COMPANY;


    }
    public Customer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
