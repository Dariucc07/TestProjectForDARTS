package it.unisa.test;

import it.unisa.progetto.Example0;
import it.unisa.progetto.Example1;
import it.unisa.progetto.Example2;
import it.unisa.progetto.Example3;
import org.junit.Test;

public class EagerTestMoreThanOneTest {
    private Example0 example0;
    private Example1 example1;

    private Example2 example2;
    private Example3 example3;

    @Test
    public void test1(){
        example0 = new Example0();
        example1 = new Example1();

        example0.doSomething(2);
        example1.doSomething(2);
    }

    @Test
    public void test2(){
        example2 = new Example2();
        example2.doSomething(4);

        example3 = new Example3();
        example3.doSomething(4);
    }

    @Test
    public void test3(){
        example1 = new Example1();
        example1.doSomething(4);
    }
}
