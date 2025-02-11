package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");

        // Запрос имени пользователя
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();

        // Приветствие по имени
        System.out.println("Hello, " + name + "!");
    }
}

