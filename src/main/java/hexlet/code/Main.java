package hexlet.code;
import hexlet.code.games.Games;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Показываем список доступных игр
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        // Запуск игры в зависимости от выбора
        switch (choice) {
            case 1:
                Cli.greetUser();  // Приветствие пользователя
                break;
            case 2:
                Games.EvenGame.start();
                break;
            case 3:
                Games.Calc.start();
                break;
            case 4:
                Games.GCD.start();
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
