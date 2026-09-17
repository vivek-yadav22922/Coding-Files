package com.vivek.staticexample;

public class Main {
    static void main(String[] args) {
        human vivek= new human(22,"vivek yadav",10000,false);
        human abhishek= new human(24,"abhishek yadav",15000,true);
        human arpit= new human(44,"arpit",100,false);


//        System.out.println(human.population); // here no need to call reference variable we can call static member
                                                // directly using class name//
//        System.out.println( human.population);
//        System.out.println(human.population);

        System.out.println(vivek.population);// here using refernce of object for callig properties//
        System.out.println( abhishek.population);
        System.out.println(arpit.population);
    }
}
