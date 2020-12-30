package com.xkc.learn.principle.segregation;

import lombok.Data;

/**
 * 接口隔离原则：A类通过接口依赖B类，用不到的方法拆分成多个接口进行隔离
 */
@Data
public class Segregation {

    public static void main(String[] args) {
        // A类通过接口依赖B类
        A a = new A();
        a.useF1(new B());
        a.useF2(new B());
        a.useF3(new B());
    }

}

interface Interface1 {
    void f1();
}

interface Interface2 {
    void f2();

    void f3();
}

interface Interface3 {
    void f4();

    void f5();
}

class B implements Interface1, Interface2 {
    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

class D implements Interface1, Interface3 {
    @Override
    public void f1() {

    }

    @Override
    public void f4() {

    }

    @Override
    public void f5() {

    }
}

class A {
    public void useF1(Interface1 interface1) {

    }

    public void useF2(Interface2 interface2) {

    }

    public void useF3(Interface2 interface2) {

    }
}

class C {
    public void useF1(Interface1 interface1) {

    }

    public void useF4(Interface3 interface3) {

    }

    public void useF5(Interface3 interface3) {

    }
}
