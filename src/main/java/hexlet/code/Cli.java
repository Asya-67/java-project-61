package hexlet.code;

import java.util.Scanner;


public class Cli {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        // Получаем имя пользователя
        String name = scanner.nextLine();

        // Приветствуем пользователя по имени
        System.out.println("Hello, " + name + "!");
    }

}

