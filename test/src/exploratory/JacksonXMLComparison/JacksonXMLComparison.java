package exploratory.JacksonXMLComparison;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import exploratory.employee.Address;
import exploratory.employee.Employee;
import exploratory.phonebook.Phonebook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class JacksonXMLComparison {
    @Test
    public void givenArrayOfObjects_whenSerializing_thenCorrect() throws JsonProcessingException, IOException {
        Phonebook phonebook = new Phonebook();
        phonebook.initForStress(200, true);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(phonebook);

        //System.out.println(xml);

        File file = new File("test/resources/out/phonebook-xmlmapper.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        PrintWriter pw = new PrintWriter(fileOutputStream);
        pw.println(xml);

        pw.flush();

        pw.close();
    }
}
