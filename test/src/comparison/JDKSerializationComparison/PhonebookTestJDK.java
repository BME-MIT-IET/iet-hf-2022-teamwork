package comparison.JDKSerializationComparison;

import exploratory.phonebook.Phonebook;
import org.junit.Test;


import java.io.*;

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
