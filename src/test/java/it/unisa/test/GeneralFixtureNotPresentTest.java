package it.unisa.test;

import it.unisa.progetto.*;
import org.junit.Before;
import org.junit.Test;

public class GeneralFixtureNotPresentTest {

    private GeneralFixtureSingleInstance singleInstance;
    private GeneralFixtureMoreThanOne moreThanOne;
    private GeneralFixtureNotPresent notPresent;

    @Before
    public void setUp() throws Exception{
        singleInstance = new GeneralFixtureSingleInstance();
        moreThanOne = new GeneralFixtureMoreThanOne();
        notPresent = new GeneralFixtureNotPresent();
    }

    @Test
    public void test1(){
        singleInstance.doSomething(2);
        moreThanOne.doSomething(22);
        notPresent.doSomething(222);
    }

    @Test
    public void test2(){
        singleInstance.doSomething(3);
        moreThanOne.doSomething(33);
        notPresent.doSomething(333);
    }
}
