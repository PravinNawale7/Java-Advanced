package Bean;

public class Customer {
    private String name;
    private String age;
    private String address;

    public Customer(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void display() {
        System.out.println("Customer Details:");
    }
}
