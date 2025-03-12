package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.start("Even Game", name, new GameLogic() {
            private final Random random = new Random();

            @Override
            public String getQuestion() {
                int number = random.nextInt(100) + 1;
                return String.valueOf(number);
            }

            @Override
            public String getCorrectAnswer() {
                // Определяем правильный ответ
                int number = Integer.parseInt(getQuestion());
                return (number % 2 == 0) ? "yes" : "no";
            }
        });
    }
}


