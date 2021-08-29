package com.company;

public class Employee {
    public String name;
    public String occupation;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(String name,
                    String occupation,
                    String email,
                    String phone,
                    int salary,
                    int age) {
        this.name = name;
        this.occupation = occupation;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void print() {
        System.out.printf("name: %s\n" +
                        "occupation: %s\n" +
                        "email: %s\n" +
                        "phone: %s\n" +
                        "salary: %s\n" +
                        "age: %s\n",
                this.name, this.occupation, this.email, this.phone,
                this.salary, this.age);
        System.out.println("--------------------");
    }


}
