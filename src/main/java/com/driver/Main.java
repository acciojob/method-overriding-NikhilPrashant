package com.driver;
public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth()); // Cannot call method of A as it gets Overridden for B
        B obj1 = new B();
        System.out.println(obj1.meth()); // method has been overridden by B
    }
}