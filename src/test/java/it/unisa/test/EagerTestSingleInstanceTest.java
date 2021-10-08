package it.unisa.test;

import it.unisa.progetto.EagerTestSingleInstance;
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
    private EagerTestSingleInstance singleInstance;
    private EagerTestSingleInstance singleInstance1;

    @Test
    /**
     * Method with EAGER TEST
     */
    public void test1(){
        singleInstance = new EagerTestSingleInstance();
        singleInstance1 = new EagerTestSingleInstance();

        singleInstance.doSomething(2);
        singleInstance1.doSomething(2);
    }

    @Test
    public void test2(){
        singleInstance = new EagerTestSingleInstance();
        singleInstance.doSomething(4);
    }

    @Test
    public void test3(){
        singleInstance1 = new EagerTestSingleInstance();
        singleInstance1.doSomething(4);
    }
}
