package it.unisa.test;

import it.unisa.progetto.Example0;
import it.unisa.progetto.Example1;
import org.junit.Test;

/**
 * EAGER TEST SINGLE INSTANCE PRESENT: keep in mind the documentation from
 * DARTS'previous version in the Test section.
 *
 * This Test class is used in order to have Regression Testing
 * from the previous version of DARTS. DARTS must detect a single instance
 * smell.
 *
 * An Eager Test Occurs when a test method invokes several methods of the production object.
 */
public class EagerTestSingleInstanceTest {
    private Example0 example0;
    private Example1 example1;

    @Test
    public void test1(){
        example0 = new Example0();
        example1 = new Example1();

        example0.doSomething(2);
        example1.doSomething(2);
    }

    @Test
    public void test2(){
        example0 = new Example0();
        example0.doSomething(4);
    }

    @Test
    public void test3(){
        example1 = new Example1();
        example1.doSomething(4);
    }
}
