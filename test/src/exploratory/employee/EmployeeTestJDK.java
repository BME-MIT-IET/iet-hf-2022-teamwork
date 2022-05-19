package exploratory.employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.complexible.common.openrdf.model.ModelIO;
import com.complexible.pinto.RDFMapper;
import org.junit.Before;
import org.junit.Test;
import org.openrdf.model.Model;
import org.openrdf.rio.RDFFormat;

public class EmployeeTestJDK {
    private Employee[] employees;
    private EmployeeBook employeeBook;

    @Before
    public void initData() {
        employees = new Employee[] 
        { 
            new Employee("John","alma@gamil.com", new Address("Budapest", 1010 ,"Nyúl utca", 14)), 
            new Employee("Alice","korte@gamil.com", new Address()),
            new Employee("Bob","bob@gamil.com") 
        };

        employeeBook = new EmployeeBook();
        employeeBook.getElements().addAll(Arrays.asList(employees));
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


    @Test
    public void pintoSerializationTest() throws IOException{
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));
        Model graph = RDFMapper.create().writeValue(employeeBook);

        File file = new File("test/resources/out/employee-pinto.txt");
        file.createNewFile();


        FileOutputStream fileOutputStream = new FileOutputStream(file);


        ModelIO.write(graph, fileOutputStream, RDFFormat.NTRIPLES);
    }

}
