package exploratory.phonebook;

import java.util.Objects;

public class Address {
    private String zipCode;
    private String country;
    private String city;
    private String street;
    private String number;

    public Address() {}

    public Address(String zipCode, String country, String city, String street, String number) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(zipCode, address.zipCode) && Objects.equals(country, address.country) && Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(number, address.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipCode, country, city, street, number);
    }
}
