package it.unisa.test;

import it.unisa.progetto.Example0;
import org.junit.Test;

/**
 * EAGER TEST NOT PRESENT: keep in mind the documentation from
 * DARTS'previous version in the Test section.
 *
 * This Test class is used in order to have Regression Testing
 * from the previous version of DARTS. DARTS must not detect any
 * smell.
 *
 * An Eager Test Occurs when a test method invokes several methods of the production object.
 */
public class EagerTestNotPresentTest {

    private Example0 example0;
    @Test
    public void test1(){
        example0 = new Example0();
        example0.doSomething(2);
    }

    @Test
    public void test2(){
        example0 = new Example0();
        example0.doSomething(4);
    }

    @Test
    public void test3(){
        example0 = new Example0();
        example0.doSomething(6);
    }


}
