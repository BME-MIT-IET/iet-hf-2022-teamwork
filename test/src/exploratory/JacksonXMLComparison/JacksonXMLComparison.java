package exploratory.JacksonXMLComparison;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import exploratory.employee.Address;
import exploratory.employee.Employee;
import exploratory.phonebook.Phonebook;
import org.junit.Test;

public class JacksonXMLComparison {
    @Test
    public void givenArrayOfObjects_whenSerializing_thenCorrect() throws JsonProcessingException {
        Phonebook phonebook = new Phonebook();
        phonebook.defInit();
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(phonebook);

        System.out.println(xml);
    }
}
