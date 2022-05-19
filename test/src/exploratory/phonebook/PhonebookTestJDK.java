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

public class PhonebookTestJDK {

    @Test
    public void RDFSerializeNoCircularDependency() throws IOException {
        Phonebook phonebook = new Phonebook();
        phonebook.initForStress(20, true);

        File file = new File("test/resources/out/phonebooke-JDK-ser.txt");
        file.createNewFile();


        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(phonebook);
        objectOutputStream.flush();
        objectOutputStream.close();

    }
}
