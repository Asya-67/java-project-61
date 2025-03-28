package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int MAX_LIMIT = 100;
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine.start("Even Game", name, new GameLogic() {
            private final Random random = new Random();
            private int number; // Переменная для хранения числа

            @Override
            public String getQuestion() {
                number = random.nextInt(MAX_LIMIT) + 1;
                return String.valueOf(number);
            }

            @Override
            public String getCorrectAnswer() {

                return (number % 2 == 0) ? "yes" : "no";
            }
        });
    }
}
