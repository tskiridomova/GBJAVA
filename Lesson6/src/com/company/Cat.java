package com.company;

public class Cat extends Animal{
    boolean canSwim = false;
    public Cat(String name) {
        super(name);
        super.maxRun = 200;
        super.maxSwim = 0;
        super.type = "Кот";
        super.canSwim = false;
    }
}
