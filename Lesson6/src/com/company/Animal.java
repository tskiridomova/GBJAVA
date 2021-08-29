package com.company;

public class Animal {
    String name;
    String type;
    int maxSwim;
    int maxRun;
    boolean canSwim;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int length) {
        if (length > this.maxRun) {
            System.out.printf("%s не может бежать больше %s\n",
                    this.type, length);
        } else {
            System.out.printf("%s %s пробежал %sм из %s возможных\n",
                    this.type,this.name, length, this.maxRun);
        }
    }

    public void swim(int length) {
        if (!this.canSwim) {
            System.out.printf("%s не может плавать\n",
                    this.type);

        } else if (length > this.maxSwim) {
            System.out.printf("%s не может плавать больше %s\n",
                    this.type, length);
        } else {
            System.out.printf("%s %s проплыл %sм из %s возможных\n",
                    this.type,this.name, length, this.maxSwim);
        }

    }

}
