package it.unisa.test;

import it.unisa.progetto.EagerMoreThanOne;
import org.junit.Test;

public class EagerTestMoreThanOneTest {
    private EagerMoreThanOne moreThanOne;
    private EagerMoreThanOne moreThanOne1;

    private EagerMoreThanOne moreThanOne2;
    private EagerMoreThanOne moreThanOne3;

    @Test
    /**
     * Method with EAGER TEST
     */
    public void test1(){
        moreThanOne = new EagerMoreThanOne();
        moreThanOne1 = new EagerMoreThanOne();

        moreThanOne1.a();
    }

    @Test

    private void refactoredOne() {
        moreThanOne.doSomething(2);
        moreThanOne.doSomething2(33);

        moreThanOne1.doSomething(2);
    }

    @Test
    /**
     * Method with EAGER TEST
     */
    public void test2(){
        moreThanOne2 = new EagerMoreThanOne();
        moreThanOne2.doSomething(4);
        moreThanOne2.doSomething(44);

        moreThanOne3 = new EagerMoreThanOne();

        moreThanOne3.doSomething(4);
        moreThanOne3.doSomething2(44);
        moreThanOne3.a();
    }

    @Test
    public void test3(){
        moreThanOne = new EagerMoreThanOne();
        moreThanOne.doSomething(2);
    }
}
