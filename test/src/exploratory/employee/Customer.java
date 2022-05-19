package exploratory.employee;
import java.io.Serializable;
public class Customer extends Person implements Serializable {

    public Customer(String name) {
        super(name);
    }

    public Customer(String name, int age ) {
        super(name, age);
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}