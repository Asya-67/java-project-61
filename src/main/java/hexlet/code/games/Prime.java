package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final Random random = new Random();

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.start("Prime Game", name, new GameLogic() {
            private int currentQuestion;

            @Override
            public String getQuestion() {
                currentQuestion = random.nextInt(100) + 1;
                return String.valueOf(currentQuestion);
            }

            @Override
            public String getCorrectAnswer() {
                return isPrime(currentQuestion) ? "yes" : "no";
            }

            private boolean isPrime(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        });
    }
}
