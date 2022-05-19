package exploratory.phonebook;

import com.complexible.common.openrdf.model.ModelIO;
import com.complexible.pinto.RDFMapper;
import org.junit.Test;
import org.openrdf.model.Graph;
import org.openrdf.model.Model;
import org.openrdf.model.Statement;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandlerException;


import java.io.*;
import java.net.URISyntaxException;

import static org.junit.Assert.fail;

public class PhonebookTest {

    @Test
    public void RDFSerializeNoCircularDependency() throws IOException {
        Phonebook phonebook = new Phonebook();
        phonebook.defInit();

        //RDFMapper.builder().

        Model graph = RDFMapper.create().writeValue(phonebook);

        File file = new File("test/resources/out/phonebook.txt");
        file.createNewFile();


        FileOutputStream fileOutputStream = new FileOutputStream(file);

        /*PrintWriter p = new PrintWriter(fileOutputStream);

        p.println(graph.toString());
        p.flush();*/

        ModelIO.write(graph, fileOutputStream, RDFFormat.NTRIPLES);

        //ModelIO.write(graph, fileOutputStream, RDFFormat.N3);

    }

    @Test
    public void RDFSerializeWithCircularDependency() throws IOException {
        Phonebook phonebook = new Phonebook();
        phonebook.initWithCircularDependency();

        Graph graph = null;

        try {
           graph = RDFMapper.create().writeValue(phonebook);
        }
        catch (StackOverflowError e) {
            fail("Threw stackoverflow");
        }


        File file = new File("test/resources/out/phonebook.txt");
        file.createNewFile();


        FileOutputStream fileOutputStream = new FileOutputStream(file);

        PrintWriter p = new PrintWriter(fileOutputStream);


        p.println(graph.toString());
        p.flush();
    }
}
