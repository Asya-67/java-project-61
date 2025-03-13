package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("What number is missing in the progression?");
        Engine.start("Progression Game", name, new GameLogic() {
            private final Random random = new Random();
            private int hiddenValue;

            @Override
            public String getQuestion() {
                int length = random.nextInt(6) + 5;
                int start = random.nextInt(20) + 1;
                int difference = random.nextInt(10) + 1;
                StringBuilder progression = new StringBuilder();
                int hiddenIndex = random.nextInt(length);
                for (int i = 0; i < length; i++) {
                    if (i == hiddenIndex) {
                        hiddenValue = start + i * difference;
                        progression.append(".. ");
                    } else {
                        progression
                                .append(start + i * difference)
                                .append(" "); // Добавляем текущее значение прогрессии
                    }
                }
                return progression.toString().trim();
            }

            @Override
            public String getCorrectAnswer() {
                return String.valueOf(hiddenValue);
            }
        });
    }
}
