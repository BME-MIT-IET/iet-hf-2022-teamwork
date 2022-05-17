package exploratory.employee;

import java.io.Serializable;

public class Address implements Serializable{
    private String City;
    private int PostCode;
    private String Street;
    private int Number;

    public int getNumber(){
        return Number;
    }

    public void setNumber(int number){
        Number= number;
    }

    public String getStreet(){
        return Street;
    }

    public void setString(String street){
        Street= street;
    }
    public int getPostCode(){
        return PostCode;
    }

    public void setPostCode(int postCode){
        PostCode= postCode;
    }

    public String getCity(){
        return City;
    }

    public void setCity(String city){
        City= city;
    }
}
