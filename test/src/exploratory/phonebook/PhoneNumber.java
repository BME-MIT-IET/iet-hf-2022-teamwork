package exploratory.phonebook;

import java.io.Serializable;
import java.util.Objects;

public class PhoneNumber implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return phoneType == that.phoneType && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneType, number);
    }

    public enum PhoneType {
        MOBILE,
        HOME
    }

    private PhoneType phoneType;

    private String number;

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
