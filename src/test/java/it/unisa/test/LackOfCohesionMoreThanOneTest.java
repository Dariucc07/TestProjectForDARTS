package it.unisa.test;

import it.unisa.progetto.LackOfCohesionMoreThanOne;
import it.unisa.progetto.LackOfCohesionNotPresent;
import it.unisa.progetto.LackOfCohesionSingleInstance;
import org.junit.Test;

public class LackOfCohesionMoreThanOneTest {

    private String emilio,ciccio;
    String antonio="prova";
    int a, b,c;
    LackOfCohesionNotPresent notInstance;
    LackOfCohesionMoreThanOne moreThanOne;
    LackOfCohesionSingleInstance single;

    /**
     * LACK OF COHESION
     */
    @Test
    public void test1(){
        moreThanOne = new LackOfCohesionMoreThanOne();
        moreThanOne.doSomething(22);
        notInstance = new LackOfCohesionNotPresent();
        notInstance.doSomething2(32);
        String ciccio= "prova";
        String emilio= "prova";
        String results3 = ciccio.toUpperCase();
    }

    @Test
    public void test2(){
        System.out.println(antonio.toUpperCase());
    }
    @Test
    public void test3(){
        a=a+b+c;
    }
    @Test
    public void test4(){
        single = new LackOfCohesionSingleInstance();
        single.doSomething2(44);
    }
}
