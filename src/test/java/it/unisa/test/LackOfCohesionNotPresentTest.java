package it.unisa.test;

import it.unisa.progetto.LackOfCohesionNotPresent;
import org.junit.Test;

public class LackOfCohesionNotPresentTest {

    private LackOfCohesionNotPresent notPresent;

    @Test
    public void test1(){
        notPresent = new LackOfCohesionNotPresent();
        notPresent.doSomething(22);
    }
}
