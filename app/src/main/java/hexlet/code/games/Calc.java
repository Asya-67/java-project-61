package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("What is the result of the expression?");

        Engine.start("Calculator Game", name, new GameLogic() {
            private final Random random = new Random();
            private int currentAnswer;

            @Override
            public String getQuestion() {
                int number1 = random.nextInt(99);
                int number2 = random.nextInt(99);
                int operation = random.nextInt(3);
                String operator;

                switch (operation) {
                    case 0:
                        operator = "+";
                        currentAnswer = number1 + number2;
                        break;
                    case 1:
                        operator = "-";
                        currentAnswer = number1 - number2;
                        break;
                    case 2:
                        operator = "*";
                        currentAnswer = number1 * number2;
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpected operation: " + operation);
                }
                return number1 + " " + operator + " " + number2;
            }

            @Override
            public String getCorrectAnswer() {
                return String.valueOf(currentAnswer);
            }
        });
    }
}
