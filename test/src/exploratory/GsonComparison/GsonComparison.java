package exploratory.GsonComparison;

import com.complexible.pinto.RDFMapperTests;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;
import org.openrdf.model.impl.SimpleValueFactory;

import static org.junit.Assert.assertEquals;

public class GsonComparison {
    @Test
    public void givenArrayOfObjects_whenSerializing_thenCorrect() {
        RDFMapperTests.ClassWithObjectList aObj = new RDFMapperTests.ClassWithObjectList();
        aObj.setCollection(Sets.newLinkedHashSet(Lists.newArrayList(new RDFMapperTests.Person("Earl Weaver"), new RDFMapperTests.Person("Brooks Robinson"))));
        aObj.setSet(Sets.newLinkedHashSet(Lists.newArrayList(new RDFMapperTests.Person("JJ Hardy"), new RDFMapperTests.Person("Manny Machado"))));
        aObj.setList(Lists.newArrayList(new RDFMapperTests.Person("Alejandro De Aza"), new RDFMapperTests.Person("Adam Jones")));
        aObj.setSortedSet(Sets.newTreeSet(Lists.newArrayList(new RDFMapperTests.Person("Steve Pearce"), new RDFMapperTests.Person("Zach Britton"))));
        aObj.id(SimpleValueFactory.getInstance().createIRI("tag:complexible:pinto:881b2f11232944aeda9ba543e030dcfc"));

        String jsonString = new Gson().toJson(aObj);

        System.out.println(jsonString);
    }


}

