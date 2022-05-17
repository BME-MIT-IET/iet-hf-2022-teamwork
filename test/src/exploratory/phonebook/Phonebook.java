package exploratory.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phonebook {
    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

    public void defInit() {
        people = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("person1");

        Address address1 = new Address("2800", "Magyarország", "Tatabánya", "Mártírok útja", "36");
        PhoneNumber phoneNumber11 = new PhoneNumber();
        PhoneNumber phoneNumber12 = new PhoneNumber();
        phoneNumber11.setNumber("+36202293152");
        phoneNumber11.setPhoneType(PhoneNumber.PhoneType.MOBILE);
        phoneNumber12.setNumber("+3634787730");
        phoneNumber12.setPhoneType(PhoneNumber.PhoneType.HOME);

        person1.setAddress(address1);
        person1.getPhoneNumbers().add(phoneNumber11);
        person1.getPhoneNumbers().add(phoneNumber12);


        Person person2 = new Person();
        person2.setName("person1");

        Address address2 = new Address("1117", "Hungary", "Budapest", "Irinyi Jozsef utca", "42");
        PhoneNumber phoneNumber21 = new PhoneNumber();
        phoneNumber21.setNumber("+36201234567");
        phoneNumber21.setPhoneType(PhoneNumber.PhoneType.MOBILE);

        person2.setAddress(address2);
        person2.getPhoneNumbers().add(phoneNumber21);

        person1.getRelations().add(new Relation(Relation.RelationType.SON, person2));
        //person2.getRelations().add(new Relation(Relation.RelationType.FATHER, person1));

        people.add(person1);
        people.add(person2);
    }

    public void initWithCircularDependency() {
        people = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("person1");

        Address address1 = new Address("2800", "Magyarország", "Tatabánya", "Mártírok útja", "36");
        PhoneNumber phoneNumber11 = new PhoneNumber();
        PhoneNumber phoneNumber12 = new PhoneNumber();
        phoneNumber11.setNumber("+36202293152");
        phoneNumber11.setPhoneType(PhoneNumber.PhoneType.MOBILE);
        phoneNumber12.setNumber("+3634787730");
        phoneNumber12.setPhoneType(PhoneNumber.PhoneType.HOME);

        person1.setAddress(address1);
        person1.getPhoneNumbers().add(phoneNumber11);
        person1.getPhoneNumbers().add(phoneNumber12);


        Person person2 = new Person();
        person2.setName("person1");

        Address address2 = new Address("1117", "Hungary", "Budapest", "Irinyi Jozsef utca", "42");
        PhoneNumber phoneNumber21 = new PhoneNumber();
        phoneNumber21.setNumber("+36201234567");
        phoneNumber21.setPhoneType(PhoneNumber.PhoneType.MOBILE);

        person2.setAddress(address2);
        person2.getPhoneNumbers().add(phoneNumber21);

        person1.getRelations().add(new Relation(Relation.RelationType.SON, person2));
        person2.getRelations().add(new Relation(Relation.RelationType.FATHER, person1));

        people.add(person1);
        people.add(person2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(people, phonebook.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(people);
    }
}
