package it.unisa.progetto;

public class EagerTestMoreThanOne {
    public void doSomething(int p) {
        if (p == 1) {
            a();
        }
        else if(p==22){
            c();
        }
        else {
            b();
        }
    }

    public void doSomething2(int p) {
        if (p == 1) {
            a();
        }
        else if(p==22){
            c();
        }
        else {
            b();
        }
    }

    public void a() {
        System.out.println("a");
    }

    private void b() {
        System.out.println("b");
    }

    private void c() {
        System.out.println("marcellino");
    }
}