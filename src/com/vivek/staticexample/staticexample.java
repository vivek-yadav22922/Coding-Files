package com.vivek.staticexample;

public class staticexample {
    static class test{  // here if static class nahi banaya to   test a = new test("vivek"); this will give error//
        // means jab hamnay class static bana diya hai to not dependent in object  we can call directly//
        String name;

        public test(String name) {
            this.name = name;
        }
    }

    static void main(String[] args) {
        test a = new test("vivek");
        System.out.println(a.name);
    }
}



