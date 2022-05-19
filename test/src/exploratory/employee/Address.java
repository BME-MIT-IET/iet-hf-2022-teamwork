package exploratory.employee;

import java.io.Serializable;

public class Address implements Serializable{
    private String City;
    private int PostCode;
    private String Street;
    private int Number;

    public Address( String city, int code,String street, int number ){
            this.City = city;
            this.Number = number;
            this.PostCode = code;
            this.Street = street;
    }

    public Address(){}

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
