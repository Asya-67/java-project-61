package hexlet.code;

import java.util.Locale;
import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_TO_WIN = 3;
    private static final String GREETING = "Welcome to the Brain Games!";
    private static final String CONGRATULATIONS = "Congratulations, ";
    private static final String CORRECT = "Correct!";
    private static final String WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    private static final String TRY_AGAIN = "Let's try again, ";

    public static void start(String gameTitle, String name, GameLogic gameLogic) {
        System.out.println(GREETING);
        System.out.println("Welcome to the " + gameTitle + "!");
        System.out.println("Hello, " + name + "!");
        String correctAnswer;
        int correctAnswers = 0;
        while (correctAnswers < ROUNDS_TO_WIN) {
            String question = gameLogic.getQuestion();
            correctAnswer = gameLogic.getCorrectAnswer();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
            if (userAnswer.equals(correctAnswer)) {
                System.out.println(CORRECT);
                correctAnswers++;
            } else {
                System.out.printf((WRONG_ANSWER) + "%n", userAnswer, correctAnswer);
                System.out.println(TRY_AGAIN + name + "!");
                return;
            }
        }
        System.out.println(CONGRATULATIONS + name + "!");
    }
}
