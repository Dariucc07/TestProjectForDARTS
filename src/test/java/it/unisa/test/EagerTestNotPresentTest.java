package it.unisa.test;

import it.unisa.progetto.EagerTestNotPresent;
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

    private EagerTestNotPresent notPresent;
    @Test
    public void test1(){
        notPresent = new EagerTestNotPresent();
        notPresent.doSomething(2);
    }

    @Test
    public void test2(){
        notPresent = new EagerTestNotPresent();
        notPresent.doSomething(4);
    }

    @Test
    public void test3(){
        notPresent = new EagerTestNotPresent();
        notPresent.doSomething(6);
    }


}
