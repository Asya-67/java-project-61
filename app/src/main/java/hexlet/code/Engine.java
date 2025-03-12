package hexlet.code;

import java.util.Scanner;
import java.util.Locale;


public class Engine {
    public static void start(String gameTitle, String name, GameLogic gameLogic) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Welcome to the " + gameTitle + "!");
        System.out.println("Hello, " + name + "!");

        String correctAnswer;

        final int roundsToWin = 3;
        int correctAnswers = 0;

        while (correctAnswers < roundsToWin) {
            String question = gameLogic.getQuestion();
            correctAnswer = gameLogic.getCorrectAnswer();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine().trim().toLowerCase(Locale.ROOT);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public interface GameLogic {
        String getQuestion();
        String getCorrectAnswer();
    }
}


