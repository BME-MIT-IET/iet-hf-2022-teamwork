package comparison.GsonComparison;

import com.complexible.pinto.RDFMapperTests;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import exploratory.phonebook.Phonebook;
import org.junit.Test;
import org.openrdf.model.impl.SimpleValueFactory;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class GsonComparison {
    @Test
    public void givenArrayOfObjects_whenSerializing_thenCorrect() throws IOException {

        Phonebook pb = new Phonebook();

        pb.initForStress(20,true);


        String jsonString = new Gson().toJson(pb);

        //System.out.println(jsonString);
        File file = new File("test/resources/out/phonebook-gson.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        PrintWriter pw = new PrintWriter(fileOutputStream);
        pw.println(jsonString);

        pw.flush();

        pw.close();
    }


}

