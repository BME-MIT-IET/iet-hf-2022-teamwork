package exploratory.employee;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.io.Serializable;


public class Employee implements Serializable{
    private transient Address address;
    private Person person;
  
    public void setPerson(Person p){
      person = p;
    }
  
    public Person getPerson(){
      return person; 
    }
  
    public void setAddress(Address address){
      this.address = address;
  }
  
    private void writeObject(ObjectOutputStream oos) 
      throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(address.getNumber());
        oos.writeObject(address.getStreet());
        oos.writeObject(address.getCity());
        oos.writeObject(address.getPostCode());
    }
  
    private void readObject(ObjectInputStream ois) 
      throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        Integer houseNumber = (Integer) ois.readObject();
        int postCode = (Integer) ois.readObject();
        String city = (String) ois.readObject();
        Address a = new Address();
        a.setNumber(houseNumber);
        a.setPostCode(postCode);
        a.setCity(city);
        this.setAddress(a);
    }  
}
