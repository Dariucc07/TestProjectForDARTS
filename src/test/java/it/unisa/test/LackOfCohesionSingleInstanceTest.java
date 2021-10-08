package it.unisa.test;

import it.unisa.progetto.LackOfCohesionMoreThanOne;
import org.junit.Test;

public class LackOfCohesionSingleInstanceTest {

    private String emilio;

    /**
     * LACK OF COHESION
     */
    @Test
    public void test1(){
        LackOfCohesionMoreThanOne moreThanOne = new LackOfCohesionMoreThanOne();
        moreThanOne.doSomething(22);
    }
}
