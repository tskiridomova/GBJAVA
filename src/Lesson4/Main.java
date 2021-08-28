package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Игра Камень Ножницы Бумага");

        System.out.println("1 - Ножницы");
        System.out.println("2 - Камень");
        System.out.println("3 - Бумага");

        try (Scanner scanner = new Scanner(System.in)) {
            boolean play = true;
            while (play) {
                System.out.print("Выбери предмет или 0 для выхода: ");
                int player_choice = scanner.nextInt();
                System.out.println("Человек выбрал: " + intToItem(player_choice));

                if (player_choice == 0) {
                    play = false;
                }

                Random ran = new Random();
                int robot_choice = ran.nextInt(3) + 1;
                System.out.println("Робот выбрал: " + intToItem(robot_choice));
                System.out.println(game(player_choice, robot_choice));

            }
            System.out.print("Спасибо за игру");

        } catch (Throwable err) {
            System.out.println("Ошибка, введите число");
            System.exit(1);
        }
    }

    public static String intToItem(int number) {
        return switch (number) {
            case 1 -> "Ножницы";
            case 2 -> "Камень";
            case 3 -> "Бумага";
            case 0 -> "Конец игры";
            default -> "Неизвестный предмет";
        };
    }

    public static String game(int player_choice, int computer_choice) {
        if (player_choice == computer_choice) {
            return "Ничья";
        } else if ((player_choice == 1 && computer_choice == 2) || (player_choice == 2 && computer_choice == 1)) {
            //  Ножницы - Камень
            String win = "Компьютер";
            if (player_choice > computer_choice) {
                win = "Человек";
            }
            return "Камень тупит Ножницы. Победил " + win;
        } else if ((player_choice == 1 && computer_choice == 3) || (player_choice == 3 && computer_choice == 1)) {
            //  Ножницы - Бумага
            String win = "Компьютер";
            if (player_choice < computer_choice) {
                win = "Человек";
            }
            return "Ножницы режут Бумагу. Победил " + win;
        } else if ((player_choice == 2 && computer_choice == 3) || (player_choice == 3 && computer_choice == 2)) {
            //  Камень - Бумага
            String win = "Компьютер";
            if (player_choice > computer_choice) {
                win = "Человек";
            }
            return "Бумага оборачивает Камень. Победил " + win;
        }

        return "";

    }

}
