package it.unisa.test;

import it.unisa.progetto.EagerTestMoreThanOne;
import org.junit.Test;

public class EagerTestMoreThanOneTest {
    private EagerTestMoreThanOne moreThanOne;
    private EagerTestMoreThanOne moreThanOne1;

    private EagerTestMoreThanOne moreThanOne2;
    private EagerTestMoreThanOne moreThanOne3;

    @Test
    /**
     * Method with EAGER TEST
     */
    public void test1(){
        moreThanOne = new EagerTestMoreThanOne();
        moreThanOne1 = new EagerTestMoreThanOne();

        moreThanOne.doSomething(2);
        moreThanOne.doSomething(33);

        moreThanOne1.doSomething(2);
        moreThanOne1.doSomething(33);
    }

    @Test
    /**
     * Method with EAGER TEST
     */
    public void test2(){
        moreThanOne2 = new EagerTestMoreThanOne();
        moreThanOne2.doSomething(4);
        moreThanOne2.doSomething(44);

        moreThanOne3 = new EagerTestMoreThanOne();

        moreThanOne3.doSomething(4);
        moreThanOne3.doSomething(44);
    }

    @Test
    public void test3(){
        moreThanOne = new EagerTestMoreThanOne();
        moreThanOne.doSomething(2);
    }
}
