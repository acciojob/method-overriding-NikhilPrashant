package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth()); // Cannot call method of A as it gets Overridden for B
        B obj1 = new B();
        System.out.println(obj1.meth()); // method has been overridden by B
    }
}