package it.unisa.test;

import it.unisa.progetto.*;
import org.junit.Before;
import org.junit.Test;

public class GeneralFixtureNotPresentTest {

    private GeneralFixtureSingleInstance singleInstance;
    private int a, b , c;

    @Before
    public void setUp() throws Exception{
        GeneralFixtureSingleInstance singleInstance;
        a = b = c = 2;
    }

    @Test
    public void test1(){
        singleInstance = new GeneralFixtureSingleInstance();
        singleInstance.doSomething(2);
        c = a + b;

    }

    @Test
    public void test2(){
        singleInstance.doSomething(3);
        a = c + b;
    }
}
