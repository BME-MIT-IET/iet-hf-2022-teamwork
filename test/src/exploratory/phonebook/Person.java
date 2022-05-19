package exploratory.phonebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Serializable{

    private String name;
    private Address address;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private List<Relation> relations = new ArrayList<>();


    public List<Relation> getRelations() {
        return relations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.equals(phoneNumbers, person.phoneNumbers) && Objects.equals(relations, person.relations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phoneNumbers, relations);
    }
}