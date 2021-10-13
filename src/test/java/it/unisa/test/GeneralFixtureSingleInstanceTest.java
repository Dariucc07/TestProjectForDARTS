package it.unisa.test;

import it.unisa.progetto.*;
import org.junit.Before;
import org.junit.Test;

public class GeneralFixtureSingleInstanceTest {

    private GeneralFixtureSingleInstance singleInstance;
    private GeneralFixtureSingleInstance singleInstance2;
    private GeneralFixtureMoreThanOne moreThanOne;
    private GeneralFixtureNotPresent notPresent;

    private String emilio;
    private String rafelone;
    private String cimino;

    @Before
    public void setUp()throws Exception{
        emilio = "Bradipo";
        rafelone = "Hacker";
        cimino = "panchinaro destro";

        singleInstance = new GeneralFixtureSingleInstance();
        moreThanOne = new GeneralFixtureMoreThanOne();
        notPresent = new GeneralFixtureNotPresent();
    }

    /**
     * GENERAL FIXTURE
     */
    @Test
    public void test1(){
        singleInstance.doSomething(22);
    }


}
