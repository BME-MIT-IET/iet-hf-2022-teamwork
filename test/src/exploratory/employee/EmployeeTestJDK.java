package exploratory.employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTestJDK {
    private Employee[] employees;

    @Before
    public void initData() {
        employees = new Employee[] 
        { 
            new Employee("John","alma@gamil.com", new Address("Budapest", 1010 ,"Nyúl utca", 14)), 
            new Employee("Alice","korte@gamil.com", new Address()),
            new Employee("Bob","bob@gamil.com") 
        };
    }

    @Test
    public void whenCustomSerializingAndDeserializing_ThenObjectIsTheSame() 
    throws IOException, ClassNotFoundException {

        
        File file = new File("test/resources/out/employee-JDK-serilization.txt");
        file.createNewFile();


        FileOutputStream fileOutputStream = new FileOutputStream(file);
         ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);
            objectOutputStream.flush();
            objectOutputStream.close();
    }

}
