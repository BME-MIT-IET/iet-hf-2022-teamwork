package comparison.PintoComparison;

import com.complexible.common.openrdf.model.ModelIO;
import com.complexible.pinto.RDFMapper;
import exploratory.phonebook.Phonebook;
import org.junit.Test;
import org.openrdf.model.Model;
import org.openrdf.rio.RDFFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PintoTestComparison {

    @Test
    public void pintoStressTest() throws IOException {
        Phonebook phonebook = new Phonebook();
        phonebook.initForStress(20, true);

        Model graph = RDFMapper.create().writeValue(phonebook);

        File file = new File("test/resources/out/phonebook-pinto.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ModelIO.write(graph, fileOutputStream, RDFFormat.NTRIPLES);
    }
}
