package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int PROGRESSION_LENGTH = 6;
    private static final int OFFSET = 5;
    private static final int PROGRESSION_START = 20;
    private static final int DIFFERENCE = 10;

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
                int length = random.nextInt(PROGRESSION_LENGTH) + OFFSET;
                int start = random.nextInt(PROGRESSION_START) + 1;
                int difference = random.nextInt(DIFFERENCE) + 1;
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
