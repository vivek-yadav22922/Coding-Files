package com.vivek.staticexample;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
     static long population;

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//human.population +=1; // we can directly access class name no need to any referaence variable;
        this.population +=1;


    }
}
