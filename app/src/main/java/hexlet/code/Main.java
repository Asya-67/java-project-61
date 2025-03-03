package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Показываем список доступных игр
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        // Запуск игры в зависимости от выбора
        switch (choice) {
            case 1:
                Cli.greetUser();  // Приветствие пользователя
                break;
            case 2:
                EvenGame.start();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
