package hexlet.code;
import hexlet.code.games.Prime;
import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Показываем список доступных игр
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        // Запуск игры в зависимости от выбора
        switch (choice) {
            case GREET_GAME:
                Cli.greetUser();  // Приветствие пользователя
                break;
            case EVEN_GAME:
                EvenGame.start();
                break;
            case CALC_GAME:
                Calc.start();
                break;
            case GCD_GAME:
                GCD.start();
                break;
            case PROGRESSION_GAME:
                Progression.start();
                break;
            case PRIME_GAME:
                Prime.start();
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
