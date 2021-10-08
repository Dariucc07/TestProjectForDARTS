package it.unisa.test;

import it.unisa.progetto.LackOfCohesionMoreThanOne;
import it.unisa.progetto.LackOfCohesionSingleInstance;
import org.junit.Test;

public class LackOfCohesionMoreThanOneTest {

    private String emilio;
    private String gibbo;

    /**
     * LACK OF COHESION
     */
    @Test
    public void test1(){
        LackOfCohesionSingleInstance singleInstance = new LackOfCohesionSingleInstance();
        singleInstance.doSomething(22);
    }

    /**
     * LACK OF COHESION
     */
    @Test
    public void test2(){
        LackOfCohesionMoreThanOne moreThanOne = new LackOfCohesionMoreThanOne();
        moreThanOne.doSomething(22);
    }
}
