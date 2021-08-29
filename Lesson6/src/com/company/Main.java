package com.company;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Барбос");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Васик");
        dog1.run(100);
        dog2.run(600);
        cat1.swim(10);
        cat2.run(200);
    }
}
