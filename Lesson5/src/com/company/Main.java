package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "должность0",
                "email0@com.com", "+7 999 999 99 94", 100000, 21);
        employees[1] = new Employee("Петров Петр Петрович", "должность1",
                "email1@com.com", "+7 999 999 99 95", 100000, 31);
        employees[2] = new Employee("Сидоров Сидор Сидорович", "должность2",
                "email2@com.com", "+7 999 999 99 96", 100000, 41);
        employees[3] = new Employee("Иванов Петр Сидорович", "должность3",
                "email3@com.com", "+7 999 999 99 97", 100000, 51);
        employees[4] = new Employee("Петров Сидор Иванович", "должность4",
                "email4@com.com", "+7 999 999 99 98", 100000, 61);

        for(Employee employee:employees) {
            if (employee.age > 40) {
                employee.print();
            }
        }

    }



}
