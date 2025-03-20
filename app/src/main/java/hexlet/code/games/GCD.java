package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.start("GCD Game", name, new GameLogic() {
            private final Random random = new Random();
            private int num1, num2;

            @Override
            public String getQuestion() {
                num1 = random.nextInt(100) + 1;
                num2 = random.nextInt(100) + 1;
                return num1 + " " + num2;
            }

            @Override
            public String getCorrectAnswer() {
                return String.valueOf(gcd(num1, num2));
            }
        });
    }

    private static int gcd(int a,
                           int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
