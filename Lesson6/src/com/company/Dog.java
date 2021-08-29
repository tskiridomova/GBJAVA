package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        super.maxRun = 500;
        super.maxSwim = 10;
        super.type = "Собака";
        super.canSwim = true;
    }

}
