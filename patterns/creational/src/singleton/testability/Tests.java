package singleton.testability;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Tests {

    @Test
    public void singletonTotalPopulationTest(){
        SingletonRecordFinder rf = new SingletonRecordFinder();
        List<String> names = Arrays.asList("abc","sdfsd");
        int tp = rf.getTotalPopulation(names);
        org.junit.Assert.assertEquals(123123+3124234, tp);
    }

    @Test
    public void dependentPopulationTest(){
        DummyDatabase db = new DummyDatabase();
        ConfigurableRecordFinder rf = new ConfigurableRecordFinder(db);
        org.junit.Assert.assertEquals(4, rf.getTotalPopulation(Arrays.asList("alpha","gamma")));
    }

}
