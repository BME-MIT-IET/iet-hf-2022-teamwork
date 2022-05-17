package exploratory.phonebook;

import com.complexible.common.openrdf.model.ModelIO;
import com.complexible.pinto.RDFMapper;
import org.junit.Test;
import org.openrdf.model.Model;
import org.openrdf.model.Statement;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.RDFWriter;
import org.openrdf.rio.Rio;

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

        PrintWriter p = new PrintWriter(fileOutputStream);

        p.println(graph.toString());
        p.flush();

        /*RDFWriter writer = Rio.createWriter(RDFFormat.RDFXML, fileOutputStream);
        try {
            writer.startRDF();
            for (Statement st: graph) {
                writer.handleStatement(st);
            }
            writer.endRDF();
        }
        catch (RDFHandlerException e) {
            // oh no, do something!
        }
*/
        //ModelIO.write(graph, fileOutputStream, RDFFormat.N3);

    }

    @Test
    public void RDFSerializeWithCircularDependency() throws IOException {
        Phonebook phonebook = new Phonebook();
        phonebook.initWithCircularDependency();

        Model graph = null;

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
