package it.unisa.test;

import it.unisa.progetto.LackOfCohesionNotPresent;
import org.junit.Test;

public class LackOfCohesionNotPresentTest {

    private LackOfCohesionNotPresent notPresent;
    int a, b;

    @Test
    public void test1(){
        notPresent = new LackOfCohesionNotPresent();
        a = a + b;
    }

    @Test
    public void test2(){
        notPresent = new LackOfCohesionNotPresent();
        b = a + a;
    }
}
