package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Calculator {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator Game!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        for(int i = 0; i < 3; i++) {
         int number1 = random.nextInt(99);
         int number2 = random.nextInt(99);
         int operation = random.nextInt(3);
         String operator;
         int correctAnswer;


         switch (operation) {
             case 0:
                 operator = "+";
                 correctAnswer = number1 + number2;
                 break;
             case 1:
                 operator = "-";
                 correctAnswer = number1 -number2;
                 break;
             case 2:
                 operator = "*";
                 correctAnswer = number1 * number2;
                 break;
             default:
                 continue;
         }
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
